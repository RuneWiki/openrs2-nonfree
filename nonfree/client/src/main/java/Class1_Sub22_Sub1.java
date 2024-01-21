import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public final class Class1_Sub22_Sub1 extends Class1_Sub22 {

	@OriginalMember(owner = "client!qc", name = "x", descriptor = "Z")
	public boolean aBoolean179;

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "I")
	public int anInt3127;

	@OriginalMember(owner = "client!qc", name = "t", descriptor = "[B")
	public byte[] aByteArray43;

	@OriginalMember(owner = "client!qc", name = "w", descriptor = "I")
	public int anInt3128;

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "I")
	public int anInt3126;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub22_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3127 = arg0;
		this.aByteArray43 = arg1;
		this.anInt3128 = arg2;
		this.anInt3126 = arg3;
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub22_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3127 = arg0;
		this.aByteArray43 = arg1;
		this.anInt3128 = arg2;
		this.anInt3126 = arg3;
		this.aBoolean179 = arg4;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!cc;)Lclient!qc;")
	public Class1_Sub22_Sub1 method2312(@OriginalArg(0) Class18 arg0) {
		this.aByteArray43 = arg0.method442(this.aByteArray43);
		this.anInt3127 = arg0.method440(this.anInt3127);
		if (this.anInt3128 == this.anInt3126) {
			this.anInt3128 = this.anInt3126 = arg0.method439(this.anInt3128);
		} else {
			this.anInt3128 = arg0.method439(this.anInt3128);
			this.anInt3126 = arg0.method439(this.anInt3126);
			if (this.anInt3128 == this.anInt3126) {
				this.anInt3128--;
			}
		}
		return this;
	}
}
