import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class390 {

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "Lclient!cja;")
	private Class5_Sub5 aClass5_Sub5_67;

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "Lclient!gq;")
	private Class149 aClass149_12;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "()V")
	private Class390() {
	}

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lclient!gq;)V")
	public Class390(@OriginalArg(0) Class149 arg0) {
		this.aClass149_12 = arg0;
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(I)Lclient!cja;")
	public Class5_Sub5 method9270() {
		@Pc(12) Class5_Sub5 local12 = this.aClass5_Sub5_67;
		if (local12 == this.aClass149_12.aClass5_Sub5_24) {
			this.aClass5_Sub5_67 = null;
			return null;
		} else {
			this.aClass5_Sub5_67 = local12.aClass5_Sub5_66;
			return local12;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)Lclient!cja;")
	public Class5_Sub5 method9272() {
		@Pc(15) Class5_Sub5 local15 = this.aClass149_12.aClass5_Sub5_24.aClass5_Sub5_66;
		if (local15 == this.aClass149_12.aClass5_Sub5_24) {
			this.aClass5_Sub5_67 = null;
			return null;
		} else {
			this.aClass5_Sub5_67 = local15.aClass5_Sub5_66;
			return local15;
		}
	}
}
