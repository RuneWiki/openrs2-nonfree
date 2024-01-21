import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class3_Sub2_Sub10 extends Class3_Sub2 {

	@OriginalMember(owner = "client!o", name = "z", descriptor = "I")
	public int anInt2627;

	@OriginalMember(owner = "client!o", name = "B", descriptor = "[I")
	public int[] anIntArray289;

	@OriginalMember(owner = "client!o", name = "F", descriptor = "I")
	public int anInt2631;

	@OriginalMember(owner = "client!o", name = "J", descriptor = "I")
	public int anInt2634;

	@OriginalMember(owner = "client!o", name = "M", descriptor = "[Lclient!kb;")
	public Class46[] aClass46Array14;

	@OriginalMember(owner = "client!o", name = "P", descriptor = "[I")
	public int[] anIntArray290;

	@OriginalMember(owner = "client!o", name = "K", descriptor = "I")
	public int anInt2635 = 0;

	@OriginalMember(owner = "client!o", name = "S", descriptor = "Lclient!kb;")
	public Class46 aClass46_889 = Static135.aClass46_1093;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!rd;I)V")
	public void method1825(@OriginalArg(0) Class3_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method191();
			if (local5 == 0) {
				return;
			}
			this.method1826(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BLclient!rd;I)V")
	private void method1826(@OriginalArg(1) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2631 = arg0.method191();
		} else if (arg1 == 2) {
			this.anInt2627 = arg0.method191();
		} else if (arg1 == 3) {
			this.aClass46_889 = arg0.method172();
		} else if (arg1 == 4) {
			this.anInt2634 = arg0.method213();
		} else {
			@Pc(54) int local54;
			if (arg1 == 5) {
				this.anInt2635 = arg0.method208();
				this.aClass46Array14 = new Class46[this.anInt2635];
				this.anIntArray289 = new int[this.anInt2635];
				for (local54 = 0; local54 < this.anInt2635; local54++) {
					this.anIntArray289[local54] = arg0.method213();
					this.aClass46Array14[local54] = arg0.method172();
				}
			} else if (arg1 == 6) {
				this.anInt2635 = arg0.method208();
				this.anIntArray290 = new int[this.anInt2635];
				this.anIntArray289 = new int[this.anInt2635];
				for (local54 = 0; local54 < this.anInt2635; local54++) {
					this.anIntArray289[local54] = arg0.method213();
					this.anIntArray290[local54] = arg0.method213();
				}
			}
		}
	}
}
