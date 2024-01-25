import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class4_Sub13_Sub1 extends Class4_Sub13 {

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(I)V")
	public Class4_Sub13_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZF)V")
	public void method3607(@OriginalArg(1) float arg0) {
		@Pc(13) int local13 = Stream.floatToRawIntBits(arg0);
		super.aByteArray88[super.anInt9170++] = (byte) local13;
		super.aByteArray88[super.anInt9170++] = (byte) (local13 >> 8);
		super.aByteArray88[super.anInt9170++] = (byte) (local13 >> 16);
		super.aByteArray88[super.anInt9170++] = (byte) (local13 >> 24);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(FZ)V")
	public void method3608(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray88[super.anInt9170++] = (byte) (local6 >> 24);
		super.aByteArray88[super.anInt9170++] = (byte) (local6 >> 16);
		super.aByteArray88[super.anInt9170++] = (byte) (local6 >> 8);
		super.aByteArray88[super.anInt9170++] = (byte) local6;
	}
}
