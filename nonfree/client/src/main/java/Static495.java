import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static495 {

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZLjava/awt/Frame;Lclient!fl;)V")
	public static void method7177(@OriginalArg(1) Frame arg0, @OriginalArg(2) Class104 arg1) {
		while (true) {
			@Pc(10) Class159 local10 = arg1.method3131(arg0);
			while (local10.anInt5910 == 0) {
				Static344.method5698(10L);
			}
			if (local10.anInt5910 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static344.method5698(100L);
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(III)Lclient!ic;")
	public static Class9_Sub4_Sub4 method7179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class186 local7 = Static26.aClass186ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class9_Sub4_Sub4 local14 = local7.aClass9_Sub4_Sub4_1;
			local7.aClass9_Sub4_Sub4_1 = null;
			Static248.method4430(local14);
			return local14;
		}
	}
}
