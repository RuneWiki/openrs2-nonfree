import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public final class Class4_Sub6_Sub1 extends Class4_Sub6 {

	@OriginalMember(owner = "client!re", name = "r", descriptor = "Z")
	public boolean aBoolean85;

	@OriginalMember(owner = "client!re", name = "q", descriptor = "I")
	public int anInt2326;

	@OriginalMember(owner = "client!re", name = "o", descriptor = "[B")
	public byte[] aByteArray36;

	@OriginalMember(owner = "client!re", name = "s", descriptor = "I")
	public int anInt2327;

	@OriginalMember(owner = "client!re", name = "p", descriptor = "I")
	public int anInt2325;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(I[BII)V")
	public Class4_Sub6_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2326 = arg0;
		this.aByteArray36 = arg1;
		this.anInt2327 = arg2;
		this.anInt2325 = arg3;
	}

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class4_Sub6_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2326 = arg0;
		this.aByteArray36 = arg1;
		this.anInt2327 = arg2;
		this.anInt2325 = arg3;
		this.aBoolean85 = arg4;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!pb;)Lclient!re;")
	public Class4_Sub6_Sub1 method1638(@OriginalArg(0) Class63 arg0) {
		this.aByteArray36 = arg0.method1377(this.aByteArray36);
		this.anInt2326 = arg0.method1373(this.anInt2326);
		if (this.anInt2327 == this.anInt2325) {
			this.anInt2327 = this.anInt2325 = arg0.method1374(this.anInt2327);
		} else {
			this.anInt2327 = arg0.method1374(this.anInt2327);
			this.anInt2325 = arg0.method1374(this.anInt2325);
			if (this.anInt2327 == this.anInt2325) {
				this.anInt2327--;
			}
		}
		return this;
	}
}
