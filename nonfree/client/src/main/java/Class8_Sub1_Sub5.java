import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mia")
public abstract class Class8_Sub1_Sub5 extends Class8_Sub1 {

	@OriginalMember(owner = "client!mia", name = "<init>", descriptor = "(IIIII)V")
	public Class8_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.aByte146 = (byte) arg4;
		super.anInt10363 = arg2;
		super.aByte145 = (byte) arg3;
		super.anInt10357 = arg1;
		super.anInt10355 = arg0;
	}

	@OriginalMember(owner = "client!mia", name = "d", descriptor = "(B)Z")
	@Override
	public final boolean method8899(@OriginalArg(0) byte arg0) {
		if (arg0 != 94) {
			Static370.aClass73_22 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(Lclient!df;IZIIILclient!ha;)V")
	@Override
	public final void method8901(@OriginalArg(0) Class8_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class57 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mia", name = "i", descriptor = "(I)V")
	@Override
	public final void method8898(@OriginalArg(0) int arg0) {
		if (arg0 == -38) {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!mia", name = "k", descriptor = "(I)Z")
	@Override
	public final boolean method8905() {
		return Static300.aBooleanArrayArray6[(super.anInt10355 >> Static611.anInt10115) + Static28.anInt9243 - Static128.anInt7021][(super.anInt10363 >> Static611.anInt10115) - (Static97.anInt1574 - Static28.anInt9243)];
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "([Lclient!uf;Z)I")
	@Override
	public final int method8902(@OriginalArg(0) Class5_Sub43[] arg0, @OriginalArg(1) boolean arg1) {
		return arg1 ? this.method8910(arg0, super.anInt10355 >> Static611.anInt10115, super.anInt10363 >> Static611.anInt10115) : 14;
	}

	@OriginalMember(owner = "client!mia", name = "d", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method8896(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1) {
		if (arg0 != -10204) {
			this.method8902((Class5_Sub43[]) null, false);
		}
		@Pc(25) Class273 local25 = Static191.method2762(super.aByte145, super.anInt10355 >> Static611.anInt10115, super.anInt10363 >> Static611.anInt10115);
		return local25 != null && local25.aClass8_Sub1_Sub3_1.aBoolean738 ? Static281.method4142(super.anInt10363 >> Static611.anInt10115, local25.aClass8_Sub1_Sub3_1.method8900(arg0 ^ 0x2F6A) + this.method8900(-2226), super.aByte145, -108, super.anInt10355 >> Static611.anInt10115) : Static9.method108(super.anInt10363 >> Static611.anInt10115, super.aByte145, 126, super.anInt10355 >> Static611.anInt10115);
	}
}
