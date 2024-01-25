import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public final class Class4_Sub16_Sub1 extends Class4_Sub16 {

	@OriginalMember(owner = "client!ep", name = "m", descriptor = "Z")
	public boolean aBoolean207;

	@OriginalMember(owner = "client!ep", name = "l", descriptor = "I")
	public int anInt2744;

	@OriginalMember(owner = "client!ep", name = "k", descriptor = "[B")
	public byte[] aByteArray27;

	@OriginalMember(owner = "client!ep", name = "n", descriptor = "I")
	public int anInt2745;

	@OriginalMember(owner = "client!ep", name = "o", descriptor = "I")
	public int anInt2746;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(I[BII)V")
	public Class4_Sub16_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2744 = arg0;
		this.aByteArray27 = arg1;
		this.anInt2745 = arg2;
		this.anInt2746 = arg3;
	}

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class4_Sub16_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2744 = arg0;
		this.aByteArray27 = arg1;
		this.anInt2745 = arg2;
		this.anInt2746 = arg3;
		this.aBoolean207 = arg4;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!pf;)Lclient!ep;")
	public Class4_Sub16_Sub1 method2544(@OriginalArg(0) Class260 arg0) {
		this.aByteArray27 = arg0.method6287(this.aByteArray27);
		this.anInt2744 = arg0.method6289(this.anInt2744);
		if (this.anInt2745 == this.anInt2746) {
			this.anInt2745 = this.anInt2746 = arg0.method6288(this.anInt2745);
		} else {
			this.anInt2745 = arg0.method6288(this.anInt2745);
			this.anInt2746 = arg0.method6288(this.anInt2746);
			if (this.anInt2745 == this.anInt2746) {
				this.anInt2745--;
			}
		}
		return this;
	}
}
