import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public abstract class Class9_Sub1_Sub3 extends Class9_Sub1 {

	@OriginalMember(owner = "client!vr", name = "E", descriptor = "S")
	public short aShort85;

	@OriginalMember(owner = "client!vr", name = "S", descriptor = "S")
	public short aShort86;

	static {
		new Class78("", 76);
	}

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class9_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aShort85 = (short) arg6;
		super.anInt10694 = arg0;
		super.aByte139 = (byte) arg3;
		super.anInt10690 = arg1;
		this.aShort86 = (short) arg5;
		super.anInt10695 = arg2;
		super.aByte140 = (byte) arg4;
	}

	@OriginalMember(owner = "client!vr", name = "f", descriptor = "(B)Z")
	@Override
	public final boolean method9079() {
		return Static181.aBooleanArrayArray2[(super.anInt10694 >> Static626.anInt9669) + Static720.anInt11190 - Static507.anInt8070][Static720.anInt11190 + (super.anInt10695 >> Static626.anInt9669) - Static527.anInt8230];
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!ee;Lclient!ha;IZIIZ)V")
	@Override
	public final void method9091(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "([Lclient!jw;I)I")
	@Override
	public final int method9094(@OriginalArg(0) Class3_Sub5[] arg0) {
		return this.method9096(super.anInt10694 >> Static626.anInt9669, super.anInt10695 >> Static626.anInt9669, arg0);
	}

	@OriginalMember(owner = "client!vr", name = "f", descriptor = "(I)V")
	@Override
	public final void method9086() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!ha;I)Z")
	@Override
	public final boolean method9082(@OriginalArg(0) Class22 arg0) {
		return Static218.method3254(super.aByte140, super.anInt10695 >> Static626.anInt9669, this.method9081(), super.anInt10694 >> Static626.anInt9669);
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(Z)Z")
	@Override
	public final boolean method9077() {
		return false;
	}
}
