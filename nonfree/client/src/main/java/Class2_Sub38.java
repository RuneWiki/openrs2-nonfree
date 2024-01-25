import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kka")
public final class Class2_Sub38 extends Class2 {

	@OriginalMember(owner = "client!kka", name = "n", descriptor = "I")
	public final int anInt5796;

	@OriginalMember(owner = "client!kka", name = "o", descriptor = "I")
	public final int anInt5797;

	@OriginalMember(owner = "client!kka", name = "<init>", descriptor = "(II)V")
	public Class2_Sub38(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5796 = arg0;
		this.anInt5797 = arg1;
	}
}
