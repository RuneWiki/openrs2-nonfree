import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class2_Sub11_Sub1 extends Class2_Sub11 {

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(I)V")
	public Class2_Sub11_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IF)V")
	public void method3861(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray128[super.anInt10066++] = (byte) local6;
		super.aByteArray128[super.anInt10066++] = (byte) (local6 >> 8);
		super.aByteArray128[super.anInt10066++] = (byte) (local6 >> 16);
		super.aByteArray128[super.anInt10066++] = (byte) (local6 >> 24);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(FB)V")
	public void method3862(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray128[super.anInt10066++] = (byte) (local6 >> 24);
		super.aByteArray128[super.anInt10066++] = (byte) (local6 >> 16);
		super.aByteArray128[super.anInt10066++] = (byte) (local6 >> 8);
		super.aByteArray128[super.anInt10066++] = (byte) local6;
	}
}
