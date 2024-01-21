import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class5_Sub2_Sub9 extends Class5_Sub2 {

	@OriginalMember(owner = "client!k", name = "N", descriptor = "I")
	public int anInt1525;

	@OriginalMember(owner = "client!k", name = "Y", descriptor = "[Lclient!r;")
	public Class61[] aClass61Array8;

	@OriginalMember(owner = "client!k", name = "ab", descriptor = "I")
	public int anInt1531;

	@OriginalMember(owner = "client!k", name = "fb", descriptor = "[I")
	public int[] anIntArray228;

	@OriginalMember(owner = "client!k", name = "hb", descriptor = "I")
	public int anInt1535;

	@OriginalMember(owner = "client!k", name = "lb", descriptor = "[I")
	public int[] anIntArray230;

	@OriginalMember(owner = "client!k", name = "P", descriptor = "I")
	public int anInt1527 = 0;

	@OriginalMember(owner = "client!k", name = "ib", descriptor = "Lclient!r;")
	public Class61 aClass61_479 = Static107.aClass61_837;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IBLclient!pa;)V")
	private void method1072(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub14 arg1) {
		if (arg0 == 1) {
			this.anInt1535 = arg1.method1471();
		} else if (arg0 == 2) {
			this.anInt1531 = arg1.method1471();
		} else if (arg0 == 3) {
			this.aClass61_479 = arg1.method1450();
		} else if (arg0 == 4) {
			this.anInt1525 = arg1.method1461();
		} else {
			@Pc(51) int local51;
			if (arg0 == 5) {
				this.anInt1527 = arg1.method1478();
				this.anIntArray228 = new int[this.anInt1527];
				this.aClass61Array8 = new Class61[this.anInt1527];
				for (local51 = 0; local51 < this.anInt1527; local51++) {
					this.anIntArray228[local51] = arg1.method1461();
					this.aClass61Array8[local51] = arg1.method1450();
				}
				return;
			}
			if (arg0 == 6) {
				this.anInt1527 = arg1.method1478();
				this.anIntArray230 = new int[this.anInt1527];
				this.anIntArray228 = new int[this.anInt1527];
				for (local51 = 0; local51 < this.anInt1527; local51++) {
					this.anIntArray228[local51] = arg1.method1461();
					this.anIntArray230[local51] = arg1.method1461();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!pa;I)V")
	public void method1074(@OriginalArg(0) Class5_Sub14 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1471();
			if (local5 == 0) {
				return;
			}
			this.method1072(local5, arg0);
		}
	}
}
