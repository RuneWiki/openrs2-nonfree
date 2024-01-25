import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public final class Class2_Sub35 extends Class2 {

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
	public int anInt6260;

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
	public int anInt6261;

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
	public int anInt6262;

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
	public int anInt6265;

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
	public int anInt6266;

	@OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
	public int anInt6264 = -1;

	@OriginalMember(owner = "client!ob", name = "s", descriptor = "Z")
	public boolean aBoolean471 = false;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(I)V")
	public Class2_Sub35(@OriginalArg(0) int arg0) {
		this.anInt6264 = arg0;
	}
}
