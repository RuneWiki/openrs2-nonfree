import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public final class Class1_Sub17 extends Class1 {

	@OriginalMember(owner = "client!ma", name = "s", descriptor = "I")
	public int anInt3669;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
	public Class1_Sub17() {
	}

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(I)V")
	public Class1_Sub17(@OriginalArg(0) int arg0) {
		this.anInt3669 = arg0;
	}
}
