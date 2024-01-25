import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public final class Class3_Sub33_Sub1 extends Class3_Sub33 {

	@OriginalMember(owner = "client!mca", name = "l", descriptor = "Z")
	public boolean aBoolean542;

	@OriginalMember(owner = "client!mca", name = "o", descriptor = "I")
	public int anInt6921;

	@OriginalMember(owner = "client!mca", name = "k", descriptor = "[B")
	public byte[] aByteArray53;

	@OriginalMember(owner = "client!mca", name = "m", descriptor = "I")
	public int anInt6922;

	@OriginalMember(owner = "client!mca", name = "n", descriptor = "I")
	public int anInt6920;

	@OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(I[BII)V")
	public Class3_Sub33_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6921 = arg0;
		this.aByteArray53 = arg1;
		this.anInt6922 = arg2;
		this.anInt6920 = arg3;
	}

	@OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class3_Sub33_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6921 = arg0;
		this.aByteArray53 = arg1;
		this.anInt6922 = arg2;
		this.anInt6920 = arg3;
		this.aBoolean542 = arg4;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lclient!om;)Lclient!mca;")
	public Class3_Sub33_Sub1 method5801(@OriginalArg(0) Class272 arg0) {
		this.aByteArray53 = arg0.method6848(this.aByteArray53);
		this.anInt6921 = arg0.method6849(this.anInt6921);
		if (this.anInt6922 == this.anInt6920) {
			this.anInt6922 = this.anInt6920 = arg0.method6847(this.anInt6922);
		} else {
			this.anInt6922 = arg0.method6847(this.anInt6922);
			this.anInt6920 = arg0.method6847(this.anInt6920);
			if (this.anInt6922 == this.anInt6920) {
				this.anInt6922--;
			}
		}
		return this;
	}
}
