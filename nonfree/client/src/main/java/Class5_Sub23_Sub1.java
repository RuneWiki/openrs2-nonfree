import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class5_Sub23_Sub1 extends Class5_Sub23 {

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(I)V")
	public Class5_Sub23_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(FB)V")
	public void method4302(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray102[super.anInt9869++] = (byte) (local6 >> 24);
		super.aByteArray102[super.anInt9869++] = (byte) (local6 >> 16);
		super.aByteArray102[super.anInt9869++] = (byte) (local6 >> 8);
		super.aByteArray102[super.anInt9869++] = (byte) local6;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IF)V")
	public void method4304(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray102[super.anInt9869++] = (byte) local6;
		super.aByteArray102[super.anInt9869++] = (byte) (local6 >> 8);
		super.aByteArray102[super.anInt9869++] = (byte) (local6 >> 16);
		super.aByteArray102[super.anInt9869++] = (byte) (local6 >> 24);
	}
}
