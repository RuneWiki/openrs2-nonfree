import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public final class Class1_Sub30 extends Class1 {

	@OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
	public int anInt5344;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
	public Class1_Sub30() {
	}

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(I)V")
	public Class1_Sub30(@OriginalArg(0) int arg0) {
		this.anInt5344 = arg0;
	}
}
