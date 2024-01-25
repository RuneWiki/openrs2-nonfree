import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public final class Class2_Sub31_Sub1 extends Class2_Sub31 {

	@OriginalMember(owner = "client!mca", name = "n", descriptor = "Z")
	public boolean aBoolean401;

	@OriginalMember(owner = "client!mca", name = "k", descriptor = "I")
	public int anInt5384;

	@OriginalMember(owner = "client!mca", name = "j", descriptor = "[B")
	public byte[] aByteArray91;

	@OriginalMember(owner = "client!mca", name = "m", descriptor = "I")
	public int anInt5386;

	@OriginalMember(owner = "client!mca", name = "l", descriptor = "I")
	public int anInt5385;

	@OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub31_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5384 = arg0;
		this.aByteArray91 = arg1;
		this.anInt5386 = arg2;
		this.anInt5385 = arg3;
	}

	@OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class2_Sub31_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5384 = arg0;
		this.aByteArray91 = arg1;
		this.anInt5386 = arg2;
		this.anInt5385 = arg3;
		this.aBoolean401 = arg4;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lclient!rm;)Lclient!mca;")
	public Class2_Sub31_Sub1 method4633(@OriginalArg(0) Class250 arg0) {
		this.aByteArray91 = arg0.method6532(this.aByteArray91);
		this.anInt5384 = arg0.method6533(this.anInt5384);
		if (this.anInt5386 == this.anInt5385) {
			this.anInt5386 = this.anInt5385 = arg0.method6534(this.anInt5386);
		} else {
			this.anInt5386 = arg0.method6534(this.anInt5386);
			this.anInt5385 = arg0.method6534(this.anInt5385);
			if (this.anInt5386 == this.anInt5385) {
				this.anInt5386--;
			}
		}
		return this;
	}
}
