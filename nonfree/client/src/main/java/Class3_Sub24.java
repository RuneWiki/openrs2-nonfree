import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public final class Class3_Sub24 extends Class3 {

	@OriginalMember(owner = "client!hea", name = "n", descriptor = "I")
	public int anInt3846;

	@OriginalMember(owner = "client!hea", name = "<init>", descriptor = "()V")
	private Class3_Sub24() {
	}

	@OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(I)V")
	public Class3_Sub24(@OriginalArg(0) int arg0) {
		this.anInt3846 = arg0;
	}
}
