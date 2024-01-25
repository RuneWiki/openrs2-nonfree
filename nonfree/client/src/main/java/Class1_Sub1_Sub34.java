import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class1_Sub1_Sub34 extends Class1_Sub1 {

	@OriginalMember(owner = "client!sj", name = "M", descriptor = "I")
	private int anInt6204 = 1;

	@OriginalMember(owner = "client!sj", name = "P", descriptor = "I")
	private int anInt6206 = 204;

	@OriginalMember(owner = "client!sj", name = "T", descriptor = "I")
	private int anInt6209 = 1;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5622(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass109_41.method2236(arg0);
		if (super.aClass109_41.aBoolean214) {
			for (@Pc(22) int local22 = 0; local22 < Static434.anInt4326; local22++) {
				@Pc(28) int local28 = Static280.anIntArray238[local22];
				@Pc(32) int local32 = Static221.anIntArray194[arg0];
				@Pc(39) int local39 = local28 * this.anInt6209 >> 12;
				@Pc(46) int local46 = this.anInt6204 * local32 >> 12;
				@Pc(56) int local56 = local28 % (4096 / this.anInt6209) * this.anInt6209;
				@Pc(66) int local66 = this.anInt6204 * (local32 % (4096 / this.anInt6204));
				if (local66 < this.anInt6206) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local16[local22] = 0;
						continue;
					}
					if (this.anInt6206 > local56) {
						local16[local22] = 0;
						continue;
					}
				}
				if (this.anInt6206 > local56) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 > 0) {
						local16[local22] = 0;
						continue;
					}
				}
				local16[local22] = 4096;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILclient!dh;I)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt6209 = arg1.method4463();
		} else if (arg0 == 1) {
			this.anInt6204 = arg1.method4463();
		} else if (arg0 == 2) {
			this.anInt6206 = arg1.method4485();
		}
	}
}
