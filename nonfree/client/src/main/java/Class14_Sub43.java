import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public final class Class14_Sub43 extends Class14 {

	@OriginalMember(owner = "client!wq", name = "q", descriptor = "I")
	public final int anInt6721;

	@OriginalMember(owner = "client!wq", name = "o", descriptor = "I")
	public final int anInt6719;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(II)V")
	public Class14_Sub43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6721 = arg0;
		this.anInt6719 = arg1;
	}
}
