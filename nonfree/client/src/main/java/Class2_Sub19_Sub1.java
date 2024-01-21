import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public final class Class2_Sub19_Sub1 extends Class2_Sub19 {

	@OriginalMember(owner = "client!qe", name = "u", descriptor = "Z")
	public boolean aBoolean129;

	@OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
	public int anInt3162;

	@OriginalMember(owner = "client!qe", name = "r", descriptor = "[B")
	public byte[] aByteArray38;

	@OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
	public int anInt3160;

	@OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
	public int anInt3161;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub19_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3162 = arg0;
		this.aByteArray38 = arg1;
		this.anInt3160 = arg2;
		this.anInt3161 = arg3;
	}

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class2_Sub19_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3162 = arg0;
		this.aByteArray38 = arg1;
		this.anInt3160 = arg2;
		this.anInt3161 = arg3;
		this.aBoolean129 = arg4;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!wb;)Lclient!qe;")
	public Class2_Sub19_Sub1 method2108(@OriginalArg(0) Class88 arg0) {
		this.aByteArray38 = arg0.method2772(this.aByteArray38);
		this.anInt3162 = arg0.method2773(this.anInt3162);
		if (this.anInt3160 == this.anInt3161) {
			this.anInt3160 = this.anInt3161 = arg0.method2774(this.anInt3160);
		} else {
			this.anInt3160 = arg0.method2774(this.anInt3160);
			this.anInt3161 = arg0.method2774(this.anInt3161);
			if (this.anInt3160 == this.anInt3161) {
				this.anInt3160--;
			}
		}
		return this;
	}
}
