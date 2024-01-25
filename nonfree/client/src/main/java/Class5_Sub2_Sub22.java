import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class5_Sub2_Sub22 extends Class5_Sub2 {

	@OriginalMember(owner = "client!oe", name = "G", descriptor = "I")
	private int anInt6603 = 1;

	@OriginalMember(owner = "client!oe", name = "E", descriptor = "I")
	private int anInt6601 = 204;

	@OriginalMember(owner = "client!oe", name = "D", descriptor = "I")
	private int anInt6600 = 1;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!ofa;I)V")
	@Override
	public void method9040(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6603 = arg0.method5966();
		} else if (arg1 == 1) {
			this.anInt6600 = arg0.method5966();
		} else if (arg1 == 2) {
			this.anInt6601 = arg0.method5968();
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9034(@OriginalArg(0) int arg0) {
		@Pc(21) int[] local21 = super.aClass379_41.method9012(arg0);
		if (super.aClass379_41.aBoolean761) {
			for (@Pc(27) int local27 = 0; local27 < Static597.anInt10025; local27++) {
				@Pc(33) int local33 = Static352.anIntArray331[local27];
				@Pc(37) int local37 = Static493.anIntArray476[arg0];
				@Pc(44) int local44 = local33 * this.anInt6603 >> 12;
				@Pc(51) int local51 = local37 * this.anInt6600 >> 12;
				@Pc(61) int local61 = this.anInt6603 * (local33 % (4096 / this.anInt6603));
				@Pc(71) int local71 = local37 % (4096 / this.anInt6600) * this.anInt6600;
				if (this.anInt6601 > local71) {
					for (local44 -= local51; local44 < 0; local44 += 4) {
					}
					while (local44 > 3) {
						local44 -= 4;
					}
					if (local44 != 1) {
						local21[local27] = 0;
						continue;
					}
					if (this.anInt6601 > local61) {
						local21[local27] = 0;
						continue;
					}
				}
				if (this.anInt6601 > local61) {
					for (local44 -= local51; local44 < 0; local44 += 4) {
					}
					while (local44 > 3) {
						local44 -= 4;
					}
					if (local44 > 0) {
						local21[local27] = 0;
						continue;
					}
				}
				local21[local27] = 4096;
			}
		}
		return local21;
	}
}
