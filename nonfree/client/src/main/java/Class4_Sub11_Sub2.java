import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class4_Sub11_Sub2 extends Class4_Sub11 {

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(I)V")
	public Class4_Sub11_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IF)V")
	public void method3462(@OriginalArg(1) float arg0) {
		@Pc(2) int local2 = Float.floatToRawIntBits(arg0);
		this.aByteArray55[this.anInt3768++] = (byte) local2;
		this.aByteArray55[this.anInt3768++] = (byte) (local2 >> 8);
		this.aByteArray55[this.anInt3768++] = (byte) (local2 >> 16);
		this.aByteArray55[this.anInt3768++] = (byte) (local2 >> 24);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BF)V")
	public void method3463(@OriginalArg(1) float arg0) {
		@Pc(2) int local2 = Float.floatToRawIntBits(arg0);
		this.aByteArray55[this.anInt3768++] = (byte) (local2 >> 24);
		this.aByteArray55[this.anInt3768++] = (byte) (local2 >> 16);
		this.aByteArray55[this.anInt3768++] = (byte) (local2 >> 8);
		this.aByteArray55[this.anInt3768++] = (byte) local2;
	}
}
