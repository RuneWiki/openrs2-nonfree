import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class59 {

	@OriginalMember(owner = "client!d", name = "g", descriptor = "Lclient!fea;")
	private Class99 aClass99_14;

	@OriginalMember(owner = "client!d", name = "h", descriptor = "Lclient!um;")
	private Class5 aClass5_55;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V")
	public Class59() {
	}

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lclient!fea;)V")
	public Class59(@OriginalArg(0) Class99 arg0) {
		this.aClass99_14 = arg0;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!fea;B)V")
	public void method1395(@OriginalArg(0) Class99 arg0) {
		this.aClass99_14 = arg0;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)Lclient!um;")
	public Class5 method1396() {
		@Pc(6) Class5 local6 = this.aClass5_55;
		if (this.aClass99_14.aClass5_102 == local6) {
			this.aClass5_55 = null;
			return null;
		} else {
			this.aClass5_55 = local6.aClass5_284;
			return local6;
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(I)Lclient!um;")
	public Class5 method1397() {
		@Pc(13) Class5 local13 = this.aClass99_14.aClass5_102.aClass5_284;
		if (this.aClass99_14.aClass5_102 == local13) {
			this.aClass5_55 = null;
			return null;
		} else {
			this.aClass5_55 = local13.aClass5_284;
			return local13;
		}
	}
}
