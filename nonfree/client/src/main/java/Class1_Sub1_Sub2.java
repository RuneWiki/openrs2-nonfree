import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(I)V")
	public Class1_Sub1_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IF)V")
	public void method4148(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray66[super.anInt5056++] = (byte) local6;
		super.aByteArray66[super.anInt5056++] = (byte) (local6 >> 8);
		super.aByteArray66[super.anInt5056++] = (byte) (local6 >> 16);
		super.aByteArray66[super.anInt5056++] = (byte) (local6 >> 24);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(FB)V")
	public void method4149(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray66[super.anInt5056++] = (byte) (local6 >> 24);
		super.aByteArray66[super.anInt5056++] = (byte) (local6 >> 16);
		super.aByteArray66[super.anInt5056++] = (byte) (local6 >> 8);
		super.aByteArray66[super.anInt5056++] = (byte) local6;
	}
}
