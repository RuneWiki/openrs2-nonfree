import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public abstract class Class21_Sub1_Sub4 extends Class21_Sub1 {

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(IIIII)V")
	public Class21_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.anInt10554 = arg1;
		super.aByte128 = (byte) arg4;
		super.aByte127 = (byte) arg3;
		super.anInt10550 = arg2;
		super.anInt10551 = arg0;
	}

	@OriginalMember(owner = "client!kj", name = "j", descriptor = "(I)V")
	@Override
	public final void method8232() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)Z")
	@Override
	public final boolean method8226() {
		return Static339.aBooleanArrayArray8[(super.anInt10551 >> Static392.anInt3635) + Static30.anInt1124 - Static465.anInt8858][(super.anInt10550 >> Static392.anInt3635) + Static30.anInt1124 - Static78.anInt1933];
	}

	@OriginalMember(owner = "client!kj", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method8221() {
		@Pc(19) Class192 local19 = Static216.method3513(super.aByte127, super.anInt10551 >> Static392.anInt3635, super.anInt10550 >> Static392.anInt3635);
		return local19 != null && local19.aClass21_Sub1_Sub1_1.aBoolean662 ? Static183.method3008(super.anInt10551 >> Static392.anInt3635, super.aByte127, super.anInt10550 >> Static392.anInt3635, local19.aClass21_Sub1_Sub1_1.method8231() + this.method8231()) : Static351.method5319(super.aByte127, super.anInt10551 >> Static392.anInt3635, super.anInt10550 >> Static392.anInt3635);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!vj;IZLclient!r;IIB)V")
	@Override
	public final void method8230(@OriginalArg(0) Class21_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class7 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(I[Lclient!am;)I")
	@Override
	public final int method8234(@OriginalArg(1) Class4_Sub3[] arg0) {
		return this.method8236(super.anInt10550 >> Static392.anInt3635, super.anInt10551 >> Static392.anInt3635, arg0);
	}

	@OriginalMember(owner = "client!kj", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method8225() {
		return false;
	}
}
