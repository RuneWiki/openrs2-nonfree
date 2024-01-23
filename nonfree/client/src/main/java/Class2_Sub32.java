import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public final class Class2_Sub32 extends Class2 {

	@OriginalMember(owner = "client!wd", name = "C", descriptor = "I")
	public int anInt6016;

	@OriginalMember(owner = "client!wd", name = "w", descriptor = "I")
	public int anInt6012;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(II)V")
	public Class2_Sub32(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6016 = arg0;
		this.anInt6012 = arg1;
	}
}
