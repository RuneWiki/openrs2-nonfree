import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public final class Class3_Sub4_Sub1_Sub2 extends Class3_Sub4_Sub1 {

	@OriginalMember(owner = "client!pj", name = "M", descriptor = "B")
	public byte aByte23;

	@OriginalMember(owner = "client!pj", name = "N", descriptor = "Lclient!ug;")
	public Class3_Sub26 aClass3_Sub26_5;

	@OriginalMember(owner = "client!pj", name = "T", descriptor = "I")
	public int anInt4217;

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(Z)I")
	@Override
	public int method3534() {
		return this.aClass3_Sub26_5 == null ? 0 : this.aClass3_Sub26_5.anInt4615 * 100 / (this.aClass3_Sub26_5.aByteArray64.length - this.aByte23);
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(B)[B")
	@Override
	public byte[] method3528() {
		if (this.aBoolean297 || this.aClass3_Sub26_5.aByteArray64.length - this.aByte23 > this.aClass3_Sub26_5.anInt4615) {
			throw new RuntimeException();
		}
		return this.aClass3_Sub26_5.aByteArray64;
	}
}
