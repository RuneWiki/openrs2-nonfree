import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public final class Class2_Sub8_Sub1 extends Class2_Sub8 {

	@OriginalMember(owner = "client!qa", name = "z", descriptor = "I")
	public int anInt2289;

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "[B")
	public byte[] aByteArray19;

	@OriginalMember(owner = "client!qa", name = "y", descriptor = "I")
	public int anInt2288;

	@OriginalMember(owner = "client!qa", name = "x", descriptor = "I")
	public int anInt2287;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub8_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2289 = arg0;
		this.aByteArray19 = arg1;
		this.anInt2288 = arg2;
		this.anInt2287 = arg3;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!v;)Lclient!qa;")
	public Class2_Sub8_Sub1 method1622(@OriginalArg(0) Class61 arg0) {
		this.aByteArray19 = arg0.method1960(this.aByteArray19);
		this.anInt2289 = arg0.method1962(this.anInt2289);
		if (this.anInt2288 == this.anInt2287) {
			this.anInt2288 = this.anInt2287 = arg0.method1961(this.anInt2288);
		} else {
			this.anInt2288 = arg0.method1961(this.anInt2288);
			this.anInt2287 = arg0.method1961(this.anInt2287);
			if (this.anInt2288 == this.anInt2287) {
				this.anInt2288--;
			}
		}
		return this;
	}
}
