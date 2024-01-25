import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public final class Class1_Sub32 extends Class1 {

	@OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
	public int anInt6144;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
	private Class1_Sub32() {
	}

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(I)V")
	public Class1_Sub32(@OriginalArg(0) int arg0) {
		this.anInt6144 = arg0;
	}
}
