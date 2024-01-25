import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Class1_Sub5_Sub1 extends Class1_Sub5 {

	@OriginalMember(owner = "client!aq", name = "K", descriptor = "I")
	private int anInt322 = 1365;

	@OriginalMember(owner = "client!aq", name = "M", descriptor = "I")
	private int anInt324 = 0;

	@OriginalMember(owner = "client!aq", name = "S", descriptor = "I")
	private int anInt330 = 20;

	@OriginalMember(owner = "client!aq", name = "T", descriptor = "I")
	private int anInt331 = 0;

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5805(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass214_41.method5651(arg0);
		if (super.aClass214_41.aBoolean544) {
			for (@Pc(22) int local22 = 0; local22 < Static75.anInt1566; local22++) {
				@Pc(37) int local37 = (Static49.anIntArray492[local22] << 12) / this.anInt322 + this.anInt331;
				@Pc(49) int local49 = (Static191.anIntArray379[arg0] << 12) / this.anInt322 + this.anInt324;
				@Pc(55) int local55 = local37;
				@Pc(57) int local57 = local49;
				@Pc(63) int local63 = local37 * local37 >> 12;
				@Pc(69) int local69 = local49 * local49 >> 12;
				@Pc(71) int local71 = 0;
				while (local69 + local63 < 16384 && local71 < this.anInt330) {
					local57 = (local57 * local55 >> 12) * 2 + local49;
					local55 = local37 + local63 - local69;
					local69 = local57 * local57 >> 12;
					local71++;
					local63 = local55 * local55 >> 12;
				}
				local11[local22] = this.anInt330 - 1 <= local71 ? 0 : (local71 << 12) / this.anInt330;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method5814(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt322 = arg0.method5715();
		} else if (arg1 == 1) {
			this.anInt330 = arg0.method5715();
		} else if (arg1 == 2) {
			this.anInt331 = arg0.method5715();
		} else if (arg1 == 3) {
			this.anInt324 = arg0.method5715();
		}
	}
}
