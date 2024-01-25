import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class198 implements Interface9 {

	@OriginalMember(owner = "client!r", name = "b", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	static {
		for (@Pc(4) int local4 = 0; local4 < 100; local4++) {
			aRectangleArray1[local4] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(J[III)Ljava/lang/String;")
	@Override
	public String method4457(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			@Pc(20) Class187 local20 = Static8.aClass242_1.method5294(arg1[0]);
			return local20.method4298((int) arg0);
		} else if (arg2 == 1 || arg2 == 10) {
			@Pc(38) Class88 local38 = Static263.aClass102_2.method2172((int) arg0);
			return local38.aString17;
		} else if (arg2 == 6 || arg2 == 7 || arg2 == 11) {
			return Static8.aClass242_1.method5294(arg1[0]).method4298((int) arg0);
		} else {
			return null;
		}
	}
}
