import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ot")
public final class Class10_Sub2_Sub25 extends Class10_Sub2 {

	@OriginalMember(owner = "client!ot", name = "P", descriptor = "I")
	private int anInt5206 = 1;

	@OriginalMember(owner = "client!ot", name = "Q", descriptor = "I")
	private int anInt5207 = 204;

	@OriginalMember(owner = "client!ot", name = "N", descriptor = "I")
	private int anInt5204 = 1;

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6035(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass241_41.method5238(arg0);
		if (super.aClass241_41.aBoolean440) {
			for (@Pc(22) int local22 = 0; local22 < Static121.anInt2458; local22++) {
				@Pc(28) int local28 = Static182.anIntArray374[local22];
				@Pc(32) int local32 = Static67.anIntArray106[arg0];
				@Pc(39) int local39 = local28 * this.anInt5204 >> 12;
				@Pc(46) int local46 = local32 * this.anInt5206 >> 12;
				@Pc(56) int local56 = local28 % (4096 / this.anInt5204) * this.anInt5204;
				@Pc(66) int local66 = local32 % (4096 / this.anInt5206) * this.anInt5206;
				if (this.anInt5207 > local66) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local11[local22] = 0;
						continue;
					}
					if (this.anInt5207 > local56) {
						local11[local22] = 0;
						continue;
					}
				}
				if (this.anInt5207 > local56) {
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

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IILclient!nn;)V")
	@Override
	public void method6044(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt5204 = arg1.method2502();
		} else if (arg0 == 1) {
			this.anInt5206 = arg1.method2502();
		} else if (arg0 == 2) {
			this.anInt5207 = arg1.method2485();
		}
	}
}
