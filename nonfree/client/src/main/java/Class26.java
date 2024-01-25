import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public final class Class26 {

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
	public int anInt767;

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
	public int anInt768;

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
	public int anInt769;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V")
	public Class26() {
	}

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lclient!bm;)V")
	public Class26(@OriginalArg(0) Class26 arg0) {
		this.anInt767 = arg0.anInt767;
		this.anInt769 = arg0.anInt769;
		this.anInt768 = arg0.anInt768;
	}
}
