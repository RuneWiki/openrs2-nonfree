import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public final class Class3_Sub48_Sub1 extends Class3_Sub48 {

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "Z")
	public boolean aBoolean659;

	@OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
	public int anInt8529;

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "[B")
	public byte[] aByteArray91;

	@OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
	public int anInt8530;

	@OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
	public int anInt8531;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(I[BII)V")
	public Class3_Sub48_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8529 = arg0;
		this.aByteArray91 = arg1;
		this.anInt8530 = arg2;
		this.anInt8531 = arg3;
	}

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class3_Sub48_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt8529 = arg0;
		this.aByteArray91 = arg1;
		this.anInt8530 = arg2;
		this.anInt8531 = arg3;
		this.aBoolean659 = arg4;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!js;)Lclient!ug;")
	public Class3_Sub48_Sub1 method7099(@OriginalArg(0) Class166 arg0) {
		this.aByteArray91 = arg0.method3988(this.aByteArray91);
		this.anInt8529 = arg0.method3991(this.anInt8529);
		if (this.anInt8530 == this.anInt8531) {
			this.anInt8530 = this.anInt8531 = arg0.method3989(this.anInt8530);
		} else {
			this.anInt8530 = arg0.method3989(this.anInt8530);
			this.anInt8531 = arg0.method3989(this.anInt8531);
			if (this.anInt8530 == this.anInt8531) {
				this.anInt8530--;
			}
		}
		return this;
	}
}
