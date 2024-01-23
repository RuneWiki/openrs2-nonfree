import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public final class Class1_Sub22 extends Class1 {

	@OriginalMember(owner = "client!p", name = "p", descriptor = "I")
	public int anInt3973;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V")
	public Class1_Sub22() {
	}

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(I)V")
	public Class1_Sub22(@OriginalArg(0) int arg0) {
		this.anInt3973 = arg0;
	}
}
