import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iw")
public final class Class3_Sub17_Sub1 extends Class3_Sub17 {

	@OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(I)V")
	public Class3_Sub17_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(FZ)V")
	public void method4226(@OriginalArg(0) float arg0) {
		@Pc(11) int local11 = Stream.floatToRawIntBits(arg0);
		super.aByteArray59[super.lb++] = (byte) (local11 >> 24);
		super.aByteArray59[super.lb++] = (byte) (local11 >> 16);
		super.aByteArray59[super.lb++] = (byte) (local11 >> 8);
		super.aByteArray59[super.lb++] = (byte) local11;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IF)V")
	public void method4229(@OriginalArg(1) float arg0) {
		@Pc(16) int local16 = Stream.floatToRawIntBits(arg0);
		super.aByteArray59[super.lb++] = (byte) local16;
		super.aByteArray59[super.lb++] = (byte) (local16 >> 8);
		super.aByteArray59[super.lb++] = (byte) (local16 >> 16);
		super.aByteArray59[super.lb++] = (byte) (local16 >> 24);
	}
}
