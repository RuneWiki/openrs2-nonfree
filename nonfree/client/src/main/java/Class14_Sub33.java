import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class14_Sub33 extends Class14 {

	@OriginalMember(owner = "client!oc", name = "p", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "S")
	public short aShort72;

	static {
		for (@Pc(49) int local49 = 0; local49 < 100; local49++) {
			aRectangleArray2[local49] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
	private Class14_Sub33() {
	}

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(S)V")
	public Class14_Sub33(@OriginalArg(0) short arg0) {
		this.aShort72 = arg0;
	}
}
