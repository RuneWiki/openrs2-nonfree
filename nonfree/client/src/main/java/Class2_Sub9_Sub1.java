import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public final class Class2_Sub9_Sub1 extends Class2_Sub9 {

	@OriginalMember(owner = "client!id", name = "v", descriptor = "Z")
	public boolean aBoolean179;

	@OriginalMember(owner = "client!id", name = "u", descriptor = "I")
	public int anInt2254;

	@OriginalMember(owner = "client!id", name = "w", descriptor = "[B")
	public byte[] aByteArray22;

	@OriginalMember(owner = "client!id", name = "y", descriptor = "I")
	public int anInt2256;

	@OriginalMember(owner = "client!id", name = "x", descriptor = "I")
	public int anInt2255;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub9_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2254 = arg0;
		this.aByteArray22 = arg1;
		this.anInt2256 = arg2;
		this.anInt2255 = arg3;
	}

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class2_Sub9_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2254 = arg0;
		this.aByteArray22 = arg1;
		this.anInt2256 = arg2;
		this.anInt2255 = arg3;
		this.aBoolean179 = arg4;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!ak;)Lclient!id;")
	public Class2_Sub9_Sub1 method1941(@OriginalArg(0) Class9 arg0) {
		this.aByteArray22 = arg0.method249(this.aByteArray22);
		this.anInt2254 = arg0.method250(this.anInt2254);
		if (this.anInt2256 == this.anInt2255) {
			this.anInt2256 = this.anInt2255 = arg0.method253(this.anInt2256);
		} else {
			this.anInt2256 = arg0.method253(this.anInt2256);
			this.anInt2255 = arg0.method253(this.anInt2255);
			if (this.anInt2256 == this.anInt2255) {
				this.anInt2256--;
			}
		}
		return this;
	}
}
