import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public final class Class1_Sub20_Sub1 extends Class1_Sub20 {

	@OriginalMember(owner = "client!fv", name = "l", descriptor = "Z")
	public boolean aBoolean148;

	@OriginalMember(owner = "client!fv", name = "n", descriptor = "I")
	public int anInt2447;

	@OriginalMember(owner = "client!fv", name = "p", descriptor = "[B")
	public byte[] aByteArray46;

	@OriginalMember(owner = "client!fv", name = "m", descriptor = "I")
	public int anInt2446;

	@OriginalMember(owner = "client!fv", name = "o", descriptor = "I")
	public int anInt2448;

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub20_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2447 = arg0;
		this.aByteArray46 = arg1;
		this.anInt2446 = arg2;
		this.anInt2448 = arg3;
	}

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub20_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2447 = arg0;
		this.aByteArray46 = arg1;
		this.anInt2446 = arg2;
		this.anInt2448 = arg3;
		this.aBoolean148 = arg4;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lclient!nm;)Lclient!fv;")
	public Class1_Sub20_Sub1 method2170(@OriginalArg(0) Class173 arg0) {
		this.aByteArray46 = arg0.method3948(this.aByteArray46);
		this.anInt2447 = arg0.method3950(this.anInt2447);
		if (this.anInt2446 == this.anInt2448) {
			this.anInt2446 = this.anInt2448 = arg0.method3951(this.anInt2446);
		} else {
			this.anInt2446 = arg0.method3951(this.anInt2446);
			this.anInt2448 = arg0.method3951(this.anInt2448);
			if (this.anInt2446 == this.anInt2448) {
				this.anInt2446--;
			}
		}
		return this;
	}
}
