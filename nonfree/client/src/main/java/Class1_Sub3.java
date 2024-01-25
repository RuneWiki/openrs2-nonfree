import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public abstract class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!kp", name = "k", descriptor = "I")
	public final int anInt5317;

	@OriginalMember(owner = "client!kp", name = "q", descriptor = "I")
	public final int anInt5323;

	@OriginalMember(owner = "client!kp", name = "l", descriptor = "I")
	public int anInt5318;

	@OriginalMember(owner = "client!kp", name = "o", descriptor = "I")
	public int anInt5321;

	@OriginalMember(owner = "client!kp", name = "s", descriptor = "I")
	public int anInt5325;

	@OriginalMember(owner = "client!kp", name = "n", descriptor = "I")
	protected final int anInt5320;

	@OriginalMember(owner = "client!kp", name = "p", descriptor = "I")
	public int anInt5322;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt5317 = arg3;
		this.anInt5323 = arg6;
		this.anInt5318 = arg4;
		this.anInt5321 = arg2;
		this.anInt5325 = arg0;
		this.anInt5320 = arg1;
		this.anInt5322 = arg5;
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(Z)Z")
	@Override
	public final boolean method5759() {
		return false;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZILclient!la;IIILclient!dr;)V")
	@Override
	public final void method5762(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class37 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(B)V")
	@Override
	public final void method5761() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "(B)I")
	public abstract int method4509();
}
