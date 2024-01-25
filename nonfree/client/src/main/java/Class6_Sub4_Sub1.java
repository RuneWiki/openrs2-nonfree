import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public final class Class6_Sub4_Sub1 extends Class6_Sub4 {

	@OriginalMember(owner = "client!gu", name = "n", descriptor = "Z")
	public boolean aBoolean184;

	@OriginalMember(owner = "client!gu", name = "l", descriptor = "I")
	public int anInt2442;

	@OriginalMember(owner = "client!gu", name = "k", descriptor = "[B")
	public byte[] aByteArray34;

	@OriginalMember(owner = "client!gu", name = "o", descriptor = "I")
	public int anInt2444;

	@OriginalMember(owner = "client!gu", name = "m", descriptor = "I")
	public int anInt2443;

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(I[BII)V")
	public Class6_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2442 = arg0;
		this.aByteArray34 = arg1;
		this.anInt2444 = arg2;
		this.anInt2443 = arg3;
	}

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class6_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2442 = arg0;
		this.aByteArray34 = arg1;
		this.anInt2444 = arg2;
		this.anInt2443 = arg3;
		this.aBoolean184 = arg4;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lclient!r;)Lclient!gu;")
	public Class6_Sub4_Sub1 method2221(@OriginalArg(0) Class213 arg0) {
		this.aByteArray34 = arg0.method4781(this.aByteArray34);
		this.anInt2442 = arg0.method4782(this.anInt2442);
		if (this.anInt2444 == this.anInt2443) {
			this.anInt2444 = this.anInt2443 = arg0.method4778(this.anInt2444);
		} else {
			this.anInt2444 = arg0.method4778(this.anInt2444);
			this.anInt2443 = arg0.method4778(this.anInt2443);
			if (this.anInt2444 == this.anInt2443) {
				this.anInt2444--;
			}
		}
		return this;
	}
}
