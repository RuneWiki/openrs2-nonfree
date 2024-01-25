import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public final class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!aca", name = "v", descriptor = "Ljava/lang/String;")
	public String aString1;

	@OriginalMember(owner = "client!aca", name = "w", descriptor = "Ljava/lang/String;")
	public String aString2;

	@OriginalMember(owner = "client!aca", name = "x", descriptor = "I")
	public int anInt65;

	@OriginalMember(owner = "client!aca", name = "u", descriptor = "I")
	public int anInt64 = -1;

	@OriginalMember(owner = "client!aca", name = "c", descriptor = "(B)Lclient!wfa;")
	public Class386 method63() {
		return Static28.aClass386Array1[super.anInt56];
	}
}
