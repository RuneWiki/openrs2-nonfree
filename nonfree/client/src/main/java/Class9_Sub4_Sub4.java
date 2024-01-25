import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public abstract class Class9_Sub4_Sub4 extends Class9_Sub4 {

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(IIIII)V")
	public Class9_Sub4_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.anInt10365 = arg1;
		super.anInt10357 = arg2;
		super.aByte134 = (byte) arg4;
		super.anInt10360 = arg0;
		super.aByte135 = (byte) arg3;
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(Z)Z")
	@Override
	public final boolean method8426() {
		return Static137.aBooleanArrayArray1[Static456.anInt8195 + (super.anInt10360 >> Static606.anInt10280) - Static427.anInt7834][Static456.anInt8195 + (super.anInt10357 >> Static606.anInt10280) - Static594.anInt10050];
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!gg;BZILclient!ha;II)V")
	@Override
	public final void method8416(@OriginalArg(0) Class9_Sub4 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!ha;B)Z")
	@Override
	public final boolean method8412(@OriginalArg(0) Class5 arg0) {
		@Pc(27) Class168 local27 = Static167.method3171(super.aByte135, super.anInt10360 >> Static606.anInt10280, super.anInt10357 >> Static606.anInt10280);
		return local27 != null && local27.aClass9_Sub4_Sub2_1.aBoolean756 ? Static359.method5818(super.aByte135, super.anInt10357 >> Static606.anInt10280, super.anInt10360 >> Static606.anInt10280, local27.aClass9_Sub4_Sub2_1.method8425() + this.method8425()) : Static267.method4826(super.aByte135, super.anInt10357 >> Static606.anInt10280, super.anInt10360 >> Static606.anInt10280);
	}

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "(B)V")
	@Override
	public final void method8427() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(B)Z")
	@Override
	public final boolean method8417() {
		return false;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[Lclient!cba;)I")
	@Override
	public final int method8415(@OriginalArg(1) Class6_Sub10[] arg0) {
		return this.method8424(super.anInt10360 >> Static606.anInt10280, arg0, super.anInt10357 >> Static606.anInt10280);
	}
}
