import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public final class Class6_Sub12_Sub1 extends Class6_Sub12 {

	@OriginalMember(owner = "client!mda", name = "n", descriptor = "Z")
	public boolean aBoolean351;

	@OriginalMember(owner = "client!mda", name = "m", descriptor = "I")
	public int anInt5511;

	@OriginalMember(owner = "client!mda", name = "k", descriptor = "[B")
	public byte[] aByteArray66;

	@OriginalMember(owner = "client!mda", name = "l", descriptor = "I")
	public int anInt5510;

	@OriginalMember(owner = "client!mda", name = "o", descriptor = "I")
	public int anInt5512;

	@OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(I[BII)V")
	public Class6_Sub12_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5511 = arg0;
		this.aByteArray66 = arg1;
		this.anInt5510 = arg2;
		this.anInt5512 = arg3;
	}

	@OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class6_Sub12_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5511 = arg0;
		this.aByteArray66 = arg1;
		this.anInt5510 = arg2;
		this.anInt5512 = arg3;
		this.aBoolean351 = arg4;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lclient!au;)Lclient!mda;")
	public Class6_Sub12_Sub1 method4741(@OriginalArg(0) Class21 arg0) {
		this.aByteArray66 = arg0.method304(this.aByteArray66);
		this.anInt5511 = arg0.method300(this.anInt5511);
		if (this.anInt5510 == this.anInt5512) {
			this.anInt5510 = this.anInt5512 = arg0.method305(this.anInt5510);
		} else {
			this.anInt5510 = arg0.method305(this.anInt5510);
			this.anInt5512 = arg0.method305(this.anInt5512);
			if (this.anInt5510 == this.anInt5512) {
				this.anInt5510--;
			}
		}
		return this;
	}
}
