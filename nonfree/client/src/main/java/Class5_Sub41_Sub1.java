import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qca")
public final class Class5_Sub41_Sub1 extends Class5_Sub41 {

	@OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(I)V")
	public Class5_Sub41_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(FI)V")
	public void method6768(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray93[super.anInt9230++] = (byte) local6;
		super.aByteArray93[super.anInt9230++] = (byte) (local6 >> 8);
		super.aByteArray93[super.anInt9230++] = (byte) (local6 >> 16);
		super.aByteArray93[super.anInt9230++] = (byte) (local6 >> 24);
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(BF)V")
	public void method6771(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray93[super.anInt9230++] = (byte) (local6 >> 24);
		super.aByteArray93[super.anInt9230++] = (byte) (local6 >> 16);
		super.aByteArray93[super.anInt9230++] = (byte) (local6 >> 8);
		super.aByteArray93[super.anInt9230++] = (byte) local6;
	}
}
