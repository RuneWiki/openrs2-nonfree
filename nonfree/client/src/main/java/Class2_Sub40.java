import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public final class Class2_Sub40 extends Class2 {

	@OriginalMember(owner = "client!vh", name = "s", descriptor = "[Lclient!oe;")
	public static final Class11_Sub5_Sub2_Sub2[] aClass11_Sub5_Sub2_Sub2Array1 = new Class11_Sub5_Sub2_Sub2[32768];

	@OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
	public static int anInt6819 = 0;

	@OriginalMember(owner = "client!vh", name = "u", descriptor = "Ljava/lang/String;")
	public String aString65;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V", line = 40)
	private Class2_Sub40() {
	}

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 44)
	public Class2_Sub40(@OriginalArg(0) String arg0) {
		this.aString65 = arg0;
	}
}
