import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class3_Sub1_Sub15 extends Class3_Sub1 {

	@OriginalMember(owner = "client!o", name = "T", descriptor = "I")
	public int anInt2510;

	@OriginalMember(owner = "client!o", name = "V", descriptor = "I")
	public int anInt2511;

	@OriginalMember(owner = "client!o", name = "Y", descriptor = "I")
	public int anInt2514;

	@OriginalMember(owner = "client!o", name = "cb", descriptor = "[I")
	public int[] anIntArray249;

	@OriginalMember(owner = "client!o", name = "gb", descriptor = "[I")
	public int[] anIntArray250;

	@OriginalMember(owner = "client!o", name = "jb", descriptor = "[Lclient!qf;")
	public Class60[] aClass60Array16;

	@OriginalMember(owner = "client!o", name = "U", descriptor = "Lclient!qf;")
	public Class60 aClass60_1063 = Static122.aClass60_258;

	@OriginalMember(owner = "client!o", name = "pb", descriptor = "I")
	public int anInt2519 = 0;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!la;)V")
	public void method1621(@OriginalArg(1) Class3_Sub12 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method1936();
			if (local10 == 0) {
				return;
			}
			this.method1623(arg0, local10);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!la;I)V")
	private void method1623(@OriginalArg(1) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2510 = arg0.method1936();
		} else if (arg1 == 2) {
			this.anInt2514 = arg0.method1936();
		} else if (arg1 == 3) {
			this.aClass60_1063 = arg0.method1943();
		} else if (arg1 == 4) {
			this.anInt2511 = arg0.method1920();
		} else {
			@Pc(49) int local49;
			if (arg1 == 5) {
				this.anInt2519 = arg0.method1963();
				this.aClass60Array16 = new Class60[this.anInt2519];
				this.anIntArray249 = new int[this.anInt2519];
				for (local49 = 0; local49 < this.anInt2519; local49++) {
					this.anIntArray249[local49] = arg0.method1920();
					this.aClass60Array16[local49] = arg0.method1943();
				}
			} else if (arg1 == 6) {
				this.anInt2519 = arg0.method1963();
				this.anIntArray249 = new int[this.anInt2519];
				this.anIntArray250 = new int[this.anInt2519];
				for (local49 = 0; local49 < this.anInt2519; local49++) {
					this.anIntArray249[local49] = arg0.method1920();
					this.anIntArray250[local49] = arg0.method1920();
				}
			}
		}
	}
}
