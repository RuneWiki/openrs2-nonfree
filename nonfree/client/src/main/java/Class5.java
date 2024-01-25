import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class5 {

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "Z")
	public boolean aBoolean5 = true;

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
	private int anInt83 = -1;

	@OriginalMember(owner = "client!ad", name = "q", descriptor = "Lclient!pea;")
	private final Class121_Sub3 aClass121_Sub3_1;

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
	private final int anInt85;

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
	private final int anInt82;

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "Lclient!at;")
	private final Class20 aClass20_1;

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
	private final int anInt84;

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "Lclient!rm;")
	private Interface19 anInterface19_1;

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "Lclient!fw;")
	private Class113_Sub1 aClass113_Sub1_1;

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "Lclient!qw;")
	private Class35_Sub3 aClass35_Sub3_1;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lclient!pea;Lclient!at;Lclient!le;IIIII)V")
	public Class5(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) Class60_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass121_Sub3_1 = arg0;
		this.anInt85 = arg7;
		this.anInt82 = arg6;
		this.aClass20_1 = arg1;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(51) int local51;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(49) int local49 = (local37 + local35) * arg2.anInt9656 + local31;
			for (local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray10[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		this.anInt84 = local27;
		if (local27 <= 0) {
			this.aClass35_Sub3_1 = null;
		} else {
			@Pc(97) Class6_Sub14 local97 = new Class6_Sub14(local27 * 2);
			@Pc(116) int local116;
			@Pc(124) short[] local124;
			@Pc(128) int local128;
			@Pc(114) int local114;
			if (this.aClass121_Sub3_1.aBoolean458) {
				for (local51 = 0; local51 < local25; local51++) {
					local114 = local31 + (local51 + local35) * arg2.anInt9656;
					for (local116 = 0; local116 < local25; local116++) {
						local124 = arg2.aShortArrayArray10[local114++];
						if (local124 != null) {
							for (local128 = 0; local128 < local124.length; local128++) {
								local97.method5999(local124[local128] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local51 = 0; local51 < local25; local51++) {
					local114 = local31 + (local51 + local35) * arg2.anInt9656;
					for (local116 = 0; local116 < local25; local116++) {
						local124 = arg2.aShortArrayArray10[local114++];
						if (local124 != null) {
							for (local128 = 0; local128 < local124.length; local128++) {
								local97.method6038(local124[local128] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface19_1 = this.aClass121_Sub3_1.method5658(local97.anInt7244, false, local97.aByteArray88);
			this.aClass113_Sub1_1 = new Class113_Sub1(this.aClass121_Sub3_1, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
	private void method72() {
		if (!this.aBoolean5) {
			return;
		}
		this.aBoolean5 = false;
		@Pc(16) byte[] local16 = this.aClass20_1.aByteArray13;
		@Pc(20) byte[] local20 = this.aClass121_Sub3_1.aByteArray83;
		@Pc(30) int local30 = 0;
		@Pc(34) int local34 = this.aClass20_1.anInt371;
		@Pc(44) int local44 = this.anInt85 * this.aClass20_1.anInt371 + this.anInt82;
		@Pc(57) int local57;
		for (@Pc(46) int local46 = -128; local46 < 0; local46++) {
			local30 = (local30 << 8) - local30;
			for (local57 = -128; local57 < 0; local57++) {
				if (local16[local44++] != 0) {
					local30++;
				}
			}
			local44 += local34 - 128;
		}
		if (this.aClass35_Sub3_1 != null && local30 == this.anInt83) {
			this.aBoolean5 = false;
			return;
		}
		this.anInt83 = local30;
		local57 = 0;
		local44 = this.anInt82 + local34 * this.anInt85;
		for (@Pc(113) int local113 = -128; local113 < 0; local113++) {
			for (@Pc(117) int local117 = -128; local117 < 0; local117++) {
				if (local16[local44] == 0) {
					@Pc(125) int local125 = 0;
					if (local16[local44 - 1] != 0) {
						local125++;
					}
					if (local16[local44 + 1] != 0) {
						local125++;
					}
					if (local16[local44 - local34] != 0) {
						local125++;
					}
					if (local16[local44 + local34] != 0) {
						local125++;
					}
					local20[local57++] = (byte) (local125 * 17);
				} else {
					local20[local57++] = 68;
				}
				local44++;
			}
			local44 += this.aClass20_1.anInt371 - 128;
		}
		if (this.aClass35_Sub3_1 == null) {
			this.aClass35_Sub3_1 = new Class35_Sub3(this.aClass121_Sub3_1, 3553, 6406, 128, 128, false, this.aClass121_Sub3_1.aByteArray83, 6406, false);
			this.aClass35_Sub3_1.method4857(false, false);
			this.aClass35_Sub3_1.method5329(true);
		} else {
			this.aClass35_Sub3_1.method4853(128, 128, this.aClass121_Sub3_1.aByteArray83, 6406, false);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!rm;I)V")
	private void method73(@OriginalArg(1) Interface19 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			this.method72();
			this.aClass121_Sub3_1.method5713(this.aClass35_Sub3_1);
			this.aClass121_Sub3_1.method5657(arg1, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZI[BI)V")
	public void method74(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		this.aClass113_Sub1_1.method6484(arg1, this.aClass121_Sub3_1.method5686(5123) * arg0);
		this.method73(this.aClass113_Sub1_1, arg0);
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V")
	public void method75() {
		this.method73(this.anInterface19_1, this.anInt84);
	}
}
