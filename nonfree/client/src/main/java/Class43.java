import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class43 {

	@OriginalMember(owner = "client!de", name = "f", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	static {
		for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
			aRectangleArray1[local12] = new Rectangle();
		}
	}
}
