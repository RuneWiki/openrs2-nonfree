import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public final class Class124 {

	@OriginalMember(owner = "client!lp", name = "h", descriptor = "Lclient!qs;")
	private Class5 aClass5_149;

	@OriginalMember(owner = "client!lp", name = "k", descriptor = "I")
	private int anInt3605 = 0;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "Lclient!cs;")
	private final Class42 aClass42_31;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lclient!cs;)V")
	public Class124(@OriginalArg(0) Class42 arg0) {
		this.aClass42_31 = arg0;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)Lclient!qs;")
	public Class5 method3323() {
		this.anInt3605 = 0;
		return this.method3324();
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)Lclient!qs;")
	public Class5 method3324() {
		@Pc(28) Class5 local28;
		if (this.anInt3605 > 0 && this.aClass42_31.aClass5Array1[this.anInt3605 - 1] != this.aClass5_149) {
			local28 = this.aClass5_149;
			this.aClass5_149 = local28.aClass5_247;
			return local28;
		}
		while (this.aClass42_31.anInt1198 > this.anInt3605) {
			local28 = this.aClass42_31.aClass5Array1[this.anInt3605++].aClass5_247;
			if (this.aClass42_31.aClass5Array1[this.anInt3605 - 1] != local28) {
				this.aClass5_149 = local28.aClass5_247;
				return local28;
			}
		}
		return null;
	}
}
