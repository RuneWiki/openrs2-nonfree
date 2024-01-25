import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class7_Sub3_Sub1 extends Class7_Sub3 {

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(I)V")
	public Class7_Sub3_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(FI)V")
	public void method1702(@OriginalArg(0) float arg0) {
		@Pc(10) int local10 = Float.floatToRawIntBits(arg0);
		this.aByteArray33[this.anInt3005++] = (byte) (local10 >> 24);
		this.aByteArray33[this.anInt3005++] = (byte) (local10 >> 16);
		this.aByteArray33[this.anInt3005++] = (byte) (local10 >> 8);
		this.aByteArray33[this.anInt3005++] = (byte) local10;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(FZ)V")
	public void method1703(@OriginalArg(0) float arg0) {
		@Pc(5) int local5 = Float.floatToRawIntBits(arg0);
		this.aByteArray33[this.anInt3005++] = (byte) local5;
		this.aByteArray33[this.anInt3005++] = (byte) (local5 >> 8);
		this.aByteArray33[this.anInt3005++] = (byte) (local5 >> 16);
		this.aByteArray33[this.anInt3005++] = (byte) (local5 >> 24);
	}
}
