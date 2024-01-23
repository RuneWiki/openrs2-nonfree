import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class4_Sub2_Sub7 extends Class4_Sub2 {

	@OriginalMember(owner = "client!fk", name = "E", descriptor = "Ljava/lang/String;")
	public String aString65;

	@OriginalMember(owner = "client!fk", name = "H", descriptor = "C")
	private char aChar3;

	@OriginalMember(owner = "client!fk", name = "K", descriptor = "I")
	public int anInt1697;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IBLclient!pi;)V")
	private void method1388(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 == 1) {
			this.aChar3 = Static131.method1213(arg1.method3069());
		} else if (arg0 == 2) {
			this.anInt1697 = arg1.method3084();
		} else if (arg0 == 5) {
			this.aString65 = arg1.method3111();
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILclient!pi;)V")
	public void method1390(@OriginalArg(1) Class4_Sub24 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method3110();
			if (local14 == 0) {
				return;
			}
			this.method1388(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "(Z)Z")
	public boolean method1391() {
		return this.aChar3 == 's';
	}
}
