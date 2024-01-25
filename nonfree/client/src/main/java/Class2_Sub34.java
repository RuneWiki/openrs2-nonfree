import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public final class Class2_Sub34 extends Class2 {

	@OriginalMember(owner = "client!oda", name = "i", descriptor = "Lclient!iba;")
	public Class154 aClass154_77;

	@OriginalMember(owner = "client!oda", name = "l", descriptor = "Lclient!lr;")
	public Class2_Sub7_Sub2 aClass2_Sub7_Sub2_2;

	@OriginalMember(owner = "client!oda", name = "n", descriptor = "I")
	public int anInt6307;

	@OriginalMember(owner = "client!oda", name = "p", descriptor = "I")
	public int anInt6309;

	@OriginalMember(owner = "client!oda", name = "d", descriptor = "(I)V")
	public void method5266() {
		if (Static386.aClass2_Sub34Array1.length > Static101.anInt1807) {
			Static386.aClass2_Sub34Array1[Static101.anInt1807++] = this;
		}
	}
}
