import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class1_Sub3_Sub7 extends Class1_Sub3 {

	@OriginalMember(owner = "client!i", name = "L", descriptor = "C")
	private char aChar2;

	@OriginalMember(owner = "client!i", name = "P", descriptor = "I")
	public int anInt2417;

	@OriginalMember(owner = "client!i", name = "db", descriptor = "Ljava/lang/String;")
	public String aString144;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ILclient!qm;B)V")
	private void method1792(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub14 arg1) {
		if (arg0 == 1) {
			this.aChar2 = Static23.method506(arg1.method2212());
		} else if (arg0 == 2) {
			this.anInt2417 = arg1.method2194();
		} else if (arg0 == 5) {
			this.aString144 = arg1.method2237();
		}
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(B)Z")
	public boolean method1794() {
		return this.aChar2 == 's';
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BLclient!qm;)V")
	public void method1796(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2199();
			if (local5 == 0) {
				return;
			}
			this.method1792(local5, arg0);
		}
	}
}
