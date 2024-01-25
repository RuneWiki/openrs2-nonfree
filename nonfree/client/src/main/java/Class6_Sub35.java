import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public final class Class6_Sub35 extends Class6 {

	@OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
	public int anInt6119;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
	private Class6_Sub35() {
	}

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(I)V")
	public Class6_Sub35(@OriginalArg(0) int arg0) {
		this.anInt6119 = arg0;
	}
}
