import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aw")
public final class Class2_Sub4_Sub3 extends Class2_Sub4 {

	@OriginalMember(owner = "client!aw", name = "E", descriptor = "I")
	private int anInt430 = 1;

	@OriginalMember(owner = "client!aw", name = "D", descriptor = "I")
	private int anInt429 = 204;

	@OriginalMember(owner = "client!aw", name = "H", descriptor = "I")
	private int anInt432 = 1;

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7564(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass271_41.method5621(arg0);
		if (super.aClass271_41.aBoolean543) {
			for (@Pc(23) int local23 = 0; local23 < Static143.anInt7434; local23++) {
				@Pc(29) int local29 = Static519.anIntArray155[local23];
				@Pc(33) int local33 = Static13.anIntArray418[arg0];
				@Pc(40) int local40 = local29 * this.anInt432 >> 12;
				@Pc(47) int local47 = local33 * this.anInt430 >> 12;
				@Pc(57) int local57 = this.anInt432 * (local29 % (4096 / this.anInt432));
				@Pc(67) int local67 = local33 % (4096 / this.anInt430) * this.anInt430;
				if (this.anInt429 > local67) {
					for (local40 -= local47; local40 < 0; local40 += 4) {
					}
					while (local40 > 3) {
						local40 -= 4;
					}
					if (local40 != 1) {
						local11[local23] = 0;
						continue;
					}
					if (this.anInt429 > local57) {
						local11[local23] = 0;
						continue;
					}
				}
				if (this.anInt429 > local57) {
					for (local40 -= local47; local40 < 0; local40 += 4) {
					}
					while (local40 > 3) {
						local40 -= 4;
					}
					if (local40 > 0) {
						local11[local23] = 0;
						continue;
					}
				}
				local11[local23] = 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(ILclient!gk;B)V")
	@Override
	public void method7566(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt432 = arg1.method4464();
		} else if (arg0 == 1) {
			this.anInt430 = arg1.method4464();
		} else if (arg0 == 2) {
			this.anInt429 = arg1.method4518();
		}
	}
}
