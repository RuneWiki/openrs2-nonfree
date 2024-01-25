import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class2_Sub2_Sub11 extends Class2_Sub2 {

	@OriginalMember(owner = "client!de", name = "M", descriptor = "I")
	private int anInt1155 = 0;

	@OriginalMember(owner = "client!de", name = "O", descriptor = "I")
	private int anInt1156 = 20;

	@OriginalMember(owner = "client!de", name = "P", descriptor = "I")
	private int anInt1157 = 1365;

	@OriginalMember(owner = "client!de", name = "T", descriptor = "I")
	private int anInt1161 = 0;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5883(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass137_41.method3812(arg0);
		if (super.aClass137_41.aBoolean369) {
			for (@Pc(22) int local22 = 0; local22 < Static339.anInt6735; local22++) {
				@Pc(36) int local36 = this.anInt1161 + (Static212.anIntArray325[local22] << 12) / this.anInt1157;
				@Pc(48) int local48 = this.anInt1155 + (Class208.lb[arg0] << 12) / this.anInt1157;
				@Pc(54) int local54 = local36;
				@Pc(56) int local56 = local48;
				@Pc(62) int local62 = local36 * local36 >> 12;
				@Pc(68) int local68 = local48 * local48 >> 12;
				@Pc(70) int local70 = 0;
				while (local68 + local62 < 16384 && this.anInt1156 > local70) {
					local56 = (local56 * local54 >> 12) * 2 + local48;
					local54 = local36 + local62 - local68;
					local62 = local54 * local54 >> 12;
					local70++;
					local68 = local56 * local56 >> 12;
				}
				local16[local22] = this.anInt1156 - 1 > local70 ? (local70 << 12) / this.anInt1156 : 0;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!dg;I)V")
	@Override
	public void method5882(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 == 0) {
			this.anInt1157 = arg1.method4464();
		} else if (arg0 == 1) {
			this.anInt1156 = arg1.method4464();
		} else if (arg0 == 2) {
			this.anInt1161 = arg1.method4464();
		} else if (arg0 == 3) {
			this.anInt1155 = arg1.method4464();
		}
	}
}
