import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class4_Sub30_Sub2 extends Class4_Sub30 {

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(I)V")
	public Class4_Sub30_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IF)V")
	public void method4892(@OriginalArg(1) float arg0) {
		@Pc(13) int local13 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray79[super.anInt6244++] = (byte) local13;
		super.aByteArray79[super.anInt6244++] = (byte) (local13 >> 8);
		super.aByteArray79[super.anInt6244++] = (byte) (local13 >> 16);
		super.aByteArray79[super.anInt6244++] = (byte) (local13 >> 24);
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(IF)V")
	public void method4896(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray79[super.anInt6244++] = (byte) (local6 >> 24);
		super.aByteArray79[super.anInt6244++] = (byte) (local6 >> 16);
		super.aByteArray79[super.anInt6244++] = (byte) (local6 >> 8);
		super.aByteArray79[super.anInt6244++] = (byte) local6;
	}
}
