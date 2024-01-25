import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public abstract class Class8_Sub5 extends Class8 {

	@OriginalMember(owner = "client!e", name = "p", descriptor = "I")
	public int anInt5128;

	@OriginalMember(owner = "client!e", name = "i", descriptor = "I")
	protected final int anInt5123;

	@OriginalMember(owner = "client!e", name = "r", descriptor = "I")
	public int anInt5130;

	@OriginalMember(owner = "client!e", name = "q", descriptor = "I")
	public int anInt5129;

	@OriginalMember(owner = "client!e", name = "u", descriptor = "I")
	public final int anInt5132;

	@OriginalMember(owner = "client!e", name = "m", descriptor = "I")
	public final int anInt5126;

	@OriginalMember(owner = "client!e", name = "v", descriptor = "I")
	public int anInt5133;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class8_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt5128 = arg0;
		this.anInt5123 = arg1;
		this.anInt5130 = arg5;
		this.anInt5129 = arg4;
		this.anInt5132 = arg3;
		this.anInt5126 = arg6;
		this.anInt5133 = arg2;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method5873() {
		return false;
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(Z)I")
	public abstract int method4114();

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V")
	@Override
	public final void method5879() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!gg;IZIIILclient!ya;)V")
	@Override
	public final void method5875(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class135 arg5) {
		throw new IllegalStateException();
	}
}
