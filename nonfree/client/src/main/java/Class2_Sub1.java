import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!aa", name = "x", descriptor = "I")
	public int anInt5075;

	@OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
	public int anInt5064;

	@OriginalMember(owner = "client!aa", name = "w", descriptor = "I")
	public final int anInt5074;

	@OriginalMember(owner = "client!aa", name = "z", descriptor = "I")
	public int anInt5077;

	@OriginalMember(owner = "client!aa", name = "y", descriptor = "I")
	protected final int anInt5076;

	@OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
	public int anInt5065;

	@OriginalMember(owner = "client!aa", name = "A", descriptor = "I")
	public final int anInt5078;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt5075 = arg5;
		this.anInt5064 = arg0;
		this.anInt5074 = arg3;
		this.anInt5077 = arg2;
		this.anInt5076 = arg1;
		this.anInt5065 = arg4;
		this.anInt5078 = arg6;
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)V")
	@Override
	public final void method5408() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZIIILclient!ai;ILclient!vm;)V")
	@Override
	public final void method5406(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class92 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)I")
	public abstract int method4194();

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "(B)Z")
	@Override
	public final boolean method5411() {
		return false;
	}
}
