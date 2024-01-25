import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public final class Class51 {

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "Lclient!tc;")
	public Interface22 anInterface22_10;

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "Lclient!tc;")
	public Interface22 anInterface22_11;

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "Z")
	public boolean aBoolean170;

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "Z")
	public boolean aBoolean169;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Z)V")
	public Class51(@OriginalArg(0) boolean arg0) {
		this.aBoolean169 = arg0;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V")
	public void method1963() {
		if (this.anInterface22_10 != null) {
			this.anInterface22_10.method6475();
		}
		this.aBoolean170 = false;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)Z")
	public boolean method1965() {
		return this.aBoolean170 && !this.aBoolean169;
	}
}
