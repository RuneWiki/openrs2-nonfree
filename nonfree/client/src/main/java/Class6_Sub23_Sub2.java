import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class6_Sub23_Sub2 extends Class6_Sub23 {

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(I)V")
	public Class6_Sub23_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(FI)V")
	public void method8406(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray101[super.anInt9901++] = (byte) local6;
		super.aByteArray101[super.anInt9901++] = (byte) (local6 >> 8);
		super.aByteArray101[super.anInt9901++] = (byte) (local6 >> 16);
		super.aByteArray101[super.anInt9901++] = (byte) (local6 >> 24);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IF)V")
	public void method8407(@OriginalArg(1) float arg0) {
		@Pc(13) int local13 = Stream.floatToRawIntBits(arg0);
		super.aByteArray101[super.anInt9901++] = (byte) (local13 >> 24);
		super.aByteArray101[super.anInt9901++] = (byte) (local13 >> 16);
		super.aByteArray101[super.anInt9901++] = (byte) (local13 >> 8);
		super.aByteArray101[super.anInt9901++] = (byte) local13;
	}
}
