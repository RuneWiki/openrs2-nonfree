import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public abstract class Class8_Sub1_Sub1 extends Class8_Sub1 {

	@OriginalMember(owner = "client!dr", name = "K", descriptor = "S")
	public final short aShort4;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(IIIIII)V")
	protected Class8_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.aByte145 = (byte) arg3;
		super.aByte146 = (byte) arg4;
		super.anInt10357 = arg1;
		super.anInt10355 = arg0;
		super.anInt10363 = arg2;
		this.aShort4 = (short) arg5;
	}

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method8896(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1) {
		return arg0 == -10204 ? Static9.method108(super.anInt10363 >> Static611.anInt10115, super.aByte146, arg0 ^ 0xFFFFD859, super.anInt10355 >> Static611.anInt10115) : false;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "([Lclient!uf;Z)I")
	@Override
	public final int method8902(@OriginalArg(0) Class5_Sub43[] arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1) {
			this.method8896(-107, (Class57) null);
		}
		return this.method8910(arg0, super.anInt10355 >> Static611.anInt10115, super.anInt10363 >> Static611.anInt10115);
	}

	@OriginalMember(owner = "client!dr", name = "k", descriptor = "(I)Z")
	@Override
	public final boolean method8905() {
		return Static300.aBooleanArrayArray6[(super.anInt10355 >> Static611.anInt10115) + Static28.anInt9243 - Static128.anInt7021][(super.anInt10363 >> Static611.anInt10115) + Static28.anInt9243 - Static97.anInt1574];
	}
}
