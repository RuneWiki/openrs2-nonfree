import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class7_Sub3_Sub6 extends Class7_Sub3 {

	@OriginalMember(owner = "client!db", name = "F", descriptor = "I")
	private int anInt1154 = 1;

	@OriginalMember(owner = "client!db", name = "H", descriptor = "I")
	private int anInt1156 = 204;

	@OriginalMember(owner = "client!db", name = "J", descriptor = "I")
	private int anInt1158 = 1;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
	public Class7_Sub3_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5594(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass113_41.method2456(arg0);
		if (super.aClass113_41.aBoolean181) {
			for (@Pc(17) int local17 = 0; local17 < Static58.anInt1052; local17++) {
				@Pc(23) int local23 = Static185.anIntArray298[local17];
				@Pc(27) int local27 = Static203.anIntArray322[arg0];
				@Pc(34) int local34 = this.anInt1154 * local23 >> 12;
				@Pc(41) int local41 = local27 * this.anInt1158 >> 12;
				@Pc(51) int local51 = this.anInt1154 * (local23 % (4096 / this.anInt1154));
				@Pc(61) int local61 = this.anInt1158 * (local27 % (4096 / this.anInt1158));
				if (local61 < this.anInt1156) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 != 1) {
						local11[local17] = 0;
						continue;
					}
					if (local51 < this.anInt1156) {
						local11[local17] = 0;
						continue;
					}
				}
				if (this.anInt1156 > local51) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 > 0) {
						local11[local17] = 0;
						continue;
					}
				}
				local11[local17] = 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IZLclient!gk;)V")
	@Override
	public void method5599(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt1154 = arg1.method3981();
		} else if (arg0 == 1) {
			this.anInt1158 = arg1.method3981();
		} else if (arg0 == 2) {
			this.anInt1156 = arg1.method3943();
		}
	}
}
