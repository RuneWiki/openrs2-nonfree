import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class1_Sub31 extends Class1 {

	@OriginalMember(owner = "client!oc", name = "p", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!oc", name = "s", descriptor = "S")
	public short aShort74;

	static {
		for (@Pc(8) int local8 = 0; local8 < 100; local8++) {
			aRectangleArray2[local8] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
	private Class1_Sub31() {
	}

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(S)V")
	public Class1_Sub31(@OriginalArg(0) short arg0) {
		this.aShort74 = arg0;
	}
}
