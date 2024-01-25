import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public final class Class64_Sub2 extends Class64 implements Interface23 {

	@OriginalMember(owner = "client!mg", name = "K", descriptor = "I")
	private int anInt6642;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lclient!nv;I[BIZ)V")
	public Class64_Sub2(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt6642 = arg1;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "([BIII)V")
	@Override
	public void method5438(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method5435(arg0, arg1);
		this.anInt6642 = 5123;
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)J")
	@Override
	public long method5437() {
		return 0L;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)I")
	@Override
	public int method5436() {
		return super.anInt6632;
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)I")
	@Override
	public int method5439() {
		return this.anInt6642;
	}

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "(I)V")
	@Override
	protected void method5433() {
		super.aClass16_Sub3_27.method5993(this);
	}
}
