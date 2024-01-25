import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class1_Sub5_Sub2 extends Class1_Sub5 {

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(I)V")
	public Class1_Sub5_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(FB)V")
	public void method5420(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray89[super.anInt6475++] = (byte) local6;
		super.aByteArray89[super.anInt6475++] = (byte) (local6 >> 8);
		super.aByteArray89[super.anInt6475++] = (byte) (local6 >> 16);
		super.aByteArray89[super.anInt6475++] = (byte) (local6 >> 24);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(FI)V")
	public void method5422(@OriginalArg(0) float arg0) {
		@Pc(10) int local10 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray89[super.anInt6475++] = (byte) (local10 >> 24);
		super.aByteArray89[super.anInt6475++] = (byte) (local10 >> 16);
		super.aByteArray89[super.anInt6475++] = (byte) (local10 >> 8);
		super.aByteArray89[super.anInt6475++] = (byte) local10;
	}
}
