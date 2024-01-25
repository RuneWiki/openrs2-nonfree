import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static493 {

	@OriginalMember(owner = "client!qu", name = "d", descriptor = "[Lclient!aaa;")
	public static Class2_Sub1_Sub1[] aClass2_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!qu", name = "y", descriptor = "[I")
	public static int[] anIntArray540;

	@OriginalMember(owner = "client!qu", name = "o", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_291 = new Class179(61, -2);

	@OriginalMember(owner = "client!qu", name = "t", descriptor = "Ljava/lang/Object;")
	public static volatile Object anObject22 = null;

	@OriginalMember(owner = "client!qu", name = "x", descriptor = "I")
	public static int anInt8353 = 0;

	@OriginalMember(owner = "client!qu", name = "d", descriptor = "(I)V")
	public static void method7104() {
		@Pc(8) Class6_Sub4_Sub18 local8 = Static565.method7924(0L, 15);
		local8.method7979();
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILjava/io/File;)[B")
	public static byte[] method7106(@OriginalArg(1) File arg0) {
		return Static383.method5442(arg0, (int) arg0.length());
	}
}
