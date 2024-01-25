import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!efa")
public class Class6 {

	@OriginalMember(owner = "client!efa", name = "h", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray148 = new Rectangle[100];

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "J")
	public long aLong278;

	@OriginalMember(owner = "client!efa", name = "d", descriptor = "Lclient!efa;")
	public Class6 aClass6_299;

	@OriginalMember(owner = "client!efa", name = "k", descriptor = "Lclient!efa;")
	public Class6 aClass6_300;

	static {
		for (@Pc(4) int local4 = 0; local4 < 100; local4++) {
			aRectangleArray148[local4] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!efa", name = "c", descriptor = "(B)Z")
	public final boolean method9042() {
		return this.aClass6_300 != null;
	}

	@OriginalMember(owner = "client!efa", name = "d", descriptor = "(B)V")
	public final void method9043() {
		if (this.aClass6_300 != null) {
			this.aClass6_300.aClass6_299 = this.aClass6_299;
			this.aClass6_299.aClass6_300 = this.aClass6_300;
			this.aClass6_300 = null;
			this.aClass6_299 = null;
		}
	}
}
