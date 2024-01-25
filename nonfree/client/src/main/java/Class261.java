import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public final class Class261 {

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
	public int anInt7629;

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
	public int anInt7630;

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
	public int anInt7631;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
	public Class261() {
	}

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lclient!wd;)V")
	public Class261(@OriginalArg(0) Class261 arg0) {
		this.anInt7631 = arg0.anInt7631;
		this.anInt7629 = arg0.anInt7629;
		this.anInt7630 = arg0.anInt7630;
	}
}
