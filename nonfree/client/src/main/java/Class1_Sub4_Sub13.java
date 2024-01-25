import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public abstract class Class1_Sub4_Sub13 extends Class1_Sub4 {

	@OriginalMember(owner = "client!jj", name = "t", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray5 = new Rectangle[100];

	@OriginalMember(owner = "client!jj", name = "w", descriptor = "Lclient!uk;")
	public final Interface7 anInterface7_3;

	static {
		for (@Pc(8) int local8 = 0; local8 < 100; local8++) {
			aRectangleArray5[local8] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lclient!uk;)V")
	protected Class1_Sub4_Sub13(@OriginalArg(0) Interface7 arg0) {
		this.anInterface7_3 = arg0;
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)Z")
	public abstract boolean method5355();

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method5357();
}
