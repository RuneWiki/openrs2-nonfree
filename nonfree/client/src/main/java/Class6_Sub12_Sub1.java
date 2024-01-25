import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public final class Class6_Sub12_Sub1 extends Class6_Sub12 {

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "Z")
	public boolean aBoolean706;

	@OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
	public int anInt9543;

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "[B")
	public byte[] aByteArray124;

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
	public int anInt9542;

	@OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
	public int anInt9544;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(I[BII)V")
	public Class6_Sub12_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9543 = arg0;
		this.aByteArray124 = arg1;
		this.anInt9542 = arg2;
		this.anInt9544 = arg3;
	}

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class6_Sub12_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt9543 = arg0;
		this.aByteArray124 = arg1;
		this.anInt9542 = arg2;
		this.anInt9544 = arg3;
		this.aBoolean706 = arg4;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!ifa;)Lclient!wb;")
	public Class6_Sub12_Sub1 method7958(@OriginalArg(0) Class151 arg0) {
		this.aByteArray124 = arg0.method3994(this.aByteArray124);
		this.anInt9543 = arg0.method3998(this.anInt9543);
		if (this.anInt9542 == this.anInt9544) {
			this.anInt9542 = this.anInt9544 = arg0.method3996(this.anInt9542);
		} else {
			this.anInt9542 = arg0.method3996(this.anInt9542);
			this.anInt9544 = arg0.method3996(this.anInt9544);
			if (this.anInt9542 == this.anInt9544) {
				this.anInt9542--;
			}
		}
		return this;
	}
}
