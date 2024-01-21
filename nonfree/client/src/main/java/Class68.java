import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class68 {

	@OriginalMember(owner = "client!rd", name = "o", descriptor = "Lclient!ud;")
	private final Class77 aClass77_8 = new Class77(256);

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "Lclient!we;")
	private final Class62 aClass62_20;

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "Lclient!we;")
	private final Class62 aClass62_21;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lclient!we;Lclient!we;)V")
	public Class68(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class62 arg1) {
		this.aClass62_20 = arg1;
		this.aClass62_21 = arg0;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "([IBI)Lclient!tc;")
	public Class3_Sub2_Sub1 method1640(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(8) long local8 = (long) arg1 ^ 0x300000000L;
		@Pc(15) Class3_Sub2_Sub1 local15 = (Class3_Sub2_Sub1) this.aClass77_8.method1805(local8);
		if (local15 != null) {
			return local15;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(40) Class76 local40 = Static112.method1796(this.aClass62_20, arg1);
			if (local40 == null) {
				return null;
			}
			local15 = local40.method1792();
			this.aClass77_8.method1810(local15, local8);
			if (arg0 != null) {
				arg0[0] -= local15.aByteArray52.length;
			}
			return local15;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "([III)Lclient!tc;")
	public Class3_Sub2_Sub1 method1647(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(4) long local4 = (long) arg1 ^ 0x200000000L;
		@Pc(15) Class3_Sub2_Sub1 local15 = (Class3_Sub2_Sub1) this.aClass77_8.method1805(local4);
		if (local15 != null) {
			return local15;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(35) Class72 local35 = Static133.method1707(this.aClass62_21, arg1);
			if (local35 == null) {
				return null;
			}
			local15 = local35.method1703();
			this.aClass77_8.method1810(local15, local4);
			if (arg0 != null) {
				arg0[0] -= local15.aByteArray52.length;
			}
			return local15;
		} else {
			return null;
		}
	}
}
