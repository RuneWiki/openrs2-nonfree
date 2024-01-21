import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public final class Class1_Sub20_Sub1 extends Class1_Sub20 {

	@OriginalMember(owner = "client!qe", name = "z", descriptor = "Z")
	public boolean aBoolean140;

	@OriginalMember(owner = "client!qe", name = "A", descriptor = "I")
	public int anInt3738;

	@OriginalMember(owner = "client!qe", name = "x", descriptor = "[B")
	public byte[] aByteArray45;

	@OriginalMember(owner = "client!qe", name = "y", descriptor = "I")
	public int anInt3737;

	@OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
	public int anInt3736;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub20_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3738 = arg0;
		this.aByteArray45 = arg1;
		this.anInt3737 = arg2;
		this.anInt3736 = arg3;
	}

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub20_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3738 = arg0;
		this.aByteArray45 = arg1;
		this.anInt3737 = arg2;
		this.anInt3736 = arg3;
		this.aBoolean140 = arg4;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!ua;)Lclient!qe;")
	public Class1_Sub20_Sub1 method2781(@OriginalArg(0) Class77 arg0) {
		this.aByteArray45 = arg0.method3264(this.aByteArray45);
		this.anInt3738 = arg0.method3263(this.anInt3738);
		if (this.anInt3737 == this.anInt3736) {
			this.anInt3737 = this.anInt3736 = arg0.method3266(this.anInt3737);
		} else {
			this.anInt3737 = arg0.method3266(this.anInt3737);
			this.anInt3736 = arg0.method3266(this.anInt3736);
			if (this.anInt3737 == this.anInt3736) {
				this.anInt3737--;
			}
		}
		return this;
	}
}
