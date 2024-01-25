import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public final class Class14_Sub19_Sub1 extends Class14_Sub19 {

	@OriginalMember(owner = "client!pd", name = "o", descriptor = "Z")
	public boolean aBoolean539;

	@OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
	public int anInt7680;

	@OriginalMember(owner = "client!pd", name = "n", descriptor = "[B")
	public byte[] aByteArray83;

	@OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
	public int anInt7682;

	@OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
	public int anInt7681;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(I[BII)V")
	public Class14_Sub19_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7680 = arg0;
		this.aByteArray83 = arg1;
		this.anInt7682 = arg2;
		this.anInt7681 = arg3;
	}

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class14_Sub19_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7680 = arg0;
		this.aByteArray83 = arg1;
		this.anInt7682 = arg2;
		this.anInt7681 = arg3;
		this.aBoolean539 = arg4;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!nga;)Lclient!pd;")
	public Class14_Sub19_Sub1 method6790(@OriginalArg(0) Class250 arg0) {
		this.aByteArray83 = arg0.method6131(this.aByteArray83);
		this.anInt7680 = arg0.method6133(this.anInt7680);
		if (this.anInt7682 == this.anInt7681) {
			this.anInt7682 = this.anInt7681 = arg0.method6130(this.anInt7682);
		} else {
			this.anInt7682 = arg0.method6130(this.anInt7682);
			this.anInt7681 = arg0.method6130(this.anInt7681);
			if (this.anInt7682 == this.anInt7681) {
				this.anInt7682--;
			}
		}
		return this;
	}
}
