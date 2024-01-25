import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class84_Sub1 extends Class84 {

	@OriginalMember(owner = "client!uf", name = "o", descriptor = "[Lclient!br;")
	public static final Class27[] aClass27Array1 = new Class27[5];

	@OriginalMember(owner = "client!uf", name = "m", descriptor = "Ljava/lang/String;")
	public String aString65;

	@OriginalMember(owner = "client!uf", name = "p", descriptor = "Ljava/lang/String;")
	public String aString66;

	@OriginalMember(owner = "client!uf", name = "q", descriptor = "I")
	public int anInt6832;

	@OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
	public int anInt6835 = -1;

	static {
		for (@Pc(4) int local4 = 0; local4 < aClass27Array1.length; local4++) {
			aClass27Array1[local4] = new Class27();
		}
	}

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "(I)Lclient!sc;")
	public Class214 method5301() {
		return Static422.aClass214Array1[super.anInt6827];
	}
}
