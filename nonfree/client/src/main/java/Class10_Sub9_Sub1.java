import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public final class Class10_Sub9_Sub1 extends Class10_Sub9 {

	@OriginalMember(owner = "client!oc", name = "x", descriptor = "I")
	public int anInt1839;

	@OriginalMember(owner = "client!oc", name = "w", descriptor = "[B")
	public byte[] aByteArray6;

	@OriginalMember(owner = "client!oc", name = "z", descriptor = "I")
	public int anInt1841;

	@OriginalMember(owner = "client!oc", name = "y", descriptor = "I")
	public int anInt1840;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(I[BII)V")
	public Class10_Sub9_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1839 = arg0;
		this.aByteArray6 = arg1;
		this.anInt1841 = arg2;
		this.anInt1840 = arg3;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!l;)Lclient!oc;")
	public Class10_Sub9_Sub1 method1023(@OriginalArg(0) Class35 arg0) {
		this.aByteArray6 = arg0.method811(this.aByteArray6);
		this.anInt1839 = arg0.method808(this.anInt1839);
		if (this.anInt1841 == this.anInt1840) {
			this.anInt1841 = this.anInt1840 = arg0.method815(this.anInt1841);
		} else {
			this.anInt1841 = arg0.method815(this.anInt1841);
			this.anInt1840 = arg0.method815(this.anInt1840);
			if (this.anInt1841 == this.anInt1840) {
				this.anInt1841--;
			}
		}
		return this;
	}
}
