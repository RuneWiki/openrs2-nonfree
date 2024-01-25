import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dca")
public final class Class5_Sub15_Sub1 extends Class5_Sub15 {

	@OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(I)V")
	public Class5_Sub15_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(FI)V")
	public void method1612(@OriginalArg(0) float arg0) {
		@Pc(10) int local10 = Stream.floatToRawIntBits(arg0);
		super.aByteArray45[super.anInt4144++] = (byte) local10;
		super.aByteArray45[super.anInt4144++] = (byte) (local10 >> 8);
		super.aByteArray45[super.anInt4144++] = (byte) (local10 >> 16);
		super.aByteArray45[super.anInt4144++] = (byte) (local10 >> 24);
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(BF)V")
	public void method1614(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray45[super.anInt4144++] = (byte) (local6 >> 24);
		super.aByteArray45[super.anInt4144++] = (byte) (local6 >> 16);
		super.aByteArray45[super.anInt4144++] = (byte) (local6 >> 8);
		super.aByteArray45[super.anInt4144++] = (byte) local6;
	}
}
