import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class1_Sub4_Sub14 extends Class1_Sub4 {

	@OriginalMember(owner = "client!hf", name = "I", descriptor = "I")
	private int anInt2091 = 0;

	@OriginalMember(owner = "client!hf", name = "P", descriptor = "I")
	private int anInt2095 = 20;

	@OriginalMember(owner = "client!hf", name = "S", descriptor = "I")
	private int anInt2098 = 1365;

	@OriginalMember(owner = "client!hf", name = "N", descriptor = "I")
	private int anInt2093 = 0;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4746(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = this.aClass7_41.method116(arg0);
		if (this.aClass7_41.aBoolean4) {
			for (@Pc(17) int local17 = 0; local17 < Static182.anInt3492; local17++) {
				@Pc(37) int local37 = (Static250.anIntArray398[arg0] << 12) / this.anInt2098 + this.anInt2093;
				@Pc(49) int local49 = this.anInt2091 + (Static279.anIntArray454[local17] << 12) / this.anInt2098;
				@Pc(57) int local57 = local49 * local49 >> 12;
				@Pc(61) int local61 = local49;
				@Pc(67) int local67 = local37 * local37 >> 12;
				@Pc(69) int local69 = local37;
				@Pc(71) int local71 = 0;
				while (local57 + local67 < 16384 && this.anInt2095 > local71) {
					local69 = local37 + (local69 * local61 >> 12) * 2;
					local61 = local49 + local57 - local67;
					local67 = local69 * local69 >> 12;
					local71++;
					local57 = local61 * local61 >> 12;
				}
				local11[local17] = this.anInt2095 - 1 > local71 ? (local71 << 12) / this.anInt2095 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!lf;I)V")
	@Override
	public void method4747(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2098 = arg0.method1386();
		} else if (arg1 == 1) {
			this.anInt2095 = arg0.method1386();
		} else if (arg1 == 2) {
			this.anInt2091 = arg0.method1386();
		} else if (arg1 == 3) {
			this.anInt2093 = arg0.method1386();
		}
	}
}
