import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tba")
public final class Class5_Sub1_Sub32 extends Class5_Sub1 {

	@OriginalMember(owner = "client!tba", name = "C", descriptor = "I")
	private int anInt9459 = 12288;

	@OriginalMember(owner = "client!tba", name = "M", descriptor = "I")
	private int anInt9460 = 0;

	@OriginalMember(owner = "client!tba", name = "Q", descriptor = "I")
	private int anInt9468 = 2048;

	@OriginalMember(owner = "client!tba", name = "O", descriptor = "I")
	private int anInt9462 = 0;

	@OriginalMember(owner = "client!tba", name = "I", descriptor = "I")
	private int anInt9467 = 4096;

	@OriginalMember(owner = "client!tba", name = "L", descriptor = "I")
	private int anInt9471 = 8192;

	@OriginalMember(owner = "client!tba", name = "U", descriptor = "I")
	private int anInt9472 = 2048;

	@OriginalMember(owner = "client!tba", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)V")
	@Override
	public void method9204() {
		Static19.method298();
	}

	@OriginalMember(owner = "client!tba", name = "e", descriptor = "(III)Z")
	private boolean method8115(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = (arg1 - arg0) * this.anInt9459 >> 12;
		@Pc(23) int local23 = Static633.anIntArray577[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt9459;
		@Pc(45) int local45 = (local30 << 12) / this.anInt9471;
		@Pc(52) int local52 = this.anInt9467 * local45 >> 12;
		return local52 > arg0 + arg1 && -local52 < arg1 + arg0;
	}

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method9212(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass83_41.method1414((byte) -64, arg0);
		if (super.aClass83_41.aBoolean148) {
			@Pc(35) int local35 = Static23.anIntArray27[arg0] - 2048;
			for (@Pc(37) int local37 = 0; local37 < Static648.anInt9588; local37++) {
				@Pc(45) int local45 = Static293.anIntArray288[local37] - 2048;
				@Pc(51) int local51 = local45 + this.anInt9472;
				@Pc(63) int local63 = local51 >= -2048 ? local51 : local51 + 4096;
				@Pc(73) int local73 = local63 > 2048 ? local63 - 4096 : local63;
				@Pc(78) int local78 = local35 + this.anInt9462;
				@Pc(88) int local88 = local78 >= -2048 ? local78 : local78 + 4096;
				@Pc(98) int local98 = local88 <= 2048 ? local88 : local88 - 4096;
				@Pc(103) int local103 = this.anInt9460 + local45;
				@Pc(115) int local115 = local103 >= -2048 ? local103 : local103 + 4096;
				@Pc(127) int local127 = local115 > 2048 ? local115 - 4096 : local115;
				@Pc(133) int local133 = local35 + this.anInt9468;
				@Pc(145) int local145 = local133 >= -2048 ? local133 : local133 + 4096;
				@Pc(157) int local157 = local145 > 2048 ? local145 - 4096 : local145;
				local11[local37] = this.method8115(local73, local98) || this.method8118(local127, local157) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tba", name = "d", descriptor = "(III)Z")
	private boolean method8118(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20 = this.anInt9459 * (arg0 + arg1) >> 12;
		@Pc(30) int local30 = Static633.anIntArray577[local20 * 255 >> 12 & 0xFF];
		@Pc(37) int local37 = (local30 << 12) / this.anInt9459;
		@Pc(44) int local44 = (local37 << 12) / this.anInt9471;
		@Pc(51) int local51 = this.anInt9467 * local44 >> 12;
		return arg1 - arg0 < local51 && -local51 < arg1 - arg0;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(BILclient!ib;)V")
	@Override
	public void method9209(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 0) {
			this.anInt9472 = arg1.method8519();
		} else if (arg0 == 1) {
			this.anInt9462 = arg1.method8519();
		} else if (arg0 == 2) {
			this.anInt9460 = arg1.method8519();
		} else if (arg0 == 3) {
			this.anInt9468 = arg1.method8519();
		} else if (arg0 == 4) {
			this.anInt9459 = arg1.method8519();
		} else if (arg0 == 5) {
			this.anInt9467 = arg1.method8519();
		} else if (arg0 == 6) {
			this.anInt9471 = arg1.method8519();
		}
	}
}
