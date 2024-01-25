import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class1_Sub21_Sub1 extends Class1_Sub21 {

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(I)V")
	public Class1_Sub21_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IF)V")
	public void method2551(@OriginalArg(1) float arg0) {
		@Pc(2) int local2 = Float.floatToRawIntBits(arg0);
		this.aByteArray82[this.anInt6611++] = (byte) (local2 >> 24);
		this.aByteArray82[this.anInt6611++] = (byte) (local2 >> 16);
		this.aByteArray82[this.anInt6611++] = (byte) (local2 >> 8);
		this.aByteArray82[this.anInt6611++] = (byte) local2;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(FB)V")
	public void method2552(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = Float.floatToRawIntBits(arg0);
		this.aByteArray82[this.anInt6611++] = (byte) local2;
		this.aByteArray82[this.anInt6611++] = (byte) (local2 >> 8);
		this.aByteArray82[this.anInt6611++] = (byte) (local2 >> 16);
		this.aByteArray82[this.anInt6611++] = (byte) (local2 >> 24);
	}
}
