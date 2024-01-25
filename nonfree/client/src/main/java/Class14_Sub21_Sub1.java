import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class14_Sub21_Sub1 extends Class14_Sub21 {

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(I)V")
	public Class14_Sub21_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(FB)V")
	public void method7246(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray99[super.anInt8936++] = (byte) (local6 >> 24);
		super.aByteArray99[super.anInt8936++] = (byte) (local6 >> 16);
		super.aByteArray99[super.anInt8936++] = (byte) (local6 >> 8);
		super.aByteArray99[super.anInt8936++] = (byte) local6;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(FI)V")
	public void method7248(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray99[super.anInt8936++] = (byte) local6;
		super.aByteArray99[super.anInt8936++] = (byte) (local6 >> 8);
		super.aByteArray99[super.anInt8936++] = (byte) (local6 >> 16);
		super.aByteArray99[super.anInt8936++] = (byte) (local6 >> 24);
	}
}
