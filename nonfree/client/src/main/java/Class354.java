import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uia")
public final class Class354 {

	@OriginalMember(owner = "client!uia", name = "b", descriptor = "Ljava/lang/String;")
	public String aString135;

	@OriginalMember(owner = "client!uia", name = "i", descriptor = "I")
	public int anInt9837;

	@OriginalMember(owner = "client!uia", name = "e", descriptor = "I")
	public int anInt9834 = 443;

	@OriginalMember(owner = "client!uia", name = "m", descriptor = "I")
	public int anInt9840 = 43594;

	@OriginalMember(owner = "client!uia", name = "j", descriptor = "Z")
	private boolean aBoolean699 = true;

	@OriginalMember(owner = "client!uia", name = "c", descriptor = "Z")
	private boolean aBoolean698 = false;

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(ILclient!uia;)Z")
	public boolean method8298(@OriginalArg(1) Class354 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt9837 == arg0.anInt9837 && this.aString135.equals(arg0.aString135);
		}
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(Lclient!vt;B)Lclient!fe;")
	public Class103 method8301(@OriginalArg(0) Class380 arg0) {
		return arg0.method8821(this.aString135, this.aBoolean698, this.aBoolean699 ? this.anInt9834 : this.anInt9840);
	}

	@OriginalMember(owner = "client!uia", name = "b", descriptor = "(I)V")
	public void method8303() {
		if (!this.aBoolean699) {
			this.aBoolean699 = true;
			this.aBoolean698 = true;
		} else if (this.aBoolean698) {
			this.aBoolean698 = false;
		} else {
			this.aBoolean699 = false;
		}
	}
}
