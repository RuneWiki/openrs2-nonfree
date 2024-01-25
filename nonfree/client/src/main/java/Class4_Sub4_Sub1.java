import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public final class Class4_Sub4_Sub1 extends Class4_Sub4 {

	@OriginalMember(owner = "client!js", name = "p", descriptor = "Z")
	public boolean aBoolean346;

	@OriginalMember(owner = "client!js", name = "q", descriptor = "I")
	public int anInt3727;

	@OriginalMember(owner = "client!js", name = "o", descriptor = "[B")
	public byte[] aByteArray48;

	@OriginalMember(owner = "client!js", name = "n", descriptor = "I")
	public int anInt3726;

	@OriginalMember(owner = "client!js", name = "m", descriptor = "I")
	public int anInt3725;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(I[BII)V")
	public Class4_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3727 = arg0;
		this.aByteArray48 = arg1;
		this.anInt3726 = arg2;
		this.anInt3725 = arg3;
	}

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class4_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3727 = arg0;
		this.aByteArray48 = arg1;
		this.anInt3726 = arg2;
		this.anInt3725 = arg3;
		this.aBoolean346 = arg4;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!wd;)Lclient!js;")
	public Class4_Sub4_Sub1 method3079(@OriginalArg(0) Class261 arg0) {
		this.aByteArray48 = arg0.method5551(this.aByteArray48);
		this.anInt3727 = arg0.method5552(this.anInt3727);
		if (this.anInt3726 == this.anInt3725) {
			this.anInt3726 = this.anInt3725 = arg0.method5550(this.anInt3726);
		} else {
			this.anInt3726 = arg0.method5550(this.anInt3726);
			this.anInt3725 = arg0.method5550(this.anInt3725);
			if (this.anInt3726 == this.anInt3725) {
				this.anInt3726--;
			}
		}
		return this;
	}
}
