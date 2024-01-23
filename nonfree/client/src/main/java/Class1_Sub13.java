import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public final class Class1_Sub13 extends Class1 {

	@OriginalMember(owner = "client!il", name = "s", descriptor = "I")
	public int anInt2547;

	@OriginalMember(owner = "client!il", name = "p", descriptor = "I")
	public int anInt2544;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(II)V")
	public Class1_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2547 = arg0;
		this.anInt2544 = arg1;
	}
}
