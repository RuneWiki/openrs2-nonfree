import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class Class2 {

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "J")
	public long aLong157;

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "Lclient!hb;")
	public Class2 aClass2_213;

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "Lclient!hb;")
	public Class2 aClass2_214;

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)Z")
	public final boolean method3006() {
		return this.aClass2_213 != null;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V")
	public final void method3007() {
		if (this.aClass2_213 != null) {
			this.aClass2_213.aClass2_214 = this.aClass2_214;
			this.aClass2_214.aClass2_213 = this.aClass2_213;
			this.aClass2_214 = null;
			this.aClass2_213 = null;
		}
	}
}
