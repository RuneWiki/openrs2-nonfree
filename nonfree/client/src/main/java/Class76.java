import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class76 {

	@OriginalMember(owner = "client!va", name = "c", descriptor = "Lclient!ab;")
	private final Class2 aClass2_12 = new Class2(256);

	@OriginalMember(owner = "client!va", name = "l", descriptor = "Lclient!tb;")
	private final Class44 aClass44_67;

	@OriginalMember(owner = "client!va", name = "j", descriptor = "Lclient!tb;")
	private final Class44 aClass44_66;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lclient!tb;Lclient!tb;)V")
	public Class76(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class44 arg1) {
		this.aClass44_67 = arg1;
		this.aClass44_66 = arg0;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BI[I)Lclient!r;")
	public Class3_Sub4_Sub1 method1927(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(17) long local17 = (long) arg0 ^ 0x300000000L;
		@Pc(24) Class3_Sub4_Sub1 local24 = (Class3_Sub4_Sub1) this.aClass2_12.method17(local17);
		if (local24 != null) {
			return local24;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(41) Class55 local41 = Static78.method1381(this.aClass44_67, arg0);
			if (local41 == null) {
				return null;
			}
			local24 = local41.method1373();
			this.aClass2_12.method12(local24, local17);
			if (arg1 != null) {
				arg1[0] -= local24.aByteArray32.length;
			}
			return local24;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II[I)Lclient!r;")
	public Class3_Sub4_Sub1 method1928(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(8) long local8 = (long) arg0 ^ 0x200000000L;
		@Pc(19) Class3_Sub4_Sub1 local19 = (Class3_Sub4_Sub1) this.aClass2_12.method17(local8);
		if (local19 != null) {
			return local19;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(39) Class73 local39 = Static133.method1878(this.aClass44_66, arg0);
			if (local39 == null) {
				return null;
			}
			local19 = local39.method1879();
			this.aClass2_12.method12(local19, local8);
			if (arg1 != null) {
				arg1[0] -= local19.aByteArray32.length;
			}
			return local19;
		} else {
			return null;
		}
	}
}
