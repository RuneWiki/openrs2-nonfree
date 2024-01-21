import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class81 {

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "Lclient!ec;")
	private final Class17 aClass17_21 = new Class17(256);

	@OriginalMember(owner = "client!wc", name = "U", descriptor = "Lclient!ec;")
	private final Class17 aClass17_22 = new Class17(256);

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "Lclient!ef;")
	private final Class16 aClass16_151;

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "Lclient!ef;")
	private final Class16 aClass16_152;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!ef;Lclient!ef;)V")
	public Class81(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class16 arg1) {
		this.aClass16_151 = arg0;
		this.aClass16_152 = arg1;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([IIZI)Lclient!nb;")
	private Class3_Sub5_Sub1 method2257(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg1 ^ (arg2 >>> 12 | (arg2 & 0xD0000FFF) << 4);
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class3_Sub5_Sub1 local31 = (Class3_Sub5_Sub1) this.aClass17_22.method599(local24);
		if (local31 != null) {
			return local31;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(52) Class36 local52 = Static136.method1154(this.aClass16_151, arg2, arg1);
			if (local52 == null) {
				return null;
			}
			local31 = local52.method1157();
			this.aClass17_22.method594(local31, local24);
			if (arg0 != null) {
				arg0[0] -= local31.aByteArray23.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([IIII)Lclient!nb;")
	private Class3_Sub5_Sub1 method2259(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) int local20 = arg2 ^ (arg1 >>> 12 | (arg1 & 0xFFF) << 4);
		@Pc(26) int local26 = local20 | arg1 << 16;
		@Pc(31) long local31 = (long) local26 ^ 0x100000000L;
		@Pc(38) Class3_Sub5_Sub1 local38 = (Class3_Sub5_Sub1) this.aClass17_22.method599(local31);
		if (local38 != null) {
			return local38;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(57) Class3_Sub10 local57 = (Class3_Sub10) this.aClass17_21.method599(local31);
			if (local57 == null) {
				local57 = Static45.method865(this.aClass16_152, arg1, arg2);
				if (local57 == null) {
					return null;
				}
				this.aClass17_21.method594(local57, local31);
			}
			local38 = local57.method867(arg0);
			if (local38 == null) {
				return null;
			} else {
				local57.method2201();
				this.aClass17_22.method594(local38, local31);
				return local38;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([III)Lclient!nb;")
	public Class3_Sub5_Sub1 method2261(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass16_152.method579() == 1) {
			return this.method2259(arg0, 0, arg1);
		} else if (this.aClass16_152.method561(arg1) == 1) {
			return this.method2259(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II[I)Lclient!nb;")
	public Class3_Sub5_Sub1 method2262(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass16_151.method579() == 1) {
			return this.method2257(arg1, arg0, 0);
		} else if (this.aClass16_151.method561(arg0) == 1) {
			return this.method2257(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}
}
