import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class2_Sub24_Sub1 extends Class2_Sub24 {

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(I)V")
	public Class2_Sub24_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZF)V")
	public void method3241(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Float.floatToRawIntBits(arg0);
		this.aByteArray100[this.anInt6669++] = (byte) local6;
		this.aByteArray100[this.anInt6669++] = (byte) (local6 >> 8);
		this.aByteArray100[this.anInt6669++] = (byte) (local6 >> 16);
		this.aByteArray100[this.anInt6669++] = (byte) (local6 >> 24);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(FI)V")
	public void method3242(@OriginalArg(0) float arg0) {
		@Pc(9) int local9 = Float.floatToRawIntBits(arg0);
		this.aByteArray100[this.anInt6669++] = (byte) (local9 >> 24);
		this.aByteArray100[this.anInt6669++] = (byte) (local9 >> 16);
		this.aByteArray100[this.anInt6669++] = (byte) (local9 >> 8);
		this.aByteArray100[this.anInt6669++] = (byte) local9;
	}
}
