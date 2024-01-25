import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public final class Class3_Sub18_Sub1 extends Class3_Sub18 {

	@OriginalMember(owner = "client!wo", name = "l", descriptor = "Z")
	public boolean aBoolean767;

	@OriginalMember(owner = "client!wo", name = "m", descriptor = "I")
	public int anInt10133;

	@OriginalMember(owner = "client!wo", name = "o", descriptor = "[B")
	public byte[] aByteArray106;

	@OriginalMember(owner = "client!wo", name = "n", descriptor = "I")
	public int anInt10134;

	@OriginalMember(owner = "client!wo", name = "k", descriptor = "I")
	public int anInt10132;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(I[BII)V")
	public Class3_Sub18_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt10133 = arg0;
		this.aByteArray106 = arg1;
		this.anInt10134 = arg2;
		this.anInt10132 = arg3;
	}

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class3_Sub18_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt10133 = arg0;
		this.aByteArray106 = arg1;
		this.anInt10134 = arg2;
		this.anInt10132 = arg3;
		this.aBoolean767 = arg4;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!ln;)Lclient!wo;")
	public Class3_Sub18_Sub1 method8589(@OriginalArg(0) Class208 arg0) {
		this.aByteArray106 = arg0.method5387(this.aByteArray106);
		this.anInt10133 = arg0.method5390(this.anInt10133);
		if (this.anInt10134 == this.anInt10132) {
			this.anInt10134 = this.anInt10132 = arg0.method5392(this.anInt10134);
		} else {
			this.anInt10134 = arg0.method5392(this.anInt10134);
			this.anInt10132 = arg0.method5392(this.anInt10132);
			if (this.anInt10134 == this.anInt10132) {
				this.anInt10134--;
			}
		}
		return this;
	}
}
