import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class14_Sub4_Sub1 extends Class14_Sub4 {

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(I)V")
	public Class14_Sub4_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BF)V")
	public void method646(@OriginalArg(1) float arg0) {
		@Pc(2) int local2 = Float.floatToRawIntBits(arg0);
		this.aByteArray74[this.anInt2637++] = (byte) (local2 >> 24);
		this.aByteArray74[this.anInt2637++] = (byte) (local2 >> 16);
		this.aByteArray74[this.anInt2637++] = (byte) (local2 >> 8);
		this.aByteArray74[this.anInt2637++] = (byte) local2;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(FB)V")
	public void method647(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = Float.floatToRawIntBits(arg0);
		this.aByteArray74[this.anInt2637++] = (byte) local2;
		this.aByteArray74[this.anInt2637++] = (byte) (local2 >> 8);
		this.aByteArray74[this.anInt2637++] = (byte) (local2 >> 16);
		this.aByteArray74[this.anInt2637++] = (byte) (local2 >> 24);
	}
}
