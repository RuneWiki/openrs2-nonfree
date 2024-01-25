import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nfa")
public final class Class227 {

	@OriginalMember(owner = "client!nfa", name = "l", descriptor = "I")
	private int anInt7041 = -1;

	@OriginalMember(owner = "client!nfa", name = "h", descriptor = "Z")
	public boolean aBoolean610 = true;

	@OriginalMember(owner = "client!nfa", name = "n", descriptor = "I")
	private final int anInt7043;

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "Lclient!jia;")
	private final Class161 aClass161_1;

	@OriginalMember(owner = "client!nfa", name = "s", descriptor = "I")
	private final int anInt7048;

	@OriginalMember(owner = "client!nfa", name = "f", descriptor = "Lclient!eq;")
	private final Class33_Sub3 aClass33_Sub3_32;

	@OriginalMember(owner = "client!nfa", name = "r", descriptor = "I")
	private final int anInt7047;

	@OriginalMember(owner = "client!nfa", name = "v", descriptor = "Lclient!hga;")
	private Class121_Sub2 aClass121_Sub2_5;

	@OriginalMember(owner = "client!nfa", name = "e", descriptor = "Lclient!jb;")
	private Interface12 anInterface12_5;

	@OriginalMember(owner = "client!nfa", name = "i", descriptor = "Lclient!dn;")
	private Class66_Sub1 aClass66_Sub1_1;

	@OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(Lclient!eq;Lclient!jia;Lclient!qh;IIIII)V")
	public Class227(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) Class274_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt7043 = arg6;
		this.aClass161_1 = arg1;
		this.anInt7048 = arg7;
		this.aClass33_Sub3_32 = arg0;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(51) int local51;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(49) int local49 = (local37 + local35) * arg2.anInt9726 + local31;
			for (local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray19[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		this.anInt7047 = local27;
		if (local27 <= 0) {
			this.aClass121_Sub2_5 = null;
		} else {
			@Pc(94) Class3_Sub15 local94 = new Class3_Sub15(local27 * 2);
			@Pc(115) int local115;
			@Pc(123) short[] local123;
			@Pc(127) int local127;
			@Pc(113) int local113;
			if (this.aClass33_Sub3_32.aBoolean264) {
				for (local51 = 0; local51 < local25; local51++) {
					local113 = local31 + (local35 + local51) * arg2.anInt9726;
					for (local115 = 0; local115 < local25; local115++) {
						local123 = arg2.aShortArrayArray19[local113++];
						if (local123 != null) {
							for (local127 = 0; local127 < local123.length; local127++) {
								local94.method8464(local123[local127] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local51 = 0; local51 < local25; local51++) {
					local113 = arg2.anInt9726 * (local35 + local51) + local31;
					for (local115 = 0; local115 < local25; local115++) {
						local123 = arg2.aShortArrayArray19[local113++];
						if (local123 != null) {
							for (local127 = 0; local127 < local123.length; local127++) {
								local94.method8405(local123[local127] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface12_5 = this.aClass33_Sub3_32.method3064(local94.aByteArray106, false, local94.anInt10282);
			this.aClass66_Sub1_1 = new Class66_Sub1(this.aClass33_Sub3_32, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I)V")
	public void method5903() {
		this.method5908(this.anInt7047, this.anInterface12_5);
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(ILclient!jb;B)V")
	private void method5908(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		if (arg0 != 0) {
			this.method5912();
			this.aClass33_Sub3_32.method3012(this.aClass121_Sub2_5);
			this.aClass33_Sub3_32.method3075(arg0, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I[BII)V")
	public void method5909(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.aClass66_Sub1_1.method3814(arg1, this.aClass33_Sub3_32.method3058(5123) * arg0);
		this.method5908(arg0, this.aClass66_Sub1_1);
	}

	@OriginalMember(owner = "client!nfa", name = "c", descriptor = "(I)V")
	private void method5912() {
		if (!this.aBoolean610) {
			return;
		}
		this.aBoolean610 = false;
		@Pc(16) byte[] local16 = this.aClass161_1.aByteArray63;
		@Pc(20) byte[] local20 = this.aClass33_Sub3_32.aByteArray35;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass161_1.anInt5767;
		@Pc(36) int local36 = this.anInt7048 * this.aClass161_1.anInt5767 + this.anInt7043;
		@Pc(59) int local59;
		for (@Pc(48) int local48 = -128; local48 < 0; local48++) {
			local22 = (local22 << 8) - local22;
			for (local59 = -128; local59 < 0; local59++) {
				if (local16[local36++] != 0) {
					local22++;
				}
			}
			local36 += local26 - 128;
		}
		if (this.aClass121_Sub2_5 != null && this.anInt7041 == local22) {
			this.aBoolean610 = false;
			return;
		}
		this.anInt7041 = local22;
		local59 = 0;
		local36 = this.anInt7048 * local26 + this.anInt7043;
		for (@Pc(105) int local105 = -128; local105 < 0; local105++) {
			for (@Pc(109) int local109 = -128; local109 < 0; local109++) {
				if (local16[local36] == 0) {
					@Pc(124) int local124 = 0;
					if (local16[local36 - 1] != 0) {
						local124++;
					}
					if (local16[local36 + 1] != 0) {
						local124++;
					}
					if (local16[local36 - local26] != 0) {
						local124++;
					}
					if (local16[local26 + local36] != 0) {
						local124++;
					}
					local20[local59++] = (byte) (local124 * 17);
				} else {
					local20[local59++] = 68;
				}
				local36++;
			}
			local36 += this.aClass161_1.anInt5767 - 128;
		}
		if (this.aClass121_Sub2_5 == null) {
			this.aClass121_Sub2_5 = new Class121_Sub2(this.aClass33_Sub3_32, 3553, 6406, 128, 128, false, this.aClass33_Sub3_32.aByteArray35, 6406, false);
			this.aClass121_Sub2_5.method5567(false, false);
			this.aClass121_Sub2_5.method7326(true);
		} else {
			this.aClass121_Sub2_5.method5566(128, 128, false, this.aClass33_Sub3_32.aByteArray35, 6406);
		}
	}
}
