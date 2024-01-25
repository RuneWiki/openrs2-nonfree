import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public final class Class157 {

	@OriginalMember(owner = "client!id", name = "c", descriptor = "I")
	public int anInt4641;

	@OriginalMember(owner = "client!id", name = "d", descriptor = "Ljava/lang/String;")
	public String aString34;

	@OriginalMember(owner = "client!id", name = "e", descriptor = "Z")
	private boolean aBoolean339 = false;

	@OriginalMember(owner = "client!id", name = "h", descriptor = "I")
	public int anInt4643 = 43594;

	@OriginalMember(owner = "client!id", name = "f", descriptor = "Z")
	private boolean aBoolean340 = true;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "I")
	public int anInt4640 = 443;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!id;B)Z")
	public boolean method3976(@OriginalArg(0) Class157 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return arg0.anInt4641 == this.anInt4641 && this.aString34.equals(arg0.aString34);
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
	public void method3977() {
		if (!this.aBoolean340) {
			this.aBoolean339 = true;
			this.aBoolean340 = true;
		} else if (this.aBoolean339) {
			this.aBoolean339 = false;
		} else {
			this.aBoolean340 = false;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!rp;I)Lclient!jg;")
	public Class174 method3979(@OriginalArg(0) Class298 arg0) {
		return arg0.method7279(this.aString34, this.aBoolean340 ? this.anInt4640 : this.anInt4643, this.aBoolean339);
	}
}
