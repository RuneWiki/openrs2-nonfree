import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
public final class Class1_Sub3_Sub2 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(I)V")
	public Class1_Sub3_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(FI)V")
	public void method1228(@OriginalArg(0) float arg0) {
		@Pc(11) int local11 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray14[super.anInt1710++] = (byte) (local11 >> 24);
		super.aByteArray14[super.anInt1710++] = (byte) (local11 >> 16);
		super.aByteArray14[super.anInt1710++] = (byte) (local11 >> 8);
		super.aByteArray14[super.anInt1710++] = (byte) local11;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(FB)V")
	public void method1232(@OriginalArg(0) float arg0) {
		@Pc(10) int local10 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray14[super.anInt1710++] = (byte) local10;
		super.aByteArray14[super.anInt1710++] = (byte) (local10 >> 8);
		super.aByteArray14[super.anInt1710++] = (byte) (local10 >> 16);
		super.aByteArray14[super.anInt1710++] = (byte) (local10 >> 24);
	}
}
