import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public final class Class51 {

	@OriginalMember(owner = "client!ob", name = "r", descriptor = "Z")
	public boolean aBoolean90 = true;

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
	public final int anInt2158;

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
	public final int anInt2159;

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
	public final int anInt2156;

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
	public final int anInt2157;

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
	public final int anInt2160;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
	public final int anInt2154;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class51(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt2158 = arg0;
		this.anInt2159 = arg4;
		this.anInt2156 = arg3;
		this.anInt2157 = arg1;
		this.anInt2160 = arg5;
		this.anInt2154 = arg2;
		this.aBoolean90 = arg6;
	}
}
