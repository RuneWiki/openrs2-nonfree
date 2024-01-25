import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class3_Sub2_Sub1 extends Class3_Sub2 {

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(I)V")
	public Class3_Sub2_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(FB)V")
	public void method395(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray95[super.anInt7620++] = (byte) local6;
		super.aByteArray95[super.anInt7620++] = (byte) (local6 >> 8);
		super.aByteArray95[super.anInt7620++] = (byte) (local6 >> 16);
		super.aByteArray95[super.anInt7620++] = (byte) (local6 >> 24);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(FI)V")
	public void method400(@OriginalArg(0) float arg0) {
		@Pc(11) int local11 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray95[super.anInt7620++] = (byte) (local11 >> 24);
		super.aByteArray95[super.anInt7620++] = (byte) (local11 >> 16);
		super.aByteArray95[super.anInt7620++] = (byte) (local11 >> 8);
		super.aByteArray95[super.anInt7620++] = (byte) local11;
	}
}
