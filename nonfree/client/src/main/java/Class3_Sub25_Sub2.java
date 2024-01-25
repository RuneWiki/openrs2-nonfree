import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class3_Sub25_Sub2 extends Class3_Sub25 {

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(I)V")
	public Class3_Sub25_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IF)V")
	public void method4128(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray88[super.anInt4974++] = (byte) (local6 >> 24);
		super.aByteArray88[super.anInt4974++] = (byte) (local6 >> 16);
		super.aByteArray88[super.anInt4974++] = (byte) (local6 >> 8);
		super.aByteArray88[super.anInt4974++] = (byte) local6;
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(IF)V")
	public void method4130(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray88[super.anInt4974++] = (byte) local6;
		super.aByteArray88[super.anInt4974++] = (byte) (local6 >> 8);
		super.aByteArray88[super.anInt4974++] = (byte) (local6 >> 16);
		super.aByteArray88[super.anInt4974++] = (byte) (local6 >> 24);
	}
}
