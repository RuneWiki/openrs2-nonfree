import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class1_Sub14_Sub1 extends Class1_Sub14 {

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(I)V")
	public Class1_Sub14_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(FB)V")
	public void method1406(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray65[super.anInt5695++] = (byte) local6;
		super.aByteArray65[super.anInt5695++] = (byte) (local6 >> 8);
		super.aByteArray65[super.anInt5695++] = (byte) (local6 >> 16);
		super.aByteArray65[super.anInt5695++] = (byte) (local6 >> 24);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IF)V")
	public void method1407(@OriginalArg(1) float arg0) {
		@Pc(10) int local10 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray65[super.anInt5695++] = (byte) (local10 >> 24);
		super.aByteArray65[super.anInt5695++] = (byte) (local10 >> 16);
		super.aByteArray65[super.anInt5695++] = (byte) (local10 >> 8);
		super.aByteArray65[super.anInt5695++] = (byte) local10;
	}
}
