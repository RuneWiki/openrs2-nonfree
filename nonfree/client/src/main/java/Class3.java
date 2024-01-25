import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public class Class3 {

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray122 = new Rectangle[100];

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "Lclient!ob;")
	public Class3 aClass3_247;

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "J")
	public long aLong211;

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "Lclient!ob;")
	public Class3 aClass3_248;

	static {
		for (@Pc(4) int local4 = 0; local4 < 100; local4++) {
			aRectangleArray122[local4] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V")
	public final void method5717() {
		if (this.aClass3_247 != null) {
			this.aClass3_247.aClass3_248 = this.aClass3_248;
			this.aClass3_248.aClass3_247 = this.aClass3_247;
			this.aClass3_248 = null;
			this.aClass3_247 = null;
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(Z)Z")
	public final boolean method5718() {
		return this.aClass3_247 != null;
	}
}
