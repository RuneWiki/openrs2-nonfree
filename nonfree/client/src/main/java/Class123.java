import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public final class Class123 {

	@OriginalMember(owner = "client!is", name = "a", descriptor = "I")
	public int anInt3695;

	@OriginalMember(owner = "client!is", name = "b", descriptor = "I")
	public int anInt3696;

	@OriginalMember(owner = "client!is", name = "c", descriptor = "I")
	public int anInt3697;

	@OriginalMember(owner = "client!is", name = "d", descriptor = "I")
	public int anInt3698;

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "()V")
	public Class123() {
	}

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lclient!is;)V")
	public Class123(@OriginalArg(0) Class123 arg0) {
		this.anInt3696 = arg0.anInt3696;
		this.anInt3698 = arg0.anInt3698;
		this.anInt3697 = arg0.anInt3697;
		this.anInt3695 = arg0.anInt3695;
	}
}
