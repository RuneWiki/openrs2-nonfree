import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public final class Class3_Sub24_Sub1 extends Class3_Sub24 {

	@OriginalMember(owner = "client!tb", name = "u", descriptor = "Z")
	public boolean aBoolean167;

	@OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
	public int anInt3687;

	@OriginalMember(owner = "client!tb", name = "s", descriptor = "[B")
	public byte[] aByteArray47;

	@OriginalMember(owner = "client!tb", name = "r", descriptor = "I")
	public int anInt3686;

	@OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
	public int anInt3685;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(I[BII)V")
	public Class3_Sub24_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3687 = arg0;
		this.aByteArray47 = arg1;
		this.anInt3686 = arg2;
		this.anInt3685 = arg3;
	}

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class3_Sub24_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3687 = arg0;
		this.aByteArray47 = arg1;
		this.anInt3686 = arg2;
		this.anInt3685 = arg3;
		this.aBoolean167 = arg4;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!li;)Lclient!tb;")
	public Class3_Sub24_Sub1 method2831(@OriginalArg(0) Class58 arg0) {
		this.aByteArray47 = arg0.method1750(this.aByteArray47);
		this.anInt3687 = arg0.method1749(this.anInt3687);
		if (this.anInt3686 == this.anInt3685) {
			this.anInt3686 = this.anInt3685 = arg0.method1753(this.anInt3686);
		} else {
			this.anInt3686 = arg0.method1753(this.anInt3686);
			this.anInt3685 = arg0.method1753(this.anInt3685);
			if (this.anInt3686 == this.anInt3685) {
				this.anInt3686--;
			}
		}
		return this;
	}
}
