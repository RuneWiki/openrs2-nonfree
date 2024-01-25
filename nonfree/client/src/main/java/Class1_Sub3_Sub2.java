import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ada")
public final class Class1_Sub3_Sub2 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ada", name = "E", descriptor = "I")
	private int anInt217 = 0;

	@OriginalMember(owner = "client!ada", name = "F", descriptor = "I")
	private int anInt218 = 20;

	@OriginalMember(owner = "client!ada", name = "H", descriptor = "I")
	private int anInt220 = 1365;

	@OriginalMember(owner = "client!ada", name = "K", descriptor = "I")
	private int anInt222 = 0;

	@OriginalMember(owner = "client!ada", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7123(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass12_41.method502(arg0);
		if (super.aClass12_41.aBoolean23) {
			for (@Pc(22) int local22 = 0; local22 < Static452.anInt7734; local22++) {
				@Pc(36) int local36 = this.anInt217 + (Static228.anIntArray442[local22] << 12) / this.anInt220;
				@Pc(48) int local48 = this.anInt222 + (Static7.anIntArray20[arg0] << 12) / this.anInt220;
				@Pc(54) int local54 = local36;
				@Pc(56) int local56 = local48;
				@Pc(62) int local62 = local36 * local36 >> 12;
				@Pc(68) int local68 = local48 * local48 >> 12;
				@Pc(70) int local70 = 0;
				while (local68 + local62 < 16384 && this.anInt218 > local70) {
					local56 = local48 + (local56 * local54 >> 12) * 2;
					local54 = local62 + local36 - local68;
					local62 = local54 * local54 >> 12;
					local70++;
					local68 = local56 * local56 >> 12;
				}
				local16[local22] = this.anInt218 - 1 > local70 ? (local70 << 12) / this.anInt218 : 0;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(ILclient!ge;I)V")
	@Override
	public void method7121(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt220 = arg0.method3967();
		} else if (arg1 == 1) {
			this.anInt218 = arg0.method3967();
		} else if (arg1 == 2) {
			this.anInt217 = arg0.method3967();
		} else if (arg1 == 3) {
			this.anInt222 = arg0.method3967();
		}
	}
}
