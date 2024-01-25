import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class3_Sub15_Sub2 extends Class3_Sub15 {

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(I)V")
	public Class3_Sub15_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(FZ)V")
	public void method8469(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray106[super.anInt10282++] = (byte) (local6 >> 24);
		super.aByteArray106[super.anInt10282++] = (byte) (local6 >> 16);
		super.aByteArray106[super.anInt10282++] = (byte) (local6 >> 8);
		super.aByteArray106[super.anInt10282++] = (byte) local6;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(FI)V")
	public void method8470(@OriginalArg(0) float arg0) {
		@Pc(11) int local11 = Stream.floatToRawIntBits(arg0);
		super.aByteArray106[super.anInt10282++] = (byte) local11;
		super.aByteArray106[super.anInt10282++] = (byte) (local11 >> 8);
		super.aByteArray106[super.anInt10282++] = (byte) (local11 >> 16);
		super.aByteArray106[super.anInt10282++] = (byte) (local11 >> 24);
	}
}
