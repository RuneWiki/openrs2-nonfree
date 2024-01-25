import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public final class Class4_Sub36 extends Class4 {

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
	public final int anInt5156;

	@OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
	public int anInt5159;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(II)V")
	public Class4_Sub36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5156 = arg0;
		this.anInt5159 = arg1;
	}
}
