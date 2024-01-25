import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public abstract class Class15_Sub1_Sub3 extends Class15_Sub1 {

	@OriginalMember(owner = "client!vp", name = "E", descriptor = "S")
	public final short aShort107;

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(IIIIII)V")
	protected Class15_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.anInt10297 = arg1;
		super.anInt10298 = arg2;
		super.aByte125 = (byte) arg4;
		super.anInt10301 = arg0;
		super.aByte124 = (byte) arg3;
		this.aShort107 = (short) arg5;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(B[Lclient!ada;)I")
	@Override
	public final int method8329(@OriginalArg(1) Class8_Sub1[] arg0) {
		return this.method8330(super.anInt10298 >> Static172.anInt4156, arg0, super.anInt10301 >> Static172.anInt4156);
	}

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method8324() {
		return Static109.method2472(super.anInt10301 >> Static172.anInt4156, super.anInt10298 >> Static172.anInt4156, super.aByte125);
	}

	@OriginalMember(owner = "client!vp", name = "e", descriptor = "(I)Z")
	@Override
	public final boolean method8325() {
		return Static100.aBooleanArrayArray3[Static183.anInt4307 + (super.anInt10301 >> Static172.anInt4156) - Static603.anInt10257][(super.anInt10298 >> Static172.anInt4156) + Static183.anInt4307 - Static470.anInt8495];
	}
}
