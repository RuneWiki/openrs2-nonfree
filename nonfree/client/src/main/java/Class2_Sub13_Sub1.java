import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class2_Sub13_Sub1 extends Class2_Sub13 {

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(I)V")
	public Class2_Sub13_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(FI)V")
	public void method1756(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = Float.floatToRawIntBits(arg0);
		this.aByteArray77[this.anInt4788++] = (byte) local2;
		this.aByteArray77[this.anInt4788++] = (byte) (local2 >> 8);
		this.aByteArray77[this.anInt4788++] = (byte) (local2 >> 16);
		this.aByteArray77[this.anInt4788++] = (byte) (local2 >> 24);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(FB)V")
	public void method1757(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Float.floatToRawIntBits(arg0);
		this.aByteArray77[this.anInt4788++] = (byte) (local6 >> 24);
		this.aByteArray77[this.anInt4788++] = (byte) (local6 >> 16);
		this.aByteArray77[this.anInt4788++] = (byte) (local6 >> 8);
		this.aByteArray77[this.anInt4788++] = (byte) local6;
	}
}
