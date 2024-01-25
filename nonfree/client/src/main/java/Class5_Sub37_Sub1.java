import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public final class Class5_Sub37_Sub1 extends Class5_Sub37 {

	@OriginalMember(owner = "client!so", name = "p", descriptor = "Z")
	public boolean aBoolean655;

	@OriginalMember(owner = "client!so", name = "n", descriptor = "I")
	public int anInt8937;

	@OriginalMember(owner = "client!so", name = "o", descriptor = "[B")
	public byte[] aByteArray94;

	@OriginalMember(owner = "client!so", name = "m", descriptor = "I")
	public int anInt8936;

	@OriginalMember(owner = "client!so", name = "l", descriptor = "I")
	public int anInt8935;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(I[BII)V")
	public Class5_Sub37_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8937 = arg0;
		this.aByteArray94 = arg1;
		this.anInt8936 = arg2;
		this.anInt8935 = arg3;
	}

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class5_Sub37_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt8937 = arg0;
		this.aByteArray94 = arg1;
		this.anInt8936 = arg2;
		this.anInt8935 = arg3;
		this.aBoolean655 = arg4;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!gaa;)Lclient!so;")
	public Class5_Sub37_Sub1 method7692(@OriginalArg(0) Class114 arg0) {
		this.aByteArray94 = arg0.method2479(this.aByteArray94);
		this.anInt8937 = arg0.method2481(this.anInt8937);
		if (this.anInt8936 == this.anInt8935) {
			this.anInt8936 = this.anInt8935 = arg0.method2480(this.anInt8936);
		} else {
			this.anInt8936 = arg0.method2480(this.anInt8936);
			this.anInt8935 = arg0.method2480(this.anInt8935);
			if (this.anInt8936 == this.anInt8935) {
				this.anInt8936--;
			}
		}
		return this;
	}
}
