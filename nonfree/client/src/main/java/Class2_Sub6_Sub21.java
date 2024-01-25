import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oea")
public final class Class2_Sub6_Sub21 extends Class2_Sub6 {

	@OriginalMember(owner = "client!oea", name = "I", descriptor = "[F")
	public static final float[] aFloatArray31 = new float[16384];

	@OriginalMember(owner = "client!oea", name = "S", descriptor = "[F")
	public static final float[] aFloatArray32 = new float[16384];

	@OriginalMember(owner = "client!oea", name = "O", descriptor = "I")
	private int anInt6280 = 0;

	@OriginalMember(owner = "client!oea", name = "J", descriptor = "I")
	private int anInt6275 = 2048;

	@OriginalMember(owner = "client!oea", name = "K", descriptor = "I")
	private int anInt6276 = 4096;

	@OriginalMember(owner = "client!oea", name = "L", descriptor = "I")
	private int anInt6277 = 0;

	@OriginalMember(owner = "client!oea", name = "M", descriptor = "I")
	private int anInt6278 = 12288;

	@OriginalMember(owner = "client!oea", name = "T", descriptor = "I")
	private int anInt6284 = 2048;

	@OriginalMember(owner = "client!oea", name = "V", descriptor = "I")
	private int anInt6286 = 8192;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray31[local9] = (float) Math.sin(local7 * (double) local9);
			aFloatArray32[local9] = (float) Math.cos((double) local9 * local7);
		}
	}

	@OriginalMember(owner = "client!oea", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8469(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass377_41.method8586(arg0);
		if (super.aClass377_41.aBoolean746) {
			@Pc(29) int local29 = Static564.anIntArray630[arg0] - 2048;
			for (@Pc(31) int local31 = 0; local31 < Static51.anInt1085; local31++) {
				@Pc(39) int local39 = Static586.anIntArray653[local31] - 2048;
				@Pc(44) int local44 = local39 + this.anInt6284;
				@Pc(53) int local53 = local44 >= -2048 ? local44 : local44 + 4096;
				@Pc(64) int local64 = local53 > 2048 ? local53 - 4096 : local53;
				@Pc(69) int local69 = this.anInt6277 + local29;
				@Pc(80) int local80 = local69 < -2048 ? local69 + 4096 : local69;
				@Pc(91) int local91 = local80 > 2048 ? local80 - 4096 : local80;
				@Pc(97) int local97 = local39 + this.anInt6280;
				@Pc(106) int local106 = local97 >= -2048 ? local97 : local97 + 4096;
				@Pc(117) int local117 = local106 <= 2048 ? local106 : local106 - 4096;
				@Pc(122) int local122 = this.anInt6275 + local29;
				@Pc(133) int local133 = local122 >= -2048 ? local122 : local122 + 4096;
				@Pc(142) int local142 = local133 <= 2048 ? local133 : local133 - 4096;
				local19[local31] = this.method5443(local64, local91) || this.method5442(local142, local117) ? 4096 : 0;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IZLclient!vj;)V")
	@Override
	public void method8467(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 0) {
			this.anInt6284 = arg1.method8546();
		} else if (arg0 == 1) {
			this.anInt6277 = arg1.method8546();
		} else if (arg0 == 2) {
			this.anInt6280 = arg1.method8546();
		} else if (arg0 == 3) {
			this.anInt6275 = arg1.method8546();
		} else if (arg0 == 4) {
			this.anInt6278 = arg1.method8546();
		} else if (arg0 == 5) {
			this.anInt6276 = arg1.method8546();
		} else if (arg0 == 6) {
			this.anInt6286 = arg1.method8546();
		}
	}

	@OriginalMember(owner = "client!oea", name = "d", descriptor = "(III)Z")
	private boolean method5442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = (arg1 + arg0) * this.anInt6278 >> 12;
		@Pc(22) int local22 = Static111.anIntArray141[local12 * 255 >> 12 & 0xFF];
		@Pc(36) int local36 = (local22 << 12) / this.anInt6278;
		@Pc(43) int local43 = (local36 << 12) / this.anInt6286;
		@Pc(50) int local50 = local43 * this.anInt6276 >> 12;
		return local50 > arg0 - arg1 && arg0 - arg1 > -local50;
	}

	@OriginalMember(owner = "client!oea", name = "e", descriptor = "(III)Z")
	private boolean method5443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = this.anInt6278 * (arg1 - arg0) >> 12;
		@Pc(28) int local28 = Static111.anIntArray141[local18 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt6278;
		@Pc(42) int local42 = (local35 << 12) / this.anInt6286;
		@Pc(49) int local49 = local42 * this.anInt6276 >> 12;
		return local49 > arg0 + arg1 && arg0 + arg1 > -local49;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(B)V")
	@Override
	public void method8462() {
		Static212.method2948();
	}
}
