import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lea")
public final class Class1_Sub1_Sub20 extends Class1_Sub1 {

	@OriginalMember(owner = "client!lea", name = "F", descriptor = "I")
	private int anInt5406 = 20;

	@OriginalMember(owner = "client!lea", name = "B", descriptor = "I")
	private int anInt5402 = 0;

	@OriginalMember(owner = "client!lea", name = "L", descriptor = "I")
	private int anInt5410 = 0;

	@OriginalMember(owner = "client!lea", name = "I", descriptor = "I")
	private int anInt5407 = 1365;

	@OriginalMember(owner = "client!lea", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(ILclient!io;I)V")
	@Override
	public void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt5407 = arg1.method4426();
		} else if (arg0 == 1) {
			this.anInt5406 = arg1.method4426();
		} else if (arg0 == 2) {
			this.anInt5402 = arg1.method4426();
		} else if (arg0 == 3) {
			this.anInt5410 = arg1.method4426();
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7888(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass26_41.method788(arg0);
		if (super.aClass26_41.aBoolean77) {
			for (@Pc(22) int local22 = 0; local22 < Static87.anInt1964; local22++) {
				@Pc(37) int local37 = (Static436.anIntArray506[local22] << 12) / this.anInt5407 + this.anInt5402;
				@Pc(49) int local49 = this.anInt5410 + (Static337.anIntArray406[arg0] << 12) / this.anInt5407;
				@Pc(55) int local55 = local37;
				@Pc(57) int local57 = local49;
				@Pc(63) int local63 = local37 * local37 >> 12;
				@Pc(69) int local69 = local49 * local49 >> 12;
				@Pc(71) int local71;
				for (local71 = 0; local69 + local63 < 16384 && local71 < this.anInt5406; local71++) {
					local57 = local49 + (local55 * local57 >> 12) * 2;
					local55 = local37 + local63 - local69;
					local63 = local55 * local55 >> 12;
					local69 = local57 * local57 >> 12;
				}
				local16[local22] = this.anInt5406 - 1 > local71 ? (local71 << 12) / this.anInt5406 : 0;
			}
		}
		return local16;
	}
}
