import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class2_Sub20_Sub1 extends Class2_Sub20 {

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(I)V")
	public Class2_Sub20_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(FI)V")
	public void method3563(@OriginalArg(0) float arg0) {
		@Pc(11) int local11 = Stream.floatToRawIntBits(arg0);
		super.aByteArray111[super.anInt9723++] = (byte) (local11 >> 24);
		super.aByteArray111[super.anInt9723++] = (byte) (local11 >> 16);
		super.aByteArray111[super.anInt9723++] = (byte) (local11 >> 8);
		super.aByteArray111[super.anInt9723++] = (byte) local11;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(FI)V")
	public void method3565(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray111[super.anInt9723++] = (byte) local6;
		super.aByteArray111[super.anInt9723++] = (byte) (local6 >> 8);
		super.aByteArray111[super.anInt9723++] = (byte) (local6 >> 16);
		super.aByteArray111[super.anInt9723++] = (byte) (local6 >> 24);
	}
}
