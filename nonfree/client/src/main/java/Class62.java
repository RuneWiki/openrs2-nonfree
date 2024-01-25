import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!daa")
public final class Class62 {

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "Lclient!sc;")
	private Class302 aClass302_1;

	@OriginalMember(owner = "client!daa", name = "k", descriptor = "Lclient!lha;")
	private Class8_Sub5 aClass8_Sub5_17;

	@OriginalMember(owner = "client!daa", name = "<init>", descriptor = "()V")
	private Class62() {
	}

	@OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(Lclient!sc;)V")
	public Class62(@OriginalArg(0) Class302 arg0) {
		this.aClass302_1 = arg0;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(B)Lclient!lha;")
	public Class8_Sub5 method2109() {
		@Pc(8) Class8_Sub5 local8 = this.aClass302_1.aClass8_Sub5_52.aClass8_Sub5_66;
		if (this.aClass302_1.aClass8_Sub5_52 == local8) {
			this.aClass8_Sub5_17 = null;
			return null;
		} else {
			this.aClass8_Sub5_17 = local8.aClass8_Sub5_66;
			return local8;
		}
	}

	@OriginalMember(owner = "client!daa", name = "b", descriptor = "(B)Lclient!lha;")
	public Class8_Sub5 method2112() {
		@Pc(6) Class8_Sub5 local6 = this.aClass8_Sub5_17;
		if (local6 == this.aClass302_1.aClass8_Sub5_52) {
			this.aClass8_Sub5_17 = null;
			return null;
		} else {
			this.aClass8_Sub5_17 = local6.aClass8_Sub5_66;
			return local6;
		}
	}
}
