import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class6_Sub21_Sub1 extends Class6_Sub21 {

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(I)V")
	public Class6_Sub21_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IF)V")
	public void method3126(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray93[super.anInt7338++] = (byte) local6;
		super.aByteArray93[super.anInt7338++] = (byte) (local6 >> 8);
		super.aByteArray93[super.anInt7338++] = (byte) (local6 >> 16);
		super.aByteArray93[super.anInt7338++] = (byte) (local6 >> 24);
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(IF)V")
	public void method3128(@OriginalArg(1) float arg0) {
		@Pc(15) int local15 = Stream.floatToRawIntBits(arg0);
		super.aByteArray93[super.anInt7338++] = (byte) (local15 >> 24);
		super.aByteArray93[super.anInt7338++] = (byte) (local15 >> 16);
		super.aByteArray93[super.anInt7338++] = (byte) (local15 >> 8);
		super.aByteArray93[super.anInt7338++] = (byte) local15;
	}
}
