import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public final class Class2_Sub26 extends Class2 {

	@OriginalMember(owner = "client!nm", name = "p", descriptor = "I")
	public final int anInt4375;

	@OriginalMember(owner = "client!nm", name = "v", descriptor = "I")
	public final int anInt4378;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(II)V")
	public Class2_Sub26(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4375 = arg1;
		this.anInt4378 = arg0;
	}
}
