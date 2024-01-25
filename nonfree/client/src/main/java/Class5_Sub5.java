import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public abstract class Class5_Sub5 extends Class5 {

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
	public final int anInt6285;

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
	protected final int anInt6284;

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
	protected int anInt6286;

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
	protected int anInt6288;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(IIII)V")
	protected Class5_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6285 = arg3;
		this.anInt6284 = arg1;
		this.anInt6286 = arg2;
		this.anInt6288 = arg0;
	}
}
