import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mea")
public final class Class2_Sub34_Sub1 extends Class2_Sub34 {

	@OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(I)V")
	public Class2_Sub34_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(IF)V")
	public void method5392(@OriginalArg(1) float arg0) {
		@Pc(13) int local13 = Stream.floatToRawIntBits(arg0);
		super.aByteArray77[super.anInt8188++] = (byte) local13;
		super.aByteArray77[super.anInt8188++] = (byte) (local13 >> 8);
		super.aByteArray77[super.anInt8188++] = (byte) (local13 >> 16);
		super.aByteArray77[super.anInt8188++] = (byte) (local13 >> 24);
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(BF)V")
	public void method5393(@OriginalArg(1) float arg0) {
		@Pc(11) int local11 = Stream.floatToRawIntBits(arg0);
		super.aByteArray77[super.anInt8188++] = (byte) (local11 >> 24);
		super.aByteArray77[super.anInt8188++] = (byte) (local11 >> 16);
		super.aByteArray77[super.anInt8188++] = (byte) (local11 >> 8);
		super.aByteArray77[super.anInt8188++] = (byte) local11;
	}
}
