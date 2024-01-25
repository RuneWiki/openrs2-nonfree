import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bja")
public final class Class43 {

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "I")
	public int anInt817;

	@OriginalMember(owner = "client!bja", name = "b", descriptor = "I")
	public int anInt818;

	@OriginalMember(owner = "client!bja", name = "c", descriptor = "I")
	public int anInt819;

	@OriginalMember(owner = "client!bja", name = "<init>", descriptor = "()V")
	public Class43() {
	}

	@OriginalMember(owner = "client!bja", name = "<init>", descriptor = "(Lclient!bja;)V")
	public Class43(@OriginalArg(0) Class43 arg0) {
		this.anInt819 = arg0.anInt819;
		this.anInt818 = arg0.anInt818;
		this.anInt817 = arg0.anInt817;
	}
}
