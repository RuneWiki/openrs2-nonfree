import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aca")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!aca", name = "v", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!aca", name = "r", descriptor = "I")
	public int anInt108 = 0;

	static {
		for (@Pc(4) int local4 = 0; local4 < 100; local4++) {
			aRectangleArray1[local4] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(Lclient!gw;B)V")
	public void method224(@OriginalArg(0) Class1_Sub13 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method3043();
			if (local15 == 0) {
				return;
			}
			this.method225(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(ZLclient!gw;I)V")
	private void method225(@OriginalArg(1) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt108 = arg0.method3056();
		}
	}
}
