import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class2_Sub4_Sub11 extends Class2_Sub4 {

	@OriginalMember(owner = "client!i", name = "V", descriptor = "I")
	private int anInt1655 = 16;

	@OriginalMember(owner = "client!i", name = "W", descriptor = "I")
	private int anInt1656 = 2000;

	@OriginalMember(owner = "client!i", name = "eb", descriptor = "I")
	private int anInt1662 = 4096;

	@OriginalMember(owner = "client!i", name = "ib", descriptor = "I")
	private int anInt1665 = 0;

	@OriginalMember(owner = "client!i", name = "lb", descriptor = "I")
	private int anInt1667 = 0;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3127(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass78_41.method2318(arg0);
		if (super.aClass78_41.aBoolean144) {
			@Pc(22) int local22 = this.anInt1662 >> 1;
			@Pc(27) int[][] local27 = super.aClass78_41.method2315();
			@Pc(34) Random local34 = new Random((long) this.anInt1665);
			for (@Pc(36) int local36 = 0; local36 < this.anInt1656; local36++) {
				@Pc(56) int local56 = this.anInt1662 > 0 ? this.anInt1667 + Static120.method1889(local34, this.anInt1662) - local22 : this.anInt1667;
				@Pc(62) int local62 = local56 >> 4 & 0xFF;
				@Pc(67) int local67 = Static120.method1889(local34, Static118.anInt2608);
				@Pc(72) int local72 = Static120.method1889(local34, Static38.anInt3056);
				@Pc(83) int local83 = local67 + (this.anInt1655 * Static63.anIntArray104[local62] >> 12);
				@Pc(94) int local94 = (this.anInt1655 * Static159.anIntArray290[local62] >> 12) + local72;
				@Pc(99) int local99 = local83 - local67;
				@Pc(104) int local104 = local94 - local72;
				if (local99 != 0 || local104 != 0) {
					if (local99 < 0) {
						local99 = -local99;
					}
					if (local104 < 0) {
						local104 = -local104;
					}
					@Pc(135) boolean local135 = local99 < local104;
					@Pc(139) int local139;
					@Pc(145) int local145;
					if (local135) {
						local139 = local67;
						local67 = local72;
						local72 = local139;
						local145 = local83;
						local83 = local94;
						local94 = local145;
					}
					if (local67 > local83) {
						local139 = local67;
						local145 = local72;
						local67 = local83;
						local72 = local94;
						local83 = local139;
						local94 = local145;
					}
					local139 = local72;
					local145 = local83 - local67;
					@Pc(176) int local176 = local94 - local72;
					if (local176 < 0) {
						local176 = -local176;
					}
					@Pc(188) int local188 = 2048 / local145;
					@Pc(193) int local193 = -local145 / 2;
					@Pc(203) int local203 = 1024 - (Static120.method1889(local34, 4096) >> 2);
					@Pc(210) int local210 = local94 <= local72 ? -1 : 1;
					for (@Pc(212) int local212 = local67; local212 < local83; local212++) {
						local193 += local176;
						@Pc(228) int local228 = (local212 - local67) * local188 + local203 + 1024;
						@Pc(232) int local232 = Static82.anInt1734 & local212;
						@Pc(236) int local236 = Static167.anInt3559 & local139;
						if (local193 > 0) {
							local193 += -local145;
							local139 -= -local210;
						}
						if (local135) {
							local27[local236][local232] = local228;
						} else {
							local27[local232][local236] = local228;
						}
					}
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IBLclient!kd;)V")
	@Override
	public void method3120(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt1665 = arg1.method1534();
		} else if (arg0 == 1) {
			this.anInt1656 = arg1.method1557();
		} else if (arg0 == 2) {
			this.anInt1655 = arg1.method1534();
		} else if (arg0 == 3) {
			this.anInt1667 = arg1.method1557();
		} else if (arg0 == 4) {
			this.anInt1662 = arg1.method1557();
		}
	}

	@OriginalMember(owner = "client!i", name = "f", descriptor = "(I)V")
	@Override
	public void method3133() {
		Static172.method516();
	}
}
