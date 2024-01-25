import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class Class1_Sub7_Sub1 extends Class1_Sub7 {

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(I)V")
	public Class1_Sub7_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(BF)V")
	public void method789(@OriginalArg(1) float arg0) {
		@Pc(2) int local2 = Float.floatToRawIntBits(arg0);
		this.aByteArray41[this.anInt2219++] = (byte) local2;
		this.aByteArray41[this.anInt2219++] = (byte) (local2 >> 8);
		this.aByteArray41[this.anInt2219++] = (byte) (local2 >> 16);
		this.aByteArray41[this.anInt2219++] = (byte) (local2 >> 24);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IF)V")
	public void method790(@OriginalArg(1) float arg0) {
		@Pc(2) int local2 = Float.floatToRawIntBits(arg0);
		this.aByteArray41[this.anInt2219++] = (byte) (local2 >> 24);
		this.aByteArray41[this.anInt2219++] = (byte) (local2 >> 16);
		this.aByteArray41[this.anInt2219++] = (byte) (local2 >> 8);
		this.aByteArray41[this.anInt2219++] = (byte) local2;
	}
}
