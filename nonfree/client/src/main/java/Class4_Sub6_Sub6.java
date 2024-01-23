import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class4_Sub6_Sub6 extends Class4_Sub6 {

	@OriginalMember(owner = "client!de", name = "L", descriptor = "I")
	private int anInt943 = 204;

	@OriginalMember(owner = "client!de", name = "O", descriptor = "I")
	private int anInt946 = 1;

	@OriginalMember(owner = "client!de", name = "T", descriptor = "I")
	private int anInt950 = 1;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method4375(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass156_41.method3763(arg0);
		if (this.aClass156_41.aBoolean307) {
			for (@Pc(22) int local22 = 0; local22 < Static2.anInt19; local22++) {
				@Pc(29) int local29 = Static192.anIntArray318[local22];
				@Pc(33) int local33 = Static273.anIntArray127[arg0];
				@Pc(40) int local40 = this.anInt946 * local33 >> 12;
				@Pc(47) int local47 = local29 * this.anInt950 >> 12;
				@Pc(57) int local57 = local29 % (4096 / this.anInt950) * this.anInt950;
				@Pc(67) int local67 = this.anInt946 * (local33 % (4096 / this.anInt946));
				if (local67 < this.anInt943) {
					for (local47 -= local40; local47 < 0; local47 += 4) {
					}
					while (local47 > 3) {
						local47 -= 4;
					}
					if (local47 != 1) {
						local11[local22] = 0;
						continue;
					}
					if (this.anInt943 > local57) {
						local11[local22] = 0;
						continue;
					}
				}
				if (local57 < this.anInt943) {
					for (local47 -= local40; local47 < 0; local47 += 4) {
					}
					while (local47 > 3) {
						local47 -= 4;
					}
					if (local47 > 0) {
						local11[local22] = 0;
						continue;
					}
				}
				local11[local22] = 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!p;II)V")
	@Override
	public void method4381(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt950 = arg0.method1874();
		} else if (arg1 == 1) {
			this.anInt946 = arg0.method1874();
		} else if (arg1 == 2) {
			this.anInt943 = arg0.method1837();
		}
	}
}
