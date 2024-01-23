import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public final class Class3_Sub11_Sub1 extends Class3_Sub11 {

	@OriginalMember(owner = "client!qj", name = "s", descriptor = "Z")
	public boolean aBoolean313;

	@OriginalMember(owner = "client!qj", name = "p", descriptor = "I")
	public int anInt4384;

	@OriginalMember(owner = "client!qj", name = "q", descriptor = "[B")
	public byte[] aByteArray59;

	@OriginalMember(owner = "client!qj", name = "r", descriptor = "I")
	public int anInt4385;

	@OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
	public int anInt4383;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(I[BII)V")
	public Class3_Sub11_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4384 = arg0;
		this.aByteArray59 = arg1;
		this.anInt4385 = arg2;
		this.anInt4383 = arg3;
	}

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class3_Sub11_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4384 = arg0;
		this.aByteArray59 = arg1;
		this.anInt4385 = arg2;
		this.anInt4383 = arg3;
		this.aBoolean313 = arg4;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!rj;)Lclient!qj;")
	public Class3_Sub11_Sub1 method3668(@OriginalArg(0) Class152 arg0) {
		this.aByteArray59 = arg0.method4072(this.aByteArray59);
		this.anInt4384 = arg0.method4070(this.anInt4384);
		if (this.anInt4385 == this.anInt4383) {
			this.anInt4385 = this.anInt4383 = arg0.method4071(this.anInt4385);
		} else {
			this.anInt4385 = arg0.method4071(this.anInt4385);
			this.anInt4383 = arg0.method4071(this.anInt4383);
			if (this.anInt4385 == this.anInt4383) {
				this.anInt4385--;
			}
		}
		return this;
	}
}
