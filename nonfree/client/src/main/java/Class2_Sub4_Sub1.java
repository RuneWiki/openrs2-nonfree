import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public final class Class2_Sub4_Sub1 extends Class2_Sub4 {

	@OriginalMember(owner = "client!cu", name = "p", descriptor = "Z")
	public boolean aBoolean88;

	@OriginalMember(owner = "client!cu", name = "q", descriptor = "I")
	public int anInt954;

	@OriginalMember(owner = "client!cu", name = "r", descriptor = "[B")
	public byte[] aByteArray19;

	@OriginalMember(owner = "client!cu", name = "s", descriptor = "I")
	public int anInt955;

	@OriginalMember(owner = "client!cu", name = "t", descriptor = "I")
	public int anInt956;

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt954 = arg0;
		this.aByteArray19 = arg1;
		this.anInt955 = arg2;
		this.anInt956 = arg3;
	}

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class2_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt954 = arg0;
		this.aByteArray19 = arg1;
		this.anInt955 = arg2;
		this.anInt956 = arg3;
		this.aBoolean88 = arg4;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!fm;)Lclient!cu;")
	public Class2_Sub4_Sub1 method939(@OriginalArg(0) Class76 arg0) {
		this.aByteArray19 = arg0.method1785(this.aByteArray19);
		this.anInt954 = arg0.method1783(this.anInt954);
		if (this.anInt955 == this.anInt956) {
			this.anInt955 = this.anInt956 = arg0.method1782(this.anInt955);
		} else {
			this.anInt955 = arg0.method1782(this.anInt955);
			this.anInt956 = arg0.method1782(this.anInt956);
			if (this.anInt955 == this.anInt956) {
				this.anInt955--;
			}
		}
		return this;
	}
}
