import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class4_Sub4_Sub16 extends Class4_Sub4 {

	@OriginalMember(owner = "client!ue", name = "L", descriptor = "[I")
	public int[] anIntArray319;

	@OriginalMember(owner = "client!ue", name = "V", descriptor = "I")
	public int anInt2889;

	@OriginalMember(owner = "client!ue", name = "W", descriptor = "I")
	public int anInt2890;

	@OriginalMember(owner = "client!ue", name = "Y", descriptor = "I")
	public int anInt2892;

	@OriginalMember(owner = "client!ue", name = "eb", descriptor = "[Lclient!qc;")
	public Class60[] aClass60Array25;

	@OriginalMember(owner = "client!ue", name = "fb", descriptor = "[I")
	public int[] anIntArray320;

	@OriginalMember(owner = "client!ue", name = "cb", descriptor = "I")
	public int anInt2895 = 0;

	@OriginalMember(owner = "client!ue", name = "I", descriptor = "Lclient!qc;")
	public Class60 aClass60_1154 = Static65.aClass60_607;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILclient!re;)V")
	public void method2044(@OriginalArg(1) Class4_Sub13 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1223();
			if (local5 == 0) {
				return;
			}
			this.method2050(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZLclient!re;)V")
	private void method2050(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt2889 = arg1.method1223();
		} else if (arg0 == 2) {
			this.anInt2892 = arg1.method1223();
		} else if (arg0 == 3) {
			this.aClass60_1154 = arg1.method1249();
		} else if (arg0 == 4) {
			this.anInt2890 = arg1.method1215();
		} else {
			@Pc(68) int local68;
			if (arg0 == 5) {
				this.anInt2895 = arg1.method1244();
				this.aClass60Array25 = new Class60[this.anInt2895];
				this.anIntArray320 = new int[this.anInt2895];
				for (local68 = 0; local68 < this.anInt2895; local68++) {
					this.anIntArray320[local68] = arg1.method1215();
					this.aClass60Array25[local68] = arg1.method1249();
				}
			} else if (arg0 == 6) {
				this.anInt2895 = arg1.method1244();
				this.anIntArray319 = new int[this.anInt2895];
				this.anIntArray320 = new int[this.anInt2895];
				for (local68 = 0; local68 < this.anInt2895; local68++) {
					this.anIntArray320[local68] = arg1.method1215();
					this.anIntArray319[local68] = arg1.method1215();
				}
				return;
			}
		}
	}
}
