import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public final class Class36 {

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
	public int anInt1301;

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
	public int anInt1304;

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
	public int anInt1305;

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
	public int anInt1307;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
	public Class36() {
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!ib;)V")
	public Class36(@OriginalArg(0) Class36 arg0) {
		this.anInt1307 = arg0.anInt1307;
		this.anInt1301 = arg0.anInt1301;
		this.anInt1305 = arg0.anInt1305;
		this.anInt1304 = arg0.anInt1304;
	}
}
