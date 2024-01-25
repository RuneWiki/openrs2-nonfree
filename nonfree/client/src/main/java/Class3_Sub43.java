import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public final class Class3_Sub43 extends Class3 {

	@OriginalMember(owner = "client!ob", name = "t", descriptor = "I")
	public final int anInt7167;

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
	public final int anInt7163;

	@OriginalMember(owner = "client!ob", name = "r", descriptor = "Z")
	public final boolean aBoolean485;

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
	public final int anInt7165;

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
	public final int anInt7162;

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
	public final int anInt7161;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class3_Sub43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt7167 = arg0;
		this.anInt7163 = arg1;
		this.aBoolean485 = arg5;
		this.anInt7165 = arg2;
		this.anInt7162 = arg3;
		this.anInt7161 = arg4;
	}
}
