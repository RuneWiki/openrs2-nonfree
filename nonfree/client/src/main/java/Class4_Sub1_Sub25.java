import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class4_Sub1_Sub25 extends Class4_Sub1 {

	@OriginalMember(owner = "client!qj", name = "U", descriptor = "I")
	private int anInt4360 = 1;

	@OriginalMember(owner = "client!qj", name = "db", descriptor = "I")
	private int anInt4369 = 204;

	@OriginalMember(owner = "client!qj", name = "V", descriptor = "I")
	private int anInt4361 = 1;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4731(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = this.aClass35_41.method730(arg0);
		if (this.aClass35_41.aBoolean51) {
			for (@Pc(22) int local22 = 0; local22 < Static73.anInt1626; local22++) {
				@Pc(33) int local33 = Static138.anIntArray231[local22];
				@Pc(40) int local40 = local33 * this.anInt4360 >> 12;
				@Pc(44) int local44 = Static237.anIntArray478[arg0];
				@Pc(51) int local51 = local44 * this.anInt4361 >> 12;
				@Pc(61) int local61 = this.anInt4360 * (local33 % (4096 / this.anInt4360));
				@Pc(71) int local71 = local44 % (4096 / this.anInt4361) * this.anInt4361;
				if (local71 < this.anInt4369) {
					for (local40 -= local51; local40 < 0; local40 += 4) {
					}
					while (local40 > 3) {
						local40 -= 4;
					}
					if (local40 != 1) {
						local16[local22] = 0;
						continue;
					}
					if (local61 < this.anInt4369) {
						local16[local22] = 0;
						continue;
					}
				}
				if (local61 < this.anInt4369) {
					for (local40 -= local51; local40 < 0; local40 += 4) {
					}
					while (local40 > 3) {
						local40 -= 4;
					}
					if (local40 > 0) {
						local16[local22] = 0;
						continue;
					}
				}
				local16[local22] = 4096;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void method4724(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4360 = arg0.method4666();
		} else if (arg1 == 1) {
			this.anInt4361 = arg0.method4666();
		} else if (arg1 == 2) {
			this.anInt4369 = arg0.method4653();
		}
	}
}
