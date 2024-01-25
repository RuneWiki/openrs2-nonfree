import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vw")
public final class Class2_Sub7_Sub39 extends Class2_Sub7 {

	@OriginalMember(owner = "client!vw", name = "I", descriptor = "I")
	private int anInt9085 = 1365;

	@OriginalMember(owner = "client!vw", name = "J", descriptor = "I")
	private int anInt9086 = 0;

	@OriginalMember(owner = "client!vw", name = "N", descriptor = "I")
	private int anInt9090 = 20;

	@OriginalMember(owner = "client!vw", name = "Q", descriptor = "I")
	private int anInt9092 = 0;

	@OriginalMember(owner = "client!vw", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vw", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7587(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass221_41.method5903(arg0);
		if (super.aClass221_41.aBoolean523) {
			for (@Pc(22) int local22 = 0; local22 < Static352.anInt6485; local22++) {
				@Pc(37) int local37 = (Static427.anIntArray602[local22] << 12) / this.anInt9085 + this.anInt9092;
				@Pc(50) int local50 = (Static313.anIntArray521[arg0] << 12) / this.anInt9085 + this.anInt9086;
				@Pc(56) int local56 = local37;
				@Pc(58) int local58 = local50;
				@Pc(64) int local64 = local37 * local37 >> 12;
				@Pc(70) int local70 = local50 * local50 >> 12;
				@Pc(72) int local72 = 0;
				while (local64 + local70 < 16384 && this.anInt9090 > local72) {
					local58 = (local56 * local58 >> 12) * 2 + local50;
					local56 = local37 + local64 - local70;
					local72++;
					local64 = local56 * local56 >> 12;
					local70 = local58 * local58 >> 12;
				}
				local16[local22] = local72 >= this.anInt9090 - 1 ? 0 : (local72 << 12) / this.anInt9090;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(IBLclient!ps;)V")
	@Override
	public void method7582(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 == 0) {
			this.anInt9085 = arg1.method5229();
		} else if (arg0 == 1) {
			this.anInt9090 = arg1.method5229();
		} else if (arg0 == 2) {
			this.anInt9092 = arg1.method5229();
		} else if (arg0 == 3) {
			this.anInt9086 = arg1.method5229();
		}
	}
}
