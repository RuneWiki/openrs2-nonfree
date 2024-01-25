import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lca")
public final class Class209 {

	@OriginalMember(owner = "client!lca", name = "m", descriptor = "I")
	private int anInt5601 = -1;

	@OriginalMember(owner = "client!lca", name = "o", descriptor = "Z")
	public boolean aBoolean409 = true;

	@OriginalMember(owner = "client!lca", name = "d", descriptor = "I")
	private final int anInt5595;

	@OriginalMember(owner = "client!lca", name = "q", descriptor = "I")
	private final int anInt5604;

	@OriginalMember(owner = "client!lca", name = "h", descriptor = "Lclient!bi;")
	private final Class13_Sub2 aClass13_Sub2_27;

	@OriginalMember(owner = "client!lca", name = "f", descriptor = "Lclient!nr;")
	private final Class244 aClass244_2;

	@OriginalMember(owner = "client!lca", name = "g", descriptor = "I")
	private final int anInt5597;

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "Lclient!g;")
	private Interface7 anInterface7_3;

	@OriginalMember(owner = "client!lca", name = "j", descriptor = "Lclient!kf;")
	private Class130_Sub2 aClass130_Sub2_2;

	@OriginalMember(owner = "client!lca", name = "r", descriptor = "Lclient!bq;")
	private Class10_Sub2 aClass10_Sub2_3;

	@OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(Lclient!bi;Lclient!nr;Lclient!ed;IIIII)V")
	public Class209(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) Class244 arg1, @OriginalArg(2) Class91_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt5595 = arg6;
		this.anInt5604 = arg7;
		this.aClass13_Sub2_27 = arg0;
		this.aClass244_2 = arg1;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(51) int local51;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(49) int local49 = arg2.anInt8650 * (local35 + local37) + local31;
			for (local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray3[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		this.anInt5597 = local27;
		if (local27 <= 0) {
			this.aClass10_Sub2_3 = null;
		} else {
			@Pc(93) Class2_Sub17 local93 = new Class2_Sub17(local27 * 2);
			@Pc(112) int local112;
			@Pc(120) short[] local120;
			@Pc(124) int local124;
			@Pc(110) int local110;
			if (this.aClass13_Sub2_27.aBoolean102) {
				for (local51 = 0; local51 < local25; local51++) {
					local110 = local31 + (local51 + local35) * arg2.anInt8650;
					for (local112 = 0; local112 < local25; local112++) {
						local120 = arg2.aShortArrayArray3[local110++];
						if (local120 != null) {
							for (local124 = 0; local124 < local120.length; local124++) {
								local93.method2879(local120[local124] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local51 = 0; local51 < local25; local51++) {
					local110 = (local51 + local35) * arg2.anInt8650 + local31;
					for (local112 = 0; local112 < local25; local112++) {
						local120 = arg2.aShortArrayArray3[local110++];
						if (local120 != null) {
							for (local124 = 0; local124 < local120.length; local124++) {
								local93.method2878(local120[local124] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface7_3 = this.aClass13_Sub2_27.method1020(local93.anInt3378, false, local93.aByteArray26);
			this.aClass130_Sub2_2 = new Class130_Sub2(this.aClass13_Sub2_27, 5123, (byte[]) null, 1);
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(III[B)V")
	public void method4871(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		this.aClass130_Sub2_2.method4615(arg1, arg0 * this.aClass13_Sub2_27.method1094(5123));
		this.method4872(this.aClass130_Sub2_2, arg0);
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(BLclient!g;I)V")
	private void method4872(@OriginalArg(1) Interface7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			this.method4876();
			this.aClass13_Sub2_27.method1096(this.aClass10_Sub2_3);
			this.aClass13_Sub2_27.method1100(0, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "(I)V")
	public void method4875() {
		this.method4872(this.anInterface7_3, this.anInt5597);
	}

	@OriginalMember(owner = "client!lca", name = "c", descriptor = "(I)V")
	private void method4876() {
		if (!this.aBoolean409) {
			return;
		}
		this.aBoolean409 = false;
		@Pc(16) byte[] local16 = this.aClass244_2.aByteArray69;
		@Pc(20) byte[] local20 = this.aClass13_Sub2_27.aByteArray6;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass244_2.anInt6706;
		@Pc(36) int local36 = this.anInt5604 * this.aClass244_2.anInt6706 + this.anInt5595;
		@Pc(54) int local54;
		for (@Pc(38) int local38 = -128; local38 < 0; local38++) {
			local22 = (local22 << 8) - local22;
			for (local54 = -128; local54 < 0; local54++) {
				if (local16[local36++] != 0) {
					local22++;
				}
			}
			local36 += local26 - 128;
		}
		if (this.aClass10_Sub2_3 != null && this.anInt5601 == local22) {
			this.aBoolean409 = false;
			return;
		}
		this.anInt5601 = local22;
		local36 = local26 * this.anInt5604 + this.anInt5595;
		local54 = 0;
		for (@Pc(109) int local109 = -128; local109 < 0; local109++) {
			for (@Pc(113) int local113 = -128; local113 < 0; local113++) {
				if (local16[local36] == 0) {
					@Pc(128) int local128 = 0;
					if (local16[local36 - 1] != 0) {
						local128++;
					}
					if (local16[local36 + 1] != 0) {
						local128++;
					}
					if (local16[local36 - local26] != 0) {
						local128++;
					}
					if (local16[local26 + local36] != 0) {
						local128++;
					}
					local20[local54++] = (byte) (local128 * 17);
				} else {
					local20[local54++] = 68;
				}
				local36++;
			}
			local36 += this.aClass244_2.anInt6706 - 128;
		}
		if (this.aClass10_Sub2_3 == null) {
			this.aClass10_Sub2_3 = new Class10_Sub2(this.aClass13_Sub2_27, 3553, 6406, 128, 128, false, this.aClass13_Sub2_27.aByteArray6, 6406, false);
			this.aClass10_Sub2_3.method720(false, false);
			this.aClass10_Sub2_3.method7260(true);
		} else {
			this.aClass10_Sub2_3.method727(false, this.aClass13_Sub2_27.aByteArray6, 128, 128, 6406);
		}
	}
}
