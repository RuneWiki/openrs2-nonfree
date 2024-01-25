import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class192 {

	@OriginalMember(owner = "client!lh", name = "p", descriptor = "Z")
	public boolean aBoolean378 = true;

	@OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
	private int anInt5125 = -1;

	@OriginalMember(owner = "client!lh", name = "l", descriptor = "Lclient!vj;")
	private final Class45_Sub3 aClass45_Sub3_32;

	@OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
	private final int anInt5130;

	@OriginalMember(owner = "client!lh", name = "s", descriptor = "Lclient!haa;")
	private final Class121 aClass121_1;

	@OriginalMember(owner = "client!lh", name = "r", descriptor = "I")
	private final int anInt5129;

	@OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
	private final int anInt5124;

	@OriginalMember(owner = "client!lh", name = "o", descriptor = "Lclient!g;")
	private Class24_Sub1 aClass24_Sub1_5;

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "Lclient!cn;")
	private Interface2 anInterface2_3;

	@OriginalMember(owner = "client!lh", name = "q", descriptor = "Lclient!gj;")
	private Class111_Sub1 aClass111_Sub1_2;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lclient!vj;Lclient!haa;Lclient!mea;IIIII)V")
	public Class192(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) Class34_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass45_Sub3_32 = arg0;
		this.anInt5130 = arg7;
		this.aClass121_1 = arg1;
		this.anInt5129 = arg6;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(51) int local51;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(49) int local49 = arg2.anInt7854 * (local37 + local35) + local31;
			for (local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray20[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		this.anInt5124 = local27;
		if (local27 <= 0) {
			this.aClass24_Sub1_5 = null;
		} else {
			@Pc(90) Class3_Sub11 local90 = new Class3_Sub11(local27 * 2);
			@Pc(110) int local110;
			@Pc(118) short[] local118;
			@Pc(122) int local122;
			@Pc(108) int local108;
			if (this.aClass45_Sub3_32.aBoolean687) {
				for (local51 = 0; local51 < local25; local51++) {
					local108 = arg2.anInt7854 * (local51 + local35) + local31;
					for (local110 = 0; local110 < local25; local110++) {
						local118 = arg2.aShortArrayArray20[local108++];
						if (local118 != null) {
							for (local122 = 0; local122 < local118.length; local122++) {
								local90.method5200(local118[local122] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local51 = 0; local51 < local25; local51++) {
					local108 = local31 + (local51 + local35) * arg2.anInt7854;
					for (local110 = 0; local110 < local25; local110++) {
						local118 = arg2.aShortArrayArray20[local108++];
						if (local118 != null) {
							for (local122 = 0; local122 < local118.length; local122++) {
								local90.method5222(local118[local122] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface2_3 = this.aClass45_Sub3_32.method7477(local90.anInt6128, false, local90.aByteArray62);
			this.aClass111_Sub1_2 = new Class111_Sub1(this.aClass45_Sub3_32, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILclient!cn;)V")
	private void method4447(@OriginalArg(1) int arg0, @OriginalArg(2) Interface2 arg1) {
		if (arg0 != 0) {
			this.method4448();
			this.aClass45_Sub3_32.method7475(this.aClass24_Sub1_5);
			this.aClass45_Sub3_32.method7482(arg1, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
	private void method4448() {
		if (!this.aBoolean378) {
			return;
		}
		this.aBoolean378 = false;
		@Pc(16) byte[] local16 = this.aClass121_1.aByteArray38;
		@Pc(20) byte[] local20 = this.aClass45_Sub3_32.aByteArray93;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass121_1.anInt3599;
		@Pc(37) int local37 = this.anInt5129 + this.aClass121_1.anInt3599 * this.anInt5130;
		@Pc(50) int local50;
		for (@Pc(39) int local39 = -128; local39 < 0; local39++) {
			local22 = (local22 << 8) - local22;
			for (local50 = -128; local50 < 0; local50++) {
				if (local16[local37++] != 0) {
					local22++;
				}
			}
			local37 += local26 - 128;
		}
		if (this.aClass24_Sub1_5 != null && local22 == this.anInt5125) {
			this.aBoolean378 = false;
			return;
		}
		this.anInt5125 = local22;
		local50 = 0;
		local37 = this.anInt5129 + local26 * this.anInt5130;
		for (@Pc(112) int local112 = -128; local112 < 0; local112++) {
			for (@Pc(116) int local116 = -128; local116 < 0; local116++) {
				if (local16[local37] == 0) {
					@Pc(124) int local124 = 0;
					if (local16[local37 - 1] != 0) {
						local124++;
					}
					if (local16[local37 + 1] != 0) {
						local124++;
					}
					if (local16[local37 - local26] != 0) {
						local124++;
					}
					if (local16[local37 + local26] != 0) {
						local124++;
					}
					local20[local50++] = (byte) (local124 * 17);
				} else {
					local20[local50++] = 68;
				}
				local37++;
			}
			local37 += this.aClass121_1.anInt3599 - 128;
		}
		if (this.aClass24_Sub1_5 == null) {
			this.aClass24_Sub1_5 = new Class24_Sub1(this.aClass45_Sub3_32, 3553, 6406, 128, 128, false, this.aClass45_Sub3_32.aByteArray93, 6406, false);
			this.aClass24_Sub1_5.method824(false, false);
			this.aClass24_Sub1_5.method2802(true);
		} else {
			this.aClass24_Sub1_5.method825(false, 128, 128, this.aClass45_Sub3_32.aByteArray93, 6406);
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I[BIB)V")
	public void method4449(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.aClass111_Sub1_2.method7527(arg1, arg0 * this.aClass45_Sub3_32.method7506(5123));
		this.method4447(arg0, this.aClass111_Sub1_2);
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
	public void method4450() {
		this.method4447(this.anInt5124, this.anInterface2_3);
	}
}
