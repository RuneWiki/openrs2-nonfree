import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public final class Class6_Sub19_Sub1 extends Class6_Sub19 {

	@OriginalMember(owner = "client!ft", name = "h", descriptor = "Z")
	public boolean aBoolean237;

	@OriginalMember(owner = "client!ft", name = "k", descriptor = "I")
	public int anInt3210;

	@OriginalMember(owner = "client!ft", name = "i", descriptor = "[B")
	public byte[] aByteArray13;

	@OriginalMember(owner = "client!ft", name = "j", descriptor = "I")
	public int anInt3209;

	@OriginalMember(owner = "client!ft", name = "l", descriptor = "I")
	public int anInt3211;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(I[BII)V")
	public Class6_Sub19_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3210 = arg0;
		this.aByteArray13 = arg1;
		this.anInt3209 = arg2;
		this.anInt3211 = arg3;
	}

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class6_Sub19_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3210 = arg0;
		this.aByteArray13 = arg1;
		this.anInt3209 = arg2;
		this.anInt3211 = arg3;
		this.aBoolean237 = arg4;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!pea;)Lclient!ft;")
	public Class6_Sub19_Sub1 method2832(@OriginalArg(0) Class250 arg0) {
		this.aByteArray13 = arg0.method5743(this.aByteArray13);
		this.anInt3210 = arg0.method5742(this.anInt3210);
		if (this.anInt3209 == this.anInt3211) {
			this.anInt3209 = this.anInt3211 = arg0.method5745(this.anInt3209);
		} else {
			this.anInt3209 = arg0.method5745(this.anInt3209);
			this.anInt3211 = arg0.method5745(this.anInt3211);
			if (this.anInt3209 == this.anInt3211) {
				this.anInt3209--;
			}
		}
		return this;
	}
}
