import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class23 {

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "Lclient!s;")
	private final Class66 aClass66_3 = new Class66(256);

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "Lclient!sd;")
	private final Class29 aClass29_22;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "Lclient!sd;")
	private final Class29 aClass29_21;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!sd;Lclient!sd;)V")
	public Class23(@OriginalArg(0) Class29 arg0, @OriginalArg(1) Class29 arg1) {
		this.aClass29_22 = arg1;
		this.aClass29_21 = arg0;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II[I)Lclient!e;")
	public Class5_Sub5_Sub1 method627(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(8) long local8 = (long) arg0 ^ 0x200000000L;
		@Pc(15) Class5_Sub5_Sub1 local15 = (Class5_Sub5_Sub1) this.aClass66_3.method1812(local8);
		if (local15 != null) {
			return local15;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(32) Class8 local32 = Static125.method83(this.aClass29_21, arg0);
			if (local32 == null) {
				return null;
			}
			local15 = local32.method85();
			this.aClass66_3.method1811(local8, local15);
			if (arg1 != null) {
				arg1[0] -= local15.aByteArray18.length;
			}
			return local15;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I[II)Lclient!e;")
	public Class5_Sub5_Sub1 method631(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = (long) arg1 ^ 0x300000000L;
		@Pc(24) Class5_Sub5_Sub1 local24 = (Class5_Sub5_Sub1) this.aClass66_3.method1812(local4);
		if (local24 != null) {
			return local24;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(41) Class62 local41 = Static95.method1792(this.aClass29_22, arg1);
			if (local41 == null) {
				return null;
			}
			local24 = local41.method1790();
			this.aClass66_3.method1811(local4, local24);
			if (arg0 != null) {
				arg0[0] -= local24.aByteArray18.length;
			}
			return local24;
		} else {
			return null;
		}
	}
}
