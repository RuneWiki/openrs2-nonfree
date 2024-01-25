import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class1_Sub4_Sub9 extends Class1_Sub4 {

	@OriginalMember(owner = "client!dq", name = "C", descriptor = "I")
	private int anInt1760 = 1365;

	@OriginalMember(owner = "client!dq", name = "B", descriptor = "I")
	private int anInt1759 = 0;

	@OriginalMember(owner = "client!dq", name = "F", descriptor = "I")
	private int anInt1762 = 20;

	@OriginalMember(owner = "client!dq", name = "G", descriptor = "I")
	private int anInt1763 = 0;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5957(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass15_41.method508(arg0);
		if (super.aClass15_41.aBoolean17) {
			for (@Pc(22) int local22 = 0; local22 < Static66.anInt1511; local22++) {
				@Pc(36) int local36 = this.anInt1759 + (Static121.anIntArray197[local22] << 12) / this.anInt1760;
				@Pc(48) int local48 = this.anInt1763 + (Static266.anIntArray628[arg0] << 12) / this.anInt1760;
				@Pc(54) int local54 = local36;
				@Pc(56) int local56 = local48;
				@Pc(62) int local62 = local36 * local36 >> 12;
				@Pc(68) int local68 = local48 * local48 >> 12;
				@Pc(70) int local70 = 0;
				while (local68 + local62 < 16384 && this.anInt1762 > local70) {
					local56 = (local56 * local54 >> 12) * 2 + local48;
					local54 = local36 + local62 - local68;
					local62 = local54 * local54 >> 12;
					local70++;
					local68 = local56 * local56 >> 12;
				}
				local11[local22] = local70 >= this.anInt1762 - 1 ? 0 : (local70 << 12) / this.anInt1762;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(BILclient!hp;)V")
	@Override
	public void method5949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 0) {
			this.anInt1760 = arg1.method5362();
		} else if (arg0 == 1) {
			this.anInt1762 = arg1.method5362();
		} else if (arg0 == 2) {
			this.anInt1759 = arg1.method5362();
		} else if (arg0 == 3) {
			this.anInt1763 = arg1.method5362();
		}
	}
}
