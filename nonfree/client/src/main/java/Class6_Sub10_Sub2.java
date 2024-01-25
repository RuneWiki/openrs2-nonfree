import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class6_Sub10_Sub2 extends Class6_Sub10 {

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(I)V")
	public Class6_Sub10_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(BF)V")
	public void method4026(@OriginalArg(1) float arg0) {
		@Pc(2) int local2 = Float.floatToRawIntBits(arg0);
		this.aByteArray67[this.anInt4188++] = (byte) (local2 >> 24);
		this.aByteArray67[this.anInt4188++] = (byte) (local2 >> 16);
		this.aByteArray67[this.anInt4188++] = (byte) (local2 >> 8);
		this.aByteArray67[this.anInt4188++] = (byte) local2;
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(BF)V")
	public void method4027(@OriginalArg(1) float arg0) {
		@Pc(2) int local2 = Float.floatToRawIntBits(arg0);
		this.aByteArray67[this.anInt4188++] = (byte) local2;
		this.aByteArray67[this.anInt4188++] = (byte) (local2 >> 8);
		this.aByteArray67[this.anInt4188++] = (byte) (local2 >> 16);
		this.aByteArray67[this.anInt4188++] = (byte) (local2 >> 24);
	}
}
