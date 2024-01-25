import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public abstract class Class20_Sub2_Sub5 extends Class20_Sub2 {

	@OriginalMember(owner = "client!ng", name = "J", descriptor = "S")
	public final short aShort94;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(IIIIII)V")
	protected Class20_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aShort94 = (short) arg5;
		super.anInt10724 = arg1;
		super.anInt10729 = arg2;
		super.aByte130 = (byte) arg4;
		super.aByte131 = (byte) arg3;
		super.anInt10725 = arg0;
	}

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method9010() {
		return Static460.aBooleanArrayArray6[Static197.anInt10372 + (super.anInt10725 >> Static643.anInt10682) - Static162.anInt3371][Static197.anInt10372 + (super.anInt10729 >> Static643.anInt10682) - Static313.anInt5975];
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(I[Lclient!raa;)I")
	@Override
	public final int method9008(@OriginalArg(1) Class6_Sub1[] arg0) {
		return this.method9009(super.anInt10729 >> Static643.anInt10682, arg0, super.anInt10725 >> Static643.anInt10682);
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(Lclient!ha;I)Z")
	@Override
	public final boolean method9015(@OriginalArg(0) Class100 arg0) {
		return Static606.method7456(super.anInt10729 >> Static643.anInt10682, super.anInt10725 >> Static643.anInt10682, super.aByte130);
	}
}
