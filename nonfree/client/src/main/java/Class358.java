import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!via")
public final class Class358 {

	@OriginalMember(owner = "client!via", name = "c", descriptor = "I")
	public int anInt10266;

	@OriginalMember(owner = "client!via", name = "k", descriptor = "Ljava/lang/String;")
	public String aString107;

	@OriginalMember(owner = "client!via", name = "a", descriptor = "Z")
	private boolean aBoolean806 = false;

	@OriginalMember(owner = "client!via", name = "g", descriptor = "Z")
	private boolean aBoolean807 = true;

	@OriginalMember(owner = "client!via", name = "e", descriptor = "I")
	public int anInt10268 = 443;

	@OriginalMember(owner = "client!via", name = "j", descriptor = "I")
	public int anInt10271 = 43594;

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(ILclient!fl;)Lclient!jt;")
	public Class159 method8340(@OriginalArg(1) Class104 arg0) {
		return arg0.method3132(this.aString107, this.aBoolean807 ? this.anInt10268 : this.anInt10271, this.aBoolean806);
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(ILclient!via;)Z")
	public boolean method8343(@OriginalArg(1) Class358 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt10266 == arg0.anInt10266 && this.aString107.equals(arg0.aString107);
		}
	}

	@OriginalMember(owner = "client!via", name = "b", descriptor = "(I)V")
	public void method8344() {
		if (!this.aBoolean807) {
			this.aBoolean807 = true;
			this.aBoolean806 = true;
		} else if (this.aBoolean806) {
			this.aBoolean806 = false;
		} else {
			this.aBoolean807 = false;
		}
	}
}
