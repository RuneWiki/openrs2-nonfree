import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public abstract class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!gl", name = "f", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray4 = new Rectangle[100];

	static {
		for (@Pc(4) int local4 = 0; local4 < 100; local4++) {
			aRectangleArray4[local4] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V")
	protected Class7_Sub1() {
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)Lclient!lm;")
	public abstract Class42_Sub3 method1775();
}
