import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public abstract class Class44_Sub5 extends Class44 {

	@OriginalMember(owner = "client!js", name = "j", descriptor = "I")
	protected int anInt5412;

	@OriginalMember(owner = "client!js", name = "n", descriptor = "I")
	protected final int anInt5414;

	@OriginalMember(owner = "client!js", name = "q", descriptor = "I")
	protected int anInt5417;

	@OriginalMember(owner = "client!js", name = "i", descriptor = "I")
	public final int anInt5411;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(IIII)V")
	protected Class44_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5412 = arg2;
		this.anInt5414 = arg1;
		this.anInt5417 = arg0;
		this.anInt5411 = arg3;
	}
}
