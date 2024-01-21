import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public final class Class8_Sub5 extends Class8 {

	@OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
	public final int anInt390;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(I)V")
	public Class8_Sub5(@OriginalArg(0) int arg0) {
		this.anInt390 = arg0;
	}
}
