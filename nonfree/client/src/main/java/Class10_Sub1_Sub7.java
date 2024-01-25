import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public abstract class Class10_Sub1_Sub7 extends Class10_Sub1 {

	@OriginalMember(owner = "client!i", name = "B", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray4;

	static {
		new Class182(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
		aRectangleArray4 = new Rectangle[100];
		for (@Pc(10) int local10 = 0; local10 < 100; local10++) {
			aRectangleArray4[local10] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
	protected Class10_Sub1_Sub7() {
	}
}
