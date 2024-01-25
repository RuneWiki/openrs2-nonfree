import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nga")
public final class Class14_Sub29_Sub2 extends Class14_Sub29 {

	@OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(I)V")
	public Class14_Sub29_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(FB)V")
	public void method5908(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray84[super.anInt7264++] = (byte) (local6 >> 24);
		super.aByteArray84[super.anInt7264++] = (byte) (local6 >> 16);
		super.aByteArray84[super.anInt7264++] = (byte) (local6 >> 8);
		super.aByteArray84[super.anInt7264++] = (byte) local6;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(FZ)V")
	public void method5911(@OriginalArg(0) float arg0) {
		@Pc(10) int local10 = Stream.floatToRawIntBits(arg0);
		super.aByteArray84[super.anInt7264++] = (byte) local10;
		super.aByteArray84[super.anInt7264++] = (byte) (local10 >> 8);
		super.aByteArray84[super.anInt7264++] = (byte) (local10 >> 16);
		super.aByteArray84[super.anInt7264++] = (byte) (local10 >> 24);
	}
}
