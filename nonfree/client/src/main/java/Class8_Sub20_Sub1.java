import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public final class Class8_Sub20_Sub1 extends Class8_Sub20 {

	@OriginalMember(owner = "client!rk", name = "s", descriptor = "Z")
	public boolean aBoolean378;

	@OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
	public int anInt4698;

	@OriginalMember(owner = "client!rk", name = "q", descriptor = "[B")
	public byte[] aByteArray47;

	@OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
	public int anInt4699;

	@OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
	public int anInt4700;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(I[BII)V")
	public Class8_Sub20_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4698 = arg0;
		this.aByteArray47 = arg1;
		this.anInt4699 = arg2;
		this.anInt4700 = arg3;
	}

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class8_Sub20_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4698 = arg0;
		this.aByteArray47 = arg1;
		this.anInt4699 = arg2;
		this.anInt4700 = arg3;
		this.aBoolean378 = arg4;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!hm;)Lclient!rk;")
	public Class8_Sub20_Sub1 method3542(@OriginalArg(0) Class75 arg0) {
		this.aByteArray47 = arg0.method1709(this.aByteArray47);
		this.anInt4698 = arg0.method1710(this.anInt4698);
		if (this.anInt4699 == this.anInt4700) {
			this.anInt4699 = this.anInt4700 = arg0.method1707(this.anInt4699);
		} else {
			this.anInt4699 = arg0.method1707(this.anInt4699);
			this.anInt4700 = arg0.method1707(this.anInt4700);
			if (this.anInt4699 == this.anInt4700) {
				this.anInt4699--;
			}
		}
		return this;
	}
}
