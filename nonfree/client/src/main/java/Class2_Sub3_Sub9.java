import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class2_Sub3_Sub9 extends Class2_Sub3 {

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "[I")
	public int[] anIntArray143;

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "[Lclient!ai;")
	public Class6[] aClass6Array9;

	@OriginalMember(owner = "client!kb", name = "F", descriptor = "I")
	public int anInt1976;

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "[I")
	public int[] anIntArray144;

	@OriginalMember(owner = "client!kb", name = "H", descriptor = "I")
	public int anInt1977;

	@OriginalMember(owner = "client!kb", name = "V", descriptor = "I")
	public int anInt1984;

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "I")
	public int anInt1975 = 0;

	@OriginalMember(owner = "client!kb", name = "J", descriptor = "Lclient!ai;")
	public Class6 aClass6_605 = Static95.aClass6_675;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IILclient!me;)V")
	private void method1304(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt1976 = arg1.method1402();
		} else if (arg0 == 2) {
			this.anInt1984 = arg1.method1402();
		} else if (arg0 == 3) {
			this.aClass6_605 = arg1.method1399();
		} else if (arg0 == 4) {
			this.anInt1977 = arg1.method1396();
		} else {
			@Pc(59) int local59;
			if (arg0 == 5) {
				this.anInt1975 = arg1.method1397();
				this.aClass6Array9 = new Class6[this.anInt1975];
				this.anIntArray143 = new int[this.anInt1975];
				for (local59 = 0; local59 < this.anInt1975; local59++) {
					this.anIntArray143[local59] = arg1.method1396();
					this.aClass6Array9[local59] = arg1.method1399();
				}
			} else if (arg0 == 6) {
				this.anInt1975 = arg1.method1397();
				this.anIntArray143 = new int[this.anInt1975];
				this.anIntArray144 = new int[this.anInt1975];
				for (local59 = 0; local59 < this.anInt1975; local59++) {
					this.anIntArray143[local59] = arg1.method1396();
					this.anIntArray144[local59] = arg1.method1396();
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!me;I)V")
	public void method1305(@OriginalArg(0) Class2_Sub13 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method1402();
			if (local10 == 0) {
				return;
			}
			this.method1304(local10, arg0);
		}
	}
}
