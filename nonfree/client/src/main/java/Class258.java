import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public final class Class258 {

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "I")
	public int anInt7144;

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "I")
	public int anInt7145;

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "I")
	public int anInt7146;

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "I")
	public int anInt7147;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "()V")
	public Class258() {
	}

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lclient!vo;)V")
	public Class258(@OriginalArg(0) Class258 arg0) {
		this.anInt7144 = arg0.anInt7144;
		this.anInt7145 = arg0.anInt7145;
		this.anInt7147 = arg0.anInt7147;
		this.anInt7146 = arg0.anInt7146;
	}
}
