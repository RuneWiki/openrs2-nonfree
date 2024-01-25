import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public final class Class95 {

	@OriginalMember(owner = "client!et", name = "a", descriptor = "Z")
	public boolean aBoolean154;

	@OriginalMember(owner = "client!et", name = "c", descriptor = "Lclient!pm;")
	public Interface21 anInterface21_2;

	@OriginalMember(owner = "client!et", name = "g", descriptor = "Lclient!pm;")
	public Interface21 anInterface21_3;

	@OriginalMember(owner = "client!et", name = "e", descriptor = "Z")
	public boolean aBoolean155;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Z)V")
	public Class95(@OriginalArg(0) boolean arg0) {
		this.aBoolean155 = arg0;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(B)Z")
	public boolean method2090() {
		return this.aBoolean154 && !this.aBoolean155;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V")
	public void method2091() {
		if (this.anInterface21_3 != null) {
			this.anInterface21_3.method8887();
		}
		this.aBoolean154 = false;
	}
}
