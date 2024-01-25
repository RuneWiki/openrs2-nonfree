import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dea")
public final class Class6_Sub3_Sub8 extends Class6_Sub3 {

	@OriginalMember(owner = "client!dea", name = "F", descriptor = "I")
	private int anInt1534 = 2048;

	@OriginalMember(owner = "client!dea", name = "G", descriptor = "I")
	private int anInt1535 = 2048;

	@OriginalMember(owner = "client!dea", name = "N", descriptor = "I")
	private int anInt1540 = 12288;

	@OriginalMember(owner = "client!dea", name = "K", descriptor = "I")
	private int anInt1537 = 8192;

	@OriginalMember(owner = "client!dea", name = "M", descriptor = "I")
	private int anInt1539 = 4096;

	@OriginalMember(owner = "client!dea", name = "R", descriptor = "I")
	private int anInt1544 = 0;

	@OriginalMember(owner = "client!dea", name = "T", descriptor = "I")
	private int anInt1546 = 0;

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dea", name = "e", descriptor = "(III)Z")
	private boolean method1412(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = this.anInt1540 * (arg0 + arg1) >> 12;
		@Pc(23) int local23 = Static6.anIntArray5[local13 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local23 << 12) / this.anInt1540;
		@Pc(42) int local42 = (local35 << 12) / this.anInt1537;
		@Pc(49) int local49 = local42 * this.anInt1539 >> 12;
		return local49 > arg0 - arg1 && arg0 - arg1 > -local49;
	}

	@OriginalMember(owner = "client!dea", name = "g", descriptor = "(I)V")
	@Override
	public void method7957() {
		Static583.method7925();
	}

	@OriginalMember(owner = "client!dea", name = "f", descriptor = "(III)Z")
	private boolean method1413(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.anInt1540 * (arg1 - arg0) >> 12;
		@Pc(23) int local23 = Static6.anIntArray5[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt1540;
		@Pc(42) int local42 = (local30 << 12) / this.anInt1537;
		@Pc(49) int local49 = local42 * this.anInt1539 >> 12;
		return arg0 + arg1 < local49 && -local49 < arg0 + arg1;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(ILclient!jr;B)V")
	@Override
	public void method7955(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt1534 = arg1.method6044();
		} else if (arg0 == 1) {
			this.anInt1546 = arg1.method6044();
		} else if (arg0 == 2) {
			this.anInt1544 = arg1.method6044();
		} else if (arg0 == 3) {
			this.anInt1535 = arg1.method6044();
		} else if (arg0 == 4) {
			this.anInt1540 = arg1.method6044();
		} else if (arg0 == 5) {
			this.anInt1539 = arg1.method6044();
		} else if (arg0 == 6) {
			this.anInt1537 = arg1.method6044();
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7954(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass137_41.method3408(arg0);
		if (super.aClass137_41.aBoolean306) {
			@Pc(26) int local26 = Static77.anIntArray116[arg0] - 2048;
			for (@Pc(28) int local28 = 0; local28 < Static35.anInt670; local28++) {
				@Pc(36) int local36 = Static372.anIntArray481[local28] - 2048;
				@Pc(41) int local41 = this.anInt1534 + local36;
				@Pc(50) int local50 = local41 < -2048 ? local41 + 4096 : local41;
				@Pc(61) int local61 = local50 > 2048 ? local50 - 4096 : local50;
				@Pc(67) int local67 = local26 + this.anInt1546;
				@Pc(76) int local76 = local67 < -2048 ? local67 + 4096 : local67;
				@Pc(85) int local85 = local76 > 2048 ? local76 - 4096 : local76;
				@Pc(91) int local91 = local36 + this.anInt1544;
				@Pc(102) int local102 = local91 < -2048 ? local91 + 4096 : local91;
				@Pc(113) int local113 = local102 <= 2048 ? local102 : local102 - 4096;
				@Pc(118) int local118 = local26 + this.anInt1535;
				@Pc(129) int local129 = local118 < -2048 ? local118 + 4096 : local118;
				@Pc(138) int local138 = local129 <= 2048 ? local129 : local129 - 4096;
				local16[local28] = this.method1413(local61, local85) || this.method1412(local138, local113) ? 4096 : 0;
			}
		}
		return local16;
	}
}
