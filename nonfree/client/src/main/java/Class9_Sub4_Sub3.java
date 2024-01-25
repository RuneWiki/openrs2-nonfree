import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public abstract class Class9_Sub4_Sub3 extends Class9_Sub4 {

	@OriginalMember(owner = "client!hc", name = "D", descriptor = "S")
	public final short aShort96;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(IIIIII)V")
	protected Class9_Sub4_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aShort96 = (short) arg5;
		super.anInt10360 = arg0;
		super.aByte134 = (byte) arg4;
		super.aByte135 = (byte) arg3;
		super.anInt10365 = arg1;
		super.anInt10357 = arg2;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[Lclient!cba;)I")
	@Override
	public final int method8415(@OriginalArg(1) Class6_Sub10[] arg0) {
		return this.method8424(super.anInt10360 >> Static606.anInt10280, arg0, super.anInt10357 >> Static606.anInt10280);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!ha;B)Z")
	@Override
	public final boolean method8412(@OriginalArg(0) Class5 arg0) {
		return Static267.method4826(super.aByte134, super.anInt10357 >> Static606.anInt10280, super.anInt10360 >> Static606.anInt10280);
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(Z)Z")
	@Override
	public final boolean method8426() {
		return Static137.aBooleanArrayArray1[Static456.anInt8195 + (super.anInt10360 >> Static606.anInt10280) - Static427.anInt7834][(super.anInt10357 >> Static606.anInt10280) + Static456.anInt8195 - Static594.anInt10050];
	}
}
