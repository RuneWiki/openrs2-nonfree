import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dda")
public final class Class3_Sub2_Sub2 extends Class3_Sub2 {

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(I)V")
	public Class3_Sub2_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(BF)V")
	public void method2079(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray20[super.anInt2178++] = (byte) local6;
		super.aByteArray20[super.anInt2178++] = (byte) (local6 >> 8);
		super.aByteArray20[super.anInt2178++] = (byte) (local6 >> 16);
		super.aByteArray20[super.anInt2178++] = (byte) (local6 >> 24);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZF)V")
	public void method2080(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray20[super.anInt2178++] = (byte) (local6 >> 24);
		super.aByteArray20[super.anInt2178++] = (byte) (local6 >> 16);
		super.aByteArray20[super.anInt2178++] = (byte) (local6 >> 8);
		super.aByteArray20[super.anInt2178++] = (byte) local6;
	}
}
