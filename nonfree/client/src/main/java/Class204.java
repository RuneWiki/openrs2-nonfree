import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class204 {

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
	private int anInt5477 = -1;

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "Z")
	public boolean aBoolean424 = true;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
	private final int anInt5475;

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "Lclient!hk;")
	private final Class16_Sub2 aClass16_Sub2_27;

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
	private final int anInt5479;

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "Lclient!pk;")
	private final Class280 aClass280_1;

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
	private final int anInt5480;

	@OriginalMember(owner = "client!kd", name = "q", descriptor = "Lclient!kf;")
	private Class39_Sub4 aClass39_Sub4_3;

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "Lclient!nc;")
	private Interface17 anInterface17_5;

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "Lclient!rs;")
	private Class127_Sub2 aClass127_Sub2_2;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!hk;Lclient!pk;Lclient!vca;IIIII)V")
	public Class204(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) Class280 arg1, @OriginalArg(2) Class104_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt5475 = arg6;
		this.aClass16_Sub2_27 = arg0;
		this.anInt5479 = arg7;
		this.aClass280_1 = arg1;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(52) int local52;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(50) int local50 = (local35 + local37) * arg2.anInt9718 + local31;
			for (local52 = 0; local52 < local25; local52++) {
				@Pc(60) short[] local60 = arg2.aShortArrayArray22[local50++];
				if (local60 != null) {
					local27 += local60.length;
				}
			}
		}
		this.anInt5480 = local27;
		if (local27 <= 0) {
			this.aClass39_Sub4_3 = null;
		} else {
			@Pc(99) Class3_Sub17 local99 = new Class3_Sub17(local27 * 2);
			@Pc(118) int local118;
			@Pc(126) short[] local126;
			@Pc(130) int local130;
			@Pc(116) int local116;
			if (this.aClass16_Sub2_27.aBoolean322) {
				for (local52 = 0; local52 < local25; local52++) {
					local116 = local31 + arg2.anInt9718 * (local52 + local35);
					for (local118 = 0; local118 < local25; local118++) {
						local126 = arg2.aShortArrayArray22[local116++];
						if (local126 != null) {
							for (local130 = 0; local130 < local126.length; local130++) {
								local99.method4876(local126[local130] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local52 = 0; local52 < local25; local52++) {
					local116 = (local52 + local35) * arg2.anInt9718 + local31;
					for (local118 = 0; local118 < local25; local118++) {
						local126 = arg2.aShortArrayArray22[local116++];
						if (local126 != null) {
							for (local130 = 0; local130 < local126.length; local130++) {
								local99.method4843(local126[local130] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface17_5 = this.aClass16_Sub2_27.method3613(false, local99.lb, local99.aByteArray59);
			this.aClass127_Sub2_2 = new Class127_Sub2(this.aClass16_Sub2_27, 5123, (byte[]) null, 1);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!nc;II)V")
	private void method4636(@OriginalArg(0) Interface17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method4641();
			this.aClass16_Sub2_27.method3620(this.aClass39_Sub4_3);
			this.aClass16_Sub2_27.method3632(0, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
	public void method4637() {
		this.method4636(this.anInterface17_5, this.anInt5480);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z[BII)V")
	public void method4640(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.aClass127_Sub2_2.method7366(arg0, this.aClass16_Sub2_27.method3674(5123) * arg1);
		this.method4636(this.aClass127_Sub2_2, arg1);
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)V")
	private void method4641() {
		if (!this.aBoolean424) {
			return;
		}
		this.aBoolean424 = false;
		@Pc(16) byte[] local16 = this.aClass280_1.aByteArray74;
		@Pc(20) byte[] local20 = this.aClass16_Sub2_27.aByteArray39;
		@Pc(22) int local22 = 0;
		@Pc(30) int local30 = this.aClass280_1.anInt7923;
		@Pc(40) int local40 = this.anInt5475 + this.anInt5479 * this.aClass280_1.anInt7923;
		@Pc(53) int local53;
		for (@Pc(42) int local42 = -128; local42 < 0; local42++) {
			local22 = (local22 << 8) - local22;
			for (local53 = -128; local53 < 0; local53++) {
				if (local16[local40++] != 0) {
					local22++;
				}
			}
			local40 += local30 - 128;
		}
		if (this.aClass39_Sub4_3 != null && this.anInt5477 == local22) {
			this.aBoolean424 = false;
			return;
		}
		this.anInt5477 = local22;
		local53 = 0;
		local40 = this.anInt5479 * local30 + this.anInt5475;
		for (@Pc(102) int local102 = -128; local102 < 0; local102++) {
			for (@Pc(106) int local106 = -128; local106 < 0; local106++) {
				if (local16[local40] == 0) {
					@Pc(124) int local124 = 0;
					if (local16[local40 - 1] != 0) {
						local124++;
					}
					if (local16[local40 + 1] != 0) {
						local124++;
					}
					if (local16[local40 - local30] != 0) {
						local124++;
					}
					if (local16[local30 + local40] != 0) {
						local124++;
					}
					local20[local53++] = (byte) (local124 * 17);
				} else {
					local20[local53++] = 68;
				}
				local40++;
			}
			local40 += this.aClass280_1.anInt7923 - 128;
		}
		if (this.aClass39_Sub4_3 == null) {
			this.aClass39_Sub4_3 = new Class39_Sub4(this.aClass16_Sub2_27, 3553, 6406, 128, 128, false, this.aClass16_Sub2_27.aByteArray39, 6406, false);
			this.aClass39_Sub4_3.method8469(false, false);
			this.aClass39_Sub4_3.method8465(true);
		} else {
			this.aClass39_Sub4_3.method8468(128, 128, this.aClass16_Sub2_27.aByteArray39, false, 6406);
		}
	}
}
