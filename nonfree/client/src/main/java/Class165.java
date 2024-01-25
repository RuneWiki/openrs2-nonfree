import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public final class Class165 {

	@OriginalMember(owner = "client!ht", name = "f", descriptor = "Ljava/lang/String;")
	public String aString47;

	@OriginalMember(owner = "client!ht", name = "k", descriptor = "I")
	public int anInt4607;

	@OriginalMember(owner = "client!ht", name = "h", descriptor = "Z")
	private boolean aBoolean355 = false;

	@OriginalMember(owner = "client!ht", name = "n", descriptor = "I")
	public int anInt4602 = 443;

	@OriginalMember(owner = "client!ht", name = "m", descriptor = "Z")
	private boolean aBoolean356 = true;

	@OriginalMember(owner = "client!ht", name = "e", descriptor = "I")
	public int anInt4608 = 43594;

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ILclient!ft;)Lclient!vn;")
	public Class380 method4203(@OriginalArg(1) Class122 arg0) {
		return arg0.method3344(this.aString47, this.aBoolean355, this.aBoolean356 ? this.anInt4602 : this.anInt4608);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(BLclient!ht;)Z")
	public boolean method4206(@OriginalArg(1) Class165 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt4607 == arg0.anInt4607 && this.aString47.equals(arg0.aString47);
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V")
	public void method4207() {
		if (!this.aBoolean356) {
			this.aBoolean356 = true;
			this.aBoolean355 = true;
		} else if (this.aBoolean355) {
			this.aBoolean355 = false;
		} else {
			this.aBoolean356 = false;
		}
	}
}
