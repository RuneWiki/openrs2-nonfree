import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qaa")
public final class Class272 {

	@OriginalMember(owner = "client!qaa", name = "b", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	static {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			aRectangleArray2[local7] = new Rectangle();
		}
	}
}
