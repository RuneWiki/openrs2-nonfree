import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!laa")
public final class Class5_Sub2_Sub17 extends Class5_Sub2 {

	@OriginalMember(owner = "client!laa", name = "H", descriptor = "I")
	private int anInt5266 = 2048;

	@OriginalMember(owner = "client!laa", name = "L", descriptor = "I")
	private int anInt5270 = 4096;

	@OriginalMember(owner = "client!laa", name = "M", descriptor = "I")
	private int anInt5271 = 0;

	@OriginalMember(owner = "client!laa", name = "T", descriptor = "I")
	private int anInt5276 = 12288;

	@OriginalMember(owner = "client!laa", name = "W", descriptor = "I")
	private int anInt5279 = 8192;

	@OriginalMember(owner = "client!laa", name = "S", descriptor = "I")
	private int anInt5275 = 2048;

	@OriginalMember(owner = "client!laa", name = "O", descriptor = "I")
	private int anInt5272 = 0;

	@OriginalMember(owner = "client!laa", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILclient!ofa;I)V")
	@Override
	public void method9040(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5266 = arg0.method5968();
		} else if (arg1 == 1) {
			this.anInt5272 = arg0.method5968();
		} else if (arg1 == 2) {
			this.anInt5271 = arg0.method5968();
		} else if (arg1 == 3) {
			this.anInt5275 = arg0.method5968();
		} else if (arg1 == 4) {
			this.anInt5276 = arg0.method5968();
		} else if (arg1 == 5) {
			this.anInt5270 = arg0.method5968();
		} else if (arg1 == 6) {
			this.anInt5279 = arg0.method5968();
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIB)Z")
	private boolean method4720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = (arg1 - arg0) * this.anInt5276 >> 12;
		@Pc(23) int local23 = Static556.anIntArray515[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt5276;
		@Pc(37) int local37 = (local30 << 12) / this.anInt5279;
		@Pc(44) int local44 = local37 * this.anInt5270 >> 12;
		return local44 > arg1 + arg0 && -local44 < arg0 + arg1;
	}

	@OriginalMember(owner = "client!laa", name = "c", descriptor = "(I)V")
	@Override
	public void method9044() {
		Static528.method7829();
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIZ)Z")
	private boolean method4721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = (arg1 + arg0) * this.anInt5276 >> 12;
		@Pc(27) int local27 = Static556.anIntArray515[local17 * 255 >> 12 & 0xFF];
		@Pc(34) int local34 = (local27 << 12) / this.anInt5276;
		@Pc(41) int local41 = (local34 << 12) / this.anInt5279;
		@Pc(48) int local48 = this.anInt5270 * local41 >> 12;
		return local48 > arg1 - arg0 && -local48 < arg1 - arg0;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9034(@OriginalArg(0) int arg0) {
		@Pc(20) int[] local20 = super.aClass379_41.method9012(arg0);
		if (super.aClass379_41.aBoolean761) {
			@Pc(30) int local30 = Static493.anIntArray476[arg0] - 2048;
			for (@Pc(32) int local32 = 0; local32 < Static597.anInt10025; local32++) {
				@Pc(40) int local40 = Static352.anIntArray331[local32] - 2048;
				@Pc(45) int local45 = local40 + this.anInt5266;
				@Pc(54) int local54 = local45 < -2048 ? local45 + 4096 : local45;
				@Pc(65) int local65 = local54 > 2048 ? local54 - 4096 : local54;
				@Pc(70) int local70 = local30 + this.anInt5272;
				@Pc(79) int local79 = local70 < -2048 ? local70 + 4096 : local70;
				@Pc(90) int local90 = local79 <= 2048 ? local79 : local79 - 4096;
				@Pc(95) int local95 = this.anInt5271 + local40;
				@Pc(104) int local104 = local95 >= -2048 ? local95 : local95 + 4096;
				@Pc(113) int local113 = local104 <= 2048 ? local104 : local104 - 4096;
				@Pc(118) int local118 = this.anInt5275 + local30;
				@Pc(129) int local129 = local118 < -2048 ? local118 + 4096 : local118;
				@Pc(138) int local138 = local129 <= 2048 ? local129 : local129 - 4096;
				local20[local32] = this.method4720(local65, local90) || this.method4721(local113, local138) ? 4096 : 0;
			}
		}
		return local20;
	}
}
