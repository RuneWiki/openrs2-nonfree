import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public final class Class264 {

	@OriginalMember(owner = "client!or", name = "a", descriptor = "I")
	public int anInt6998;

	@OriginalMember(owner = "client!or", name = "b", descriptor = "I")
	public int anInt6999;

	@OriginalMember(owner = "client!or", name = "c", descriptor = "I")
	public int anInt7000;

	@OriginalMember(owner = "client!or", name = "d", descriptor = "I")
	public int anInt7001;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "()V")
	public Class264() {
	}

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lclient!or;)V")
	public Class264(@OriginalArg(0) Class264 arg0) {
		this.anInt6998 = arg0.anInt6998;
		this.anInt7000 = arg0.anInt7000;
		this.anInt7001 = arg0.anInt7001;
		this.anInt6999 = arg0.anInt6999;
	}
}
