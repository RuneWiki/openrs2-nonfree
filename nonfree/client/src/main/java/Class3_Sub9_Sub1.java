import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public final class Class3_Sub9_Sub1 extends Class3_Sub9 {

	@OriginalMember(owner = "client!ta", name = "L", descriptor = "I")
	public int anInt2418;

	@OriginalMember(owner = "client!ta", name = "J", descriptor = "[B")
	public byte[] aByteArray21;

	@OriginalMember(owner = "client!ta", name = "K", descriptor = "I")
	public int anInt2417;

	@OriginalMember(owner = "client!ta", name = "I", descriptor = "I")
	public int anInt2416;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(I[BII)V")
	public Class3_Sub9_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2418 = arg0;
		this.aByteArray21 = arg1;
		this.anInt2417 = arg2;
		this.anInt2416 = arg3;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!oe;)Lclient!ta;")
	public Class3_Sub9_Sub1 method1612(@OriginalArg(0) Class57 arg0) {
		this.aByteArray21 = arg0.method1224(this.aByteArray21);
		this.anInt2418 = arg0.method1226(this.anInt2418);
		if (this.anInt2417 == this.anInt2416) {
			this.anInt2417 = this.anInt2416 = arg0.method1223(this.anInt2417);
		} else {
			this.anInt2417 = arg0.method1223(this.anInt2417);
			this.anInt2416 = arg0.method1223(this.anInt2416);
			if (this.anInt2417 == this.anInt2416) {
				this.anInt2417--;
			}
		}
		return this;
	}
}
