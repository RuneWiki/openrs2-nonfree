import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public abstract class Class6_Sub1_Sub2 extends Class6_Sub1 {

	@OriginalMember(owner = "client!dfa", name = "x", descriptor = "S")
	public final short aShort96;

	@OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "(IIIIII)V")
	protected Class6_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aShort96 = (short) arg5;
		super.anInt8759 = arg1;
		super.anInt8761 = arg0;
		super.anInt8764 = arg2;
		super.aByte112 = (byte) arg3;
		super.aByte111 = (byte) arg4;
	}

	@OriginalMember(owner = "client!dfa", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method7327() {
		return Static557.aBooleanArrayArray9[Static74.anInt1648 + (super.anInt8761 >> Static134.anInt2822) - Static350.anInt6287][(super.anInt8764 >> Static134.anInt2822) + Static74.anInt1648 - Static148.anInt3061];
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "([Lclient!gga;I)I")
	@Override
	public final int method7315(@OriginalArg(0) Class2_Sub14[] arg0) {
		return this.method7321(arg0, super.anInt8761 >> Static134.anInt2822, super.anInt8764 >> Static134.anInt2822);
	}

	@OriginalMember(owner = "client!dfa", name = "f", descriptor = "(B)Z")
	@Override
	public final boolean method7320() {
		return Static563.method7642(super.aByte111, super.anInt8761 >> Static134.anInt2822, super.anInt8764 >> Static134.anInt2822);
	}
}
