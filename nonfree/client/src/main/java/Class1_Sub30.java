import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public final class Class1_Sub30 extends Class1 {

	@OriginalMember(owner = "client!rm", name = "B", descriptor = "I")
	public int anInt5142;

	@OriginalMember(owner = "client!rm", name = "z", descriptor = "I")
	public int anInt5140;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(II)V")
	public Class1_Sub30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5142 = arg0;
		this.anInt5140 = arg1;
	}
}
