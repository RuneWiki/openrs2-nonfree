import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public final class Class3_Sub37 extends Class3 {

	@OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
	public final int anInt6761;

	@OriginalMember(owner = "client!ml", name = "q", descriptor = "I")
	public final int anInt6766;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(II)V")
	public Class3_Sub37(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6761 = arg0;
		this.anInt6766 = arg1;
	}
}
