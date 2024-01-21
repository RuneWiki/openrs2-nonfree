import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public final class Class3_Sub9_Sub1 extends Class3_Sub9 {

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "Z")
	public boolean aBoolean169;

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
	public int anInt3892;

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "[B")
	public byte[] aByteArray48;

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
	public int anInt3890;

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
	public int anInt3891;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(I[BII)V")
	public Class3_Sub9_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3892 = arg0;
		this.aByteArray48 = arg1;
		this.anInt3890 = arg2;
		this.anInt3891 = arg3;
	}

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class3_Sub9_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3892 = arg0;
		this.aByteArray48 = arg1;
		this.anInt3890 = arg2;
		this.anInt3891 = arg3;
		this.aBoolean169 = arg4;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!jc;)Lclient!wc;")
	public Class3_Sub9_Sub1 method2837(@OriginalArg(0) Class41 arg0) {
		this.aByteArray48 = arg0.method1250(this.aByteArray48);
		this.anInt3892 = arg0.method1245(this.anInt3892);
		if (this.anInt3890 == this.anInt3891) {
			this.anInt3890 = this.anInt3891 = arg0.method1244(this.anInt3890);
		} else {
			this.anInt3890 = arg0.method1244(this.anInt3890);
			this.anInt3891 = arg0.method1244(this.anInt3891);
			if (this.anInt3890 == this.anInt3891) {
				this.anInt3890--;
			}
		}
		return this;
	}
}
