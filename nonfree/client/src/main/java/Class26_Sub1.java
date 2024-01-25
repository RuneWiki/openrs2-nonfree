import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class Class26_Sub1 extends Class26 {

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
	protected final int anInt7176;

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
	public int anInt7186;

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
	public int anInt7181;

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
	public final int anInt7173;

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "I")
	public int anInt7183;

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
	public final int anInt7177;

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
	public int anInt7180;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class26_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt7176 = arg1;
		this.anInt7186 = arg5;
		this.anInt7181 = arg2;
		this.anInt7173 = arg3;
		this.anInt7183 = arg4;
		this.anInt7177 = arg6;
		this.anInt7180 = arg0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ya;IIILclient!qj;IZ)V")
	@Override
	public final void method5712(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class26 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(B)I")
	public abstract int method5551();

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
	@Override
	public final void method5715() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)Z")
	@Override
	public final boolean method5721() {
		return false;
	}
}
