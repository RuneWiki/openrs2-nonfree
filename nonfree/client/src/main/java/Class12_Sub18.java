import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public final class Class12_Sub18 extends Class12 {

	@OriginalMember(owner = "client!hba", name = "m", descriptor = "I")
	public int anInt3978;

	@OriginalMember(owner = "client!hba", name = "<init>", descriptor = "()V")
	private Class12_Sub18() {
	}

	@OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(I)V")
	public Class12_Sub18(@OriginalArg(0) int arg0) {
		this.anInt3978 = arg0;
	}
}
