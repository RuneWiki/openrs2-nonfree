import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public abstract class Class8_Sub1_Sub2 extends Class8_Sub1 {

	@OriginalMember(owner = "client!qj", name = "I", descriptor = "S")
	public short aShort104;

	@OriginalMember(owner = "client!qj", name = "H", descriptor = "S")
	public short aShort105;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class8_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super.anInt10363 = arg2;
		super.aByte146 = (byte) arg4;
		super.anInt10357 = arg1;
		this.aShort104 = (short) arg5;
		super.aByte145 = (byte) arg3;
		this.aShort105 = (short) arg6;
		super.anInt10355 = arg0;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!df;IZIIILclient!ha;)V")
	@Override
	public final void method8901(@OriginalArg(0) Class8_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class57 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "([Lclient!uf;Z)I")
	@Override
	public final int method8902(@OriginalArg(0) Class5_Sub43[] arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1) {
			this.method8902((Class5_Sub43[]) null, false);
		}
		return this.method8910(arg0, super.anInt10355 >> Static611.anInt10115, super.anInt10363 >> Static611.anInt10115);
	}

	@OriginalMember(owner = "client!qj", name = "k", descriptor = "(I)Z")
	@Override
	public final boolean method8905() {
		return Static300.aBooleanArrayArray6[Static28.anInt9243 + (super.anInt10355 >> Static611.anInt10115) - Static128.anInt7021][Static28.anInt9243 + (super.anInt10363 >> Static611.anInt10115) - Static97.anInt1574];
	}

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method8896(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1) {
		return arg0 == -10204 ? Static281.method4142(super.anInt10363 >> Static611.anInt10115, this.method8900(arg0 + 7978), super.aByte146, arg0 ^ 0x27A2, super.anInt10355 >> Static611.anInt10115) : false;
	}

	@OriginalMember(owner = "client!qj", name = "i", descriptor = "(I)V")
	@Override
	public final void method8898(@OriginalArg(0) int arg0) {
		if (arg0 != -38) {
			Static483.method8086(-3);
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "(B)Z")
	@Override
	public final boolean method8899(@OriginalArg(0) byte arg0) {
		return arg0 == 94 ? false : false;
	}
}
