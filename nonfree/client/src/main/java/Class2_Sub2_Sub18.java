import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class2_Sub2_Sub18 extends Class2_Sub2 {

	@OriginalMember(owner = "client!va", name = "V", descriptor = "I")
	public int anInt4133;

	@OriginalMember(owner = "client!va", name = "W", descriptor = "I")
	public int anInt4134;

	@OriginalMember(owner = "client!va", name = "X", descriptor = "[Lclient!sg;")
	public Class77[] aClass77Array23;

	@OriginalMember(owner = "client!va", name = "Y", descriptor = "[I")
	public int[] anIntArray592;

	@OriginalMember(owner = "client!va", name = "Z", descriptor = "I")
	public int anInt4135;

	@OriginalMember(owner = "client!va", name = "bb", descriptor = "[I")
	public int[] anIntArray593;

	@OriginalMember(owner = "client!va", name = "ab", descriptor = "Lclient!sg;")
	public Class77 aClass77_1417 = Static63.aClass77_641;

	@OriginalMember(owner = "client!va", name = "T", descriptor = "I")
	public int anInt4132 = 0;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZILclient!oa;)V")
	private void method2797(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub18 arg1) {
		if (arg0 == 1) {
			this.anInt4134 = arg1.method2387();
		} else if (arg0 == 2) {
			this.anInt4133 = arg1.method2387();
		} else if (arg0 == 3) {
			this.aClass77_1417 = arg1.method2361();
		} else if (arg0 == 4) {
			this.anInt4135 = arg1.method2382();
		} else {
			@Pc(57) int local57;
			if (arg0 == 5) {
				this.anInt4132 = arg1.method2353();
				this.aClass77Array23 = new Class77[this.anInt4132];
				this.anIntArray592 = new int[this.anInt4132];
				for (local57 = 0; local57 < this.anInt4132; local57++) {
					this.anIntArray592[local57] = arg1.method2382();
					this.aClass77Array23[local57] = arg1.method2361();
				}
			} else if (arg0 == 6) {
				this.anInt4132 = arg1.method2353();
				this.anIntArray593 = new int[this.anInt4132];
				this.anIntArray592 = new int[this.anInt4132];
				for (local57 = 0; local57 < this.anInt4132; local57++) {
					this.anIntArray592[local57] = arg1.method2382();
					this.anIntArray593[local57] = arg1.method2382();
				}
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!oa;I)V")
	public void method2798(@OriginalArg(0) Class2_Sub18 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method2387();
			if (local17 == 0) {
				return;
			}
			this.method2797(local17, arg0);
		}
	}
}
