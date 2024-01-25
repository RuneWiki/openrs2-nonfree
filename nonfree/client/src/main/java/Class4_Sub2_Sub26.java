import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class4_Sub2_Sub26 extends Class4_Sub2 {

	@OriginalMember(owner = "client!rb", name = "N", descriptor = "I")
	private int anInt8536 = 2048;

	@OriginalMember(owner = "client!rb", name = "J", descriptor = "I")
	private int anInt8532 = 8192;

	@OriginalMember(owner = "client!rb", name = "M", descriptor = "I")
	private int anInt8535 = 0;

	@OriginalMember(owner = "client!rb", name = "V", descriptor = "I")
	private int anInt8543 = 4096;

	@OriginalMember(owner = "client!rb", name = "Y", descriptor = "I")
	private int anInt8545 = 0;

	@OriginalMember(owner = "client!rb", name = "Q", descriptor = "I")
	private int anInt8539 = 2048;

	@OriginalMember(owner = "client!rb", name = "W", descriptor = "I")
	private int anInt8544 = 12288;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(III)Z")
	private boolean method6612(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt8544 * (arg0 + arg1) >> 12;
		@Pc(22) int local22 = Static365.anIntArray392[local12 * 255 >> 12 & 0xFF];
		@Pc(34) int local34 = (local22 << 12) / this.anInt8544;
		@Pc(41) int local41 = (local34 << 12) / this.anInt8532;
		@Pc(48) int local48 = this.anInt8543 * local41 >> 12;
		return arg0 - arg1 < local48 && arg0 - arg1 > -local48;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method8206(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt8539 = arg0.method7054();
		} else if (arg1 == 1) {
			this.anInt8545 = arg0.method7054();
		} else if (arg1 == 2) {
			this.anInt8535 = arg0.method7054();
		} else if (arg1 == 3) {
			this.anInt8536 = arg0.method7054();
		} else if (arg1 == 4) {
			this.anInt8544 = arg0.method7054();
		} else if (arg1 == 5) {
			this.anInt8543 = arg0.method7054();
		} else if (arg1 == 6) {
			this.anInt8532 = arg0.method7054();
		}
	}

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "(III)Z")
	private boolean method6614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = this.anInt8544 * (arg1 - arg0) >> 12;
		@Pc(23) int local23 = Static365.anIntArray392[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt8544;
		@Pc(42) int local42 = (local30 << 12) / this.anInt8532;
		@Pc(49) int local49 = this.anInt8543 * local42 >> 12;
		return local49 > arg1 + arg0 && -local49 < arg0 + arg1;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method8203(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass135_41.method3011(arg0);
		if (super.aClass135_41.aBoolean278) {
			@Pc(29) int local29 = Static217.anIntArray501[arg0] - 2048;
			for (@Pc(31) int local31 = 0; local31 < Static417.anInt5248; local31++) {
				@Pc(39) int local39 = Static579.anIntArray585[local31] - 2048;
				@Pc(44) int local44 = this.anInt8539 + local39;
				@Pc(55) int local55 = local44 >= -2048 ? local44 : local44 + 4096;
				@Pc(64) int local64 = local55 > 2048 ? local55 - 4096 : local55;
				@Pc(69) int local69 = this.anInt8545 + local29;
				@Pc(78) int local78 = local69 < -2048 ? local69 + 4096 : local69;
				@Pc(87) int local87 = local78 > 2048 ? local78 - 4096 : local78;
				@Pc(92) int local92 = local39 + this.anInt8535;
				@Pc(101) int local101 = local92 >= -2048 ? local92 : local92 + 4096;
				@Pc(110) int local110 = local101 > 2048 ? local101 - 4096 : local101;
				@Pc(116) int local116 = local29 + this.anInt8536;
				@Pc(125) int local125 = local116 >= -2048 ? local116 : local116 + 4096;
				@Pc(136) int local136 = local125 <= 2048 ? local125 : local125 - 4096;
				local19[local31] = this.method6614(local64, local87) || this.method6612(local136, local110) ? 4096 : 0;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V")
	@Override
	public void method8210() {
		Static374.method5814();
	}
}
