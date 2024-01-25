import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class5_Sub22_Sub2 extends Class5_Sub22 {

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(I)V")
	public Class5_Sub22_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(FI)V")
	public void method5969(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray71[super.anInt6629++] = (byte) (local6 >> 24);
		super.aByteArray71[super.anInt6629++] = (byte) (local6 >> 16);
		super.aByteArray71[super.anInt6629++] = (byte) (local6 >> 8);
		super.aByteArray71[super.anInt6629++] = (byte) local6;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IF)V")
	public void method5970(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray71[super.anInt6629++] = (byte) local6;
		super.aByteArray71[super.anInt6629++] = (byte) (local6 >> 8);
		super.aByteArray71[super.anInt6629++] = (byte) (local6 >> 16);
		super.aByteArray71[super.anInt6629++] = (byte) (local6 >> 24);
	}
}
