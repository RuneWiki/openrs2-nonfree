import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public final class Class1_Sub18 extends Class1 {

	@OriginalMember(owner = "client!fp", name = "l", descriptor = "I")
	public final int anInt2189;

	@OriginalMember(owner = "client!fp", name = "p", descriptor = "I")
	public final int anInt2193;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(II)V")
	public Class1_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2189 = arg0;
		this.anInt2193 = arg1;
	}
}
