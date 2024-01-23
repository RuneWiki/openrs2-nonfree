import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public final class Class1_Sub15_Sub1 extends Class1_Sub15 {

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "Z")
	public boolean aBoolean148;

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
	public int anInt3458;

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "[B")
	public byte[] aByteArray49;

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "I")
	public int anInt3460;

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
	public int anInt3459;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub15_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3458 = arg0;
		this.aByteArray49 = arg1;
		this.anInt3460 = arg2;
		this.anInt3459 = arg3;
	}

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub15_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3458 = arg0;
		this.aByteArray49 = arg1;
		this.anInt3460 = arg2;
		this.anInt3459 = arg3;
		this.aBoolean148 = arg4;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!b;)Lclient!qa;")
	public Class1_Sub15_Sub1 method2791(@OriginalArg(0) Class8 arg0) {
		this.aByteArray49 = arg0.method185(this.aByteArray49);
		this.anInt3458 = arg0.method184(this.anInt3458);
		if (this.anInt3460 == this.anInt3459) {
			this.anInt3460 = this.anInt3459 = arg0.method186(this.anInt3460);
		} else {
			this.anInt3460 = arg0.method186(this.anInt3460);
			this.anInt3459 = arg0.method186(this.anInt3459);
			if (this.anInt3460 == this.anInt3459) {
				this.anInt3460--;
			}
		}
		return this;
	}
}
