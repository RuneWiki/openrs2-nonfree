import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public final class Class3_Sub42_Sub1 extends Class3_Sub42 {

	@OriginalMember(owner = "client!te", name = "k", descriptor = "Z")
	public boolean aBoolean589;

	@OriginalMember(owner = "client!te", name = "m", descriptor = "I")
	public int anInt8318;

	@OriginalMember(owner = "client!te", name = "o", descriptor = "[B")
	public byte[] aByteArray97;

	@OriginalMember(owner = "client!te", name = "l", descriptor = "I")
	public int anInt8317;

	@OriginalMember(owner = "client!te", name = "n", descriptor = "I")
	public int anInt8319;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(I[BII)V")
	public Class3_Sub42_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8318 = arg0;
		this.aByteArray97 = arg1;
		this.anInt8317 = arg2;
		this.anInt8319 = arg3;
	}

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class3_Sub42_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt8318 = arg0;
		this.aByteArray97 = arg1;
		this.anInt8317 = arg2;
		this.anInt8319 = arg3;
		this.aBoolean589 = arg4;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!sn;)Lclient!te;")
	public Class3_Sub42_Sub1 method6903(@OriginalArg(0) Class270 arg0) {
		this.aByteArray97 = arg0.method6779(this.aByteArray97);
		this.anInt8318 = arg0.method6782(this.anInt8318);
		if (this.anInt8317 == this.anInt8319) {
			this.anInt8317 = this.anInt8319 = arg0.method6780(this.anInt8317);
		} else {
			this.anInt8317 = arg0.method6780(this.anInt8317);
			this.anInt8319 = arg0.method6780(this.anInt8319);
			if (this.anInt8317 == this.anInt8319) {
				this.anInt8317--;
			}
		}
		return this;
	}
}
