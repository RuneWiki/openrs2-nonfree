import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public class Class2 {

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray120 = new Rectangle[100];

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "J")
	public long aLong208;

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "Lclient!ag;")
	public Class2 aClass2_243;

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "Lclient!ag;")
	public Class2 aClass2_244;

	static {
		for (@Pc(4) int local4 = 0; local4 < 100; local4++) {
			aRectangleArray120[local4] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)Z")
	public final boolean method5744() {
		return this.aClass2_243 != null;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
	public final void method5745() {
		if (this.aClass2_243 != null) {
			this.aClass2_243.aClass2_244 = this.aClass2_244;
			this.aClass2_244.aClass2_243 = this.aClass2_243;
			this.aClass2_243 = null;
			this.aClass2_244 = null;
		}
	}
}
