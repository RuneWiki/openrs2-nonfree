import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public final class Class1_Sub12_Sub1 extends Class1_Sub12 {

	@OriginalMember(owner = "client!mg", name = "q", descriptor = "Z")
	public boolean aBoolean307;

	@OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
	public int anInt4814;

	@OriginalMember(owner = "client!mg", name = "s", descriptor = "[B")
	public byte[] aByteArray54;

	@OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
	public int anInt4816;

	@OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
	public int anInt4815;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub12_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4814 = arg0;
		this.aByteArray54 = arg1;
		this.anInt4816 = arg2;
		this.anInt4815 = arg3;
	}

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub12_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4814 = arg0;
		this.aByteArray54 = arg1;
		this.anInt4816 = arg2;
		this.anInt4815 = arg3;
		this.aBoolean307 = arg4;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!sn;)Lclient!mg;")
	public Class1_Sub12_Sub1 method3716(@OriginalArg(0) Class233 arg0) {
		this.aByteArray54 = arg0.method5189(this.aByteArray54);
		this.anInt4814 = arg0.method5185(this.anInt4814);
		if (this.anInt4816 == this.anInt4815) {
			this.anInt4816 = this.anInt4815 = arg0.method5186(this.anInt4816);
		} else {
			this.anInt4816 = arg0.method5186(this.anInt4816);
			this.anInt4815 = arg0.method5186(this.anInt4815);
			if (this.anInt4816 == this.anInt4815) {
				this.anInt4816--;
			}
		}
		return this;
	}
}
