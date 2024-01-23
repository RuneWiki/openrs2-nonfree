import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public final class Class1_Sub11_Sub1 extends Class1_Sub11 {

	@OriginalMember(owner = "client!h", name = "r", descriptor = "Z")
	public boolean aBoolean144;

	@OriginalMember(owner = "client!h", name = "t", descriptor = "I")
	public int anInt2189;

	@OriginalMember(owner = "client!h", name = "s", descriptor = "[B")
	public byte[] aByteArray51;

	@OriginalMember(owner = "client!h", name = "q", descriptor = "I")
	public int anInt2188;

	@OriginalMember(owner = "client!h", name = "p", descriptor = "I")
	public int anInt2187;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub11_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2189 = arg0;
		this.aByteArray51 = arg1;
		this.anInt2188 = arg2;
		this.anInt2187 = arg3;
	}

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub11_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2189 = arg0;
		this.aByteArray51 = arg1;
		this.anInt2188 = arg2;
		this.anInt2187 = arg3;
		this.aBoolean144 = arg4;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!bi;)Lclient!h;")
	public Class1_Sub11_Sub1 method1619(@OriginalArg(0) Class19 arg0) {
		this.aByteArray51 = arg0.method428(this.aByteArray51);
		this.anInt2189 = arg0.method427(this.anInt2189);
		if (this.anInt2188 == this.anInt2187) {
			this.anInt2188 = this.anInt2187 = arg0.method429(this.anInt2188);
		} else {
			this.anInt2188 = arg0.method429(this.anInt2188);
			this.anInt2187 = arg0.method429(this.anInt2187);
			if (this.anInt2188 == this.anInt2187) {
				this.anInt2188--;
			}
		}
		return this;
	}
}
