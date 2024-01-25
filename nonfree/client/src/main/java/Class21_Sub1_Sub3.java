import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public abstract class Class21_Sub1_Sub3 extends Class21_Sub1 {

	@OriginalMember(owner = "client!vea", name = "A", descriptor = "S")
	public short aShort115;

	@OriginalMember(owner = "client!vea", name = "z", descriptor = "S")
	public short aShort114;

	@OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class21_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super.aByte128 = (byte) arg4;
		super.aByte127 = (byte) arg3;
		super.anInt10550 = arg2;
		this.aShort115 = (short) arg5;
		super.anInt10551 = arg0;
		this.aShort114 = (short) arg6;
		super.anInt10554 = arg1;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(I[Lclient!am;)I")
	@Override
	public final int method8234(@OriginalArg(1) Class4_Sub3[] arg0) {
		return this.method8236(super.anInt10550 >> Static392.anInt3635, super.anInt10551 >> Static392.anInt3635, arg0);
	}

	@OriginalMember(owner = "client!vea", name = "b", descriptor = "(B)Z")
	@Override
	public final boolean method8226() {
		return Static339.aBooleanArrayArray8[(super.anInt10551 >> Static392.anInt3635) - (Static465.anInt8858 - Static30.anInt1124)][(super.anInt10550 >> Static392.anInt3635) + Static30.anInt1124 - Static78.anInt1933];
	}

	@OriginalMember(owner = "client!vea", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method8225() {
		return false;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lclient!vj;IZLclient!r;IIB)V")
	@Override
	public final void method8230(@OriginalArg(0) Class21_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class7 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vea", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method8221() {
		return Static183.method3008(super.anInt10551 >> Static392.anInt3635, super.aByte128, super.anInt10550 >> Static392.anInt3635, this.method8231());
	}

	@OriginalMember(owner = "client!vea", name = "j", descriptor = "(I)V")
	@Override
	public final void method8232() {
		throw new IllegalStateException();
	}
}
