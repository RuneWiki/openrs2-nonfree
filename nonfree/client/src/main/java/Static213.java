import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!hda", name = "qb", descriptor = "I")
	public static int anInt3454 = 1409;

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(IBLjava/awt/Canvas;I)Lclient!nda;")
	public static Class4_Sub12 method3186(@OriginalArg(0) int arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(14) Class local14 = Class.forName("Class4_Sub12_Sub1");
			@Pc(18) Class4_Sub12 local18 = (Class4_Sub12) local14.getDeclaredConstructor().newInstance();
			local18.method8686(arg1, arg0, arg2);
			return local18;
		} catch (@Pc(27) Throwable local27) {
			@Pc(31) Class4_Sub12_Sub2 local31 = new Class4_Sub12_Sub2();
			local31.method8686(arg1, arg0, arg2);
			return local31;
		}
	}
}
