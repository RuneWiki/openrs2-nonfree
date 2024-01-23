import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ae", name = "Y", descriptor = "I")
	private int anInt202 = 1365;

	@OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
	private int anInt197 = 0;

	@OriginalMember(owner = "client!ae", name = "Z", descriptor = "I")
	private int anInt203 = 0;

	@OriginalMember(owner = "client!ae", name = "X", descriptor = "I")
	private int anInt201 = 20;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZLclient!jj;I)V")
	@Override
	public void method4446(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt202 = arg0.method3107();
		} else if (arg1 == 1) {
			this.anInt201 = arg0.method3107();
		} else if (arg1 == 2) {
			this.anInt197 = arg0.method3107();
		} else if (arg1 == 3) {
			this.anInt203 = arg0.method3107();
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method4459(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = this.aClass176_41.method4469(arg0);
		if (this.aClass176_41.aBoolean437) {
			for (@Pc(14) int local14 = 0; local14 < Static131.anInt2513; local14++) {
				@Pc(29) int local29 = this.anInt197 + (Static105.anIntArray261[local14] << 12) / this.anInt202;
				@Pc(42) int local42 = (Static219.anIntArray515[arg0] << 12) / this.anInt202 + this.anInt203;
				@Pc(48) int local48 = local29;
				@Pc(50) int local50 = local42;
				@Pc(56) int local56 = local29 * local29 >> 12;
				@Pc(62) int local62 = local42 * local42 >> 12;
				@Pc(64) int local64 = 0;
				while (local62 + local56 < 16384 && this.anInt201 > local64) {
					local50 = local42 + (local48 * local50 >> 12) * 2;
					local64++;
					local48 = local29 + local56 - local62;
					local62 = local50 * local50 >> 12;
					local56 = local48 * local48 >> 12;
				}
				local7[local14] = local64 >= this.anInt201 - 1 ? 0 : (local64 << 12) / this.anInt201;
			}
		}
		return local7;
	}
}
