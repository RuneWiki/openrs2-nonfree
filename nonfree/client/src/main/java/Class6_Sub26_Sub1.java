import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class6_Sub26_Sub1 extends Class6_Sub26 {

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(I)V")
	public Class6_Sub26_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IF)V")
	public void method4360(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray65[super.anInt5769++] = (byte) local6;
		super.aByteArray65[super.anInt5769++] = (byte) (local6 >> 8);
		super.aByteArray65[super.anInt5769++] = (byte) (local6 >> 16);
		super.aByteArray65[super.anInt5769++] = (byte) (local6 >> 24);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(FB)V")
	public void method4361(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray65[super.anInt5769++] = (byte) (local6 >> 24);
		super.aByteArray65[super.anInt5769++] = (byte) (local6 >> 16);
		super.aByteArray65[super.anInt5769++] = (byte) (local6 >> 8);
		super.aByteArray65[super.anInt5769++] = (byte) local6;
	}
}
