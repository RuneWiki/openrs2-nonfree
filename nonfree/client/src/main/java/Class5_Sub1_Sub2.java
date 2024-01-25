import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class5_Sub1_Sub2 extends Class5_Sub1 {

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(I)V")
	public Class5_Sub1_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(FI)V")
	public void method1887(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Float.floatToRawIntBits(arg0);
		this.aByteArray18[this.anInt2029++] = (byte) (local6 >> 24);
		this.aByteArray18[this.anInt2029++] = (byte) (local6 >> 16);
		this.aByteArray18[this.anInt2029++] = (byte) (local6 >> 8);
		this.aByteArray18[this.anInt2029++] = (byte) local6;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(FI)V")
	public void method1888(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = Float.floatToRawIntBits(arg0);
		this.aByteArray18[this.anInt2029++] = (byte) local2;
		this.aByteArray18[this.anInt2029++] = (byte) (local2 >> 8);
		this.aByteArray18[this.anInt2029++] = (byte) (local2 >> 16);
		this.aByteArray18[this.anInt2029++] = (byte) (local2 >> 24);
	}
}
