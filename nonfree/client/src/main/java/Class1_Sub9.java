import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public final class Class1_Sub9 extends Class1 {

	@OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
	public int anInt571;

	static {
		new Class105("", 76);
	}

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
	private Class1_Sub9() {
	}

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(I)V")
	public Class1_Sub9(@OriginalArg(0) int arg0) {
		this.anInt571 = arg0;
	}
}
