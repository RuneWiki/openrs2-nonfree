import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mba")
public final class Class6_Sub1_Sub21 extends Class6_Sub1 {

	@OriginalMember(owner = "client!mba", name = "K", descriptor = "I")
	private int anInt6772 = 2048;

	@OriginalMember(owner = "client!mba", name = "I", descriptor = "I")
	private int anInt6770 = 4096;

	@OriginalMember(owner = "client!mba", name = "M", descriptor = "I")
	private int anInt6773 = 8192;

	@OriginalMember(owner = "client!mba", name = "S", descriptor = "I")
	private int anInt6779 = 12288;

	@OriginalMember(owner = "client!mba", name = "U", descriptor = "I")
	private int anInt6781 = 0;

	@OriginalMember(owner = "client!mba", name = "T", descriptor = "I")
	private int anInt6780 = 2048;

	@OriginalMember(owner = "client!mba", name = "W", descriptor = "I")
	private int anInt6783 = 0;

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mba", name = "d", descriptor = "(B)V")
	@Override
	public void method8732() {
		Static621.method8513();
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(BII)Z")
	private boolean method5668(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = this.anInt6779 * (arg0 + arg1) >> 12;
		@Pc(27) int local27 = Static420.anIntArray408[local17 * 255 >> 12 & 0xFF];
		@Pc(34) int local34 = (local27 << 12) / this.anInt6779;
		@Pc(41) int local41 = (local34 << 12) / this.anInt6773;
		@Pc(48) int local48 = this.anInt6770 * local41 >> 12;
		return local48 > arg1 - arg0 && arg1 - arg0 > -local48;
	}

	@OriginalMember(owner = "client!mba", name = "d", descriptor = "(III)Z")
	private boolean method5670(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = (arg1 - arg0) * this.anInt6779 >> 12;
		@Pc(27) int local27 = Static420.anIntArray408[local17 * 255 >> 12 & 0xFF];
		@Pc(34) int local34 = (local27 << 12) / this.anInt6779;
		@Pc(41) int local41 = (local34 << 12) / this.anInt6773;
		@Pc(48) int local48 = local41 * this.anInt6770 >> 12;
		return local48 > arg1 + arg0 && -local48 < arg0 + arg1;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8721(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass24_41.method788(arg0);
		if (super.aClass24_41.aBoolean80) {
			@Pc(30) int local30 = Static603.anIntArray549[arg0] - 2048;
			for (@Pc(32) int local32 = 0; local32 < Static53.anInt1787; local32++) {
				@Pc(40) int local40 = Static12.anIntArray15[local32] - 2048;
				@Pc(46) int local46 = local40 + this.anInt6772;
				@Pc(55) int local55 = local46 >= -2048 ? local46 : local46 + 4096;
				@Pc(66) int local66 = local55 <= 2048 ? local55 : local55 - 4096;
				@Pc(72) int local72 = local30 + this.anInt6783;
				@Pc(81) int local81 = local72 < -2048 ? local72 + 4096 : local72;
				@Pc(90) int local90 = local81 <= 2048 ? local81 : local81 - 4096;
				@Pc(95) int local95 = this.anInt6781 + local40;
				@Pc(104) int local104 = local95 >= -2048 ? local95 : local95 + 4096;
				@Pc(115) int local115 = local104 > 2048 ? local104 - 4096 : local104;
				@Pc(120) int local120 = this.anInt6780 + local30;
				@Pc(131) int local131 = local120 >= -2048 ? local120 : local120 + 4096;
				@Pc(140) int local140 = local131 <= 2048 ? local131 : local131 - 4096;
				local11[local32] = this.method5670(local66, local90) || this.method5668(local115, local140) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ILclient!ji;B)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt6772 = arg1.method8220();
		} else if (arg0 == 1) {
			this.anInt6783 = arg1.method8220();
		} else if (arg0 == 2) {
			this.anInt6781 = arg1.method8220();
		} else if (arg0 == 3) {
			this.anInt6780 = arg1.method8220();
		} else if (arg0 == 4) {
			this.anInt6779 = arg1.method8220();
		} else if (arg0 == 5) {
			this.anInt6770 = arg1.method8220();
		} else if (arg0 == 6) {
			this.anInt6773 = arg1.method8220();
		}
	}
}
