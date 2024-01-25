import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class11_Sub25_Sub2 extends Class11_Sub25 {

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(I)V")
	public Class11_Sub25_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ZF)V")
	public void method5228(@OriginalArg(1) float arg0) {
		@Pc(2) int local2 = Float.floatToRawIntBits(arg0);
		this.aByteArray93[this.anInt6076++] = (byte) (local2 >> 24);
		this.aByteArray93[this.anInt6076++] = (byte) (local2 >> 16);
		this.aByteArray93[this.anInt6076++] = (byte) (local2 >> 8);
		this.aByteArray93[this.anInt6076++] = (byte) local2;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IF)V")
	public void method5229(@OriginalArg(1) float arg0) {
		@Pc(2) int local2 = Float.floatToRawIntBits(arg0);
		this.aByteArray93[this.anInt6076++] = (byte) local2;
		this.aByteArray93[this.anInt6076++] = (byte) (local2 >> 8);
		this.aByteArray93[this.anInt6076++] = (byte) (local2 >> 16);
		this.aByteArray93[this.anInt6076++] = (byte) (local2 >> 24);
	}
}
