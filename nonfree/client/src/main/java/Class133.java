import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class133 {

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "()V")
	public Class133() throws Exception {
	}

	@OriginalMember(owner = "client!gn", name = "showcursor", descriptor = "(Ljava/awt/Component;Z)V")
	private void showcursor(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			arg0 = null;
		} else if (arg0 == null) {
			throw new NullPointerException();
		}
		if (this.aComponent1 == arg0) {
			return;
		}
		if (this.aComponent1 != null) {
			this.aComponent1.setCursor((Cursor) null);
			this.aComponent1 = null;
		}
		if (arg0 != null) {
			arg0.setCursor(arg0.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), (String) null));
			this.aComponent1 = arg0;
		}
	}

	@OriginalMember(owner = "client!gn", name = "setcustomcursor", descriptor = "(Ljava/awt/Component;[IIILjava/awt/Point;)V")
	private void setcustomcursor(@OriginalArg(0) Component arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Point arg4) {
		if (arg1 == null) {
			arg0.setCursor((Cursor) null);
		} else {
			@Pc(9) BufferedImage local9 = new BufferedImage(arg2, arg3, 2);
			local9.setRGB(0, 0, arg2, arg3, arg1, 0, arg2);
			arg0.setCursor(arg0.getToolkit().createCustomCursor(local9, arg4, (String) null));
		}
	}

	@OriginalMember(owner = "client!gn", name = "movemouse", descriptor = "(II)V")
	private void movemouse(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aRobot1.mouseMove(arg0, arg1);
	}
}
