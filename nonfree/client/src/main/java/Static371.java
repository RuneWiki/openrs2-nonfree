import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!ph", name = "k", descriptor = "[I")
	public static int[] anIntArray621;

	@OriginalMember(owner = "client!ph", name = "z", descriptor = "I")
	public static int anInt6982;

	@OriginalMember(owner = "client!ph", name = "j", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_90 = new Class158(81, 3);

	@OriginalMember(owner = "client!ph", name = "p", descriptor = "Z")
	public static boolean aBoolean443 = false;

	@OriginalMember(owner = "client!ph", name = "B", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray6 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ljava/lang/String;II)Lclient!mq;")
	public static Class1 method5854(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class1 local13;
		try {
			local13 = (Class1) Class.forName("Class1_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			local13 = new Class1_Sub1();
		}
		local13.anInt110 = arg1;
		local13.aString3 = arg0;
		return local13;
	}
}
