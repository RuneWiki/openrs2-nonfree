import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class14 {

	@OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
	private int anInt149 = -1;

	@OriginalMember(owner = "client!ao", name = "o", descriptor = "Z")
	public boolean aBoolean1 = true;

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
	private final int anInt143;

	@OriginalMember(owner = "client!ao", name = "u", descriptor = "I")
	private final int anInt156;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "Lclient!cn;")
	private final Class42 aClass42_1;

	@OriginalMember(owner = "client!ao", name = "p", descriptor = "Lclient!vd;")
	private final Class51_Sub2 aClass51_Sub2_4;

	@OriginalMember(owner = "client!ao", name = "t", descriptor = "I")
	private final int anInt155;

	@OriginalMember(owner = "client!ao", name = "m", descriptor = "Lclient!ud;")
	private Class59_Sub3 aClass59_Sub3_1;

	@OriginalMember(owner = "client!ao", name = "w", descriptor = "Lclient!oj;")
	private Interface10 anInterface10_1;

	@OriginalMember(owner = "client!ao", name = "i", descriptor = "Lclient!ev;")
	private Class10_Sub2 aClass10_Sub2_1;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lclient!vd;Lclient!cn;Lclient!ne;IIIII)V")
	public Class14(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) Class165_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt143 = arg7;
		this.anInt156 = arg6;
		this.aClass42_1 = arg1;
		this.aClass51_Sub2_4 = arg0;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(48) int local48 = (local35 + local37) * arg2.anInt4489 + local31;
			for (local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray2[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		this.anInt155 = local27;
		if (local27 <= 0) {
			this.aClass59_Sub3_1 = null;
		} else {
			@Pc(92) Class7_Sub14 local92 = new Class7_Sub14(local27 * 2);
			@Pc(112) int local112;
			@Pc(120) short[] local120;
			@Pc(124) int local124;
			@Pc(110) int local110;
			if (this.aClass51_Sub2_4.aBoolean461) {
				for (local50 = 0; local50 < local25; local50++) {
					local110 = local31 + (local35 + local50) * arg2.anInt4489;
					for (local112 = 0; local112 < local25; local112++) {
						local120 = arg2.aShortArrayArray2[local110++];
						if (local120 != null) {
							for (local124 = 0; local124 < local120.length; local124++) {
								local92.method3993(local120[local124] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local50 = 0; local50 < local25; local50++) {
					local110 = local31 + arg2.anInt4489 * (local35 + local50);
					for (local112 = 0; local112 < local25; local112++) {
						local120 = arg2.aShortArrayArray2[local110++];
						if (local120 != null) {
							for (local124 = 0; local124 < local120.length; local124++) {
								local92.method3976(local120[local124] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface10_1 = this.aClass51_Sub2_4.method5383(local92.aByteArray75, false, local92.anInt4989);
			this.aClass10_Sub2_1 = new Class10_Sub2(this.aClass51_Sub2_4, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "([BIIB)V")
	public void method104(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		this.aClass10_Sub2_1.method5743(arg1 * this.aClass51_Sub2_4.method5406(5123), arg0);
		this.method110(this.aClass10_Sub2_1, arg1);
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V")
	public void method108() {
		this.method110(this.anInterface10_1, this.anInt155);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!oj;II)V")
	private void method110(@OriginalArg(0) Interface10 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method113();
			this.aClass51_Sub2_4.method5364(this.aClass59_Sub3_1);
			this.aClass51_Sub2_4.method5365(arg0, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Z)V")
	private void method113() {
		if (!this.aBoolean1) {
			return;
		}
		this.aBoolean1 = false;
		@Pc(16) byte[] local16 = this.aClass42_1.aByteArray10;
		@Pc(20) byte[] local20 = this.aClass51_Sub2_4.aByteArray93;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass42_1.anInt933;
		@Pc(36) int local36 = this.anInt143 * this.aClass42_1.anInt933 + this.anInt156;
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
		if (this.aClass59_Sub3_1 != null && local22 == this.anInt149) {
			this.aBoolean1 = false;
			return;
		}
		this.anInt149 = local22;
		local49 = 0;
		local36 = this.anInt143 * local26 + this.anInt156;
		for (@Pc(102) int local102 = -128; local102 < 0; local102++) {
			for (@Pc(106) int local106 = -128; local106 < 0; local106++) {
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
					if (local16[local36 + local26] != 0) {
						local117++;
					}
					local20[local49++] = (byte) (local117 * 17);
				} else {
					local20[local49++] = 68;
				}
				local36++;
			}
			local36 += this.aClass42_1.anInt933 - 128;
		}
		if (this.aClass59_Sub3_1 == null) {
			this.aClass59_Sub3_1 = new Class59_Sub3(this.aClass51_Sub2_4, 3553, 6406, 128, 128, false, this.aClass51_Sub2_4.aByteArray93, 6406, false);
			this.aClass59_Sub3_1.method5770(false, false);
			this.aClass59_Sub3_1.method5760(true);
		} else {
			this.aClass59_Sub3_1.method5765(6406, this.aClass51_Sub2_4.aByteArray93, 128, false, 128);
		}
	}
}
