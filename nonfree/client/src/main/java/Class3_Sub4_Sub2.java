import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uba")
public final class Class3_Sub4_Sub2 extends Class3_Sub4 {

	@OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(I)V")
	public Class3_Sub4_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IF)V")
	public void method7962(@OriginalArg(1) float arg0) {
		@Pc(10) int local10 = Stream.floatToRawIntBits(arg0);
		super.aByteArray90[super.anInt9739++] = (byte) (local10 >> 24);
		super.aByteArray90[super.anInt9739++] = (byte) (local10 >> 16);
		super.aByteArray90[super.anInt9739++] = (byte) (local10 >> 8);
		super.aByteArray90[super.anInt9739++] = (byte) local10;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(FI)V")
	public void method7963(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray90[super.anInt9739++] = (byte) local6;
		super.aByteArray90[super.anInt9739++] = (byte) (local6 >> 8);
		super.aByteArray90[super.anInt9739++] = (byte) (local6 >> 16);
		super.aByteArray90[super.anInt9739++] = (byte) (local6 >> 24);
	}
}
