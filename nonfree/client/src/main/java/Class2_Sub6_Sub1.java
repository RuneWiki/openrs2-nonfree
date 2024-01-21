import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public final class Class2_Sub6_Sub1 extends Class2_Sub6 {

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "Z")
	public boolean aBoolean33;

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
	public int anInt610;

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
	public int anInt609;

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
	public int anInt608;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub6_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt610 = arg0;
		this.aByteArray5 = arg1;
		this.anInt609 = arg2;
		this.anInt608 = arg3;
	}

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class2_Sub6_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt610 = arg0;
		this.aByteArray5 = arg1;
		this.anInt609 = arg2;
		this.anInt608 = arg3;
		this.aBoolean33 = arg4;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!sb;)Lclient!cb;")
	public Class2_Sub6_Sub1 method451(@OriginalArg(0) Class88 arg0) {
		this.aByteArray5 = arg0.method2660(this.aByteArray5);
		this.anInt610 = arg0.method2658(this.anInt610);
		if (this.anInt609 == this.anInt608) {
			this.anInt609 = this.anInt608 = arg0.method2659(this.anInt609);
		} else {
			this.anInt609 = arg0.method2659(this.anInt609);
			this.anInt608 = arg0.method2659(this.anInt608);
			if (this.anInt609 == this.anInt608) {
				this.anInt609--;
			}
		}
		return this;
	}
}
