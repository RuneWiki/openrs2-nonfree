import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public abstract class Class28_Sub3 extends Class28 {

	@OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
	protected final int anInt3268;

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
	protected int anInt3262;

	@OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
	protected int anInt3265;

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
	public final int anInt3263;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(IIII)V")
	protected Class28_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3268 = arg1;
		this.anInt3262 = arg0;
		this.anInt3265 = arg2;
		this.anInt3263 = arg3;
	}
}
