import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public final class Class2_Sub50 extends Class2 {

	@OriginalMember(owner = "client!wp", name = "k", descriptor = "I")
	public final int anInt10421;

	@OriginalMember(owner = "client!wp", name = "l", descriptor = "I")
	public int anInt10422;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(II)V")
	public Class2_Sub50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10421 = arg0;
		this.anInt10422 = arg1;
	}
}
