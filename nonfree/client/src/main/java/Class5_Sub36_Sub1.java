import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mka")
public final class Class5_Sub36_Sub1 extends Class5_Sub36 {

	@OriginalMember(owner = "client!mka", name = "<init>", descriptor = "(I)V")
	public Class5_Sub36_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!mka", name = "a", descriptor = "(FZ)V")
	public void method5494(@OriginalArg(0) float arg0) {
		@Pc(14) int local14 = Stream.floatToRawIntBits(arg0);
		super.aByteArray89[super.anInt8456++] = (byte) (local14 >> 24);
		super.aByteArray89[super.anInt8456++] = (byte) (local14 >> 16);
		super.aByteArray89[super.anInt8456++] = (byte) (local14 >> 8);
		super.aByteArray89[super.anInt8456++] = (byte) local14;
	}

	@OriginalMember(owner = "client!mka", name = "a", descriptor = "(IF)V")
	public void method5496(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray89[super.anInt8456++] = (byte) local6;
		super.aByteArray89[super.anInt8456++] = (byte) (local6 >> 8);
		super.aByteArray89[super.anInt8456++] = (byte) (local6 >> 16);
		super.aByteArray89[super.anInt8456++] = (byte) (local6 >> 24);
	}
}
