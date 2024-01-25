import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class10_Sub8_Sub1 extends Class10_Sub8 {

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(I)V")
	public Class10_Sub8_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BF)V")
	public void method833(@OriginalArg(1) float arg0) {
		@Pc(14) int local14 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray44[super.anInt2989++] = (byte) local14;
		super.aByteArray44[super.anInt2989++] = (byte) (local14 >> 8);
		super.aByteArray44[super.anInt2989++] = (byte) (local14 >> 16);
		super.aByteArray44[super.anInt2989++] = (byte) (local14 >> 24);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(FI)V")
	public void method835(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray44[super.anInt2989++] = (byte) (local6 >> 24);
		super.aByteArray44[super.anInt2989++] = (byte) (local6 >> 16);
		super.aByteArray44[super.anInt2989++] = (byte) (local6 >> 8);
		super.aByteArray44[super.anInt2989++] = (byte) local6;
	}
}
