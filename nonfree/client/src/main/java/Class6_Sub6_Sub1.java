import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public final class Class6_Sub6_Sub1 extends Class6_Sub6 {

	@OriginalMember(owner = "client!qr", name = "q", descriptor = "Z")
	public boolean aBoolean507;

	@OriginalMember(owner = "client!qr", name = "o", descriptor = "I")
	public int anInt7691;

	@OriginalMember(owner = "client!qr", name = "n", descriptor = "[B")
	public byte[] aByteArray99;

	@OriginalMember(owner = "client!qr", name = "r", descriptor = "I")
	public int anInt7693;

	@OriginalMember(owner = "client!qr", name = "p", descriptor = "I")
	public int anInt7692;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(I[BII)V")
	public Class6_Sub6_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7691 = arg0;
		this.aByteArray99 = arg1;
		this.anInt7693 = arg2;
		this.anInt7692 = arg3;
	}

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class6_Sub6_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7691 = arg0;
		this.aByteArray99 = arg1;
		this.anInt7693 = arg2;
		this.anInt7692 = arg3;
		this.aBoolean507 = arg4;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!ew;)Lclient!qr;")
	public Class6_Sub6_Sub1 method6127(@OriginalArg(0) Class96 arg0) {
		this.aByteArray99 = arg0.method2273(this.aByteArray99);
		this.anInt7691 = arg0.method2276(this.anInt7691);
		if (this.anInt7693 == this.anInt7692) {
			this.anInt7693 = this.anInt7692 = arg0.method2275(this.anInt7693);
		} else {
			this.anInt7693 = arg0.method2275(this.anInt7693);
			this.anInt7692 = arg0.method2275(this.anInt7692);
			if (this.anInt7693 == this.anInt7692) {
				this.anInt7693--;
			}
		}
		return this;
	}
}
