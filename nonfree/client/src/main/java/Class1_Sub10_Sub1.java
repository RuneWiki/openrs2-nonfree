import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public final class Class1_Sub10_Sub1 extends Class1_Sub10 {

	@OriginalMember(owner = "client!me", name = "y", descriptor = "I")
	public int anInt1557;

	@OriginalMember(owner = "client!me", name = "x", descriptor = "[B")
	public byte[] aByteArray20;

	@OriginalMember(owner = "client!me", name = "z", descriptor = "I")
	public int anInt1558;

	@OriginalMember(owner = "client!me", name = "w", descriptor = "I")
	public int anInt1556;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub10_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1557 = arg0;
		this.aByteArray20 = arg1;
		this.anInt1558 = arg2;
		this.anInt1556 = arg3;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!dd;)Lclient!me;")
	public Class1_Sub10_Sub1 method1093(@OriginalArg(0) Class16 arg0) {
		this.aByteArray20 = arg0.method410(this.aByteArray20);
		this.anInt1557 = arg0.method409(this.anInt1557);
		if (this.anInt1558 == this.anInt1556) {
			this.anInt1558 = this.anInt1556 = arg0.method408(this.anInt1558);
		} else {
			this.anInt1558 = arg0.method408(this.anInt1558);
			this.anInt1556 = arg0.method408(this.anInt1556);
			if (this.anInt1558 == this.anInt1556) {
				this.anInt1558--;
			}
		}
		return this;
	}
}
