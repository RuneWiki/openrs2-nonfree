import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public final class Class92 {

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
	public int anInt1942;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
	public int anInt1943;

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
	public int anInt1944;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
	public Class92() {
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!eb;)V")
	public Class92(@OriginalArg(0) Class92 arg0) {
		this.anInt1943 = arg0.anInt1943;
		this.anInt1944 = arg0.anInt1944;
		this.anInt1942 = arg0.anInt1942;
	}
}
