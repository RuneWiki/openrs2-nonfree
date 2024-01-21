import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public final class Class1_Sub19_Sub1 extends Class1_Sub19 {

	@OriginalMember(owner = "client!mg", name = "r", descriptor = "Z")
	public boolean aBoolean115;

	@OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
	public int anInt2891;

	@OriginalMember(owner = "client!mg", name = "u", descriptor = "[B")
	public byte[] aByteArray35;

	@OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
	public int anInt2892;

	@OriginalMember(owner = "client!mg", name = "v", descriptor = "I")
	public int anInt2893;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub19_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2891 = arg0;
		this.aByteArray35 = arg1;
		this.anInt2892 = arg2;
		this.anInt2893 = arg3;
	}

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub19_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2891 = arg0;
		this.aByteArray35 = arg1;
		this.anInt2892 = arg2;
		this.anInt2893 = arg3;
		this.aBoolean115 = arg4;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!jb;)Lclient!mg;")
	public Class1_Sub19_Sub1 method2171(@OriginalArg(0) Class43 arg0) {
		this.aByteArray35 = arg0.method1455(this.aByteArray35);
		this.anInt2891 = arg0.method1459(this.anInt2891);
		if (this.anInt2892 == this.anInt2893) {
			this.anInt2892 = this.anInt2893 = arg0.method1454(this.anInt2892);
		} else {
			this.anInt2892 = arg0.method1454(this.anInt2892);
			this.anInt2893 = arg0.method1454(this.anInt2893);
			if (this.anInt2892 == this.anInt2893) {
				this.anInt2892--;
			}
		}
		return this;
	}
}
