import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public final class Class258 {

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
	public int anInt7636;

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
	public int anInt7637;

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
	public int anInt7638;

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
	public int anInt7639;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
	public Class258() {
	}

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!wb;)V")
	public Class258(@OriginalArg(0) Class258 arg0) {
		this.anInt7636 = arg0.anInt7636;
		this.anInt7638 = arg0.anInt7638;
		this.anInt7639 = arg0.anInt7639;
		this.anInt7637 = arg0.anInt7637;
	}
}
