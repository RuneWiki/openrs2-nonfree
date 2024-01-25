import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public final class Class16_Sub3 extends Class16 {

	@OriginalMember(owner = "client!ir", name = "p", descriptor = "I")
	public final int anInt4778;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(I)V")
	public Class16_Sub3(@OriginalArg(0) int arg0) {
		this.anInt4778 = arg0;
	}
}
