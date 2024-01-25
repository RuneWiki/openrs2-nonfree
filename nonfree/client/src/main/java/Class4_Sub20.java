import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public final class Class4_Sub20 extends Class4 {

	@OriginalMember(owner = "client!ft", name = "r", descriptor = "I")
	public int anInt3138;

	@OriginalMember(owner = "client!ft", name = "s", descriptor = "I")
	public final int anInt3139;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(II)V")
	public Class4_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3138 = arg1;
		this.anInt3139 = arg0;
	}
}
