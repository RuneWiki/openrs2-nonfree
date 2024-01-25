import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class1_Sub13_Sub1 extends Class1_Sub13 {

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(I)V")
	public Class1_Sub13_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZF)V")
	public void method2611(@OriginalArg(1) float arg0) {
		@Pc(13) int local13 = Stream.floatToRawIntBits(arg0);
		super.aByteArray45[super.anInt3400++] = (byte) local13;
		super.aByteArray45[super.anInt3400++] = (byte) (local13 >> 8);
		super.aByteArray45[super.anInt3400++] = (byte) (local13 >> 16);
		super.aByteArray45[super.anInt3400++] = (byte) (local13 >> 24);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IF)V")
	public void method2612(@OriginalArg(1) float arg0) {
		@Pc(12) int local12 = Stream.floatToRawIntBits(arg0);
		super.aByteArray45[super.anInt3400++] = (byte) (local12 >> 24);
		super.aByteArray45[super.anInt3400++] = (byte) (local12 >> 16);
		super.aByteArray45[super.anInt3400++] = (byte) (local12 >> 8);
		super.aByteArray45[super.anInt3400++] = (byte) local12;
	}
}
