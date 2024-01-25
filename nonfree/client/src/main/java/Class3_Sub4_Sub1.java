import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class3_Sub4_Sub1 extends Class3_Sub4 {

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(I)V")
	public Class3_Sub4_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(FI)V")
	public void method382(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = Float.floatToRawIntBits(arg0);
		this.aByteArray70[this.anInt4268++] = (byte) (local2 >> 24);
		this.aByteArray70[this.anInt4268++] = (byte) (local2 >> 16);
		this.aByteArray70[this.anInt4268++] = (byte) (local2 >> 8);
		this.aByteArray70[this.anInt4268++] = (byte) local2;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IF)V")
	public void method383(@OriginalArg(1) float arg0) {
		@Pc(2) int local2 = Float.floatToRawIntBits(arg0);
		this.aByteArray70[this.anInt4268++] = (byte) local2;
		this.aByteArray70[this.anInt4268++] = (byte) (local2 >> 8);
		this.aByteArray70[this.anInt4268++] = (byte) (local2 >> 16);
		this.aByteArray70[this.anInt4268++] = (byte) (local2 >> 24);
	}
}
