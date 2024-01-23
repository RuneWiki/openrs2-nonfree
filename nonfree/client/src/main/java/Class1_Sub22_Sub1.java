import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public final class Class1_Sub22_Sub1 extends Class1_Sub22 {

	@OriginalMember(owner = "client!om", name = "t", descriptor = "Z")
	public boolean aBoolean291;

	@OriginalMember(owner = "client!om", name = "u", descriptor = "I")
	public int anInt3755;

	@OriginalMember(owner = "client!om", name = "q", descriptor = "[B")
	public byte[] aByteArray70;

	@OriginalMember(owner = "client!om", name = "s", descriptor = "I")
	public int anInt3754;

	@OriginalMember(owner = "client!om", name = "r", descriptor = "I")
	public int anInt3753;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub22_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3755 = arg0;
		this.aByteArray70 = arg1;
		this.anInt3754 = arg2;
		this.anInt3753 = arg3;
	}

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub22_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3755 = arg0;
		this.aByteArray70 = arg1;
		this.anInt3754 = arg2;
		this.anInt3753 = arg3;
		this.aBoolean291 = arg4;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!sn;)Lclient!om;")
	public Class1_Sub22_Sub1 method2959(@OriginalArg(0) Class151 arg0) {
		this.aByteArray70 = arg0.method3880(this.aByteArray70);
		this.anInt3755 = arg0.method3876(this.anInt3755);
		if (this.anInt3754 == this.anInt3753) {
			this.anInt3754 = this.anInt3753 = arg0.method3879(this.anInt3754);
		} else {
			this.anInt3754 = arg0.method3879(this.anInt3754);
			this.anInt3753 = arg0.method3879(this.anInt3753);
			if (this.anInt3754 == this.anInt3753) {
				this.anInt3754--;
			}
		}
		return this;
	}
}
