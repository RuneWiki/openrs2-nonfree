import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class2_Sub2_Sub13 extends Class2_Sub2 {

	@OriginalMember(owner = "client!fn", name = "F", descriptor = "I")
	private int anInt2203 = 4096;

	@OriginalMember(owner = "client!fn", name = "H", descriptor = "Z")
	private boolean aBoolean147 = true;

	static {
		new Class134("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
	}

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub13() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!sv;II)V")
	@Override
	public void method5470(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2203 = arg0.method3555();
		} else if (arg1 == 1) {
			this.aBoolean147 = arg0.method3580() == 1;
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5471(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass207_41.method4467(arg0);
		if (super.aClass207_41.aBoolean419) {
			@Pc(31) int[] local31 = this.method5472(Static157.anInt2698 & arg0 - 1, 0);
			@Pc(37) int[] local37 = this.method5472(arg0, 0);
			@Pc(47) int[] local47 = this.method5472(arg0 + 1 & Static157.anInt2698, 0);
			@Pc(51) int[] local51 = local11[0];
			@Pc(55) int[] local55 = local11[1];
			@Pc(59) int[] local59 = local11[2];
			for (@Pc(61) int local61 = 0; local61 < Static217.anInt3574; local61++) {
				@Pc(75) int local75 = (local47[local61] - local31[local61]) * this.anInt2203;
				@Pc(95) int local95 = (local37[Static127.anInt2287 & local61 + 1] - local37[Static127.anInt2287 & local61 - 1]) * this.anInt2203;
				@Pc(99) int local99 = local95 >> 12;
				@Pc(103) int local103 = local75 >> 12;
				@Pc(109) int local109 = local99 * local99 >> 12;
				@Pc(115) int local115 = local103 * local103 >> 12;
				@Pc(129) int local129 = (int) (Math.sqrt((double) ((float) (local115 + local109 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(135) int local135;
				@Pc(133) int local133;
				@Pc(137) int local137;
				if (local129 == 0) {
					local133 = 0;
					local135 = 0;
					local137 = 0;
				} else {
					local133 = local75 / local129;
					local137 = 16777216 / local129;
					local135 = local95 / local129;
				}
				if (this.aBoolean147) {
					local137 = (local137 >> 1) + 2048;
					local133 = (local133 >> 1) + 2048;
					local135 = (local135 >> 1) + 2048;
				}
				local51[local61] = local135;
				local55[local61] = local133;
				local59[local61] = local137;
			}
		}
		return local11;
	}
}
