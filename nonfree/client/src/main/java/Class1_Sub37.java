import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public final class Class1_Sub37 extends Class1 {

	@OriginalMember(owner = "client!ud", name = "B", descriptor = "I")
	public int anInt6000;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
	private Class1_Sub37() {
	}

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(I)V")
	public Class1_Sub37(@OriginalArg(0) int arg0) {
		this.anInt6000 = arg0;
	}
}
