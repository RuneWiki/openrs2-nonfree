import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public final class Class4_Sub9_Sub2 extends Class4_Sub9 {

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(I)V")
	public Class4_Sub9_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IF)V")
	public void method6030(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray97[super.anInt7219++] = (byte) local6;
		super.aByteArray97[super.anInt7219++] = (byte) (local6 >> 8);
		super.aByteArray97[super.anInt7219++] = (byte) (local6 >> 16);
		super.aByteArray97[super.anInt7219++] = (byte) (local6 >> 24);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(FI)V")
	public void method6031(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray97[super.anInt7219++] = (byte) (local6 >> 24);
		super.aByteArray97[super.anInt7219++] = (byte) (local6 >> 16);
		super.aByteArray97[super.anInt7219++] = (byte) (local6 >> 8);
		super.aByteArray97[super.anInt7219++] = (byte) local6;
	}
}
