import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class2_Sub10_Sub2 extends Class2_Sub10 {

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(I)V")
	public Class2_Sub10_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZF)V")
	public void method4465(@OriginalArg(1) float arg0) {
		@Pc(5) int local5 = Float.floatToRawIntBits(arg0);
		this.aByteArray57[this.anInt4807++] = (byte) local5;
		this.aByteArray57[this.anInt4807++] = (byte) (local5 >> 8);
		this.aByteArray57[this.anInt4807++] = (byte) (local5 >> 16);
		this.aByteArray57[this.anInt4807++] = (byte) (local5 >> 24);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IF)V")
	public void method4466(@OriginalArg(1) float arg0) {
		@Pc(9) int local9 = Float.floatToRawIntBits(arg0);
		this.aByteArray57[this.anInt4807++] = (byte) (local9 >> 24);
		this.aByteArray57[this.anInt4807++] = (byte) (local9 >> 16);
		this.aByteArray57[this.anInt4807++] = (byte) (local9 >> 8);
		this.aByteArray57[this.anInt4807++] = (byte) local9;
	}
}
