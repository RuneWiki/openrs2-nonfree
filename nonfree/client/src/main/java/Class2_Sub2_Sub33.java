import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class2_Sub2_Sub33 extends Class2_Sub2 {

	@OriginalMember(owner = "client!sm", name = "C", descriptor = "[[I")
	private int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!sm", name = "D", descriptor = "[I")
	private int[] anIntArray534;

	@OriginalMember(owner = "client!sm", name = "R", descriptor = "[I")
	private int[] anIntArray535;

	@OriginalMember(owner = "client!sm", name = "E", descriptor = "I")
	private int anInt6192 = 0;

	@OriginalMember(owner = "client!sm", name = "M", descriptor = "[S")
	private final short[] aShortArray83 = new short[257];

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub33() {
		super(1, true);
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(IB)[I")
	private int[] method4834(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray534;
		} else if (arg0 >= this.anIntArrayArray50.length) {
			return this.anIntArray535;
		} else {
			return this.anIntArrayArray50[arg0];
		}
	}

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "(B)V")
	@Override
	public void method5475() {
		if (this.anIntArrayArray50 == null) {
			this.anIntArrayArray50 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray50.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt6192 == 2) {
			this.method4836();
		}
		Static51.method703();
		this.method4835();
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5465(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass170_41.method3645(arg0);
		if (super.aClass170_41.aBoolean317) {
			@Pc(28) int[] local28 = this.method5472(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static217.anInt3574; local30++) {
				@Pc(38) int local38 = local28[local30] >> 4;
				if (local38 < 0) {
					local38 = 0;
				}
				if (local38 > 256) {
					local38 = 256;
				}
				local18[local30] = this.aShortArray83[local38];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "(I)V")
	private void method4835() {
		@Pc(8) int local8 = this.anInt6192;
		@Pc(28) int local28;
		@Pc(26) int local26;
		@Pc(55) int[] local55;
		@Pc(60) int[] local60;
		@Pc(69) int local69;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(86) int local86;
		if (local8 == 2) {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; local28 < this.anIntArrayArray50.length - 1 && local26 >= this.anIntArrayArray50[local28][0]; local28++) {
				}
				local55 = this.anIntArrayArray50[local28 - 1];
				local60 = this.anIntArrayArray50[local28];
				local69 = this.method4834(local28 - 2)[1];
				local73 = local55[1];
				local77 = local60[1];
				local86 = this.method4834(local28 + 1)[1];
				@Pc(104) int local104 = (local26 - local55[0] << 12) / (local60[0] - local55[0]);
				@Pc(110) int local110 = local104 * local104 >> 12;
				@Pc(120) int local120 = local73 + local86 - local69 - local77;
				@Pc(127) int local127 = local69 - local120 - local73;
				@Pc(132) int local132 = local77 - local69;
				@Pc(144) int local144 = (local104 * local120 >> 12) * local110 >> 12;
				@Pc(150) int local150 = local110 * local127 >> 12;
				@Pc(156) int local156 = local132 * local104 >> 12;
				@Pc(165) int local165 = local73 + local156 + local144 + local150;
				if (local165 <= -32768) {
					local165 = -32767;
				}
				if (local165 >= 32768) {
					local165 = 32767;
				}
				this.aShortArray83[local8] = (short) local165;
			}
		} else if (local8 == 1) {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; local28 < this.anIntArrayArray50.length - 1 && local26 >= this.anIntArrayArray50[local28][0]; local28++) {
				}
				local55 = this.anIntArrayArray50[local28 - 1];
				local60 = this.anIntArrayArray50[local28];
				local69 = (local26 - local55[0] << 12) / (local60[0] - local55[0]);
				local73 = 4096 - Static412.anIntArray564[local69 >> 5 & 0xFF] >> 1;
				local77 = 4096 - local73;
				local86 = local77 * local55[1] + local60[1] * local73 >> 12;
				if (local86 <= -32768) {
					local86 = -32767;
				}
				if (local86 >= 32768) {
					local86 = 32767;
				}
				this.aShortArray83[local8] = (short) local86;
			}
		} else {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; this.anIntArrayArray50.length - 1 > local28 && local26 >= this.anIntArrayArray50[local28][0]; local28++) {
				}
				local55 = this.anIntArrayArray50[local28 - 1];
				local60 = this.anIntArrayArray50[local28];
				local69 = (local26 - local55[0] << 12) / (local60[0] - local55[0]);
				local73 = 4096 - local69;
				local77 = local60[1] * local69 + local55[1] * local73 >> 12;
				if (local77 <= -32768) {
					local77 = -32767;
				}
				if (local77 >= 32768) {
					local77 = 32767;
				}
				this.aShortArray83[local8] = (short) local77;
			}
		}
	}

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "(I)V")
	private void method4836() {
		@Pc(8) int[] local8 = this.anIntArrayArray50[0];
		@Pc(21) int[] local21 = this.anIntArrayArray50[1];
		@Pc(30) int[] local30 = this.anIntArrayArray50[this.anIntArrayArray50.length - 2];
		@Pc(39) int[] local39 = this.anIntArrayArray50[this.anIntArrayArray50.length - 1];
		this.anIntArray535 = new int[] { local30[0] + local30[0] - local39[0], local30[1] + -local39[1] + local30[1] };
		this.anIntArray534 = new int[] { local8[0] + local8[0] - local21[0], local8[1] + local8[1] + -local21[1] };
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!sv;II)V")
	@Override
	public void method5470(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt6192 = arg0.method3580();
		this.anIntArrayArray50 = new int[arg0.method3580()][2];
		for (@Pc(27) int local27 = 0; local27 < this.anIntArrayArray50.length; local27++) {
			this.anIntArrayArray50[local27][0] = arg0.method3555();
			this.anIntArrayArray50[local27][1] = arg0.method3555();
		}
	}
}
