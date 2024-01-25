import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static343 {

	@OriginalMember(owner = "client!mea", name = "D", descriptor = "I")
	public static int anInt6700;

	@OriginalMember(owner = "client!mea", name = "F", descriptor = "I")
	public static int anInt6701;

	@OriginalMember(owner = "client!mea", name = "q", descriptor = "Lclient!nca;")
	public static final Class228 aClass228_9 = new Class228("RC", 1);

	@OriginalMember(owner = "client!mea", name = "C", descriptor = "I")
	public static int anInt6699 = 0;

	@OriginalMember(owner = "client!mea", name = "E", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_92 = new Class130(50, 7);

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Ljava/net/Socket;II)Lclient!oi;")
	public static Class230 method5748(@OriginalArg(0) Socket arg0) throws IOException {
		return new Class230_Sub1(arg0, 7500);
	}

	@OriginalMember(owner = "client!mea", name = "e", descriptor = "(I)V")
	public static void method5749() {
		Static517.aClass280_42.method7100();
		Static411.aClass15_12.method903();
		Static223.aClass15_7.method903();
	}
}
