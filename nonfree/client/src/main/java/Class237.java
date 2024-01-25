import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class237 implements Interface10 {

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "Z")
	private boolean aBoolean481;

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "Ljava/lang/String;")
	private final String aString80;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class237(@OriginalArg(0) String arg0) {
		this.aString80 = arg0;
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)Lclient!kh;")
	@Override
	public Class202 method6098() {
		return Static314.aClass202_4;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)I")
	@Override
	public int method6097() {
		if (this.aBoolean481) {
			return 100;
		}
		@Pc(20) int local20 = Static304.method4923(this.aString80);
		if (local20 >= 0 && local20 <= 100) {
			return local20;
		} else {
			this.aBoolean481 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)Z")
	public boolean method5862() {
		return this.aBoolean481;
	}
}
