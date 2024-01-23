import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "Lclient!th;")
	public static Class98 aClass98_1;

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "Lclient!wb;")
	public static Class1_Sub7_Sub2 aClass1_Sub7_Sub2_2;

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
	public static int anInt3602 = 0;

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1240 = Static200.method3116("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
	public static int anInt3603 = 0;

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1241 = null;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!ah;B)I")
	public static int method2717(@OriginalArg(0) Class6 arg0) {
		@Pc(19) Class1_Sub16 local19 = (Class1_Sub16) Static163.aClass33_13.method1071((long) arg0.anInt242 + ((long) arg0.anInt229 << 32));
		return local19 == null ? arg0.anInt199 : local19.anInt2543;
	}
}
