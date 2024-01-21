import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public final class Class33 {

	@OriginalMember(owner = "client!i", name = "a", descriptor = "I")
	public int anInt1218;

	@OriginalMember(owner = "client!i", name = "c", descriptor = "I")
	public int anInt1219;

	@OriginalMember(owner = "client!i", name = "f", descriptor = "I")
	public int anInt1222;

	@OriginalMember(owner = "client!i", name = "g", descriptor = "I")
	public int anInt1223;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
	public Class33() {
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!i;)V")
	public Class33(@OriginalArg(0) Class33 arg0) {
		this.anInt1223 = arg0.anInt1223;
		this.anInt1218 = arg0.anInt1218;
		this.anInt1219 = arg0.anInt1219;
		this.anInt1222 = arg0.anInt1222;
	}
}
