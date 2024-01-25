import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class1_Sub4_Sub11 extends Class1_Sub4 {

	@OriginalMember(owner = "client!fl", name = "G", descriptor = "I")
	private int anInt2366 = 1;

	@OriginalMember(owner = "client!fl", name = "E", descriptor = "I")
	private int anInt2365 = 204;

	@OriginalMember(owner = "client!fl", name = "K", descriptor = "I")
	private int anInt2370 = 1;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5957(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass15_41.method508(arg0);
		if (super.aClass15_41.aBoolean17) {
			for (@Pc(24) int local24 = 0; local24 < Static66.anInt1511; local24++) {
				@Pc(30) int local30 = Static121.anIntArray197[local24];
				@Pc(34) int local34 = Static266.anIntArray628[arg0];
				@Pc(41) int local41 = this.anInt2370 * local30 >> 12;
				@Pc(48) int local48 = local34 * this.anInt2366 >> 12;
				@Pc(58) int local58 = local30 % (4096 / this.anInt2370) * this.anInt2370;
				@Pc(68) int local68 = local34 % (4096 / this.anInt2366) * this.anInt2366;
				if (local68 < this.anInt2365) {
					for (local41 -= local48; local41 < 0; local41 += 4) {
					}
					while (local41 > 3) {
						local41 -= 4;
					}
					if (local41 != 1) {
						local11[local24] = 0;
						continue;
					}
					if (local58 < this.anInt2365) {
						local11[local24] = 0;
						continue;
					}
				}
				if (local58 < this.anInt2365) {
					for (local41 -= local48; local41 < 0; local41 += 4) {
					}
					while (local41 > 3) {
						local41 -= 4;
					}
					if (local41 > 0) {
						local11[local24] = 0;
						continue;
					}
				}
				local11[local24] = 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BILclient!hp;)V")
	@Override
	public void method5949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 0) {
			this.anInt2370 = arg1.method5366();
		} else if (arg0 == 1) {
			this.anInt2366 = arg1.method5366();
		} else if (arg0 == 2) {
			this.anInt2365 = arg1.method5362();
		}
	}
}
