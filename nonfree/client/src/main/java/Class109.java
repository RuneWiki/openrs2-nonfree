import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public final class Class109 {

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "Ljava/lang/String;")
	public String aString44;

	@OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
	public int anInt2756;

	@OriginalMember(owner = "client!fi", name = "i", descriptor = "Z")
	private boolean aBoolean243 = true;

	@OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
	public int anInt2759 = 43594;

	@OriginalMember(owner = "client!fi", name = "n", descriptor = "Z")
	private boolean aBoolean244 = false;

	@OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
	public int anInt2758 = 443;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!fi;B)Z")
	public boolean method2380(@OriginalArg(0) Class109 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt2756 == arg0.anInt2756 && this.aString44.equals(arg0.aString44);
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V")
	public void method2382() {
		if (!this.aBoolean243) {
			this.aBoolean243 = true;
			this.aBoolean244 = true;
		} else if (this.aBoolean244) {
			this.aBoolean244 = false;
		} else {
			this.aBoolean243 = false;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILclient!kk;)Lclient!tj;")
	public Class330 method2383(@OriginalArg(1) Class192 arg0) {
		return arg0.method4324(this.aBoolean243 ? this.anInt2758 : this.anInt2759, this.aBoolean244, this.aString44);
	}
}
