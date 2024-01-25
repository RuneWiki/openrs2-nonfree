import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aia")
public final class Class4_Sub4_Sub1 extends Class4_Sub4 {

	@OriginalMember(owner = "client!aia", name = "m", descriptor = "Z")
	public boolean aBoolean17;

	@OriginalMember(owner = "client!aia", name = "k", descriptor = "I")
	public int anInt193;

	@OriginalMember(owner = "client!aia", name = "j", descriptor = "[B")
	public byte[] aByteArray1;

	@OriginalMember(owner = "client!aia", name = "l", descriptor = "I")
	public int anInt194;

	@OriginalMember(owner = "client!aia", name = "i", descriptor = "I")
	public int anInt192;

	@OriginalMember(owner = "client!aia", name = "<init>", descriptor = "(I[BII)V")
	public Class4_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt193 = arg0;
		this.aByteArray1 = arg1;
		this.anInt194 = arg2;
		this.anInt192 = arg3;
	}

	@OriginalMember(owner = "client!aia", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class4_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt193 = arg0;
		this.aByteArray1 = arg1;
		this.anInt194 = arg2;
		this.anInt192 = arg3;
		this.aBoolean17 = arg4;
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lclient!wp;)Lclient!aia;")
	public Class4_Sub4_Sub1 method240(@OriginalArg(0) Class391 arg0) {
		this.aByteArray1 = arg0.method8935(this.aByteArray1);
		this.anInt193 = arg0.method8933(this.anInt193);
		if (this.anInt194 == this.anInt192) {
			this.anInt194 = this.anInt192 = arg0.method8931(this.anInt194);
		} else {
			this.anInt194 = arg0.method8931(this.anInt194);
			this.anInt192 = arg0.method8931(this.anInt192);
			if (this.anInt194 == this.anInt192) {
				this.anInt194--;
			}
		}
		return this;
	}
}
