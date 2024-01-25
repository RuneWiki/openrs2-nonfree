import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public abstract class Class14_Sub2_Sub17 extends Class14_Sub2 {

	@OriginalMember(owner = "client!p", name = "v", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray4 = new Rectangle[100];

	@OriginalMember(owner = "client!p", name = "B", descriptor = "Lclient!vh;")
	public final Interface8 anInterface8_3;

	static {
		for (@Pc(6) int local6 = 0; local6 < 100; local6++) {
			aRectangleArray4[local6] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lclient!vh;)V")
	protected Class14_Sub2_Sub17(@OriginalArg(0) Interface8 arg0) {
		this.anInterface8_3 = arg0;
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(B)Z")
	public abstract boolean method5762();

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method5767();
}
