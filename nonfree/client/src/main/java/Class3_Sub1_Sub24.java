import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mp")
public final class Class3_Sub1_Sub24 extends Class3_Sub1 {

	@OriginalMember(owner = "client!mp", name = "M", descriptor = "I")
	private int anInt6899 = 1;

	@OriginalMember(owner = "client!mp", name = "O", descriptor = "I")
	private int anInt6901 = 204;

	@OriginalMember(owner = "client!mp", name = "K", descriptor = "I")
	private int anInt6897 = 1;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8359(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass313_41.method7619(arg0);
		if (super.aClass313_41.aBoolean787) {
			for (@Pc(22) int local22 = 0; local22 < Static131.anInt2935; local22++) {
				@Pc(28) int local28 = Static361.anIntArray460[local22];
				@Pc(32) int local32 = Static324.anIntArray440[arg0];
				@Pc(39) int local39 = local28 * this.anInt6897 >> 12;
				@Pc(46) int local46 = local32 * this.anInt6899 >> 12;
				@Pc(56) int local56 = local28 % (4096 / this.anInt6897) * this.anInt6897;
				@Pc(66) int local66 = this.anInt6899 * (local32 % (4096 / this.anInt6899));
				if (local66 < this.anInt6901) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local11[local22] = 0;
						continue;
					}
					if (local56 < this.anInt6901) {
						local11[local22] = 0;
						continue;
					}
				}
				if (this.anInt6901 > local56) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 > 0) {
						local11[local22] = 0;
						continue;
					}
				}
				local11[local22] = 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(ILclient!fd;I)V")
	@Override
	public void method8372(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt6897 = arg1.method6538();
		} else if (arg0 == 1) {
			this.anInt6899 = arg1.method6538();
		} else if (arg0 == 2) {
			this.anInt6901 = arg1.method6535();
		}
	}
}
