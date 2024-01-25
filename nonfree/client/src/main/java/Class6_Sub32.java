import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public final class Class6_Sub32 extends Class6 {

	@OriginalMember(owner = "client!kaa", name = "p", descriptor = "I")
	public final int anInt5945;

	@OriginalMember(owner = "client!kaa", name = "r", descriptor = "I")
	public int anInt5947;

	@OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(II)V")
	public Class6_Sub32(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5945 = arg0;
		this.anInt5947 = arg1;
	}
}
