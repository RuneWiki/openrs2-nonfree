import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class4_Sub7_Sub2 extends Class4_Sub7 {

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(I)V")
	public Class4_Sub7_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(FZ)V")
	public void method2422(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = Float.floatToRawIntBits(arg0);
		this.aByteArray42[this.anInt2667++] = (byte) local2;
		this.aByteArray42[this.anInt2667++] = (byte) (local2 >> 8);
		this.aByteArray42[this.anInt2667++] = (byte) (local2 >> 16);
		this.aByteArray42[this.anInt2667++] = (byte) (local2 >> 24);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IF)V")
	public void method2423(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Float.floatToRawIntBits(arg0);
		this.aByteArray42[this.anInt2667++] = (byte) (local6 >> 24);
		this.aByteArray42[this.anInt2667++] = (byte) (local6 >> 16);
		this.aByteArray42[this.anInt2667++] = (byte) (local6 >> 8);
		this.aByteArray42[this.anInt2667++] = (byte) local6;
	}
}
