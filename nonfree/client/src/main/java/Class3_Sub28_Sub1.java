import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class3_Sub28_Sub1 extends Class3_Sub28 {

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(I)V")
	public Class3_Sub28_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZF)V")
	public void method4573(@OriginalArg(1) float arg0) {
		@Pc(11) int local11 = Stream.floatToRawIntBits(arg0);
		super.aByteArray50[super.anInt6241++] = (byte) (local11 >> 24);
		super.aByteArray50[super.anInt6241++] = (byte) (local11 >> 16);
		super.aByteArray50[super.anInt6241++] = (byte) (local11 >> 8);
		super.aByteArray50[super.anInt6241++] = (byte) local11;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(FI)V")
	public void method4574(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray50[super.anInt6241++] = (byte) local6;
		super.aByteArray50[super.anInt6241++] = (byte) (local6 >> 8);
		super.aByteArray50[super.anInt6241++] = (byte) (local6 >> 16);
		super.aByteArray50[super.anInt6241++] = (byte) (local6 >> 24);
	}
}
