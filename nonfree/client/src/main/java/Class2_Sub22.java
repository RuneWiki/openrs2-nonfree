import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public final class Class2_Sub22 extends Class2 {

	@OriginalMember(owner = "client!hda", name = "k", descriptor = "I")
	public int anInt3866;

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "()V")
	private Class2_Sub22() {
	}

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(I)V")
	public Class2_Sub22(@OriginalArg(0) int arg0) {
		this.anInt3866 = arg0;
	}
}
