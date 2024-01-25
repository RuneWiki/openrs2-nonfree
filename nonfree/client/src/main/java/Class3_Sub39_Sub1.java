import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public final class Class3_Sub39_Sub1 extends Class3_Sub39 {

	@OriginalMember(owner = "client!pv", name = "m", descriptor = "Z")
	public boolean aBoolean534;

	@OriginalMember(owner = "client!pv", name = "n", descriptor = "I")
	public int anInt7568;

	@OriginalMember(owner = "client!pv", name = "p", descriptor = "[B")
	public byte[] aByteArray67;

	@OriginalMember(owner = "client!pv", name = "o", descriptor = "I")
	public int anInt7569;

	@OriginalMember(owner = "client!pv", name = "l", descriptor = "I")
	public int anInt7567;

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(I[BII)V")
	public Class3_Sub39_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7568 = arg0;
		this.aByteArray67 = arg1;
		this.anInt7569 = arg2;
		this.anInt7567 = arg3;
	}

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class3_Sub39_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7568 = arg0;
		this.aByteArray67 = arg1;
		this.anInt7569 = arg2;
		this.anInt7567 = arg3;
		this.aBoolean534 = arg4;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lclient!lt;)Lclient!pv;")
	public Class3_Sub39_Sub1 method6312(@OriginalArg(0) Class217 arg0) {
		this.aByteArray67 = arg0.method5105(this.aByteArray67);
		this.anInt7568 = arg0.method5108(this.anInt7568);
		if (this.anInt7569 == this.anInt7567) {
			this.anInt7569 = this.anInt7567 = arg0.method5109(this.anInt7569);
		} else {
			this.anInt7569 = arg0.method5109(this.anInt7569);
			this.anInt7567 = arg0.method5109(this.anInt7567);
			if (this.anInt7569 == this.anInt7567) {
				this.anInt7569--;
			}
		}
		return this;
	}
}
