import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lba")
public final class Class182 {

	@OriginalMember(owner = "client!lba", name = "g", descriptor = "Z")
	public boolean aBoolean382 = true;

	@OriginalMember(owner = "client!lba", name = "i", descriptor = "I")
	private int anInt5606 = -1;

	@OriginalMember(owner = "client!lba", name = "f", descriptor = "Lclient!mi;")
	private final Class206 aClass206_1;

	@OriginalMember(owner = "client!lba", name = "k", descriptor = "Lclient!er;")
	private final Class31_Sub2 aClass31_Sub2_25;

	@OriginalMember(owner = "client!lba", name = "e", descriptor = "I")
	private final int anInt5605;

	@OriginalMember(owner = "client!lba", name = "n", descriptor = "I")
	private final int anInt5609;

	@OriginalMember(owner = "client!lba", name = "j", descriptor = "I")
	private final int anInt5607;

	@OriginalMember(owner = "client!lba", name = "p", descriptor = "Lclient!lga;")
	private Interface11 anInterface11_4;

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "Lclient!lda;")
	private Class166_Sub2 aClass166_Sub2_1;

	@OriginalMember(owner = "client!lba", name = "h", descriptor = "Lclient!wh;")
	private Class50_Sub1 aClass50_Sub1_4;

	@OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(Lclient!er;Lclient!mi;Lclient!tv;IIIII)V")
	public Class182(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) Class127_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass206_1 = arg1;
		this.aClass31_Sub2_25 = arg0;
		this.anInt5605 = arg7;
		this.anInt5609 = arg6;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(51) int local51;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(49) int local49 = local31 + arg2.anInt10004 * (local35 + local37);
			for (local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray8[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		this.anInt5607 = local27;
		if (local27 <= 0) {
			this.aClass50_Sub1_4 = null;
		} else {
			@Pc(93) Class3_Sub26 local93 = new Class3_Sub26(local27 * 2);
			@Pc(112) int local112;
			@Pc(120) short[] local120;
			@Pc(124) int local124;
			@Pc(110) int local110;
			if (this.aClass31_Sub2_25.aBoolean216) {
				for (local51 = 0; local51 < local25; local51++) {
					local110 = local31 + (local51 + local35) * arg2.anInt10004;
					for (local112 = 0; local112 < local25; local112++) {
						local120 = arg2.aShortArrayArray8[local110++];
						if (local120 != null) {
							for (local124 = 0; local124 < local120.length; local124++) {
								local93.method6769(local120[local124] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local51 = 0; local51 < local25; local51++) {
					local110 = arg2.anInt10004 * (local51 + local35) + local31;
					for (local112 = 0; local112 < local25; local112++) {
						local120 = arg2.aShortArrayArray8[local110++];
						if (local120 != null) {
							for (local124 = 0; local124 < local120.length; local124++) {
								local93.method6793(local120[local124] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface11_4 = this.aClass31_Sub2_25.method2571(local93.anInt8703, false, local93.aByteArray213);
			this.aClass166_Sub2_1 = new Class166_Sub2(this.aClass31_Sub2_25, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "(I)V")
	public void method4552() {
		this.method4554(this.anInt5607, this.anInterface11_4);
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IILclient!lga;)V")
	private void method4554(@OriginalArg(1) int arg0, @OriginalArg(2) Interface11 arg1) {
		if (arg0 != 0) {
			this.method4556();
			this.aClass31_Sub2_25.method2535(this.aClass50_Sub1_4);
			this.aClass31_Sub2_25.method2498(arg0, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(I[BIZ)V")
	public void method4555(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.aClass166_Sub2_1.method5869(arg0 * this.aClass31_Sub2_25.method2496(5123), arg1);
		this.method4554(arg0, this.aClass166_Sub2_1);
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Z)V")
	private void method4556() {
		if (!this.aBoolean382) {
			return;
		}
		this.aBoolean382 = false;
		@Pc(16) byte[] local16 = this.aClass206_1.aByteArray154;
		@Pc(20) byte[] local20 = this.aClass31_Sub2_25.aByteArray71;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass206_1.anInt6043;
		@Pc(36) int local36 = this.aClass206_1.anInt6043 * this.anInt5605 + this.anInt5609;
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
		if (this.aClass50_Sub1_4 != null && this.anInt5606 == local22) {
			this.aBoolean382 = false;
			return;
		}
		this.anInt5606 = local22;
		local49 = 0;
		local36 = this.anInt5605 * local26 + this.anInt5609;
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
			local36 += this.aClass206_1.anInt6043 - 128;
		}
		if (this.aClass50_Sub1_4 == null) {
			this.aClass50_Sub1_4 = new Class50_Sub1(this.aClass31_Sub2_25, 3553, 6406, 128, 128, false, this.aClass31_Sub2_25.aByteArray71, 6406, false);
			this.aClass50_Sub1_4.method1507(false, false);
			this.aClass50_Sub1_4.method6153(true);
		} else {
			this.aClass50_Sub1_4.method1504(128, false, 128, 6406, this.aClass31_Sub2_25.aByteArray71);
		}
	}
}
