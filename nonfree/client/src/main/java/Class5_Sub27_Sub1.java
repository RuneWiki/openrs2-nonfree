import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public final class Class5_Sub27_Sub1 extends Class5_Sub27 {

	@OriginalMember(owner = "client!jg", name = "q", descriptor = "Z")
	public boolean aBoolean316;

	@OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
	public int anInt4767;

	@OriginalMember(owner = "client!jg", name = "m", descriptor = "[B")
	public byte[] aByteArray46;

	@OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
	public int anInt4766;

	@OriginalMember(owner = "client!jg", name = "p", descriptor = "I")
	public int anInt4768;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(I[BII)V")
	public Class5_Sub27_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4767 = arg0;
		this.aByteArray46 = arg1;
		this.anInt4766 = arg2;
		this.anInt4768 = arg3;
	}

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class5_Sub27_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4767 = arg0;
		this.aByteArray46 = arg1;
		this.anInt4766 = arg2;
		this.anInt4768 = arg3;
		this.aBoolean316 = arg4;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!tl;)Lclient!jg;")
	public Class5_Sub27_Sub1 method4336(@OriginalArg(0) Class355 arg0) {
		this.aByteArray46 = arg0.method8033(this.aByteArray46);
		this.anInt4767 = arg0.method8037(this.anInt4767);
		if (this.anInt4766 == this.anInt4768) {
			this.anInt4766 = this.anInt4768 = arg0.method8031(this.anInt4766);
		} else {
			this.anInt4766 = arg0.method8031(this.anInt4766);
			this.anInt4768 = arg0.method8031(this.anInt4768);
			if (this.anInt4766 == this.anInt4768) {
				this.anInt4766--;
			}
		}
		return this;
	}
}
