import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public final class Class34 {

	@OriginalMember(owner = "client!hf", name = "q", descriptor = "Z")
	public boolean aBoolean91 = true;

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
	public final int anInt2138;

	@OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
	public final int anInt2141;

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
	public final int anInt2139;

	@OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
	public final int anInt2140;

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
	public final int anInt2135;

	@OriginalMember(owner = "client!hf", name = "w", descriptor = "I")
	public final int anInt2143;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class34(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.aBoolean91 = arg6;
		this.anInt2138 = arg5;
		this.anInt2141 = arg3;
		this.anInt2139 = arg4;
		this.anInt2140 = arg1;
		this.anInt2135 = arg0;
		this.anInt2143 = arg2;
	}
}
