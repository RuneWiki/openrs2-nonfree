import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public final class Class5_Sub31 extends Class5 {

	@OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
	public final int anInt5085;

	@OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
	public final int anInt5086;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(II)V")
	public Class5_Sub31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5085 = arg1;
		this.anInt5086 = arg0;
	}
}
