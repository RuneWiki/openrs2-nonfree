import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public final class Class4_Sub9 extends Class4 {

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
	public final int anInt980;

	@OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
	public final int anInt981;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(II)V")
	public Class4_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt980 = arg0;
		this.anInt981 = arg1;
	}
}
