import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kv")
public final class Class1_Sub20_Sub2 extends Class1_Sub20 {

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(I)V")
	public Class1_Sub20_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(BF)V")
	public void method4438(@OriginalArg(1) float arg0) {
		@Pc(10) int local10 = Stream.floatToRawIntBits(arg0);
		super.aByteArray52[super.anInt5238++] = (byte) local10;
		super.aByteArray52[super.anInt5238++] = (byte) (local10 >> 8);
		super.aByteArray52[super.anInt5238++] = (byte) (local10 >> 16);
		super.aByteArray52[super.anInt5238++] = (byte) (local10 >> 24);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IF)V")
	public void method4440(@OriginalArg(1) float arg0) {
		@Pc(13) int local13 = Stream.floatToRawIntBits(arg0);
		super.aByteArray52[super.anInt5238++] = (byte) (local13 >> 24);
		super.aByteArray52[super.anInt5238++] = (byte) (local13 >> 16);
		super.aByteArray52[super.anInt5238++] = (byte) (local13 >> 8);
		super.aByteArray52[super.anInt5238++] = (byte) local13;
	}
}
