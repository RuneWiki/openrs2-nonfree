import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fca")
public final class Class6_Sub15_Sub2 extends Class6_Sub15 {

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(I)V")
	public Class6_Sub15_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(FZ)V")
	public void method3052(@OriginalArg(0) float arg0) {
		@Pc(11) int local11 = Stream.floatToRawIntBits(arg0);
		super.aByteArray20[super.anInt3174++] = (byte) (local11 >> 24);
		super.aByteArray20[super.anInt3174++] = (byte) (local11 >> 16);
		super.aByteArray20[super.anInt3174++] = (byte) (local11 >> 8);
		super.aByteArray20[super.anInt3174++] = (byte) local11;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IF)V")
	public void method3055(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray20[super.anInt3174++] = (byte) local6;
		super.aByteArray20[super.anInt3174++] = (byte) (local6 >> 8);
		super.aByteArray20[super.anInt3174++] = (byte) (local6 >> 16);
		super.aByteArray20[super.anInt3174++] = (byte) (local6 >> 24);
	}
}
