import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class5_Sub15_Sub1 extends Class5_Sub15 {

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(I)V")
	public Class5_Sub15_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZF)V")
	public void method4831(@OriginalArg(1) float arg0) {
		@Pc(11) int local11 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray93[super.anInt7013++] = (byte) (local11 >> 24);
		super.aByteArray93[super.anInt7013++] = (byte) (local11 >> 16);
		super.aByteArray93[super.anInt7013++] = (byte) (local11 >> 8);
		super.aByteArray93[super.anInt7013++] = (byte) local11;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(FI)V")
	public void method4833(@OriginalArg(0) float arg0) {
		@Pc(9) int local9 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray93[super.anInt7013++] = (byte) local9;
		super.aByteArray93[super.anInt7013++] = (byte) (local9 >> 8);
		super.aByteArray93[super.anInt7013++] = (byte) (local9 >> 16);
		super.aByteArray93[super.anInt7013++] = (byte) (local9 >> 24);
	}
}
