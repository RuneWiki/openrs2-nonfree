import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public final class Class7_Sub31_Sub1 extends Class7_Sub31 {

	@OriginalMember(owner = "client!lv", name = "n", descriptor = "Z")
	public boolean aBoolean253;

	@OriginalMember(owner = "client!lv", name = "l", descriptor = "I")
	public int anInt4158;

	@OriginalMember(owner = "client!lv", name = "k", descriptor = "[B")
	public byte[] aByteArray56;

	@OriginalMember(owner = "client!lv", name = "j", descriptor = "I")
	public int anInt4157;

	@OriginalMember(owner = "client!lv", name = "m", descriptor = "I")
	public int anInt4159;

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(I[BII)V")
	public Class7_Sub31_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4158 = arg0;
		this.aByteArray56 = arg1;
		this.anInt4157 = arg2;
		this.anInt4159 = arg3;
	}

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class7_Sub31_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4158 = arg0;
		this.aByteArray56 = arg1;
		this.anInt4157 = arg2;
		this.anInt4159 = arg3;
		this.aBoolean253 = arg4;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lclient!vg;)Lclient!lv;")
	public Class7_Sub31_Sub1 method3286(@OriginalArg(0) Class257 arg0) {
		this.aByteArray56 = arg0.method5464(this.aByteArray56);
		this.anInt4158 = arg0.method5468(this.anInt4158);
		if (this.anInt4157 == this.anInt4159) {
			this.anInt4157 = this.anInt4159 = arg0.method5467(this.anInt4157);
		} else {
			this.anInt4157 = arg0.method5467(this.anInt4157);
			this.anInt4159 = arg0.method5467(this.anInt4159);
			if (this.anInt4157 == this.anInt4159) {
				this.anInt4157--;
			}
		}
		return this;
	}
}
