import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class1_Sub28_Sub2 extends Class1_Sub28 {

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(I)V")
	public Class1_Sub28_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(BF)V")
	public void method5400(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray86[super.anInt6812++] = (byte) local6;
		super.aByteArray86[super.anInt6812++] = (byte) (local6 >> 8);
		super.aByteArray86[super.anInt6812++] = (byte) (local6 >> 16);
		super.aByteArray86[super.anInt6812++] = (byte) (local6 >> 24);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IF)V")
	public void method5401(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray86[super.anInt6812++] = (byte) (local6 >> 24);
		super.aByteArray86[super.anInt6812++] = (byte) (local6 >> 16);
		super.aByteArray86[super.anInt6812++] = (byte) (local6 >> 8);
		super.aByteArray86[super.anInt6812++] = (byte) local6;
	}
}
