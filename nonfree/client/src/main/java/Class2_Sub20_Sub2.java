import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class2_Sub20_Sub2 extends Class2_Sub20 {

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(I)V")
	public Class2_Sub20_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(BF)V")
	public void method3750(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray136[super.anInt4608++] = (byte) (local6 >> 24);
		super.aByteArray136[super.anInt4608++] = (byte) (local6 >> 16);
		super.aByteArray136[super.anInt4608++] = (byte) (local6 >> 8);
		super.aByteArray136[super.anInt4608++] = (byte) local6;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IF)V")
	public void method3753(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray136[super.anInt4608++] = (byte) local6;
		super.aByteArray136[super.anInt4608++] = (byte) (local6 >> 8);
		super.aByteArray136[super.anInt4608++] = (byte) (local6 >> 16);
		super.aByteArray136[super.anInt4608++] = (byte) (local6 >> 24);
	}
}
