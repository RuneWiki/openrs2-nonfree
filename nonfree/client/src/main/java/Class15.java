import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public final class Class15 {

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
	public int anInt629;

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
	public int anInt631;

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
	public int anInt632;

	@OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
	public int anInt633;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
	public Class15() {
	}

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lclient!ch;)V")
	public Class15(@OriginalArg(0) Class15 arg0) {
		this.anInt631 = arg0.anInt631;
		this.anInt632 = arg0.anInt632;
		this.anInt633 = arg0.anInt633;
		this.anInt629 = arg0.anInt629;
	}
}
