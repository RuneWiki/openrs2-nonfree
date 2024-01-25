import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class343 {

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray5 = new Rectangle[100];

	static {
		for (@Pc(10) int local10 = 0; local10 < 100; local10++) {
			aRectangleArray5[local10] = new Rectangle();
		}
	}
}
