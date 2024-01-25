import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bca")
public final class Class2_Sub7_Sub1 extends Class2_Sub7 {

	@OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(I)V")
	public Class2_Sub7_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(IF)V")
	public void method545(@OriginalArg(1) float arg0) {
		@Pc(11) int local11 = Stream.floatToRawIntBits(arg0);
		super.aByteArray52[super.anInt5186++] = (byte) local11;
		super.aByteArray52[super.anInt5186++] = (byte) (local11 >> 8);
		super.aByteArray52[super.anInt5186++] = (byte) (local11 >> 16);
		super.aByteArray52[super.anInt5186++] = (byte) (local11 >> 24);
	}

	@OriginalMember(owner = "client!bca", name = "b", descriptor = "(IF)V")
	public void method546(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray52[super.anInt5186++] = (byte) (local6 >> 24);
		super.aByteArray52[super.anInt5186++] = (byte) (local6 >> 16);
		super.aByteArray52[super.anInt5186++] = (byte) (local6 >> 8);
		super.aByteArray52[super.anInt5186++] = (byte) local6;
	}
}
