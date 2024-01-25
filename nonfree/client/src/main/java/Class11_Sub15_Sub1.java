import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public final class Class11_Sub15_Sub1 extends Class11_Sub15 {

	@OriginalMember(owner = "client!vj", name = "m", descriptor = "Z")
	public boolean aBoolean416;

	@OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
	public int anInt6419;

	@OriginalMember(owner = "client!vj", name = "k", descriptor = "[B")
	public byte[] aByteArray95;

	@OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
	public int anInt6417;

	@OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
	public int anInt6418;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(I[BII)V")
	public Class11_Sub15_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6419 = arg0;
		this.aByteArray95 = arg1;
		this.anInt6417 = arg2;
		this.anInt6418 = arg3;
	}

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class11_Sub15_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6419 = arg0;
		this.aByteArray95 = arg1;
		this.anInt6417 = arg2;
		this.anInt6418 = arg3;
		this.aBoolean416 = arg4;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!io;)Lclient!vj;")
	public Class11_Sub15_Sub1 method5478(@OriginalArg(0) Class103 arg0) {
		this.aByteArray95 = arg0.method2067(this.aByteArray95);
		this.anInt6419 = arg0.method2070(this.anInt6419);
		if (this.anInt6417 == this.anInt6418) {
			this.anInt6417 = this.anInt6418 = arg0.method2069(this.anInt6417);
		} else {
			this.anInt6417 = arg0.method2069(this.anInt6417);
			this.anInt6418 = arg0.method2069(this.anInt6418);
			if (this.anInt6417 == this.anInt6418) {
				this.anInt6417--;
			}
		}
		return this;
	}
}
