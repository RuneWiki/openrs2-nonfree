import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public final class Class2_Sub18_Sub1 extends Class2_Sub18 {

	@OriginalMember(owner = "client!nc", name = "s", descriptor = "Z")
	public boolean aBoolean124;

	@OriginalMember(owner = "client!nc", name = "t", descriptor = "I")
	public int anInt2664;

	@OriginalMember(owner = "client!nc", name = "u", descriptor = "[B")
	public byte[] aByteArray36;

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
	public int anInt2663;

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
	public int anInt2662;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub18_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2664 = arg0;
		this.aByteArray36 = arg1;
		this.anInt2663 = arg2;
		this.anInt2662 = arg3;
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class2_Sub18_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2664 = arg0;
		this.aByteArray36 = arg1;
		this.anInt2663 = arg2;
		this.anInt2662 = arg3;
		this.aBoolean124 = arg4;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!pf;)Lclient!nc;")
	public Class2_Sub18_Sub1 method1871(@OriginalArg(0) Class61 arg0) {
		this.aByteArray36 = arg0.method2075(this.aByteArray36);
		this.anInt2664 = arg0.method2072(this.anInt2664);
		if (this.anInt2663 == this.anInt2662) {
			this.anInt2663 = this.anInt2662 = arg0.method2076(this.anInt2663);
		} else {
			this.anInt2663 = arg0.method2076(this.anInt2663);
			this.anInt2662 = arg0.method2076(this.anInt2662);
			if (this.anInt2663 == this.anInt2662) {
				this.anInt2663--;
			}
		}
		return this;
	}
}
