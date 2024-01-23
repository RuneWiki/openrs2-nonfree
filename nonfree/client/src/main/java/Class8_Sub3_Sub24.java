import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class8_Sub3_Sub24 extends Class8_Sub3 {

	@OriginalMember(owner = "client!mm", name = "O", descriptor = "I")
	private int anInt3347 = 204;

	@OriginalMember(owner = "client!mm", name = "K", descriptor = "I")
	private int anInt3344 = 1;

	@OriginalMember(owner = "client!mm", name = "I", descriptor = "I")
	private int anInt3342 = 1;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method4227(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = this.aClass59_41.method1366(arg0);
		if (this.aClass59_41.aBoolean131) {
			for (@Pc(23) int local23 = 0; local23 < Static239.anInt4789; local23++) {
				@Pc(30) int local30 = Static33.anIntArray50[arg0];
				@Pc(34) int local34 = Static171.anIntArray258[local23];
				@Pc(44) int local44 = local30 % (4096 / this.anInt3342) * this.anInt3342;
				@Pc(54) int local54 = local34 % (4096 / this.anInt3344) * this.anInt3344;
				@Pc(61) int local61 = local30 * this.anInt3342 >> 12;
				@Pc(68) int local68 = local34 * this.anInt3344 >> 12;
				if (local44 < this.anInt3347) {
					for (local68 -= local61; local68 < 0; local68 += 4) {
					}
					while (local68 > 3) {
						local68 -= 4;
					}
					if (local68 != 1) {
						local16[local23] = 0;
						continue;
					}
					if (this.anInt3347 > local54) {
						local16[local23] = 0;
						continue;
					}
				}
				if (local54 < this.anInt3347) {
					for (local68 -= local61; local68 < 0; local68 += 4) {
					}
					while (local68 > 3) {
						local68 -= 4;
					}
					if (local68 > 0) {
						local16[local23] = 0;
						continue;
					}
				}
				local16[local23] = 4096;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IILclient!aj;)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt3344 = arg1.method2334();
		} else if (arg0 == 1) {
			this.anInt3342 = arg1.method2334();
		} else if (arg0 == 2) {
			this.anInt3347 = arg1.method2375();
		}
	}
}
