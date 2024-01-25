import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public final class Class3_Sub20_Sub1 extends Class3_Sub20 {

	@OriginalMember(owner = "client!ee", name = "o", descriptor = "Z")
	public boolean aBoolean212;

	@OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
	public int anInt2622;

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "[B")
	public byte[] aByteArray23;

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
	public int anInt2620;

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
	public int anInt2621;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(I[BII)V")
	public Class3_Sub20_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2622 = arg0;
		this.aByteArray23 = arg1;
		this.anInt2620 = arg2;
		this.anInt2621 = arg3;
	}

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class3_Sub20_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2622 = arg0;
		this.aByteArray23 = arg1;
		this.anInt2620 = arg2;
		this.anInt2621 = arg3;
		this.aBoolean212 = arg4;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!it;)Lclient!ee;")
	public Class3_Sub20_Sub1 method2362(@OriginalArg(0) Class154 arg0) {
		this.aByteArray23 = arg0.method3924(this.aByteArray23);
		this.anInt2622 = arg0.method3925(this.anInt2622);
		if (this.anInt2620 == this.anInt2621) {
			this.anInt2620 = this.anInt2621 = arg0.method3923(this.anInt2620);
		} else {
			this.anInt2620 = arg0.method3923(this.anInt2620);
			this.anInt2621 = arg0.method3923(this.anInt2621);
			if (this.anInt2620 == this.anInt2621) {
				this.anInt2620--;
			}
		}
		return this;
	}
}
