import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jv")
public final class Class5_Sub3_Sub2 extends Class5_Sub3 {

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(I)V")
	public Class5_Sub3_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IF)V")
	public void method4235(@OriginalArg(1) float arg0) {
		@Pc(10) int local10 = Stream.floatToRawIntBits(arg0);
		super.aByteArray66[super.anInt4960++] = (byte) local10;
		super.aByteArray66[super.anInt4960++] = (byte) (local10 >> 8);
		super.aByteArray66[super.anInt4960++] = (byte) (local10 >> 16);
		super.aByteArray66[super.anInt4960++] = (byte) (local10 >> 24);
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(FI)V")
	public void method4236(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray66[super.anInt4960++] = (byte) (local6 >> 24);
		super.aByteArray66[super.anInt4960++] = (byte) (local6 >> 16);
		super.aByteArray66[super.anInt4960++] = (byte) (local6 >> 8);
		super.aByteArray66[super.anInt4960++] = (byte) local6;
	}
}
