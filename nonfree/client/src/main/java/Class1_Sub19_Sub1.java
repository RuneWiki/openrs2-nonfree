import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class1_Sub19_Sub1 extends Class1_Sub19 {

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(I)V")
	public Class1_Sub19_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IF)V")
	public void method2063(@OriginalArg(1) float arg0) {
		@Pc(15) int local15 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray38[super.anInt3698++] = (byte) local15;
		super.aByteArray38[super.anInt3698++] = (byte) (local15 >> 8);
		super.aByteArray38[super.anInt3698++] = (byte) (local15 >> 16);
		super.aByteArray38[super.anInt3698++] = (byte) (local15 >> 24);
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(IF)V")
	public void method2067(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray38[super.anInt3698++] = (byte) (local6 >> 24);
		super.aByteArray38[super.anInt3698++] = (byte) (local6 >> 16);
		super.aByteArray38[super.anInt3698++] = (byte) (local6 >> 8);
		super.aByteArray38[super.anInt3698++] = (byte) local6;
	}
}
