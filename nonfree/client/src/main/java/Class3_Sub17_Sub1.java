import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public final class Class3_Sub17_Sub1 extends Class3_Sub17 {

	@OriginalMember(owner = "client!qr", name = "u", descriptor = "Z")
	public boolean aBoolean547;

	@OriginalMember(owner = "client!qr", name = "r", descriptor = "I")
	public int anInt7874;

	@OriginalMember(owner = "client!qr", name = "t", descriptor = "[B")
	public byte[] aByteArray195;

	@OriginalMember(owner = "client!qr", name = "s", descriptor = "I")
	public int anInt7875;

	@OriginalMember(owner = "client!qr", name = "v", descriptor = "I")
	public int anInt7876;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(I[BII)V")
	public Class3_Sub17_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7874 = arg0;
		this.aByteArray195 = arg1;
		this.anInt7875 = arg2;
		this.anInt7876 = arg3;
	}

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class3_Sub17_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7874 = arg0;
		this.aByteArray195 = arg1;
		this.anInt7875 = arg2;
		this.anInt7876 = arg3;
		this.aBoolean547 = arg4;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!cm;)Lclient!qr;")
	public Class3_Sub17_Sub1 method6183(@OriginalArg(0) Class59 arg0) {
		this.aByteArray195 = arg0.method1721(this.aByteArray195);
		this.anInt7874 = arg0.method1724(this.anInt7874);
		if (this.anInt7875 == this.anInt7876) {
			this.anInt7875 = this.anInt7876 = arg0.method1722(this.anInt7875);
		} else {
			this.anInt7875 = arg0.method1722(this.anInt7875);
			this.anInt7876 = arg0.method1722(this.anInt7876);
			if (this.anInt7875 == this.anInt7876) {
				this.anInt7875--;
			}
		}
		return this;
	}
}
