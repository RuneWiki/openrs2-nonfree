import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public final class Class2_Sub40 extends Class2 {

	@OriginalMember(owner = "client!tk", name = "t", descriptor = "I")
	public final int anInt6136;

	@OriginalMember(owner = "client!tk", name = "x", descriptor = "I")
	public final int anInt6139;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(II)V")
	public Class2_Sub40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6136 = arg1;
		this.anInt6139 = arg0;
	}
}
