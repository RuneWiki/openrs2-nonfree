import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class3_Sub7_Sub2 extends Class3_Sub7 {

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(I)V")
	public Class3_Sub7_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(FI)V")
	public void method6560(@OriginalArg(0) float arg0) {
		@Pc(10) int local10 = Stream.floatToRawIntBits(arg0);
		super.aByteArray86[super.anInt7869++] = (byte) local10;
		super.aByteArray86[super.anInt7869++] = (byte) (local10 >> 8);
		super.aByteArray86[super.anInt7869++] = (byte) (local10 >> 16);
		super.aByteArray86[super.anInt7869++] = (byte) (local10 >> 24);
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(FI)V")
	public void method6561(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray86[super.anInt7869++] = (byte) (local6 >> 24);
		super.aByteArray86[super.anInt7869++] = (byte) (local6 >> 16);
		super.aByteArray86[super.anInt7869++] = (byte) (local6 >> 8);
		super.aByteArray86[super.anInt7869++] = (byte) local6;
	}
}
