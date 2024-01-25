import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class138 {

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray5 = new Rectangle[100];

	static {
		for (@Pc(23) int local23 = 0; local23 < 100; local23++) {
			aRectangleArray5[local23] = new Rectangle();
		}
	}
}
