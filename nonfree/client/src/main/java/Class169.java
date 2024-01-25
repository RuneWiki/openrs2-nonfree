import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public final class Class169 {

	@OriginalMember(owner = "client!id", name = "h", descriptor = "Z")
	public boolean aBoolean333;

	@OriginalMember(owner = "client!id", name = "i", descriptor = "Lclient!je;")
	public Interface9 anInterface9_2;

	@OriginalMember(owner = "client!id", name = "d", descriptor = "Lclient!je;")
	public Interface9 anInterface9_3;

	@OriginalMember(owner = "client!id", name = "e", descriptor = "Z")
	public boolean aBoolean332;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Z)V")
	public Class169(@OriginalArg(0) boolean arg0) {
		this.aBoolean332 = arg0;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
	public void method3622() {
		if (this.anInterface9_3 != null) {
			this.anInterface9_3.method2921();
		}
		this.aBoolean333 = false;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)Z")
	public boolean method3623() {
		return this.aBoolean333 && !this.aBoolean332;
	}
}
