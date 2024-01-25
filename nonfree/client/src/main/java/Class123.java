import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class123 {

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "[Lclient!re;")
	public static final Class175[] aClass175Array1 = new Class175[5];

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "Ljava/lang/String;")
	public String aString153;

	@OriginalMember(owner = "client!lq", name = "f", descriptor = "Ljava/lang/String;")
	public String aString154;

	@OriginalMember(owner = "client!lq", name = "g", descriptor = "Ljava/lang/String;")
	public String aString155;

	@OriginalMember(owner = "client!lq", name = "h", descriptor = "B")
	public byte aByte38;

	@OriginalMember(owner = "client!lq", name = "j", descriptor = "I")
	public int anInt3833;

	static {
		for (@Pc(6) int local6 = 0; local6 < aClass175Array1.length; local6++) {
			aClass175Array1[local6] = new Class175();
		}
	}
}
