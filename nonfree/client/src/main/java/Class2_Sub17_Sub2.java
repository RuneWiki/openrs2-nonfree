import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class2_Sub17_Sub2 extends Class2_Sub17 {

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(I)V")
	public Class2_Sub17_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(FI)V")
	public void method6175(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray94[super.anInt7523++] = (byte) (local6 >> 24);
		super.aByteArray94[super.anInt7523++] = (byte) (local6 >> 16);
		super.aByteArray94[super.anInt7523++] = (byte) (local6 >> 8);
		super.aByteArray94[super.anInt7523++] = (byte) local6;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(FZ)V")
	public void method6179(@OriginalArg(0) float arg0) {
		@Pc(10) int local10 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray94[super.anInt7523++] = (byte) local10;
		super.aByteArray94[super.anInt7523++] = (byte) (local10 >> 8);
		super.aByteArray94[super.anInt7523++] = (byte) (local10 >> 16);
		super.aByteArray94[super.anInt7523++] = (byte) (local10 >> 24);
	}
}
