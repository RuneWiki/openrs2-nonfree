import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "G", descriptor = "[[I")
	public static final int[][] anIntArrayArray1 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!ae", name = "H", descriptor = "I")
	public static int anInt159 = 0;

	@OriginalMember(owner = "client!ae", name = "K", descriptor = "[I")
	public static final int[] anIntArray14 = new int[14];

	@OriginalMember(owner = "client!ae", name = "N", descriptor = "I")
	public static int anInt163 = 0;

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(B)V")
	public static void method135() {
		Static393.anIntArray582 = Static365.method5028(0.4F);
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)V")
	public static void method136(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub6 local10 = Static371.method5808(9, arg0);
		local10.method1775();
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/awt/Canvas;B)Lclient!va;")
	public static Class1_Sub6 method137(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(11) Class local11 = Class.forName("Class1_Sub6_Sub2");
			@Pc(15) Class1_Sub6 local15 = (Class1_Sub6) local11.getDeclaredConstructor().newInstance();
			local15.method1801(arg0);
			return local15;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class1_Sub6_Sub1 local26 = new Class1_Sub6_Sub1();
			local26.method1801(arg0);
			return local26;
		}
	}
}
