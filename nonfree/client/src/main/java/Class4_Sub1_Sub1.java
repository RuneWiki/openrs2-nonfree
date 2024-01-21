import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public final class Class4_Sub1_Sub1 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "Z")
	public boolean aBoolean31;

	@OriginalMember(owner = "client!ge", name = "v", descriptor = "I")
	public int anInt1056;

	@OriginalMember(owner = "client!ge", name = "u", descriptor = "[B")
	public byte[] aByteArray46;

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "I")
	public int anInt1054;

	@OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
	public int anInt1055;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(I[BII)V")
	public Class4_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1056 = arg0;
		this.aByteArray46 = arg1;
		this.anInt1054 = arg2;
		this.anInt1055 = arg3;
	}

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class4_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt1056 = arg0;
		this.aByteArray46 = arg1;
		this.anInt1054 = arg2;
		this.anInt1055 = arg3;
		this.aBoolean31 = arg4;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!vc;)Lclient!ge;")
	public Class4_Sub1_Sub1 method707(@OriginalArg(0) Class77 arg0) {
		this.aByteArray46 = arg0.method2073(this.aByteArray46);
		this.anInt1056 = arg0.method2075(this.anInt1056);
		if (this.anInt1054 == this.anInt1055) {
			this.anInt1054 = this.anInt1055 = arg0.method2071(this.anInt1054);
		} else {
			this.anInt1054 = arg0.method2071(this.anInt1054);
			this.anInt1055 = arg0.method2071(this.anInt1055);
			if (this.anInt1054 == this.anInt1055) {
				this.anInt1054--;
			}
		}
		return this;
	}
}
