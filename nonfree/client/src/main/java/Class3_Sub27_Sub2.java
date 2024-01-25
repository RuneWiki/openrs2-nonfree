import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vw")
public final class Class3_Sub27_Sub2 extends Class3_Sub27 {

	@OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(I)V")
	public Class3_Sub27_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(FB)V")
	public void method7615(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray114[super.anInt9191++] = (byte) local6;
		super.aByteArray114[super.anInt9191++] = (byte) (local6 >> 8);
		super.aByteArray114[super.anInt9191++] = (byte) (local6 >> 16);
		super.aByteArray114[super.anInt9191++] = (byte) (local6 >> 24);
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(FI)V")
	public void method7616(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray114[super.anInt9191++] = (byte) (local6 >> 24);
		super.aByteArray114[super.anInt9191++] = (byte) (local6 >> 16);
		super.aByteArray114[super.anInt9191++] = (byte) (local6 >> 8);
		super.aByteArray114[super.anInt9191++] = (byte) local6;
	}
}
