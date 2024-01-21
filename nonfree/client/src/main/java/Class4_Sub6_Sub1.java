import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public final class Class4_Sub6_Sub1 extends Class4_Sub6 {

	@OriginalMember(owner = "client!pe", name = "v", descriptor = "Z")
	public boolean aBoolean131;

	@OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
	public int anInt2133;

	@OriginalMember(owner = "client!pe", name = "w", descriptor = "[B")
	public byte[] aByteArray46;

	@OriginalMember(owner = "client!pe", name = "t", descriptor = "I")
	public int anInt2132;

	@OriginalMember(owner = "client!pe", name = "x", descriptor = "I")
	public int anInt2134;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(I[BII)V")
	public Class4_Sub6_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2133 = arg0;
		this.aByteArray46 = arg1;
		this.anInt2132 = arg2;
		this.anInt2134 = arg3;
	}

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class4_Sub6_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2133 = arg0;
		this.aByteArray46 = arg1;
		this.anInt2132 = arg2;
		this.anInt2134 = arg3;
		this.aBoolean131 = arg4;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!vb;)Lclient!pe;")
	public Class4_Sub6_Sub1 method1489(@OriginalArg(0) Class77 arg0) {
		this.aByteArray46 = arg0.method1901(this.aByteArray46);
		this.anInt2133 = arg0.method1900(this.anInt2133);
		if (this.anInt2132 == this.anInt2134) {
			this.anInt2132 = this.anInt2134 = arg0.method1899(this.anInt2132);
		} else {
			this.anInt2132 = arg0.method1899(this.anInt2132);
			this.anInt2134 = arg0.method1899(this.anInt2134);
			if (this.anInt2132 == this.anInt2134) {
				this.anInt2132--;
			}
		}
		return this;
	}
}
