import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public final class Class2_Sub5_Sub1 extends Class2_Sub5 {

	@OriginalMember(owner = "client!ar", name = "r", descriptor = "Z")
	public boolean aBoolean23;

	@OriginalMember(owner = "client!ar", name = "q", descriptor = "I")
	public int anInt300;

	@OriginalMember(owner = "client!ar", name = "o", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!ar", name = "s", descriptor = "I")
	public int anInt301;

	@OriginalMember(owner = "client!ar", name = "p", descriptor = "I")
	public int anInt299;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt300 = arg0;
		this.aByteArray4 = arg1;
		this.anInt301 = arg2;
		this.anInt299 = arg3;
	}

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class2_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt300 = arg0;
		this.aByteArray4 = arg1;
		this.anInt301 = arg2;
		this.anInt299 = arg3;
		this.aBoolean23 = arg4;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!gp;)Lclient!ar;")
	public Class2_Sub5_Sub1 method267(@OriginalArg(0) Class83 arg0) {
		this.aByteArray4 = arg0.method2240(this.aByteArray4);
		this.anInt300 = arg0.method2239(this.anInt300);
		if (this.anInt301 == this.anInt299) {
			this.anInt301 = this.anInt299 = arg0.method2242(this.anInt301);
		} else {
			this.anInt301 = arg0.method2242(this.anInt301);
			this.anInt299 = arg0.method2242(this.anInt299);
			if (this.anInt301 == this.anInt299) {
				this.anInt301--;
			}
		}
		return this;
	}
}
