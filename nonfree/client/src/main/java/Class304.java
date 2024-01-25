import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class304 {

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "Z")
	public boolean aBoolean639 = true;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
	private int anInt8934 = -1;

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "Lclient!ou;")
	private final Class244 aClass244_2;

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
	private final int anInt8940;

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
	private final int anInt8941;

	@OriginalMember(owner = "client!sd", name = "s", descriptor = "Lclient!nv;")
	private final Class16_Sub3 aClass16_Sub3_37;

	@OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
	private final int anInt8944;

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "Lclient!tv;")
	private Interface23 anInterface23_4;

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "Lclient!ht;")
	private Class53_Sub1 aClass53_Sub1_2;

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "Lclient!wn;")
	private Class20_Sub4 aClass20_Sub4_6;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lclient!nv;Lclient!ou;Lclient!eo;IIIII)V")
	public Class304(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) Class244 arg1, @OriginalArg(2) Class86_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass244_2 = arg1;
		this.anInt8940 = arg6;
		this.anInt8941 = arg7;
		this.aClass16_Sub3_37 = arg0;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(51) int local51;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(49) int local49 = local31 + (local35 + local37) * arg2.anInt9955;
			for (local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray5[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		this.anInt8944 = local27;
		if (local27 <= 0) {
			this.aClass20_Sub4_6 = null;
		} else {
			@Pc(97) Class8_Sub8 local97 = new Class8_Sub8(local27 * 2);
			@Pc(116) int local116;
			@Pc(124) short[] local124;
			@Pc(128) int local128;
			@Pc(114) int local114;
			if (this.aClass16_Sub3_37.aBoolean519) {
				for (local51 = 0; local51 < local25; local51++) {
					local114 = arg2.anInt9955 * (local51 + local35) + local31;
					for (local116 = 0; local116 < local25; local116++) {
						local124 = arg2.aShortArrayArray5[local114++];
						if (local124 != null) {
							for (local128 = 0; local128 < local124.length; local128++) {
								local97.method8548(local124[local128] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local51 = 0; local51 < local25; local51++) {
					local114 = local31 + arg2.anInt9955 * (local51 + local35);
					for (local116 = 0; local116 < local25; local116++) {
						local124 = arg2.aShortArrayArray5[local114++];
						if (local124 != null) {
							for (local128 = 0; local128 < local124.length; local128++) {
								local97.method8534(local124[local128] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface23_4 = this.aClass16_Sub3_37.method6007(local97.anInt10588, false, local97.aByteArray107);
			this.aClass53_Sub1_2 = new Class53_Sub1(this.aClass16_Sub3_37, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!tv;I)V")
	private void method7336(@OriginalArg(1) Interface23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			this.method7340();
			this.aClass16_Sub3_37.method6020(this.aClass20_Sub4_6);
			this.aClass16_Sub3_37.method5992(arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIZ[B)V")
	public void method7337(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		this.aClass53_Sub1_2.method5438(arg1, arg0 * this.aClass16_Sub3_37.method5991(5123));
		this.method7336(this.aClass53_Sub1_2, arg0);
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
	public void method7339() {
		this.method7336(this.anInterface23_4, this.anInt8944);
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)V")
	private void method7340() {
		if (!this.aBoolean639) {
			return;
		}
		this.aBoolean639 = false;
		@Pc(16) byte[] local16 = this.aClass244_2.aByteArray67;
		@Pc(20) byte[] local20 = this.aClass16_Sub3_37.aByteArray54;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass244_2.anInt7802;
		@Pc(36) int local36 = this.aClass244_2.anInt7802 * this.anInt8941 + this.anInt8940;
		@Pc(49) int local49;
		for (@Pc(38) int local38 = -128; local38 < 0; local38++) {
			local22 = (local22 << 8) - local22;
			for (local49 = -128; local49 < 0; local49++) {
				if (local16[local36++] != 0) {
					local22++;
				}
			}
			local36 += local26 - 128;
		}
		if (this.aClass20_Sub4_6 != null && local22 == this.anInt8934) {
			this.aBoolean639 = false;
			return;
		}
		this.anInt8934 = local22;
		local49 = 0;
		local36 = local26 * this.anInt8941 + this.anInt8940;
		for (@Pc(105) int local105 = -128; local105 < 0; local105++) {
			for (@Pc(109) int local109 = -128; local109 < 0; local109++) {
				if (local16[local36] == 0) {
					@Pc(117) int local117 = 0;
					if (local16[local36 - 1] != 0) {
						local117++;
					}
					if (local16[local36 + 1] != 0) {
						local117++;
					}
					if (local16[local36 - local26] != 0) {
						local117++;
					}
					if (local16[local26 + local36] != 0) {
						local117++;
					}
					local20[local49++] = (byte) (local117 * 17);
				} else {
					local20[local49++] = 68;
				}
				local36++;
			}
			local36 += this.aClass244_2.anInt7802 - 128;
		}
		if (this.aClass20_Sub4_6 == null) {
			this.aClass20_Sub4_6 = new Class20_Sub4(this.aClass16_Sub3_37, 3553, 6406, 128, 128, false, this.aClass16_Sub3_37.aByteArray54, 6406, false);
			this.aClass20_Sub4_6.method7626(false, false);
			this.aClass20_Sub4_6.method7620(true);
		} else {
			this.aClass20_Sub4_6.method7621(128, 128, this.aClass16_Sub3_37.aByteArray54, false, 6406);
		}
	}
}
