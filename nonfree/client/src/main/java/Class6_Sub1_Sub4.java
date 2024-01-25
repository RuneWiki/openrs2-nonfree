import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public abstract class Class6_Sub1_Sub4 extends Class6_Sub1 {

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(IIIII)V")
	public Class6_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.aByte112 = (byte) arg3;
		super.anInt8764 = arg2;
		super.anInt8761 = arg0;
		super.anInt8759 = arg1;
		super.aByte111 = (byte) arg4;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "([Lclient!gga;I)I")
	@Override
	public final int method7315(@OriginalArg(0) Class2_Sub14[] arg0) {
		return this.method7321(arg0, super.anInt8761 >> Static134.anInt2822, super.anInt8764 >> Static134.anInt2822);
	}

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "(I)V")
	@Override
	public final void method7322() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wr", name = "h", descriptor = "(B)Z")
	@Override
	public final boolean method7330() {
		return false;
	}

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "(B)Z")
	@Override
	public final boolean method7320() {
		@Pc(23) Class153 local23 = Static69.method1125(super.aByte112, super.anInt8761 >> Static134.anInt2822, super.anInt8764 >> Static134.anInt2822);
		return local23 != null && local23.aClass6_Sub1_Sub1_1.aBoolean568 ? Static224.method3512(local23.aClass6_Sub1_Sub1_1.method7328() + this.method7328(), super.aByte112, super.anInt8764 >> Static134.anInt2822, super.anInt8761 >> Static134.anInt2822) : Static563.method7642(super.aByte112, super.anInt8761 >> Static134.anInt2822, super.anInt8764 >> Static134.anInt2822);
	}

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method7327() {
		return Static557.aBooleanArrayArray9[(super.anInt8761 >> Static134.anInt2822) - (Static350.anInt6287 - Static74.anInt1648)][Static74.anInt1648 + (super.anInt8764 >> Static134.anInt2822) - Static148.anInt3061];
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZIBLclient!r;Lclient!lo;II)V")
	@Override
	public final void method7325(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class100 arg2, @OriginalArg(4) Class6_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}
}
