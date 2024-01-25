import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static311 {

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "I")
	public static int anInt6069 = 0;

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
	public static int anInt6070 = 0;

	@OriginalMember(owner = "client!tr", name = "g", descriptor = "Lclient!kl;")
	public static final Class1_Sub8_Sub1 aClass1_Sub8_Sub1_8 = new Class1_Sub8_Sub1(5000);

	@OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
	public static int anInt6073 = 1;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(BI)I")
	public static int method5177(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}
}
