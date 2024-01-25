import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public final class Class1_Sub20_Sub1 extends Class1_Sub20 {

	@OriginalMember(owner = "client!ig", name = "p", descriptor = "Z")
	public boolean aBoolean206;

	@OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
	public int anInt2542;

	@OriginalMember(owner = "client!ig", name = "o", descriptor = "[B")
	public byte[] aByteArray23;

	@OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
	public int anInt2541;

	@OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
	public int anInt2543;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub20_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2542 = arg0;
		this.aByteArray23 = arg1;
		this.anInt2541 = arg2;
		this.anInt2543 = arg3;
	}

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub20_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2542 = arg0;
		this.aByteArray23 = arg1;
		this.anInt2541 = arg2;
		this.anInt2543 = arg3;
		this.aBoolean206 = arg4;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!tk;)Lclient!ig;")
	public Class1_Sub20_Sub1 method2073(@OriginalArg(0) Class194 arg0) {
		this.aByteArray23 = arg0.method5196(this.aByteArray23);
		this.anInt2542 = arg0.method5197(this.anInt2542);
		if (this.anInt2541 == this.anInt2543) {
			this.anInt2541 = this.anInt2543 = arg0.method5195(this.anInt2541);
		} else {
			this.anInt2541 = arg0.method5195(this.anInt2541);
			this.anInt2543 = arg0.method5195(this.anInt2543);
			if (this.anInt2541 == this.anInt2543) {
				this.anInt2541--;
			}
		}
		return this;
	}
}
