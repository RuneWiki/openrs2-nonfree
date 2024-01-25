import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class1_Sub7_Sub2 extends Class1_Sub7 {

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(I)V")
	public Class1_Sub7_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(FI)V")
	public void method3151(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Float.floatToRawIntBits(arg0);
		this.aByteArray58[this.anInt3368++] = (byte) local6;
		this.aByteArray58[this.anInt3368++] = (byte) (local6 >> 8);
		this.aByteArray58[this.anInt3368++] = (byte) (local6 >> 16);
		this.aByteArray58[this.anInt3368++] = (byte) (local6 >> 24);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IF)V")
	public void method3152(@OriginalArg(1) float arg0) {
		@Pc(2) int local2 = Float.floatToRawIntBits(arg0);
		this.aByteArray58[this.anInt3368++] = (byte) (local2 >> 24);
		this.aByteArray58[this.anInt3368++] = (byte) (local2 >> 16);
		this.aByteArray58[this.anInt3368++] = (byte) (local2 >> 8);
		this.aByteArray58[this.anInt3368++] = (byte) local2;
	}
}
