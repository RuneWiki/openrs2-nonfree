import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public final class Class3_Sub2_Sub1 extends Class3_Sub2 {

	@OriginalMember(owner = "client!tc", name = "t", descriptor = "Z")
	public boolean aBoolean104;

	@OriginalMember(owner = "client!tc", name = "u", descriptor = "I")
	public int anInt2454;

	@OriginalMember(owner = "client!tc", name = "r", descriptor = "[B")
	public byte[] aByteArray52;

	@OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
	public int anInt2452;

	@OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
	public int anInt2453;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(I[BII)V")
	public Class3_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2454 = arg0;
		this.aByteArray52 = arg1;
		this.anInt2452 = arg2;
		this.anInt2453 = arg3;
	}

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class3_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2454 = arg0;
		this.aByteArray52 = arg1;
		this.anInt2452 = arg2;
		this.anInt2453 = arg3;
		this.aBoolean104 = arg4;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!cd;)Lclient!tc;")
	public Class3_Sub2_Sub1 method1717(@OriginalArg(0) Class14 arg0) {
		this.aByteArray52 = arg0.method221(this.aByteArray52);
		this.anInt2454 = arg0.method222(this.anInt2454);
		if (this.anInt2452 == this.anInt2453) {
			this.anInt2452 = this.anInt2453 = arg0.method220(this.anInt2452);
		} else {
			this.anInt2452 = arg0.method220(this.anInt2452);
			this.anInt2453 = arg0.method220(this.anInt2453);
			if (this.anInt2452 == this.anInt2453) {
				this.anInt2452--;
			}
		}
		return this;
	}
}
