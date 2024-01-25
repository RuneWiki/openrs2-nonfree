import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public abstract class Class6_Sub1_Sub5 extends Class6_Sub1 {

	@OriginalMember(owner = "client!lca", name = "x", descriptor = "S")
	public short aShort57;

	@OriginalMember(owner = "client!lca", name = "E", descriptor = "S")
	public short aShort58;

	@OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class6_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super.aByte111 = (byte) arg4;
		super.anInt8764 = arg2;
		this.aShort57 = (short) arg6;
		super.anInt8759 = arg1;
		this.aShort58 = (short) arg5;
		super.anInt8761 = arg0;
		super.aByte112 = (byte) arg3;
	}

	@OriginalMember(owner = "client!lca", name = "h", descriptor = "(B)Z")
	@Override
	public final boolean method7330() {
		return false;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "([Lclient!gga;I)I")
	@Override
	public final int method7315(@OriginalArg(0) Class2_Sub14[] arg0) {
		return this.method7321(arg0, super.anInt8761 >> Static134.anInt2822, super.anInt8764 >> Static134.anInt2822);
	}

	@OriginalMember(owner = "client!lca", name = "f", descriptor = "(B)Z")
	@Override
	public final boolean method7320() {
		return Static224.method3512(this.method7328(), super.aByte111, super.anInt8764 >> Static134.anInt2822, super.anInt8761 >> Static134.anInt2822);
	}

	@OriginalMember(owner = "client!lca", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method7327() {
		return Static557.aBooleanArrayArray9[Static74.anInt1648 + (super.anInt8761 >> Static134.anInt2822) - Static350.anInt6287][Static74.anInt1648 + (super.anInt8764 >> Static134.anInt2822) - Static148.anInt3061];
	}

	@OriginalMember(owner = "client!lca", name = "d", descriptor = "(I)V")
	@Override
	public final void method7322() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(ZIBLclient!r;Lclient!lo;II)V")
	@Override
	public final void method7325(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class100 arg2, @OriginalArg(4) Class6_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}
}
