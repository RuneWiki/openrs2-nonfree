import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class1_Sub2_Sub17 extends Class1_Sub2 {

	@OriginalMember(owner = "client!s", name = "z", descriptor = "Ljava/lang/String;")
	public String aString269;

	@OriginalMember(owner = "client!s", name = "B", descriptor = "I")
	public int anInt4543;

	@OriginalMember(owner = "client!s", name = "G", descriptor = "C")
	private char aChar4;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BLclient!lf;I)V")
	private void method3961(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar4 = Static242.method3805(arg0.method1363());
		} else if (arg1 == 2) {
			this.anInt4543 = arg0.method1392();
		} else if (arg1 == 5) {
			this.aString269 = arg0.method1375();
		}
	}

	@OriginalMember(owner = "client!s", name = "f", descriptor = "(I)Z")
	public boolean method3963() {
		return this.aChar4 == 's';
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BLclient!lf;)V")
	public void method3964(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method1378();
			if (local15 == 0) {
				return;
			}
			this.method3961(arg0, local15);
		}
	}
}
