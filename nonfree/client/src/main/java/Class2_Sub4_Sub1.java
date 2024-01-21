import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public final class Class2_Sub4_Sub1 extends Class2_Sub4 {

	@OriginalMember(owner = "client!nd", name = "z", descriptor = "I")
	public int anInt2061;

	@OriginalMember(owner = "client!nd", name = "A", descriptor = "[B")
	public byte[] aByteArray53;

	@OriginalMember(owner = "client!nd", name = "D", descriptor = "I")
	public int anInt2063;

	@OriginalMember(owner = "client!nd", name = "C", descriptor = "I")
	public int anInt2062;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2061 = arg0;
		this.aByteArray53 = arg1;
		this.anInt2063 = arg2;
		this.anInt2062 = arg3;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!cd;)Lclient!nd;")
	public Class2_Sub4_Sub1 method1239(@OriginalArg(0) Class12 arg0) {
		this.aByteArray53 = arg0.method306(this.aByteArray53);
		this.anInt2061 = arg0.method307(this.anInt2061);
		if (this.anInt2063 == this.anInt2062) {
			this.anInt2063 = this.anInt2062 = arg0.method312(this.anInt2063);
		} else {
			this.anInt2063 = arg0.method312(this.anInt2063);
			this.anInt2062 = arg0.method312(this.anInt2062);
			if (this.anInt2063 == this.anInt2062) {
				this.anInt2063--;
			}
		}
		return this;
	}
}
