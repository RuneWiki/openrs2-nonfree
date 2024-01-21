import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class4_Sub3_Sub2 extends Class4_Sub3 {

	@OriginalMember(owner = "client!da", name = "G", descriptor = "I")
	public int anInt700;

	@OriginalMember(owner = "client!da", name = "Z", descriptor = "I")
	public int anInt706;

	@OriginalMember(owner = "client!da", name = "cb", descriptor = "[I")
	public int[] anIntArray79;

	@OriginalMember(owner = "client!da", name = "fb", descriptor = "[Lclient!od;")
	public Class60[] aClass60Array2;

	@OriginalMember(owner = "client!da", name = "hb", descriptor = "I")
	public int anInt708;

	@OriginalMember(owner = "client!da", name = "jb", descriptor = "[I")
	public int[] anIntArray80;

	@OriginalMember(owner = "client!da", name = "L", descriptor = "Lclient!od;")
	public Class60 aClass60_211 = Static124.aClass60_1107;

	@OriginalMember(owner = "client!da", name = "eb", descriptor = "I")
	public int anInt707 = 0;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILclient!tf;)V")
	public void method385(@OriginalArg(1) Class4_Sub9 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method773();
			if (local15 == 0) {
				return;
			}
			this.method386(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!tf;II)V")
	private void method386(@OriginalArg(0) Class4_Sub9 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt708 = arg0.method773();
		} else if (arg1 == 2) {
			this.anInt700 = arg0.method773();
		} else if (arg1 == 3) {
			this.aClass60_211 = arg0.method776();
		} else if (arg1 == 4) {
			this.anInt706 = arg0.method780();
		} else {
			@Pc(60) int local60;
			if (arg1 == 5) {
				this.anInt707 = arg0.method816();
				this.anIntArray80 = new int[this.anInt707];
				this.aClass60Array2 = new Class60[this.anInt707];
				for (local60 = 0; local60 < this.anInt707; local60++) {
					this.anIntArray80[local60] = arg0.method780();
					this.aClass60Array2[local60] = arg0.method776();
				}
			} else if (arg1 == 6) {
				this.anInt707 = arg0.method816();
				this.anIntArray79 = new int[this.anInt707];
				this.anIntArray80 = new int[this.anInt707];
				for (local60 = 0; local60 < this.anInt707; local60++) {
					this.anIntArray80[local60] = arg0.method780();
					this.anIntArray79[local60] = arg0.method780();
				}
			}
		}
	}
}
