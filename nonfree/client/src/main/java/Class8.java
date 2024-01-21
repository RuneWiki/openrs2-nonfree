import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public final class Class8 {

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "Z")
	public boolean aBoolean6 = true;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
	public final int anInt188;

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
	public final int anInt191;

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
	public final int anInt194;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
	public final int anInt190;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
	public final int anInt186;

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
	public final int anInt189;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt188 = arg3;
		this.anInt191 = arg1;
		this.anInt194 = arg2;
		this.anInt190 = arg4;
		this.aBoolean6 = arg6;
		this.anInt186 = arg5;
		this.anInt189 = arg0;
	}
}
