import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class1_Sub1_Sub10 extends Class1_Sub1 {

	@OriginalMember(owner = "client!q", name = "S", descriptor = "[Lclient!id;")
	public Class34[] aClass34Array21;

	@OriginalMember(owner = "client!q", name = "Y", descriptor = "I")
	public int anInt2478;

	@OriginalMember(owner = "client!q", name = "db", descriptor = "[I")
	public int[] anIntArray313;

	@OriginalMember(owner = "client!q", name = "eb", descriptor = "I")
	public int anInt2481;

	@OriginalMember(owner = "client!q", name = "gb", descriptor = "I")
	public int anInt2483;

	@OriginalMember(owner = "client!q", name = "hb", descriptor = "[I")
	public int[] anIntArray314;

	@OriginalMember(owner = "client!q", name = "T", descriptor = "I")
	public int anInt2476 = 0;

	@OriginalMember(owner = "client!q", name = "W", descriptor = "Lclient!id;")
	public Class34 aClass34_1231 = Static127.aClass34_1019;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!of;I)V")
	public void method1639(@OriginalArg(0) Class1_Sub19 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2072();
			if (local9 == 0) {
				return;
			}
			this.method1640(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ILclient!of;I)V")
	private void method1640(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub19 arg1) {
		if (arg0 == 1) {
			this.anInt2478 = arg1.method2072();
		} else if (arg0 == 2) {
			this.anInt2483 = arg1.method2072();
		} else if (arg0 == 3) {
			this.aClass34_1231 = arg1.method2084();
		} else if (arg0 == 4) {
			this.anInt2481 = arg1.method2046();
		} else {
			@Pc(51) int local51;
			if (arg0 == 5) {
				this.anInt2476 = arg1.method2051();
				this.aClass34Array21 = new Class34[this.anInt2476];
				this.anIntArray313 = new int[this.anInt2476];
				for (local51 = 0; local51 < this.anInt2476; local51++) {
					this.anIntArray313[local51] = arg1.method2046();
					this.aClass34Array21[local51] = arg1.method2084();
				}
			} else if (arg0 == 6) {
				this.anInt2476 = arg1.method2051();
				this.anIntArray313 = new int[this.anInt2476];
				this.anIntArray314 = new int[this.anInt2476];
				for (local51 = 0; local51 < this.anInt2476; local51++) {
					this.anIntArray313[local51] = arg1.method2046();
					this.anIntArray314[local51] = arg1.method2046();
				}
			}
		}
	}
}
