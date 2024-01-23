import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public final class Class31 {

	@OriginalMember(owner = "client!da", name = "a", descriptor = "I")
	public int anInt1044;

	@OriginalMember(owner = "client!da", name = "f", descriptor = "I")
	public int anInt1048;

	@OriginalMember(owner = "client!da", name = "j", descriptor = "I")
	public int anInt1051;

	@OriginalMember(owner = "client!da", name = "l", descriptor = "I")
	public int anInt1053;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
	public Class31() {
	}

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class31(@OriginalArg(0) Class31 arg0) {
		this.anInt1044 = arg0.anInt1044;
		this.anInt1048 = arg0.anInt1048;
		this.anInt1053 = arg0.anInt1053;
		this.anInt1051 = arg0.anInt1051;
	}
}
