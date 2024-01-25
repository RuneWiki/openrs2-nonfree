import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public final class Class3_Sub4_Sub15 extends Class3_Sub4 {

	@OriginalMember(owner = "client!ht", name = "M", descriptor = "Z")
	private boolean aBoolean270 = true;

	@OriginalMember(owner = "client!ht", name = "N", descriptor = "I")
	private int anInt3485 = 4096;

	static {
		new Class175("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
	}

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5955(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass214_41.method5177(arg0);
		if (super.aClass214_41.aBoolean455) {
			@Pc(25) int[] local25 = this.method5960(0, arg0 - 1 & Static311.anInt5681);
			@Pc(31) int[] local31 = this.method5960(0, arg0);
			@Pc(41) int[] local41 = this.method5960(0, arg0 + 1 & Static311.anInt5681);
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static106.anInt2356; local55++) {
				@Pc(69) int local69 = this.anInt3485 * (local41[local55] - local25[local55]);
				@Pc(89) int local89 = this.anInt3485 * (local31[Static396.anInt6840 & local55 + 1] - local31[local55 - 1 & Static396.anInt6840]);
				@Pc(93) int local93 = local89 >> 12;
				@Pc(97) int local97 = local69 >> 12;
				@Pc(103) int local103 = local93 * local93 >> 12;
				@Pc(109) int local109 = local97 * local97 >> 12;
				@Pc(124) int local124 = (int) (Math.sqrt((double) ((float) (local103 + local109 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(141) int local141;
				@Pc(137) int local137;
				@Pc(133) int local133;
				if (local124 == 0) {
					local137 = 0;
					local133 = 0;
					local141 = 0;
				} else {
					local133 = 16777216 / local124;
					local137 = local69 / local124;
					local141 = local89 / local124;
				}
				if (this.aBoolean270) {
					local133 = (local133 >> 1) + 2048;
					local137 = (local137 >> 1) + 2048;
					local141 = (local141 >> 1) + 2048;
				}
				local45[local55] = local141;
				local49[local55] = local137;
				local53[local55] = local133;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IILclient!bt;)V")
	@Override
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt3485 = arg1.method6004();
		} else if (arg0 == 1) {
			this.aBoolean270 = arg1.method6053() == 1;
		}
	}
}
