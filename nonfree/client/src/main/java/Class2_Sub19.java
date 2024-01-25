import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public final class Class2_Sub19 extends Class2 {

	@OriginalMember(owner = "client!gda", name = "u", descriptor = "I")
	public final int anInt4213;

	@OriginalMember(owner = "client!gda", name = "s", descriptor = "I")
	public final int anInt4211;

	@OriginalMember(owner = "client!gda", name = "v", descriptor = "I")
	public final int anInt4214;

	@OriginalMember(owner = "client!gda", name = "x", descriptor = "Z")
	public final boolean aBoolean311;

	@OriginalMember(owner = "client!gda", name = "p", descriptor = "I")
	public final int anInt4210;

	@OriginalMember(owner = "client!gda", name = "w", descriptor = "I")
	public final int anInt4215;

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class2_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt4213 = arg3;
		this.anInt4211 = arg2;
		this.anInt4214 = arg1;
		this.aBoolean311 = arg5;
		this.anInt4210 = arg4;
		this.anInt4215 = arg0;
	}
}
