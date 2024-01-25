import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public final class Class1_Sub43 extends Class1 {

	@OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
	public int anInt6933;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V")
	private Class1_Sub43() {
	}

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(I)V")
	public Class1_Sub43(@OriginalArg(0) int arg0) {
		this.anInt6933 = arg0;
	}
}
