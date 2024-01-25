import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public final class Class1_Sub29 extends Class1 {

	@OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
	public final int anInt4810;

	@OriginalMember(owner = "client!kn", name = "r", descriptor = "I")
	public final int anInt4816;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(II)V")
	public Class1_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4810 = arg1;
		this.anInt4816 = arg0;
	}
}
