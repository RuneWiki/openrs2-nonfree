import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ku")
public final class Class146 {

	@OriginalMember(owner = "client!ku", name = "d", descriptor = "I")
	private int anInt3865 = -1;

	@OriginalMember(owner = "client!ku", name = "q", descriptor = "Z")
	public boolean aBoolean312 = true;

	@OriginalMember(owner = "client!ku", name = "h", descriptor = "I")
	private final int anInt3868;

	@OriginalMember(owner = "client!ku", name = "o", descriptor = "I")
	private final int anInt3871;

	@OriginalMember(owner = "client!ku", name = "k", descriptor = "Lclient!qg;")
	private final Class121_Sub2 aClass121_Sub2_17;

	@OriginalMember(owner = "client!ku", name = "m", descriptor = "Lclient!ab;")
	private final Class3 aClass3_1;

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "I")
	private final int anInt3864;

	@OriginalMember(owner = "client!ku", name = "i", descriptor = "Lclient!ce;")
	private Interface2 anInterface2_1;

	@OriginalMember(owner = "client!ku", name = "r", descriptor = "Lclient!vq;")
	private Class28_Sub2 aClass28_Sub2_2;

	@OriginalMember(owner = "client!ku", name = "l", descriptor = "Lclient!jp;")
	private Class21_Sub2 aClass21_Sub2_1;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lclient!qg;Lclient!ab;Lclient!pp;IIIII)V")
	public Class146(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) Class70_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt3868 = arg6;
		this.anInt3871 = arg7;
		this.aClass121_Sub2_17 = arg0;
		this.aClass3_1 = arg1;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(48) int local48 = local31 + (local37 + local35) * arg2.anInt5251;
			for (local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray6[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		this.anInt3864 = local27;
		if (local27 <= 0) {
			this.aClass21_Sub2_1 = null;
		} else {
			@Pc(93) Class1_Sub14 local93 = new Class1_Sub14(local27 * 2);
			@Pc(112) int local112;
			@Pc(120) short[] local120;
			@Pc(124) int local124;
			@Pc(110) int local110;
			if (this.aClass121_Sub2_17.aBoolean471) {
				for (local50 = 0; local50 < local25; local50++) {
					local110 = (local35 + local50) * arg2.anInt5251 + local31;
					for (local112 = 0; local112 < local25; local112++) {
						local120 = arg2.aShortArrayArray6[local110++];
						if (local120 != null) {
							for (local124 = 0; local124 < local120.length; local124++) {
								local93.method4504(local120[local124] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local50 = 0; local50 < local25; local50++) {
					local110 = local31 + arg2.anInt5251 * (local50 + local35);
					for (local112 = 0; local112 < local25; local112++) {
						local120 = arg2.aShortArrayArray6[local110++];
						if (local120 != null) {
							for (local124 = 0; local124 < local120.length; local124++) {
								local93.method4493(local120[local124] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface2_1 = this.aClass121_Sub2_17.method4651(local93.anInt5695, false, local93.aByteArray65);
			this.aClass28_Sub2_2 = new Class28_Sub2(this.aClass121_Sub2_17, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V")
	public void method3245() {
		this.method3249(this.anInterface2_1, this.anInt3864);
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(II[BB)V")
	public void method3246(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		this.aClass28_Sub2_2.method5945(arg1, this.aClass121_Sub2_17.method4718(5123) * arg0);
		this.method3249(this.aClass28_Sub2_2, arg0);
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(Z)V")
	private void method3248() {
		if (!this.aBoolean312) {
			return;
		}
		this.aBoolean312 = false;
		@Pc(16) byte[] local16 = this.aClass3_1.aByteArray1;
		@Pc(27) byte[] local27 = Static156.aByteArray28;
		@Pc(29) int local29 = 0;
		@Pc(33) int local33 = this.aClass3_1.anInt45;
		@Pc(44) int local44 = this.anInt3868 + this.anInt3871 * this.aClass3_1.anInt45;
		@Pc(56) int local56;
		for (@Pc(46) int local46 = -128; local46 < 0; local46++) {
			local29 = (local29 << 8) - local29;
			for (local56 = -128; local56 < 0; local56++) {
				if (local16[local44++] != 0) {
					local29++;
				}
			}
			local44 += local33 - 128;
		}
		if (this.aClass21_Sub2_1 != null && local29 == this.anInt3865) {
			this.aBoolean312 = false;
			return;
		}
		this.anInt3865 = local29;
		local56 = 0;
		local44 = this.anInt3868 + this.anInt3871 * local33;
		for (@Pc(109) int local109 = -128; local109 < 0; local109++) {
			for (@Pc(113) int local113 = -128; local113 < 0; local113++) {
				if (local16[local44] == 0) {
					@Pc(124) int local124 = 0;
					if (local16[local44 - 1] != 0) {
						local124++;
					}
					if (local16[local44 + 1] != 0) {
						local124++;
					}
					if (local16[local44 - local33] != 0) {
						local124++;
					}
					if (local16[local33 + local44] != 0) {
						local124++;
					}
					local27[local56++] = (byte) (local124 * 17);
				} else {
					local27[local56++] = 68;
				}
				local44++;
			}
			local44 += this.aClass3_1.anInt45 - 128;
		}
		if (this.aClass21_Sub2_1 == null) {
			this.aClass21_Sub2_1 = new Class21_Sub2(this.aClass121_Sub2_17, 3553, 6406, 128, 128, false, Static156.aByteArray28, 6406, false);
			this.aClass21_Sub2_1.method3487(false, false);
			this.aClass21_Sub2_1.method3755(true);
		} else {
			this.aClass21_Sub2_1.method3486(false, Static156.aByteArray28, 6406, 128, 128);
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lclient!ce;BI)V")
	private void method3249(@OriginalArg(0) Interface2 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			this.method3248();
			this.aClass121_Sub2_17.method4681(this.aClass21_Sub2_1);
			this.aClass121_Sub2_17.method4725(arg1, arg0, 0);
		}
	}
}
