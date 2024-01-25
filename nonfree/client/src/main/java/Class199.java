import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class199 {

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "Lclient!ds;")
	private Class5 aClass5_140;

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "Lclient!tg;")
	private Class330 aClass330_25;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V")
	public Class199() {
	}

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lclient!tg;)V")
	public Class199(@OriginalArg(0) Class330 arg0) {
		this.aClass330_25 = arg0;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)Lclient!ds;")
	public Class5 method4552() {
		@Pc(15) Class5 local15 = this.aClass330_25.aClass5_257.aClass5_300;
		if (local15 == this.aClass330_25.aClass5_257) {
			this.aClass5_140 = null;
			return null;
		} else {
			this.aClass5_140 = local15.aClass5_300;
			return local15;
		}
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)Lclient!ds;")
	public Class5 method4554() {
		@Pc(6) Class5 local6 = this.aClass5_140;
		if (this.aClass330_25.aClass5_257 == local6) {
			this.aClass5_140 = null;
			return null;
		} else {
			this.aClass5_140 = local6.aClass5_300;
			return local6;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!tg;Z)V")
	public void method4555(@OriginalArg(0) Class330 arg0) {
		this.aClass330_25 = arg0;
	}
}
