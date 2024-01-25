import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!fq", name = "l", descriptor = "Lclient!la;")
	public static Class116 aClass116_1;

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILclient!ga;Ljava/awt/Canvas;I)Lclient!ya;")
	public static Class49 method2039(@OriginalArg(0) int arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) Canvas arg2) {
		return new Class49_Sub1(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "(I)V")
	public static void method2040() {
		@Pc(9) Class171 local9 = Static387.aClass171_52;
		synchronized (Static387.aClass171_52) {
			Static387.aClass171_52.method3934();
		}
	}
}
