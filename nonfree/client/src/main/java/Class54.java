import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public final class Class54 {

	@OriginalMember(owner = "client!bu", name = "j", descriptor = "I")
	public int anInt869;

	@OriginalMember(owner = "client!bu", name = "c", descriptor = "Ljava/lang/String;")
	public String aString15;

	@OriginalMember(owner = "client!bu", name = "l", descriptor = "Z")
	private boolean aBoolean71 = false;

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "Z")
	private boolean aBoolean72 = true;

	@OriginalMember(owner = "client!bu", name = "k", descriptor = "I")
	public int anInt872 = 443;

	@OriginalMember(owner = "client!bu", name = "g", descriptor = "I")
	public int anInt868 = 43594;

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILclient!bu;)Z")
	public boolean method824(@OriginalArg(1) Class54 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return arg0.anInt869 == this.anInt869 && this.aString15.equals(arg0.aString15);
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)V")
	public void method825() {
		if (!this.aBoolean72) {
			this.aBoolean71 = true;
			this.aBoolean72 = true;
		} else if (this.aBoolean71) {
			this.aBoolean71 = false;
		} else {
			this.aBoolean72 = false;
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lclient!mca;B)Lclient!vd;")
	public Class366 method826(@OriginalArg(0) Class230 arg0) {
		return arg0.method5353(this.aBoolean72 ? this.anInt872 : this.anInt868, this.aString15, this.aBoolean71);
	}
}
