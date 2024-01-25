import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ow")
public final class Class4_Sub20_Sub2 extends Class4_Sub20 {

	@OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(I)V")
	public Class4_Sub20_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(BF)V")
	public void method4626(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray77[super.anInt5526++] = (byte) (local6 >> 24);
		super.aByteArray77[super.anInt5526++] = (byte) (local6 >> 16);
		super.aByteArray77[super.anInt5526++] = (byte) (local6 >> 8);
		super.aByteArray77[super.anInt5526++] = (byte) local6;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(IF)V")
	public void method4627(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray77[super.anInt5526++] = (byte) local6;
		super.aByteArray77[super.anInt5526++] = (byte) (local6 >> 8);
		super.aByteArray77[super.anInt5526++] = (byte) (local6 >> 16);
		super.aByteArray77[super.anInt5526++] = (byte) (local6 >> 24);
	}
}
