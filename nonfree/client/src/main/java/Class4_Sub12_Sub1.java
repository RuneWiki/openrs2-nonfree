import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public final class Class4_Sub12_Sub1 extends Class4_Sub12 {

	@OriginalMember(owner = "client!vf", name = "u", descriptor = "Z")
	public boolean aBoolean164;

	@OriginalMember(owner = "client!vf", name = "t", descriptor = "I")
	public int anInt3984;

	@OriginalMember(owner = "client!vf", name = "s", descriptor = "[B")
	public byte[] aByteArray48;

	@OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
	public int anInt3982;

	@OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
	public int anInt3983;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(I[BII)V")
	public Class4_Sub12_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3984 = arg0;
		this.aByteArray48 = arg1;
		this.anInt3982 = arg2;
		this.anInt3983 = arg3;
	}

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class4_Sub12_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3984 = arg0;
		this.aByteArray48 = arg1;
		this.anInt3982 = arg2;
		this.anInt3983 = arg3;
		this.aBoolean164 = arg4;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!fa;)Lclient!vf;")
	public Class4_Sub12_Sub1 method3060(@OriginalArg(0) Class25 arg0) {
		this.aByteArray48 = arg0.method925(this.aByteArray48);
		this.anInt3984 = arg0.method924(this.anInt3984);
		if (this.anInt3982 == this.anInt3983) {
			this.anInt3982 = this.anInt3983 = arg0.method923(this.anInt3982);
		} else {
			this.anInt3982 = arg0.method923(this.anInt3982);
			this.anInt3983 = arg0.method923(this.anInt3983);
			if (this.anInt3982 == this.anInt3983) {
				this.anInt3982--;
			}
		}
		return this;
	}
}
