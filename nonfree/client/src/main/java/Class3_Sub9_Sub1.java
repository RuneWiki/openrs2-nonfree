import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bga")
public final class Class3_Sub9_Sub1 extends Class3_Sub9 {

	@OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(I)V")
	public Class3_Sub9_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(FI)V")
	public void method704(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray51[super.anInt6453++] = (byte) local6;
		super.aByteArray51[super.anInt6453++] = (byte) (local6 >> 8);
		super.aByteArray51[super.anInt6453++] = (byte) (local6 >> 16);
		super.aByteArray51[super.anInt6453++] = (byte) (local6 >> 24);
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(IF)V")
	public void method706(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray51[super.anInt6453++] = (byte) (local6 >> 24);
		super.aByteArray51[super.anInt6453++] = (byte) (local6 >> 16);
		super.aByteArray51[super.anInt6453++] = (byte) (local6 >> 8);
		super.aByteArray51[super.anInt6453++] = (byte) local6;
	}
}
