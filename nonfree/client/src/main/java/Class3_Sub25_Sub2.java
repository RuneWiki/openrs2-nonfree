import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class3_Sub25_Sub2 extends Class3_Sub25 {

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(I)V")
	public Class3_Sub25_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IF)V")
	public void method8652(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray106[super.anInt9765++] = (byte) (local6 >> 24);
		super.aByteArray106[super.anInt9765++] = (byte) (local6 >> 16);
		super.aByteArray106[super.anInt9765++] = (byte) (local6 >> 8);
		super.aByteArray106[super.anInt9765++] = (byte) local6;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(IF)V")
	public void method8653(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray106[super.anInt9765++] = (byte) local6;
		super.aByteArray106[super.anInt9765++] = (byte) (local6 >> 8);
		super.aByteArray106[super.anInt9765++] = (byte) (local6 >> 16);
		super.aByteArray106[super.anInt9765++] = (byte) (local6 >> 24);
	}
}
