import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public final class Class1_Sub16_Sub1 extends Class1_Sub16 {

	@OriginalMember(owner = "client!pd", name = "F", descriptor = "Z")
	public boolean aBoolean185;

	@OriginalMember(owner = "client!pd", name = "D", descriptor = "I")
	public int anInt2191;

	@OriginalMember(owner = "client!pd", name = "C", descriptor = "[B")
	public byte[] aByteArray72;

	@OriginalMember(owner = "client!pd", name = "A", descriptor = "I")
	public int anInt2190;

	@OriginalMember(owner = "client!pd", name = "E", descriptor = "I")
	public int anInt2192;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub16_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2191 = arg0;
		this.aByteArray72 = arg1;
		this.anInt2190 = arg2;
		this.anInt2192 = arg3;
	}

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub16_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2191 = arg0;
		this.aByteArray72 = arg1;
		this.anInt2190 = arg2;
		this.anInt2192 = arg3;
		this.aBoolean185 = arg4;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!gf;)Lclient!pd;")
	public Class1_Sub16_Sub1 method1564(@OriginalArg(0) Class24 arg0) {
		this.aByteArray72 = arg0.method781(this.aByteArray72);
		this.anInt2191 = arg0.method790(this.anInt2191);
		if (this.anInt2190 == this.anInt2192) {
			this.anInt2190 = this.anInt2192 = arg0.method787(this.anInt2190);
		} else {
			this.anInt2190 = arg0.method787(this.anInt2190);
			this.anInt2192 = arg0.method787(this.anInt2192);
			if (this.anInt2190 == this.anInt2192) {
				this.anInt2190--;
			}
		}
		return this;
	}
}
