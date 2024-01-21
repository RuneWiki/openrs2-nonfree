import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public final class Class2_Sub20_Sub1 extends Class2_Sub20 {

	@OriginalMember(owner = "client!qc", name = "r", descriptor = "Z")
	public boolean aBoolean146;

	@OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
	public int anInt3409;

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "[B")
	public byte[] aByteArray35;

	@OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
	public int anInt3410;

	@OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
	public int anInt3411;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub20_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3409 = arg0;
		this.aByteArray35 = arg1;
		this.anInt3410 = arg2;
		this.anInt3411 = arg3;
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class2_Sub20_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3409 = arg0;
		this.aByteArray35 = arg1;
		this.anInt3410 = arg2;
		this.anInt3411 = arg3;
		this.aBoolean146 = arg4;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!jd;)Lclient!qc;")
	public Class2_Sub20_Sub1 method2370(@OriginalArg(0) Class49 arg0) {
		this.aByteArray35 = arg0.method1395(this.aByteArray35);
		this.anInt3409 = arg0.method1396(this.anInt3409);
		if (this.anInt3410 == this.anInt3411) {
			this.anInt3410 = this.anInt3411 = arg0.method1402(this.anInt3410);
		} else {
			this.anInt3410 = arg0.method1402(this.anInt3410);
			this.anInt3411 = arg0.method1402(this.anInt3411);
			if (this.anInt3410 == this.anInt3411) {
				this.anInt3410--;
			}
		}
		return this;
	}
}
