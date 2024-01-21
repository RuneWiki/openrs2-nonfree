import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public final class Class3_Sub13_Sub1 extends Class3_Sub13 {

	@OriginalMember(owner = "client!le", name = "x", descriptor = "Z")
	public boolean aBoolean130;

	@OriginalMember(owner = "client!le", name = "w", descriptor = "I")
	public int anInt2597;

	@OriginalMember(owner = "client!le", name = "v", descriptor = "[B")
	public byte[] aByteArray32;

	@OriginalMember(owner = "client!le", name = "t", descriptor = "I")
	public int anInt2595;

	@OriginalMember(owner = "client!le", name = "u", descriptor = "I")
	public int anInt2596;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(I[BII)V")
	public Class3_Sub13_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2597 = arg0;
		this.aByteArray32 = arg1;
		this.anInt2595 = arg2;
		this.anInt2596 = arg3;
	}

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class3_Sub13_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2597 = arg0;
		this.aByteArray32 = arg1;
		this.anInt2595 = arg2;
		this.anInt2596 = arg3;
		this.aBoolean130 = arg4;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!w;)Lclient!le;")
	public Class3_Sub13_Sub1 method2062(@OriginalArg(0) Class83 arg0) {
		this.aByteArray32 = arg0.method3147(this.aByteArray32);
		this.anInt2597 = arg0.method3143(this.anInt2597);
		if (this.anInt2595 == this.anInt2596) {
			this.anInt2595 = this.anInt2596 = arg0.method3140(this.anInt2595);
		} else {
			this.anInt2595 = arg0.method3140(this.anInt2595);
			this.anInt2596 = arg0.method3140(this.anInt2596);
			if (this.anInt2595 == this.anInt2596) {
				this.anInt2595--;
			}
		}
		return this;
	}
}
