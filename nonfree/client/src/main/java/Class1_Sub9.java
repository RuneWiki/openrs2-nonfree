import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public final class Class1_Sub9 extends Class1 {

	@OriginalMember(owner = "client!c", name = "s", descriptor = "I")
	public final int anInt508;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(I)V")
	public Class1_Sub9(@OriginalArg(0) int arg0) {
		this.anInt508 = arg0;
	}
}
