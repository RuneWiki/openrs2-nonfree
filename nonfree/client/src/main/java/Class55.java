import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class55 {

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "Lclient!ka;")
	private final Class41 aClass41_9 = new Class41(256);

	@OriginalMember(owner = "client!ob", name = "z", descriptor = "Lclient!ff;")
	private final Class11 aClass11_33;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "Lclient!ff;")
	private final Class11 aClass11_32;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!ff;Lclient!ff;)V")
	public Class55(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1) {
		this.aClass11_33 = arg1;
		this.aClass11_32 = arg0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B[II)Lclient!qe;")
	public Class2_Sub16_Sub1 method1253(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(8) long local8 = (long) arg1 ^ 0x200000000L;
		@Pc(15) Class2_Sub16_Sub1 local15 = (Class2_Sub16_Sub1) this.aClass41_9.method1056(local8);
		if (local15 != null) {
			return local15;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(40) Class25 local40 = Static128.method678(this.aClass11_32, arg1);
			if (local40 == null) {
				return null;
			}
			local15 = local40.method677();
			this.aClass41_9.method1063(local15, local8);
			if (arg0 != null) {
				arg0[0] -= local15.aByteArray35.length;
			}
			return local15;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I[II)Lclient!qe;")
	public Class2_Sub16_Sub1 method1254(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(8) long local8 = (long) arg1 ^ 0x300000000L;
		@Pc(15) Class2_Sub16_Sub1 local15 = (Class2_Sub16_Sub1) this.aClass41_9.method1056(local8);
		if (local15 != null) {
			return local15;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(39) Class30 local39 = Static47.method857(this.aClass11_33, arg1);
			if (local39 == null) {
				return null;
			}
			local15 = local39.method861();
			this.aClass41_9.method1063(local15, local8);
			if (arg0 != null) {
				arg0[0] -= local15.aByteArray35.length;
			}
			return local15;
		} else {
			return null;
		}
	}
}
