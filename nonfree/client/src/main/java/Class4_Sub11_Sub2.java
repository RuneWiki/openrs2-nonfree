import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kw")
public final class Class4_Sub11_Sub2 extends Class4_Sub11 {

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(I)V")
	public Class4_Sub11_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(FB)V")
	public void method4960(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray68[super.anInt5831++] = (byte) local6;
		super.aByteArray68[super.anInt5831++] = (byte) (local6 >> 8);
		super.aByteArray68[super.anInt5831++] = (byte) (local6 >> 16);
		super.aByteArray68[super.anInt5831++] = (byte) (local6 >> 24);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IF)V")
	public void method4961(@OriginalArg(1) float arg0) {
		@Pc(10) int local10 = Stream.floatToRawIntBits(arg0);
		super.aByteArray68[super.anInt5831++] = (byte) (local10 >> 24);
		super.aByteArray68[super.anInt5831++] = (byte) (local10 >> 16);
		super.aByteArray68[super.anInt5831++] = (byte) (local10 >> 8);
		super.aByteArray68[super.anInt5831++] = (byte) local10;
	}
}
