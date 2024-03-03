import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public final class Class2_Sub2_Sub1 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ab", name = "G", descriptor = "Z")
	public static boolean aBoolean5 = false;

	@OriginalMember(owner = "client!ab", name = "D", descriptor = "Lclient!bc;")
	public static final Class16 aClass16_1 = new Class16("", 16);

	@OriginalMember(owner = "client!ab", name = "I", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray1 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ab", name = "H", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_1 = new Class79("green:", "grün:", "vert:", "verde:");

	@OriginalMember(owner = "client!ab", name = "J", descriptor = "I")
	public static int anInt61 = -1;

	@OriginalMember(owner = "client!ab", name = "K", descriptor = "I")
	public static int anInt62 = 0;

	@OriginalMember(owner = "client!ab", name = "C", descriptor = "Lclient!uh;")
	public final Class11_Sub5_Sub4 aClass11_Sub5_Sub4_1;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lclient!uh;)V", line = 42)
	public Class2_Sub2_Sub1(@OriginalArg(0) Class11_Sub5_Sub4 arg0) {
		this.aClass11_Sub5_Sub4_1 = arg0;
	}
}
