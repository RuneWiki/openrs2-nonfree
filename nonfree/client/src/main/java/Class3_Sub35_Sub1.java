import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public final class Class3_Sub35_Sub1 extends Class3_Sub35 {

	@OriginalMember(owner = "client!ks", name = "o", descriptor = "Z")
	public boolean aBoolean393;

	@OriginalMember(owner = "client!ks", name = "s", descriptor = "I")
	public int anInt5396;

	@OriginalMember(owner = "client!ks", name = "p", descriptor = "[B")
	public byte[] aByteArray56;

	@OriginalMember(owner = "client!ks", name = "r", descriptor = "I")
	public int anInt5395;

	@OriginalMember(owner = "client!ks", name = "q", descriptor = "I")
	public int anInt5394;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(I[BII)V")
	public Class3_Sub35_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5396 = arg0;
		this.aByteArray56 = arg1;
		this.anInt5395 = arg2;
		this.anInt5394 = arg3;
	}

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class3_Sub35_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5396 = arg0;
		this.aByteArray56 = arg1;
		this.anInt5395 = arg2;
		this.anInt5394 = arg3;
		this.aBoolean393 = arg4;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!mn;)Lclient!ks;")
	public Class3_Sub35_Sub1 method4937(@OriginalArg(0) Class225 arg0) {
		this.aByteArray56 = arg0.method5476(this.aByteArray56);
		this.anInt5396 = arg0.method5475(this.anInt5396);
		if (this.anInt5395 == this.anInt5394) {
			this.anInt5395 = this.anInt5394 = arg0.method5477(this.anInt5395);
		} else {
			this.anInt5395 = arg0.method5477(this.anInt5395);
			this.anInt5394 = arg0.method5477(this.anInt5394);
			if (this.anInt5395 == this.anInt5394) {
				this.anInt5395--;
			}
		}
		return this;
	}
}
