import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class2_Sub4_Sub8 extends Class2_Sub4 {

	@OriginalMember(owner = "client!f", name = "F", descriptor = "[Lclient!gg;")
	public Class28[] aClass28Array13;

	@OriginalMember(owner = "client!f", name = "G", descriptor = "[I")
	public int[] anIntArray104;

	@OriginalMember(owner = "client!f", name = "J", descriptor = "[I")
	public int[] anIntArray105;

	@OriginalMember(owner = "client!f", name = "L", descriptor = "I")
	public int anInt1252;

	@OriginalMember(owner = "client!f", name = "N", descriptor = "I")
	public int anInt1253;

	@OriginalMember(owner = "client!f", name = "R", descriptor = "I")
	public int anInt1257;

	@OriginalMember(owner = "client!f", name = "I", descriptor = "I")
	public int anInt1250 = 0;

	@OriginalMember(owner = "client!f", name = "M", descriptor = "Lclient!gg;")
	public Class28 aClass28_766 = Static173.aClass28_2283;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!ab;)V")
	public void method900(@OriginalArg(1) Class2_Sub2 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1698();
			if (local5 == 0) {
				return;
			}
			this.method902(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!ab;I)V")
	private void method902(@OriginalArg(1) Class2_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1257 = arg0.method1698();
		} else if (arg1 == 2) {
			this.anInt1253 = arg0.method1698();
		} else if (arg1 == 3) {
			this.aClass28_766 = arg0.method1662();
		} else if (arg1 == 4) {
			this.anInt1252 = arg0.method1690();
		} else {
			@Pc(39) int local39;
			if (arg1 == 5) {
				this.anInt1250 = arg0.method1680();
				this.anIntArray105 = new int[this.anInt1250];
				this.aClass28Array13 = new Class28[this.anInt1250];
				for (local39 = 0; local39 < this.anInt1250; local39++) {
					this.anIntArray105[local39] = arg0.method1690();
					this.aClass28Array13[local39] = arg0.method1662();
				}
			} else if (arg1 == 6) {
				this.anInt1250 = arg0.method1680();
				this.anIntArray104 = new int[this.anInt1250];
				this.anIntArray105 = new int[this.anInt1250];
				for (local39 = 0; local39 < this.anInt1250; local39++) {
					this.anIntArray105[local39] = arg0.method1690();
					this.anIntArray104[local39] = arg0.method1690();
				}
			}
		}
	}
}
