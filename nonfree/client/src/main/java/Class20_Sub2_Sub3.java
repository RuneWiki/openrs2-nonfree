import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public abstract class Class20_Sub2_Sub3 extends Class20_Sub2 {

	@OriginalMember(owner = "client!ica", name = "G", descriptor = "S")
	public short aShort50;

	@OriginalMember(owner = "client!ica", name = "J", descriptor = "S")
	public short aShort51;

	@OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class20_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super.anInt10725 = arg0;
		super.anInt10724 = arg1;
		super.aByte130 = (byte) arg4;
		super.aByte131 = (byte) arg3;
		super.anInt10729 = arg2;
		this.aShort50 = (short) arg6;
		this.aShort51 = (short) arg5;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(I[Lclient!raa;)I")
	@Override
	public final int method9008(@OriginalArg(1) Class6_Sub1[] arg0) {
		return this.method9009(super.anInt10729 >> Static643.anInt10682, arg0, super.anInt10725 >> Static643.anInt10682);
	}

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "(Lclient!ha;I)Z")
	@Override
	public final boolean method9015(@OriginalArg(0) Class100 arg0) {
		return Static241.method4063(this.method9019(), super.aByte130, super.anInt10729 >> Static643.anInt10682, super.anInt10725 >> Static643.anInt10682);
	}

	@OriginalMember(owner = "client!ica", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method9010() {
		return Static460.aBooleanArrayArray6[(super.anInt10725 >> Static643.anInt10682) + Static197.anInt10372 - Static162.anInt3371][Static197.anInt10372 + (super.anInt10729 >> Static643.anInt10682) - Static313.anInt5975];
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(ILclient!vs;ZILclient!ha;II)V")
	@Override
	public final void method9018(@OriginalArg(1) Class20_Sub2 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class100 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ica", name = "e", descriptor = "(B)Z")
	@Override
	public final boolean method9011() {
		return false;
	}

	@OriginalMember(owner = "client!ica", name = "e", descriptor = "(I)V")
	@Override
	public final void method9017() {
		throw new IllegalStateException();
	}
}
