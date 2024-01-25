import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public final class Class8_Sub8_Sub1 extends Class8_Sub8 {

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(I)V")
	public Class8_Sub8_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(BF)V")
	public void method1576(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray107[super.anInt10588++] = (byte) (local6 >> 24);
		super.aByteArray107[super.anInt10588++] = (byte) (local6 >> 16);
		super.aByteArray107[super.anInt10588++] = (byte) (local6 >> 8);
		super.aByteArray107[super.anInt10588++] = (byte) local6;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(FI)V")
	public void method1578(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray107[super.anInt10588++] = (byte) local6;
		super.aByteArray107[super.anInt10588++] = (byte) (local6 >> 8);
		super.aByteArray107[super.anInt10588++] = (byte) (local6 >> 16);
		super.aByteArray107[super.anInt10588++] = (byte) (local6 >> 24);
	}
}
