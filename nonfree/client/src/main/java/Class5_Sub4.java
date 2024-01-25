import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public abstract class Class5_Sub4 extends Class5 {

	@OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
	public int anInt3176;

	@OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
	public int anInt3172;

	@OriginalMember(owner = "client!mg", name = "u", descriptor = "I")
	protected final int anInt3179;

	@OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
	public int anInt3174;

	@OriginalMember(owner = "client!mg", name = "q", descriptor = "I")
	public final int anInt3175;

	@OriginalMember(owner = "client!mg", name = "w", descriptor = "I")
	public final int anInt3181;

	@OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
	public int anInt3173;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class5_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt3176 = arg2;
		this.anInt3172 = arg0;
		this.anInt3179 = arg1;
		this.anInt3174 = arg4;
		this.anInt3175 = arg6;
		this.anInt3181 = arg3;
		this.anInt3173 = arg5;
	}

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method5681() {
		return false;
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)V")
	@Override
	public final void method5678() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZIILclient!aa;ILclient!qh;)V")
	@Override
	public final void method5677(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class5 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "(B)I")
	public abstract int method3009();
}
