import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class6_Sub1_Sub2 extends Class6_Sub1 {

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(I)V")
	public Class6_Sub1_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(FI)V")
	public void method6493(@OriginalArg(0) float arg0) {
		@Pc(10) int local10 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray96[super.anInt7898++] = (byte) (local10 >> 24);
		super.aByteArray96[super.anInt7898++] = (byte) (local10 >> 16);
		super.aByteArray96[super.anInt7898++] = (byte) (local10 >> 8);
		super.aByteArray96[super.anInt7898++] = (byte) local10;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(FZ)V")
	public void method6494(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray96[super.anInt7898++] = (byte) local6;
		super.aByteArray96[super.anInt7898++] = (byte) (local6 >> 8);
		super.aByteArray96[super.anInt7898++] = (byte) (local6 >> 16);
		super.aByteArray96[super.anInt7898++] = (byte) (local6 >> 24);
	}
}
