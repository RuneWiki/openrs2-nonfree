import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class1_Sub11_Sub2 extends Class1_Sub11 {

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(I)V")
	public Class1_Sub11_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(FI)V")
	public void method4507(@OriginalArg(0) float arg0) {
		@Pc(14) int local14 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray64[super.anInt5766++] = (byte) (local14 >> 24);
		super.aByteArray64[super.anInt5766++] = (byte) (local14 >> 16);
		super.aByteArray64[super.anInt5766++] = (byte) (local14 >> 8);
		super.aByteArray64[super.anInt5766++] = (byte) local14;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(FB)V")
	public void method4509(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray64[super.anInt5766++] = (byte) local6;
		super.aByteArray64[super.anInt5766++] = (byte) (local6 >> 8);
		super.aByteArray64[super.anInt5766++] = (byte) (local6 >> 16);
		super.aByteArray64[super.anInt5766++] = (byte) (local6 >> 24);
	}
}
