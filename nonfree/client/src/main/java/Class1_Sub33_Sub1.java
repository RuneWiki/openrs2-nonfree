import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class1_Sub33_Sub1 extends Class1_Sub33 {

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(I)V")
	public Class1_Sub33_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(FB)V")
	public void method3827(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = Float.floatToRawIntBits(arg0);
		this.aByteArray86[this.lb++] = (byte) local2;
		this.aByteArray86[this.lb++] = (byte) (local2 >> 8);
		this.aByteArray86[this.lb++] = (byte) (local2 >> 16);
		this.aByteArray86[this.lb++] = (byte) (local2 >> 24);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BF)V")
	public void method3828(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Float.floatToRawIntBits(arg0);
		this.aByteArray86[this.lb++] = (byte) (local6 >> 24);
		this.aByteArray86[this.lb++] = (byte) (local6 >> 16);
		this.aByteArray86[this.lb++] = (byte) (local6 >> 8);
		this.aByteArray86[this.lb++] = (byte) local6;
	}
}
