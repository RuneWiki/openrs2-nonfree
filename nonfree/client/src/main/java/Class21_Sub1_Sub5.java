import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public abstract class Class21_Sub1_Sub5 extends Class21_Sub1 {

	@OriginalMember(owner = "client!sp", name = "s", descriptor = "S")
	public final short aShort87;

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(IIIIII)V")
	protected Class21_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.aByte127 = (byte) arg3;
		this.aShort87 = (short) arg5;
		super.anInt10554 = arg1;
		super.anInt10550 = arg2;
		super.anInt10551 = arg0;
		super.aByte128 = (byte) arg4;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(I[Lclient!am;)I")
	@Override
	public final int method8234(@OriginalArg(1) Class4_Sub3[] arg0) {
		return this.method8236(super.anInt10550 >> Static392.anInt3635, super.anInt10551 >> Static392.anInt3635, arg0);
	}

	@OriginalMember(owner = "client!sp", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method8221() {
		return Static351.method5319(super.aByte128, super.anInt10551 >> Static392.anInt3635, super.anInt10550 >> Static392.anInt3635);
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(B)Z")
	@Override
	public final boolean method8226() {
		return Static339.aBooleanArrayArray8[Static30.anInt1124 + (super.anInt10551 >> Static392.anInt3635) - Static465.anInt8858][(super.anInt10550 >> Static392.anInt3635) + Static30.anInt1124 - Static78.anInt1933];
	}
}
