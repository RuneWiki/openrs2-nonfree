import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class153 {

	@OriginalMember(owner = "client!or", name = "e", descriptor = "I")
	private int anInt4668 = -1;

	@OriginalMember(owner = "client!or", name = "c", descriptor = "Z")
	public boolean aBoolean267 = true;

	@OriginalMember(owner = "client!or", name = "j", descriptor = "I")
	private final int anInt4671;

	@OriginalMember(owner = "client!or", name = "g", descriptor = "I")
	private final int anInt4669;

	@OriginalMember(owner = "client!or", name = "i", descriptor = "Lclient!am;")
	private final Class11 aClass11_1;

	@OriginalMember(owner = "client!or", name = "b", descriptor = "Lclient!se;")
	private final Class122_Sub2 aClass122_Sub2_33;

	@OriginalMember(owner = "client!or", name = "h", descriptor = "I")
	private final int anInt4670;

	@OriginalMember(owner = "client!or", name = "f", descriptor = "Lclient!oa;")
	private Class66_Sub1 aClass66_Sub1_3;

	@OriginalMember(owner = "client!or", name = "d", descriptor = "Lclient!rd;")
	private Interface8 anInterface8_3;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lclient!se;Lclient!am;Lclient!sb;IIIII)V")
	public Class153(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) Class22_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt4671 = arg6;
		this.anInt4669 = arg7;
		this.aClass11_1 = arg1;
		this.aClass122_Sub2_33 = arg0;
		@Pc(23) int local23 = 0x1 << arg5;
		@Pc(25) int local25 = 0;
		@Pc(29) int local29 = arg3 << arg5;
		@Pc(33) int local33 = arg4 << arg5;
		@Pc(52) int local52;
		@Pc(54) int local54;
		for (@Pc(35) int local35 = 0; local35 < local23; local35++) {
			local52 = (local33 + local35) * arg2.anInt5574 + local29;
			for (local54 = 0; local54 < local23; local54++) {
				@Pc(63) short[] local63 = arg2.aShortArrayArray6[local52++];
				if (local63 != null) {
					local25 += local63.length;
				}
			}
		}
		this.anInt4670 = local25;
		if (local25 <= 0) {
			this.aClass66_Sub1_3 = null;
		} else {
			@Pc(93) Class3_Sub4 local93 = new Class3_Sub4(local25 * 2);
			@Pc(127) short[] local127;
			@Pc(132) int local132;
			@Pc(114) int local114;
			if (this.aClass122_Sub2_33.aBoolean363) {
				for (local52 = 0; local52 < local23; local52++) {
					local54 = local29 + (local33 + local52) * arg2.anInt5574;
					for (local114 = 0; local114 < local23; local114++) {
						local127 = arg2.aShortArrayArray6[local54++];
						if (local127 != null) {
							for (local132 = 0; local132 < local127.length; local132++) {
								local93.method3660(local127[local132]);
							}
						}
					}
				}
			} else {
				for (local52 = 0; local52 < local23; local52++) {
					local54 = (local33 + local52) * arg2.anInt5574 + local29;
					for (local114 = 0; local114 < local23; local114++) {
						local127 = arg2.aShortArrayArray6[local54++];
						if (local127 != null) {
							for (local132 = 0; local132 < local127.length; local132++) {
								local93.method3616(local127[local132]);
							}
						}
					}
				}
			}
			this.anInterface8_3 = this.aClass122_Sub2_33.method4831(local93.aByteArray70, local93.anInt4268, false);
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ILclient!rd;I)V")
	public void method3981(@OriginalArg(0) int arg0, @OriginalArg(1) Interface8 arg1) {
		if (arg0 != 0) {
			this.method3983();
			this.aClass122_Sub2_33.method4864(this.aClass66_Sub1_3);
			this.aClass122_Sub2_33.method4840(arg1, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)V")
	public void method3982() {
		this.method3981(this.anInt4670, this.anInterface8_3);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V")
	private void method3983() {
		if (!this.aBoolean267) {
			return;
		}
		this.aBoolean267 = false;
		@Pc(11) byte[] local11 = this.aClass11_1.aByteArray2;
		@Pc(13) byte[] local13 = Static229.aByteArray76;
		@Pc(15) int local15 = 0;
		@Pc(23) int local23 = this.aClass11_1.anInt328;
		@Pc(33) int local33 = this.aClass11_1.anInt328 * this.anInt4669 + this.anInt4671;
		@Pc(35) int local35;
		@Pc(47) int local47;
		for (local35 = -128; local35 < 0; local35++) {
			local15 = (local15 << 8) - local15;
			for (local47 = -128; local47 < 0; local47++) {
				if (local11[local33++] != 0) {
					local15++;
				}
			}
			local33 += local23 - 128;
		}
		if (this.aClass66_Sub1_3 != null && local15 == this.anInt4668) {
			this.aBoolean267 = false;
			return;
		}
		this.anInt4668 = local15;
		local33 = this.anInt4669 * local23 + this.anInt4671;
		local35 = 0;
		for (local47 = -128; local47 < 0; local47++) {
			for (@Pc(105) int local105 = -128; local105 < 0; local105++) {
				if (local11[local33] == 0) {
					@Pc(117) int local117 = 0;
					if (local11[local33 - 1] != 0) {
						local117++;
					}
					if (local11[local33 + 1] != 0) {
						local117++;
					}
					if (local11[local33 - local23] != 0) {
						local117++;
					}
					if (local11[local33 + local23] != 0) {
						local117++;
					}
					local13[local35++] = (byte) (local117 * 17);
				} else {
					local13[local35++] = 68;
				}
				local33++;
			}
			local33 += this.aClass11_1.anInt328 - 128;
		}
		if (this.aClass66_Sub1_3 == null) {
			this.aClass66_Sub1_3 = new Class66_Sub1(this.aClass122_Sub2_33, 3553, 6406, 128, 128, false, Static229.aByteArray76, 6406, false);
			this.aClass66_Sub1_3.method1516(false, false);
			this.aClass66_Sub1_3.method4044(true);
		} else {
			this.aClass66_Sub1_3.method1513(128, 128, Static229.aByteArray76, 6406, false);
		}
	}
}
