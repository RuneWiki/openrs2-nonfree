import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public final class Class1_Sub13_Sub1 extends Class1_Sub13 {

	@OriginalMember(owner = "client!ih", name = "q", descriptor = "Z")
	public boolean aBoolean81;

	@OriginalMember(owner = "client!ih", name = "p", descriptor = "I")
	public int anInt2078;

	@OriginalMember(owner = "client!ih", name = "r", descriptor = "[B")
	public byte[] aByteArray17;

	@OriginalMember(owner = "client!ih", name = "s", descriptor = "I")
	public int anInt2079;

	@OriginalMember(owner = "client!ih", name = "t", descriptor = "I")
	public int anInt2080;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub13_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2078 = arg0;
		this.aByteArray17 = arg1;
		this.anInt2079 = arg2;
		this.anInt2080 = arg3;
	}

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub13_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2078 = arg0;
		this.aByteArray17 = arg1;
		this.anInt2079 = arg2;
		this.anInt2080 = arg3;
		this.aBoolean81 = arg4;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!ic;)Lclient!ih;")
	public Class1_Sub13_Sub1 method1445(@OriginalArg(0) Class32 arg0) {
		this.aByteArray17 = arg0.method1303(this.aByteArray17);
		this.anInt2078 = arg0.method1302(this.anInt2078);
		if (this.anInt2079 == this.anInt2080) {
			this.anInt2079 = this.anInt2080 = arg0.method1301(this.anInt2079);
		} else {
			this.anInt2079 = arg0.method1301(this.anInt2079);
			this.anInt2080 = arg0.method1301(this.anInt2080);
			if (this.anInt2079 == this.anInt2080) {
				this.anInt2079--;
			}
		}
		return this;
	}
}
