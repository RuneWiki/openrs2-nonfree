import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public abstract class Class9_Sub4_Sub1 extends Class9_Sub4 {

	@OriginalMember(owner = "client!wo", name = "I", descriptor = "S")
	public short aShort119;

	@OriginalMember(owner = "client!wo", name = "D", descriptor = "S")
	public short aShort118;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class9_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super.anInt10360 = arg0;
		super.aByte134 = (byte) arg4;
		this.aShort119 = (short) arg5;
		this.aShort118 = (short) arg6;
		super.aByte135 = (byte) arg3;
		super.anInt10357 = arg2;
		super.anInt10365 = arg1;
	}

	@OriginalMember(owner = "client!wo", name = "f", descriptor = "(B)V")
	@Override
	public final void method8427() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "(B)Z")
	@Override
	public final boolean method8417() {
		return false;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!gg;BZILclient!ha;II)V")
	@Override
	public final void method8416(@OriginalArg(0) Class9_Sub4 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!ha;B)Z")
	@Override
	public final boolean method8412(@OriginalArg(0) Class5 arg0) {
		return Static359.method5818(super.aByte134, super.anInt10357 >> Static606.anInt10280, super.anInt10360 >> Static606.anInt10280, this.method8425());
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I[Lclient!cba;)I")
	@Override
	public final int method8415(@OriginalArg(1) Class6_Sub10[] arg0) {
		return this.method8424(super.anInt10360 >> Static606.anInt10280, arg0, super.anInt10357 >> Static606.anInt10280);
	}

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "(Z)Z")
	@Override
	public final boolean method8426() {
		return Static137.aBooleanArrayArray1[Static456.anInt8195 + (super.anInt10360 >> Static606.anInt10280) - Static427.anInt7834][Static456.anInt8195 + (super.anInt10357 >> Static606.anInt10280) - Static594.anInt10050];
	}
}
