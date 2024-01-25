import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class6_Sub14_Sub1 extends Class6_Sub14 {

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(I)V")
	public Class6_Sub14_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IF)V")
	public void method3725(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray88[super.anInt7244++] = (byte) local6;
		super.aByteArray88[super.anInt7244++] = (byte) (local6 >> 8);
		super.aByteArray88[super.anInt7244++] = (byte) (local6 >> 16);
		super.aByteArray88[super.anInt7244++] = (byte) (local6 >> 24);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(FI)V")
	public void method3726(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray88[super.anInt7244++] = (byte) (local6 >> 24);
		super.aByteArray88[super.anInt7244++] = (byte) (local6 >> 16);
		super.aByteArray88[super.anInt7244++] = (byte) (local6 >> 8);
		super.aByteArray88[super.anInt7244++] = (byte) local6;
	}
}
