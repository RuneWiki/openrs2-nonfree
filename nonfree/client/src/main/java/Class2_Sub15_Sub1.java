import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public final class Class2_Sub15_Sub1 extends Class2_Sub15 {

	@OriginalMember(owner = "client!qq", name = "s", descriptor = "Z")
	public boolean aBoolean379;

	@OriginalMember(owner = "client!qq", name = "r", descriptor = "I")
	public int anInt4953;

	@OriginalMember(owner = "client!qq", name = "v", descriptor = "[B")
	public byte[] aByteArray99;

	@OriginalMember(owner = "client!qq", name = "t", descriptor = "I")
	public int anInt4954;

	@OriginalMember(owner = "client!qq", name = "u", descriptor = "I")
	public int anInt4955;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub15_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4953 = arg0;
		this.aByteArray99 = arg1;
		this.anInt4954 = arg2;
		this.anInt4955 = arg3;
	}

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class2_Sub15_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4953 = arg0;
		this.aByteArray99 = arg1;
		this.anInt4954 = arg2;
		this.anInt4955 = arg3;
		this.aBoolean379 = arg4;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!th;)Lclient!qq;")
	public Class2_Sub15_Sub1 method4338(@OriginalArg(0) Class223 arg0) {
		this.aByteArray99 = arg0.method4855(this.aByteArray99);
		this.anInt4953 = arg0.method4854(this.anInt4953);
		if (this.anInt4954 == this.anInt4955) {
			this.anInt4954 = this.anInt4955 = arg0.method4857(this.anInt4954);
		} else {
			this.anInt4954 = arg0.method4857(this.anInt4954);
			this.anInt4955 = arg0.method4857(this.anInt4955);
			if (this.anInt4954 == this.anInt4955) {
				this.anInt4954--;
			}
		}
		return this;
	}
}
