import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public final class Class3_Sub10_Sub1_Sub1 extends Class3_Sub10_Sub1 {

	@OriginalMember(owner = "client!bm", name = "u", descriptor = "I")
	public int anInt988;

	@OriginalMember(owner = "client!bm", name = "w", descriptor = "B")
	public byte aByte5;

	@OriginalMember(owner = "client!bm", name = "x", descriptor = "Lclient!rt;")
	public Class3_Sub27 aClass3_Sub27_1;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)I")
	@Override
	public int method4926() {
		return this.aClass3_Sub27_1 == null ? 0 : this.aClass3_Sub27_1.anInt9191 * 100 / (this.aClass3_Sub27_1.aByteArray114.length - this.aByte5);
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)[B")
	@Override
	public byte[] method4927() {
		if (super.aBoolean382 || this.aClass3_Sub27_1.anInt9191 < this.aClass3_Sub27_1.aByteArray114.length - this.aByte5) {
			throw new RuntimeException();
		}
		return this.aClass3_Sub27_1.aByteArray114;
	}
}
