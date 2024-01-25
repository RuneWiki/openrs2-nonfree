import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public class Class6_Sub5 extends Class6 {

	@OriginalMember(owner = "client!pea", name = "m", descriptor = "Lclient!pea;")
	public Class6_Sub5 aClass6_Sub5_59;

	@OriginalMember(owner = "client!pea", name = "o", descriptor = "Lclient!pea;")
	public Class6_Sub5 aClass6_Sub5_60;

	@OriginalMember(owner = "client!pea", name = "p", descriptor = "J")
	public long aLong242;

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(B)V")
	public final void method7814() {
		if (this.aClass6_Sub5_60 != null) {
			this.aClass6_Sub5_60.aClass6_Sub5_59 = this.aClass6_Sub5_59;
			this.aClass6_Sub5_59.aClass6_Sub5_60 = this.aClass6_Sub5_60;
			this.aClass6_Sub5_59 = null;
			this.aClass6_Sub5_60 = null;
		}
	}

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "(I)Z")
	public final boolean method7815() {
		return this.aClass6_Sub5_60 != null;
	}
}
