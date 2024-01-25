import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dv")
public final class Class2_Sub13_Sub1 extends Class2_Sub13 {

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(I)V")
	public Class2_Sub13_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IF)V")
	public void method1353(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray52[super.anInt4347++] = (byte) (local6 >> 24);
		super.aByteArray52[super.anInt4347++] = (byte) (local6 >> 16);
		super.aByteArray52[super.anInt4347++] = (byte) (local6 >> 8);
		super.aByteArray52[super.anInt4347++] = (byte) local6;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(FI)V")
	public void method1354(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray52[super.anInt4347++] = (byte) local6;
		super.aByteArray52[super.anInt4347++] = (byte) (local6 >> 8);
		super.aByteArray52[super.anInt4347++] = (byte) (local6 >> 16);
		super.aByteArray52[super.anInt4347++] = (byte) (local6 >> 24);
	}
}
