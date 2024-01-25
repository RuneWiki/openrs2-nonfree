import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public final class Class3_Sub34_Sub1 extends Class3_Sub34 {

	@OriginalMember(owner = "client!wha", name = "j", descriptor = "Z")
	public boolean aBoolean753;

	@OriginalMember(owner = "client!wha", name = "m", descriptor = "I")
	public int anInt11127;

	@OriginalMember(owner = "client!wha", name = "n", descriptor = "[B")
	public byte[] aByteArray109;

	@OriginalMember(owner = "client!wha", name = "l", descriptor = "I")
	public int anInt11126;

	@OriginalMember(owner = "client!wha", name = "k", descriptor = "I")
	public int anInt11125;

	@OriginalMember(owner = "client!wha", name = "<init>", descriptor = "(I[BII)V")
	public Class3_Sub34_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt11127 = arg0;
		this.aByteArray109 = arg1;
		this.anInt11126 = arg2;
		this.anInt11125 = arg3;
	}

	@OriginalMember(owner = "client!wha", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class3_Sub34_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt11127 = arg0;
		this.aByteArray109 = arg1;
		this.anInt11126 = arg2;
		this.anInt11125 = arg3;
		this.aBoolean753 = arg4;
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(Lclient!tl;)Lclient!wha;")
	public Class3_Sub34_Sub1 method9470(@OriginalArg(0) Class359 arg0) {
		this.aByteArray109 = arg0.method8258(this.aByteArray109);
		this.anInt11127 = arg0.method8259(this.anInt11127);
		if (this.anInt11126 == this.anInt11125) {
			this.anInt11126 = this.anInt11125 = arg0.method8263(this.anInt11126);
		} else {
			this.anInt11126 = arg0.method8263(this.anInt11126);
			this.anInt11125 = arg0.method8263(this.anInt11125);
			if (this.anInt11126 == this.anInt11125) {
				this.anInt11126--;
			}
		}
		return this;
	}
}
