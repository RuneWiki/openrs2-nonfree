import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public final class Class170 {

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "Ljava/lang/String;")
	public String aString35;

	@OriginalMember(owner = "client!jda", name = "f", descriptor = "I")
	public int anInt4548;

	@OriginalMember(owner = "client!jda", name = "g", descriptor = "I")
	public int anInt4549 = 443;

	@OriginalMember(owner = "client!jda", name = "h", descriptor = "Z")
	private boolean aBoolean366 = false;

	@OriginalMember(owner = "client!jda", name = "i", descriptor = "I")
	public int anInt4550 = 43594;

	@OriginalMember(owner = "client!jda", name = "j", descriptor = "Z")
	private boolean aBoolean367 = false;

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(ILclient!rj;)Lclient!vfa;")
	public Class347 method3780(@OriginalArg(1) Class287 arg0) {
		return arg0.method6543(this.aBoolean367 ? this.anInt4549 : this.anInt4550, this.aBoolean366, this.aString35);
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lclient!jda;B)Z")
	public boolean method3782(@OriginalArg(0) Class170 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return arg0.anInt4548 == this.anInt4548 && this.aString35.equals(arg0.aString35);
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(I)V")
	public void method3783() {
		if (!this.aBoolean367) {
			this.aBoolean366 = true;
			this.aBoolean367 = true;
		} else if (this.aBoolean366) {
			this.aBoolean366 = false;
		} else {
			this.aBoolean367 = false;
		}
	}
}
