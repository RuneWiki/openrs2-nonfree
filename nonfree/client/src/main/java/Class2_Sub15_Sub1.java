import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fw")
public final class Class2_Sub15_Sub1 extends Class2_Sub15 {

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(I)V")
	public Class2_Sub15_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(BF)V")
	public void method2573(@OriginalArg(1) float arg0) {
		@Pc(11) int local11 = Stream.floatToRawIntBits(arg0);
		super.aByteArray62[super.anInt5241++] = (byte) local11;
		super.aByteArray62[super.anInt5241++] = (byte) (local11 >> 8);
		super.aByteArray62[super.anInt5241++] = (byte) (local11 >> 16);
		super.aByteArray62[super.anInt5241++] = (byte) (local11 >> 24);
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(FI)V")
	public void method2575(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray62[super.anInt5241++] = (byte) (local6 >> 24);
		super.aByteArray62[super.anInt5241++] = (byte) (local6 >> 16);
		super.aByteArray62[super.anInt5241++] = (byte) (local6 >> 8);
		super.aByteArray62[super.anInt5241++] = (byte) local6;
	}
}
