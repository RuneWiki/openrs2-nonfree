import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class2_Sub17_Sub2 extends Class2_Sub17 {

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(I)V")
	public Class2_Sub17_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(FB)V")
	public void method2890(@OriginalArg(0) float arg0) {
		@Pc(10) int local10 = Stream.floatToRawIntBits(arg0);
		super.aByteArray26[super.anInt3378++] = (byte) (local10 >> 24);
		super.aByteArray26[super.anInt3378++] = (byte) (local10 >> 16);
		super.aByteArray26[super.anInt3378++] = (byte) (local10 >> 8);
		super.aByteArray26[super.anInt3378++] = (byte) local10;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IF)V")
	public void method2892(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray26[super.anInt3378++] = (byte) local6;
		super.aByteArray26[super.anInt3378++] = (byte) (local6 >> 8);
		super.aByteArray26[super.anInt3378++] = (byte) (local6 >> 16);
		super.aByteArray26[super.anInt3378++] = (byte) (local6 >> 24);
	}
}
