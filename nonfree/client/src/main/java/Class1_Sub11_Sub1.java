import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public final class Class1_Sub11_Sub1 extends Class1_Sub11 {

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "Z")
	public boolean aBoolean27;

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
	public int anInt805;

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
	public int anInt807;

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
	public int anInt806;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub11_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt805 = arg0;
		this.aByteArray4 = arg1;
		this.anInt807 = arg2;
		this.anInt806 = arg3;
	}

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub11_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt805 = arg0;
		this.aByteArray4 = arg1;
		this.anInt807 = arg2;
		this.anInt806 = arg3;
		this.aBoolean27 = arg4;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!ed;)Lclient!dc;")
	public Class1_Sub11_Sub1 method656(@OriginalArg(0) Class18 arg0) {
		this.aByteArray4 = arg0.method802(this.aByteArray4);
		this.anInt805 = arg0.method801(this.anInt805);
		if (this.anInt807 == this.anInt806) {
			this.anInt807 = this.anInt806 = arg0.method797(this.anInt807);
		} else {
			this.anInt807 = arg0.method797(this.anInt807);
			this.anInt806 = arg0.method797(this.anInt806);
			if (this.anInt807 == this.anInt806) {
				this.anInt807--;
			}
		}
		return this;
	}
}
