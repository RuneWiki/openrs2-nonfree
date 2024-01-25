import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public abstract class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!hm", name = "r", descriptor = "I")
	protected final int anInt4212;

	@OriginalMember(owner = "client!hm", name = "t", descriptor = "I")
	public final int anInt4214;

	@OriginalMember(owner = "client!hm", name = "j", descriptor = "I")
	public int anInt4206;

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
	public int anInt4202;

	@OriginalMember(owner = "client!hm", name = "h", descriptor = "I")
	public int anInt4204;

	@OriginalMember(owner = "client!hm", name = "u", descriptor = "I")
	public int anInt4215;

	@OriginalMember(owner = "client!hm", name = "s", descriptor = "I")
	public final int anInt4213;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class3_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt4212 = arg1;
		this.anInt4214 = arg6;
		this.anInt4206 = arg4;
		this.anInt4202 = arg0;
		this.anInt4204 = arg2;
		this.anInt4215 = arg5;
		this.anInt4213 = arg3;
	}

	@OriginalMember(owner = "client!hm", name = "i", descriptor = "(I)I")
	public abstract int method3426();

	@OriginalMember(owner = "client!hm", name = "h", descriptor = "(I)V")
	@Override
	public final void method5144() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!ya;IZLclient!ij;III)V")
	@Override
	public final void method5136(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class3 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method5135() {
		return false;
	}
}
