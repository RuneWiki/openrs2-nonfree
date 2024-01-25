import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class1_Sub8_Sub2 extends Class1_Sub8 {

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(I)V")
	public Class1_Sub8_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(FI)V")
	public void method4567(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = Float.floatToRawIntBits(arg0);
		this.aByteArray81[this.anInt5182++] = (byte) (local2 >> 24);
		this.aByteArray81[this.anInt5182++] = (byte) (local2 >> 16);
		this.aByteArray81[this.anInt5182++] = (byte) (local2 >> 8);
		this.aByteArray81[this.anInt5182++] = (byte) local2;
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(FI)V")
	public void method4568(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Float.floatToRawIntBits(arg0);
		this.aByteArray81[this.anInt5182++] = (byte) local6;
		this.aByteArray81[this.anInt5182++] = (byte) (local6 >> 8);
		this.aByteArray81[this.anInt5182++] = (byte) (local6 >> 16);
		this.aByteArray81[this.anInt5182++] = (byte) (local6 >> 24);
	}
}
