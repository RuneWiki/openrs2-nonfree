import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class1_Sub4_Sub6 extends Class1_Sub4 {

	@OriginalMember(owner = "client!di", name = "H", descriptor = "I")
	public int anInt1431;

	@OriginalMember(owner = "client!di", name = "K", descriptor = "Ljava/lang/String;")
	public String aString8;

	@OriginalMember(owner = "client!di", name = "P", descriptor = "C")
	private char aChar1;

	@OriginalMember(owner = "client!di", name = "S", descriptor = "Z")
	public boolean aBoolean103 = true;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!at;ZI)V")
	private void method1382(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar1 = Static19.method532(arg0.method2122());
		} else if (arg1 == 2) {
			this.anInt1431 = arg0.method2140();
			return;
		} else if (arg1 == 4) {
			this.aBoolean103 = false;
			return;
		} else if (arg1 == 5) {
			this.aString8 = arg0.method2109();
			return;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ILclient!at;)V")
	public void method1383(@OriginalArg(1) Class1_Sub7 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2132();
			if (local9 == 0) {
				return;
			}
			this.method1382(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!di", name = "c", descriptor = "(B)Z")
	public boolean method1384() {
		return this.aChar1 == 's';
	}
}
