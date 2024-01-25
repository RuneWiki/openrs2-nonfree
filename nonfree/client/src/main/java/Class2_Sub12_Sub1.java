import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class2_Sub12_Sub1 extends Class2_Sub12 {

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(I)V")
	public Class2_Sub12_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IF)V")
	public void method3093(@OriginalArg(1) float arg0) {
		@Pc(9) int local9 = Float.floatToRawIntBits(arg0);
		this.aByteArray30[this.anInt3606++] = (byte) local9;
		this.aByteArray30[this.anInt3606++] = (byte) (local9 >> 8);
		this.aByteArray30[this.anInt3606++] = (byte) (local9 >> 16);
		this.aByteArray30[this.anInt3606++] = (byte) (local9 >> 24);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(FI)V")
	public void method3094(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = Float.floatToRawIntBits(arg0);
		this.aByteArray30[this.anInt3606++] = (byte) (local2 >> 24);
		this.aByteArray30[this.anInt3606++] = (byte) (local2 >> 16);
		this.aByteArray30[this.anInt3606++] = (byte) (local2 >> 8);
		this.aByteArray30[this.anInt3606++] = (byte) local2;
	}
}
