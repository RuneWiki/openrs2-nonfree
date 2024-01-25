import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aw")
public final class Class1_Sub6_Sub1 extends Class1_Sub6 {

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(I)V")
	public Class1_Sub6_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(FI)V")
	public void method724(@OriginalArg(0) float arg0) {
		@Pc(13) int local13 = Stream.floatToRawIntBits(arg0);
		super.aByteArray66[super.anInt4555++] = (byte) local13;
		super.aByteArray66[super.anInt4555++] = (byte) (local13 >> 8);
		super.aByteArray66[super.anInt4555++] = (byte) (local13 >> 16);
		super.aByteArray66[super.anInt4555++] = (byte) (local13 >> 24);
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IF)V")
	public void method726(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray66[super.anInt4555++] = (byte) (local6 >> 24);
		super.aByteArray66[super.anInt4555++] = (byte) (local6 >> 16);
		super.aByteArray66[super.anInt4555++] = (byte) (local6 >> 8);
		super.aByteArray66[super.anInt4555++] = (byte) local6;
	}
}
