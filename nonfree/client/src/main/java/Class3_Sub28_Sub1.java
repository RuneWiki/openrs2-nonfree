import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public final class Class3_Sub28_Sub1 extends Class3_Sub28 {

	@OriginalMember(owner = "client!jp", name = "n", descriptor = "Z")
	public boolean aBoolean272;

	@OriginalMember(owner = "client!jp", name = "m", descriptor = "I")
	public int anInt3569;

	@OriginalMember(owner = "client!jp", name = "l", descriptor = "[B")
	public byte[] aByteArray70;

	@OriginalMember(owner = "client!jp", name = "k", descriptor = "I")
	public int anInt3568;

	@OriginalMember(owner = "client!jp", name = "o", descriptor = "I")
	public int anInt3570;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(I[BII)V")
	public Class3_Sub28_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3569 = arg0;
		this.aByteArray70 = arg1;
		this.anInt3568 = arg2;
		this.anInt3570 = arg3;
	}

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class3_Sub28_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3569 = arg0;
		this.aByteArray70 = arg1;
		this.anInt3568 = arg2;
		this.anInt3570 = arg3;
		this.aBoolean272 = arg4;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!nm;)Lclient!jp;")
	public Class3_Sub28_Sub1 method3073(@OriginalArg(0) Class164 arg0) {
		this.aByteArray70 = arg0.method3852(this.aByteArray70);
		this.anInt3569 = arg0.method3850(this.anInt3569);
		if (this.anInt3568 == this.anInt3570) {
			this.anInt3568 = this.anInt3570 = arg0.method3857(this.anInt3568);
		} else {
			this.anInt3568 = arg0.method3857(this.anInt3568);
			this.anInt3570 = arg0.method3857(this.anInt3570);
			if (this.anInt3568 == this.anInt3570) {
				this.anInt3568--;
			}
		}
		return this;
	}
}
