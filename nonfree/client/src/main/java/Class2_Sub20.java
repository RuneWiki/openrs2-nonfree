import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public final class Class2_Sub20 extends Class2 {

	@OriginalMember(owner = "client!eu", name = "r", descriptor = "I")
	public final int anInt2347;

	@OriginalMember(owner = "client!eu", name = "o", descriptor = "I")
	public final int anInt2344;

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(II)V")
	public Class2_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2347 = arg1;
		this.anInt2344 = arg0;
	}
}
