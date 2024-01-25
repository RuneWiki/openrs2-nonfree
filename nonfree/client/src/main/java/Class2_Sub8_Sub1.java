import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bca")
public final class Class2_Sub8_Sub1 extends Class2_Sub8 {

	@OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(I)V")
	public Class2_Sub8_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(FZ)V")
	public void method788(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.lb[super.anInt5725++] = (byte) local6;
		super.lb[super.anInt5725++] = (byte) (local6 >> 8);
		super.lb[super.anInt5725++] = (byte) (local6 >> 16);
		super.lb[super.anInt5725++] = (byte) (local6 >> 24);
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(BF)V")
	public void method789(@OriginalArg(1) float arg0) {
		@Pc(11) int local11 = Stream.floatToRawIntBits(arg0);
		super.lb[super.anInt5725++] = (byte) (local11 >> 24);
		super.lb[super.anInt5725++] = (byte) (local11 >> 16);
		super.lb[super.anInt5725++] = (byte) (local11 >> 8);
		super.lb[super.anInt5725++] = (byte) local11;
	}
}
