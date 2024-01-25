import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class2_Sub6_Sub26 extends Class2_Sub6 {

	@OriginalMember(owner = "client!o", name = "K", descriptor = "I")
	private int anInt4478 = 1;

	@OriginalMember(owner = "client!o", name = "Q", descriptor = "I")
	private int anInt4483 = 1;

	@OriginalMember(owner = "client!o", name = "P", descriptor = "I")
	private int anInt4482 = 204;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5642(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = super.aClass166_41.method3993(arg0);
		if (super.aClass166_41.aBoolean336) {
			for (@Pc(24) int local24 = 0; local24 < Static151.anInt2711; local24++) {
				@Pc(30) int local30 = Static160.anIntArray329[local24];
				@Pc(34) int local34 = Static138.anIntArray291[arg0];
				@Pc(41) int local41 = local30 * this.anInt4483 >> 12;
				@Pc(48) int local48 = this.anInt4478 * local34 >> 12;
				@Pc(58) int local58 = local30 % (4096 / this.anInt4483) * this.anInt4483;
				@Pc(68) int local68 = this.anInt4478 * (local34 % (4096 / this.anInt4478));
				if (this.anInt4482 > local68) {
					for (local41 -= local48; local41 < 0; local41 += 4) {
					}
					while (local41 > 3) {
						local41 -= 4;
					}
					if (local41 != 1) {
						local13[local24] = 0;
						continue;
					}
					if (local58 < this.anInt4482) {
						local13[local24] = 0;
						continue;
					}
				}
				if (this.anInt4482 > local58) {
					for (local41 -= local48; local41 < 0; local41 += 4) {
					}
					while (local41 > 3) {
						local41 -= 4;
					}
					if (local41 > 0) {
						local13[local24] = 0;
						continue;
					}
				}
				local13[local24] = 4096;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!lk;II)V")
	@Override
	public void method5637(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4483 = arg0.method4240();
		} else if (arg1 == 1) {
			this.anInt4478 = arg0.method4240();
		} else if (arg1 == 2) {
			this.anInt4482 = arg0.method4245();
		}
	}
}
