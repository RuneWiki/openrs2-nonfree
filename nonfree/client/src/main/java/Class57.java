import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class57 {

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
	private int anInt1835 = -1;

	@OriginalMember(owner = "client!ej", name = "h", descriptor = "Z")
	public boolean aBoolean176 = true;

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
	private final int anInt1833;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "Lclient!h;")
	private final Class32_Sub2 aClass32_Sub2_14;

	@OriginalMember(owner = "client!ej", name = "i", descriptor = "Lclient!ln;")
	private final Class128 aClass128_2;

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
	private final int anInt1832;

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
	private final int anInt1834;

	@OriginalMember(owner = "client!ej", name = "k", descriptor = "Lclient!ks;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "client!ej", name = "j", descriptor = "Lclient!id;")
	private Class4_Sub2 aClass4_Sub2_2;

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "Lclient!bj;")
	private Class20_Sub1 aClass20_Sub1_1;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lclient!h;Lclient!ln;Lclient!ef;IIIII)V")
	public Class57(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(2) Class53_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt1833 = arg7;
		this.aClass32_Sub2_14 = arg0;
		this.aClass128_2 = arg1;
		this.anInt1832 = arg6;
		@Pc(23) int local23 = 0x1 << arg5;
		@Pc(25) int local25 = 0;
		@Pc(29) int local29 = arg3 << arg5;
		@Pc(33) int local33 = arg4 << arg5;
		@Pc(47) int local47;
		@Pc(49) int local49;
		for (@Pc(35) int local35 = 0; local35 < local23; local35++) {
			local47 = local29 + arg2.anInt3017 * (local35 + local33);
			for (local49 = 0; local49 < local23; local49++) {
				@Pc(62) short[] local62 = arg2.aShortArrayArray1[local47++];
				if (local62 != null) {
					local25 += local62.length;
				}
			}
		}
		this.anInt1834 = local25;
		if (local25 > 0) {
			@Pc(90) Class1_Sub8 local90 = new Class1_Sub8(local25 * 2);
			@Pc(128) short[] local128;
			@Pc(132) int local132;
			@Pc(115) int local115;
			if (this.aClass32_Sub2_14.aBoolean240) {
				for (local47 = 0; local47 < local23; local47++) {
					local49 = arg2.anInt3017 * (local33 + local47) + local29;
					for (local115 = 0; local115 < local23; local115++) {
						local128 = arg2.aShortArrayArray1[local49++];
						if (local128 != null) {
							for (local132 = 0; local132 < local128.length; local132++) {
								local90.method4542(local128[local132] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local47 = 0; local47 < local23; local47++) {
					local49 = (local33 + local47) * arg2.anInt3017 + local29;
					for (local115 = 0; local115 < local23; local115++) {
						local128 = arg2.aShortArrayArray1[local49++];
						if (local128 != null) {
							for (local132 = 0; local132 < local128.length; local132++) {
								local90.method4509(local128[local132] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface4_1 = this.aClass32_Sub2_14.method2301(local90.aByteArray81, local90.anInt5182, false);
			this.aClass4_Sub2_2 = new Class4_Sub2(this.aClass32_Sub2_14, 5123, null, 1);
		} else {
			this.aClass20_Sub1_1 = null;
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(II[BI)V")
	public void method1619(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		this.aClass4_Sub2_2.method2574(arg0, this.aClass32_Sub2_14.method2292(5123) * arg1);
		this.method1620(arg1, this.aClass4_Sub2_2);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILclient!ks;I)V")
	private void method1620(@OriginalArg(0) int arg0, @OriginalArg(1) Interface4 arg1) {
		if (arg0 != 0) {
			this.method1621();
			this.aClass32_Sub2_14.method2287(this.aClass20_Sub1_1);
			this.aClass32_Sub2_14.method2252(arg1, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V")
	private void method1621() {
		if (!this.aBoolean176) {
			return;
		}
		this.aBoolean176 = false;
		@Pc(11) byte[] local11 = this.aClass128_2.aByteArray61;
		@Pc(13) byte[] local13 = Static69.aByteArray26;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass128_2.anInt3840;
		@Pc(36) int local36 = this.anInt1832 + this.aClass128_2.anInt3840 * this.anInt1833;
		@Pc(38) int local38;
		@Pc(51) int local51;
		for (local38 = -128; local38 < 0; local38++) {
			local22 = (local22 << 8) - local22;
			for (local51 = -128; local51 < 0; local51++) {
				if (local11[local36++] != 0) {
					local22++;
				}
			}
			local36 += local26 - 128;
		}
		if (this.aClass20_Sub1_1 != null && local22 == this.anInt1835) {
			this.aBoolean176 = false;
			return;
		}
		this.anInt1835 = local22;
		local38 = 0;
		local36 = this.anInt1832 + local26 * this.anInt1833;
		for (local51 = -128; local51 < 0; local51++) {
			for (@Pc(110) int local110 = -128; local110 < 0; local110++) {
				if (local11[local36] == 0) {
					@Pc(127) int local127 = 0;
					if (local11[local36 - 1] != 0) {
						local127++;
					}
					if (local11[local36 + 1] != 0) {
						local127++;
					}
					if (local11[local36 - local26] != 0) {
						local127++;
					}
					if (local11[local36 + local26] != 0) {
						local127++;
					}
					local13[local38++] = (byte) (local127 * 17);
				} else {
					local13[local38++] = 68;
				}
				local36++;
			}
			local36 += this.aClass128_2.anInt3840 - 128;
		}
		if (this.aClass20_Sub1_1 == null) {
			this.aClass20_Sub1_1 = new Class20_Sub1(this.aClass32_Sub2_14, 3553, 6406, 128, 128, false, Static69.aByteArray26, 6406, false);
			this.aClass20_Sub1_1.method1388(false, false);
			this.aClass20_Sub1_1.method5512(true);
		} else {
			this.aClass20_Sub1_1.method1386(128, 128, Static69.aByteArray26, 6406, false);
		}
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)V")
	public void method1622() {
		this.method1620(this.anInt1834, this.anInterface4_1);
	}
}
