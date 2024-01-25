import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public final class Class1_Sub41 extends Class1 {

	@OriginalMember(owner = "client!tc", name = "v", descriptor = "I")
	public final int anInt6331;

	@OriginalMember(owner = "client!tc", name = "u", descriptor = "I")
	public final int anInt6330;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(II)V")
	public Class1_Sub41(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6331 = arg1;
		this.anInt6330 = arg0;
	}
}
