import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public final class Class1_Sub3_Sub2 extends Class1_Sub3 {

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(I)V")
	public Class1_Sub3_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(FI)V")
	public void method7979(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray104[super.anInt9802++] = (byte) (local6 >> 24);
		super.aByteArray104[super.anInt9802++] = (byte) (local6 >> 16);
		super.aByteArray104[super.anInt9802++] = (byte) (local6 >> 8);
		super.aByteArray104[super.anInt9802++] = (byte) local6;
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(FI)V")
	public void method7984(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray104[super.anInt9802++] = (byte) local6;
		super.aByteArray104[super.anInt9802++] = (byte) (local6 >> 8);
		super.aByteArray104[super.anInt9802++] = (byte) (local6 >> 16);
		super.aByteArray104[super.anInt9802++] = (byte) (local6 >> 24);
	}
}
