import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class33 {

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "Lclient!sa;")
	private final Class74 aClass74_7 = new Class74(256);

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "Lclient!sa;")
	private final Class74 aClass74_8 = new Class74(256);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "Lclient!ke;")
	private final Class43 aClass43_15;

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "Lclient!ke;")
	private final Class43 aClass43_17;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lclient!ke;Lclient!ke;)V")
	public Class33(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Class43 arg1) {
		this.aClass43_15 = arg1;
		this.aClass43_17 = arg0;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z[II)Lclient!jb;")
	public Class2_Sub5_Sub1 method1064(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass43_15.method2207() == 1) {
			return this.method1065(arg1, arg0, 0);
		} else if (this.aClass43_15.method2223(arg1) == 1) {
			return this.method1065(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[II)Lclient!jb;")
	private Class2_Sub5_Sub1 method1065(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg0 ^ (arg2 >>> 12 | arg2 << 4 & 0xFFF8);
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class2_Sub5_Sub1 local33 = (Class2_Sub5_Sub1) this.aClass74_8.method2433(local26);
		if (local33 != null) {
			return local33;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(55) Class2_Sub11 local55 = (Class2_Sub11) this.aClass74_7.method2433(local26);
			if (local55 == null) {
				local55 = Static73.method1409(this.aClass43_15, arg2, arg0);
				if (local55 == null) {
					return null;
				}
				this.aClass74_7.method2432(local26, local55);
			}
			local33 = local55.method1404(arg1);
			if (local33 == null) {
				return null;
			} else {
				local55.method3004();
				this.aClass74_8.method2432(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BI[I)Lclient!jb;")
	public Class2_Sub5_Sub1 method1067(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass43_17.method2207() == 1) {
			return this.method1069(arg1, 0, arg0);
		} else if (this.aClass43_17.method2223(arg0) == 1) {
			return this.method1069(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIII)Lclient!jb;")
	private Class2_Sub5_Sub1 method1069(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = arg2 ^ (arg1 << 4 & 0xFFF3 | arg1 >>> 12);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(33) long local33 = (long) local21;
		@Pc(40) Class2_Sub5_Sub1 local40 = (Class2_Sub5_Sub1) this.aClass74_8.method2433(local33);
		if (local40 != null) {
			return local40;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(58) Class76 local58 = Static188.method2449(this.aClass43_17, arg1, arg2);
			if (local58 == null) {
				return null;
			}
			local40 = local58.method2447();
			this.aClass74_8.method2432(local33, local40);
			if (arg0 != null) {
				arg0[0] -= local40.aByteArray28.length;
			}
			return local40;
		} else {
			return null;
		}
	}
}
