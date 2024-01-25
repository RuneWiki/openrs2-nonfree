import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lu")
public abstract class Class192 {

	@OriginalMember(owner = "client!lu", name = "d", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray3 = new Rectangle[100];

	static {
		for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
			aRectangleArray3[local12] = new Rectangle();
		}
		new Class40(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!ida;I)Lclient!ida;")
	public abstract Class5_Sub2_Sub3 method6013(@OriginalArg(0) Class5_Sub2_Sub3 arg0);
}
