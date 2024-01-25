import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public final class Class7_Sub20_Sub1 extends Class7_Sub20 {

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "Z")
	public boolean aBoolean256;

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
	public int anInt3465;

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "[B")
	public byte[] aByteArray50;

	@OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
	public int anInt3466;

	@OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
	public int anInt3467;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(I[BII)V")
	public Class7_Sub20_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3465 = arg0;
		this.aByteArray50 = arg1;
		this.anInt3466 = arg2;
		this.anInt3467 = arg3;
	}

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class7_Sub20_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3465 = arg0;
		this.aByteArray50 = arg1;
		this.anInt3466 = arg2;
		this.anInt3467 = arg3;
		this.aBoolean256 = arg4;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!fm;)Lclient!kf;")
	public Class7_Sub20_Sub1 method3185(@OriginalArg(0) Class76 arg0) {
		this.aByteArray50 = arg0.method1861(this.aByteArray50);
		this.anInt3465 = arg0.method1855(this.anInt3465);
		if (this.anInt3466 == this.anInt3467) {
			this.anInt3466 = this.anInt3467 = arg0.method1853(this.anInt3466);
		} else {
			this.anInt3466 = arg0.method1853(this.anInt3466);
			this.anInt3467 = arg0.method1853(this.anInt3467);
			if (this.anInt3466 == this.anInt3467) {
				this.anInt3466--;
			}
		}
		return this;
	}
}
