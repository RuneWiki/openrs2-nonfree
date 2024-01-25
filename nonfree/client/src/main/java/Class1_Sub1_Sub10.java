import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fca")
public final class Class1_Sub1_Sub10 extends Class1_Sub1 {

	@OriginalMember(owner = "client!fca", name = "G", descriptor = "I")
	private int anInt2650 = 1;

	@OriginalMember(owner = "client!fca", name = "A", descriptor = "I")
	private int anInt2646 = 204;

	@OriginalMember(owner = "client!fca", name = "I", descriptor = "I")
	private int anInt2652 = 1;

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(BILclient!ac;)V")
	@Override
	public void method7835(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt2652 = arg1.method7974();
		} else if (arg0 == 1) {
			this.anInt2650 = arg1.method7974();
		} else if (arg0 == 2) {
			this.anInt2646 = arg1.method7945();
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7826(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass152_41.method3216(arg0);
		if (super.aClass152_41.aBoolean282) {
			for (@Pc(22) int local22 = 0; local22 < Static501.anInt8748; local22++) {
				@Pc(28) int local28 = Static95.anIntArray77[local22];
				@Pc(32) int local32 = Static583.anIntArray614[arg0];
				@Pc(39) int local39 = local28 * this.anInt2652 >> 12;
				@Pc(46) int local46 = this.anInt2650 * local32 >> 12;
				@Pc(56) int local56 = local28 % (4096 / this.anInt2652) * this.anInt2652;
				@Pc(66) int local66 = this.anInt2650 * (local32 % (4096 / this.anInt2650));
				if (this.anInt2646 > local66) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local16[local22] = 0;
						continue;
					}
					if (this.anInt2646 > local56) {
						local16[local22] = 0;
						continue;
					}
				}
				if (this.anInt2646 > local56) {
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
