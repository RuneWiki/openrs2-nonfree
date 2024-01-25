import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class6_Sub12_Sub1 extends Class6_Sub12 {

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(I)V")
	public Class6_Sub12_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(FI)V")
	public void method1602(@OriginalArg(0) float arg0) {
		@Pc(14) int local14 = Stream.floatToRawIntBits(arg0);
		super.aByteArray97[super.anInt7556++] = (byte) local14;
		super.aByteArray97[super.anInt7556++] = (byte) (local14 >> 8);
		super.aByteArray97[super.anInt7556++] = (byte) (local14 >> 16);
		super.aByteArray97[super.anInt7556++] = (byte) (local14 >> 24);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(BF)V")
	public void method1604(@OriginalArg(1) float arg0) {
		@Pc(10) int local10 = Stream.floatToRawIntBits(arg0);
		super.aByteArray97[super.anInt7556++] = (byte) (local10 >> 24);
		super.aByteArray97[super.anInt7556++] = (byte) (local10 >> 16);
		super.aByteArray97[super.anInt7556++] = (byte) (local10 >> 8);
		super.aByteArray97[super.anInt7556++] = (byte) local10;
	}
}
