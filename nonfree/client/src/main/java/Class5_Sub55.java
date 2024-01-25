import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public final class Class5_Sub55 extends Class5 {

	@OriginalMember(owner = "client!wfa", name = "i", descriptor = "I")
	public final int anInt10298;

	@OriginalMember(owner = "client!wfa", name = "r", descriptor = "I")
	public final int anInt10303;

	@OriginalMember(owner = "client!wfa", name = "n", descriptor = "Z")
	public final boolean aBoolean751;

	@OriginalMember(owner = "client!wfa", name = "k", descriptor = "I")
	public final int anInt10299;

	@OriginalMember(owner = "client!wfa", name = "o", descriptor = "I")
	public final int anInt10300;

	@OriginalMember(owner = "client!wfa", name = "q", descriptor = "I")
	public final int anInt10302;

	@OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class5_Sub55(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt10298 = arg1;
		this.anInt10303 = arg0;
		this.aBoolean751 = arg5;
		this.anInt10299 = arg3;
		this.anInt10300 = arg4;
		this.anInt10302 = arg2;
	}
}
