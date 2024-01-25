import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public abstract class Class15_Sub4 extends Class15 {

	@OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
	public int anInt9047;

	@OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
	public int anInt9050;

	@OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
	public final int anInt9051;

	@OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
	public final int anInt9043;

	@OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
	protected final int anInt9049;

	@OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
	public int anInt9048;

	@OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
	public int anInt9052;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class15_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt9047 = arg4;
		this.anInt9050 = arg5;
		this.anInt9051 = arg6;
		this.anInt9043 = arg3;
		this.anInt9049 = arg1;
		this.anInt9048 = arg0;
		this.anInt9052 = arg2;
	}

	@OriginalMember(owner = "client!ti", name = "h", descriptor = "(I)I")
	public abstract int method7166();

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IILclient!gfa;IIZLclient!oa;)V")
	@Override
	public final void method7163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class90 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)V")
	@Override
	public final void method7165() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method7162() {
		return false;
	}
}
