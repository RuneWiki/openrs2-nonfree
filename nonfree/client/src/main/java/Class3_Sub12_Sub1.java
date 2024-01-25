import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public final class Class3_Sub12_Sub1 extends Class3_Sub12 {

	@OriginalMember(owner = "client!rea", name = "l", descriptor = "Z")
	public boolean aBoolean641;

	@OriginalMember(owner = "client!rea", name = "m", descriptor = "I")
	public int anInt8565;

	@OriginalMember(owner = "client!rea", name = "j", descriptor = "[B")
	public byte[] aByteArray94;

	@OriginalMember(owner = "client!rea", name = "n", descriptor = "I")
	public int anInt8566;

	@OriginalMember(owner = "client!rea", name = "k", descriptor = "I")
	public int anInt8564;

	@OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(I[BII)V")
	public Class3_Sub12_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8565 = arg0;
		this.aByteArray94 = arg1;
		this.anInt8566 = arg2;
		this.anInt8564 = arg3;
	}

	@OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class3_Sub12_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt8565 = arg0;
		this.aByteArray94 = arg1;
		this.anInt8566 = arg2;
		this.anInt8564 = arg3;
		this.aBoolean641 = arg4;
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(Lclient!td;)Lclient!rea;")
	public Class3_Sub12_Sub1 method7244(@OriginalArg(0) Class334 arg0) {
		this.aByteArray94 = arg0.method7686(this.aByteArray94);
		this.anInt8565 = arg0.method7684(this.anInt8565);
		if (this.anInt8566 == this.anInt8564) {
			this.anInt8566 = this.anInt8564 = arg0.method7683(this.anInt8566);
		} else {
			this.anInt8566 = arg0.method7683(this.anInt8566);
			this.anInt8564 = arg0.method7683(this.anInt8564);
			if (this.anInt8566 == this.anInt8564) {
				this.anInt8566--;
			}
		}
		return this;
	}
}
