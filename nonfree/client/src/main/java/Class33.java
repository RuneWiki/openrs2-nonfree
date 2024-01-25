import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bia")
public final class Class33 implements Interface19 {

	@OriginalMember(owner = "client!bia", name = "b", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "Lclient!gga;")
	private final Class124 aClass124_13;

	static {
		for (@Pc(4) int local4 = 0; local4 < 100; local4++) {
			aRectangleArray1[local4] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!bia", name = "<init>", descriptor = "(Lclient!gga;)V")
	public Class33(@OriginalArg(0) Class124 arg0) {
		this.aClass124_13 = arg0;
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(I)I")
	@Override
	public int method9334() {
		return this.aClass124_13.method3626() ? 100 : this.aClass124_13.method3620();
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(B)Lclient!pw;")
	@Override
	public Class290 method9335() {
		return Static472.aClass290_2;
	}
}
