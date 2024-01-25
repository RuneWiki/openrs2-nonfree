import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public final class Class2_Sub42 extends Class2 {

	@OriginalMember(owner = "client!vd", name = "u", descriptor = "I")
	public int anInt6670;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
	private Class2_Sub42() {
	}

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(I)V")
	public Class2_Sub42(@OriginalArg(0) int arg0) {
		this.anInt6670 = arg0;
	}
}
