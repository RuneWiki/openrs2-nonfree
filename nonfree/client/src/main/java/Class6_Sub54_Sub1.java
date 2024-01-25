import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public final class Class6_Sub54_Sub1 extends Class6_Sub54 {

	@OriginalMember(owner = "client!vfa", name = "k", descriptor = "Z")
	public boolean aBoolean735;

	@OriginalMember(owner = "client!vfa", name = "n", descriptor = "I")
	public int anInt9981;

	@OriginalMember(owner = "client!vfa", name = "m", descriptor = "[B")
	public byte[] aByteArray107;

	@OriginalMember(owner = "client!vfa", name = "l", descriptor = "I")
	public int anInt9979;

	@OriginalMember(owner = "client!vfa", name = "j", descriptor = "I")
	public int anInt9980;

	@OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(I[BII)V")
	public Class6_Sub54_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9981 = arg0;
		this.aByteArray107 = arg1;
		this.anInt9979 = arg2;
		this.anInt9980 = arg3;
	}

	@OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class6_Sub54_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt9981 = arg0;
		this.aByteArray107 = arg1;
		this.anInt9979 = arg2;
		this.anInt9980 = arg3;
		this.aBoolean735 = arg4;
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Lclient!wp;)Lclient!vfa;")
	public Class6_Sub54_Sub1 method8673(@OriginalArg(0) Class397 arg0) {
		this.aByteArray107 = arg0.method8970(this.aByteArray107);
		this.anInt9981 = arg0.method8969(this.anInt9981);
		if (this.anInt9979 == this.anInt9980) {
			this.anInt9979 = this.anInt9980 = arg0.method8967(this.anInt9979);
		} else {
			this.anInt9979 = arg0.method8967(this.anInt9979);
			this.anInt9980 = arg0.method8967(this.anInt9980);
			if (this.anInt9979 == this.anInt9980) {
				this.anInt9979--;
			}
		}
		return this;
	}
}
