import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class4_Sub9_Sub1 extends Class4_Sub9 {

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(I)V")
	public Class4_Sub9_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(FI)V")
	public void method1084(@OriginalArg(0) float arg0) {
		@Pc(11) int local11 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray81[super.anInt6207++] = (byte) local11;
		super.aByteArray81[super.anInt6207++] = (byte) (local11 >> 8);
		super.aByteArray81[super.anInt6207++] = (byte) (local11 >> 16);
		super.aByteArray81[super.anInt6207++] = (byte) (local11 >> 24);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IF)V")
	public void method1085(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray81[super.anInt6207++] = (byte) (local6 >> 24);
		super.aByteArray81[super.anInt6207++] = (byte) (local6 >> 16);
		super.aByteArray81[super.anInt6207++] = (byte) (local6 >> 8);
		super.aByteArray81[super.anInt6207++] = (byte) local6;
	}
}
