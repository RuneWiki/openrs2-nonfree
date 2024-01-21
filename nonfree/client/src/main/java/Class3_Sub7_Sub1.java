import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public final class Class3_Sub7_Sub1 extends Class3_Sub7 {

	@OriginalMember(owner = "client!vb", name = "A", descriptor = "I")
	public int anInt2690;

	@OriginalMember(owner = "client!vb", name = "z", descriptor = "[B")
	public byte[] aByteArray23;

	@OriginalMember(owner = "client!vb", name = "E", descriptor = "I")
	public int anInt2692;

	@OriginalMember(owner = "client!vb", name = "C", descriptor = "I")
	public int anInt2691;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(I[BII)V")
	public Class3_Sub7_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2690 = arg0;
		this.aByteArray23 = arg1;
		this.anInt2692 = arg2;
		this.anInt2691 = arg3;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!oe;)Lclient!vb;")
	public Class3_Sub7_Sub1 method1851(@OriginalArg(0) Class47 arg0) {
		this.aByteArray23 = arg0.method1511(this.aByteArray23);
		this.anInt2690 = arg0.method1512(this.anInt2690);
		if (this.anInt2692 == this.anInt2691) {
			this.anInt2692 = this.anInt2691 = arg0.method1509(this.anInt2692);
		} else {
			this.anInt2692 = arg0.method1509(this.anInt2692);
			this.anInt2691 = arg0.method1509(this.anInt2691);
			if (this.anInt2692 == this.anInt2691) {
				this.anInt2692--;
			}
		}
		return this;
	}
}
