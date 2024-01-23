import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public final class Class1_Sub10 extends Class1 {

	@OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
	public int anInt1508;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
	public Class1_Sub10() {
	}

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(I)V")
	public Class1_Sub10(@OriginalArg(0) int arg0) {
		this.anInt1508 = arg0;
	}
}
