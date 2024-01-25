import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class2_Sub29_Sub1 extends Class2_Sub29 {

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I)V")
	public Class2_Sub29_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IF)V")
	public void method3899(@OriginalArg(1) float arg0) {
		@Pc(12) int local12 = Stream.floatToRawIntBits(arg0);
		super.aByteArray96[super.anInt6132++] = (byte) (local12 >> 24);
		super.aByteArray96[super.anInt6132++] = (byte) (local12 >> 16);
		super.aByteArray96[super.anInt6132++] = (byte) (local12 >> 8);
		super.aByteArray96[super.anInt6132++] = (byte) local12;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(FI)V")
	public void method3902(@OriginalArg(0) float arg0) {
		@Pc(10) int local10 = Stream.floatToRawIntBits(arg0);
		super.aByteArray96[super.anInt6132++] = (byte) local10;
		super.aByteArray96[super.anInt6132++] = (byte) (local10 >> 8);
		super.aByteArray96[super.anInt6132++] = (byte) (local10 >> 16);
		super.aByteArray96[super.anInt6132++] = (byte) (local10 >> 24);
	}
}
