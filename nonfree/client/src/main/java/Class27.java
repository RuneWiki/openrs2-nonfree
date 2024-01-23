import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class27 {

	@OriginalMember(owner = "client!da", name = "a", descriptor = "Z")
	public boolean aBoolean73;

	@OriginalMember(owner = "client!da", name = "c", descriptor = "I")
	public int anInt1016;

	@OriginalMember(owner = "client!da", name = "g", descriptor = "I")
	public int anInt1019;

	@OriginalMember(owner = "client!da", name = "i", descriptor = "I")
	public int anInt1021;

	@OriginalMember(owner = "client!da", name = "j", descriptor = "I")
	public int anInt1022;

	@OriginalMember(owner = "client!da", name = "n", descriptor = "I")
	public int anInt1026;

	@OriginalMember(owner = "client!da", name = "f", descriptor = "I")
	public int anInt1018 = 16777215;

	@OriginalMember(owner = "client!da", name = "o", descriptor = "I")
	public int anInt1027 = 8;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILclient!cg;I)V")
	public void method827(@OriginalArg(1) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method2690();
			if (local9 == 0) {
				return;
			}
			this.method828(arg1, local9, arg0);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILclient!cg;I)V")
	private void method828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub11 arg2) {
		if (arg1 == 1) {
			this.anInt1027 = arg2.method2691();
		} else if (arg1 == 2) {
			this.aBoolean73 = true;
		} else if (arg1 == 3) {
			this.anInt1019 = arg2.method2632();
			this.anInt1021 = arg2.method2632();
			this.anInt1016 = arg2.method2632();
		} else if (arg1 == 4) {
			this.anInt1022 = arg2.method2690();
		} else if (arg1 == 5) {
			this.anInt1026 = arg2.method2691();
		} else if (arg1 == 6) {
			this.anInt1018 = arg2.method2681();
		}
	}
}
