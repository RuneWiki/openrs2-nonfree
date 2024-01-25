import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public final class Class5_Sub42_Sub1 extends Class5_Sub42 {

	@OriginalMember(owner = "client!nga", name = "p", descriptor = "Z")
	public boolean aBoolean606;

	@OriginalMember(owner = "client!nga", name = "m", descriptor = "I")
	public int anInt7021;

	@OriginalMember(owner = "client!nga", name = "q", descriptor = "[B")
	public byte[] aByteArray67;

	@OriginalMember(owner = "client!nga", name = "o", descriptor = "I")
	public int anInt7023;

	@OriginalMember(owner = "client!nga", name = "n", descriptor = "I")
	public int anInt7022;

	@OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(I[BII)V")
	public Class5_Sub42_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7021 = arg0;
		this.aByteArray67 = arg1;
		this.anInt7023 = arg2;
		this.anInt7022 = arg3;
	}

	@OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class5_Sub42_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7021 = arg0;
		this.aByteArray67 = arg1;
		this.anInt7023 = arg2;
		this.anInt7022 = arg3;
		this.aBoolean606 = arg4;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lclient!ph;)Lclient!nga;")
	public Class5_Sub42_Sub1 method5821(@OriginalArg(0) Class276 arg0) {
		this.aByteArray67 = arg0.method6480(this.aByteArray67);
		this.anInt7021 = arg0.method6479(this.anInt7021);
		if (this.anInt7023 == this.anInt7022) {
			this.anInt7023 = this.anInt7022 = arg0.method6478(this.anInt7023);
		} else {
			this.anInt7023 = arg0.method6478(this.anInt7023);
			this.anInt7022 = arg0.method6478(this.anInt7022);
			if (this.anInt7023 == this.anInt7022) {
				this.anInt7023--;
			}
		}
		return this;
	}
}
