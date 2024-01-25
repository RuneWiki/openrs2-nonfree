import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class3_Sub1_Sub31 extends Class3_Sub1 {

	@OriginalMember(owner = "client!pd", name = "G", descriptor = "I")
	private int anInt6862 = 1;

	@OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
	private int anInt6865 = 1;

	@OriginalMember(owner = "client!pd", name = "N", descriptor = "I")
	private int anInt6866 = 204;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IILclient!rt;)V")
	@Override
	public void method7783(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 0) {
			this.anInt6862 = arg1.method7548();
		} else if (arg0 == 1) {
			this.anInt6865 = arg1.method7548();
		} else if (arg0 == 2) {
			this.anInt6866 = arg1.method7591();
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7784(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass219_41.method5560(arg0);
		if (super.aClass219_41.aBoolean423) {
			for (@Pc(22) int local22 = 0; local22 < Static307.anInt4846; local22++) {
				@Pc(28) int local28 = Static241.anIntArray759[local22];
				@Pc(32) int local32 = Static402.anIntArray741[arg0];
				@Pc(39) int local39 = local28 * this.anInt6862 >> 12;
				@Pc(46) int local46 = local32 * this.anInt6865 >> 12;
				@Pc(56) int local56 = this.anInt6862 * (local28 % (4096 / this.anInt6862));
				@Pc(66) int local66 = local32 % (4096 / this.anInt6865) * this.anInt6865;
				if (local66 < this.anInt6866) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local16[local22] = 0;
						continue;
					}
					if (local56 < this.anInt6866) {
						local16[local22] = 0;
						continue;
					}
				}
				if (local56 < this.anInt6866) {
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
}
