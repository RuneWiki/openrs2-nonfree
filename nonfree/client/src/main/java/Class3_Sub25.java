import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public final class Class3_Sub25 extends Class3 {

	@OriginalMember(owner = "client!hp", name = "j", descriptor = "I")
	public int anInt4450;

	@OriginalMember(owner = "client!hp", name = "k", descriptor = "I")
	public final int anInt4451;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(II)V")
	public Class3_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4450 = arg1;
		this.anInt4451 = arg0;
	}
}
