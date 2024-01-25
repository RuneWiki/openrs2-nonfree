import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public final class Class14_Sub11_Sub1 extends Class14_Sub11 {

	@OriginalMember(owner = "client!kr", name = "o", descriptor = "Z")
	public boolean aBoolean229;

	@OriginalMember(owner = "client!kr", name = "p", descriptor = "I")
	public int anInt3560;

	@OriginalMember(owner = "client!kr", name = "n", descriptor = "[B")
	public byte[] aByteArray98;

	@OriginalMember(owner = "client!kr", name = "q", descriptor = "I")
	public int anInt3561;

	@OriginalMember(owner = "client!kr", name = "m", descriptor = "I")
	public int anInt3559;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(I[BII)V")
	public Class14_Sub11_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3560 = arg0;
		this.aByteArray98 = arg1;
		this.anInt3561 = arg2;
		this.anInt3559 = arg3;
	}

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class14_Sub11_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3560 = arg0;
		this.aByteArray98 = arg1;
		this.anInt3561 = arg2;
		this.anInt3559 = arg3;
		this.aBoolean229 = arg4;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lclient!vc;)Lclient!kr;")
	public Class14_Sub11_Sub1 method3344(@OriginalArg(0) Class204 arg0) {
		this.aByteArray98 = arg0.method5671(this.aByteArray98);
		this.anInt3560 = arg0.method5669(this.anInt3560);
		if (this.anInt3561 == this.anInt3559) {
			this.anInt3561 = this.anInt3559 = arg0.method5670(this.anInt3561);
		} else {
			this.anInt3561 = arg0.method5670(this.anInt3561);
			this.anInt3559 = arg0.method5670(this.anInt3559);
			if (this.anInt3561 == this.anInt3559) {
				this.anInt3561--;
			}
		}
		return this;
	}
}
