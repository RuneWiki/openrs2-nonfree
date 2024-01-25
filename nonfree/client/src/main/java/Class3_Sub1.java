import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public abstract class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
	public final int anInt6326;

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
	protected int anInt6325;

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
	protected final int anInt6329;

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
	protected int anInt6327;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(IIII)V")
	protected Class3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6326 = arg3;
		this.anInt6325 = arg2;
		this.anInt6329 = arg1;
		this.anInt6327 = arg0;
	}
}
