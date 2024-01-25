import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hw")
public final class Class167 {

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "Lclient!tf;")
	private Class340 aClass340_32;

	@OriginalMember(owner = "client!hw", name = "g", descriptor = "Lclient!wb;")
	private Class6 aClass6_129;

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "()V")
	public Class167() {
	}

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(Lclient!tf;)V")
	public Class167(@OriginalArg(0) Class340 arg0) {
		this.aClass340_32 = arg0;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(ILclient!tf;)V")
	public void method4230(@OriginalArg(1) Class340 arg0) {
		this.aClass340_32 = arg0;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)Lclient!wb;")
	public Class6 method4235() {
		@Pc(14) Class6 local14 = this.aClass340_32.aClass6_283.aClass6_339;
		if (this.aClass340_32.aClass6_283 == local14) {
			this.aClass6_129 = null;
			return null;
		} else {
			this.aClass6_129 = local14.aClass6_339;
			return local14;
		}
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(I)Lclient!wb;")
	public Class6 method4236() {
		@Pc(6) Class6 local6 = this.aClass6_129;
		if (this.aClass340_32.aClass6_283 == local6) {
			this.aClass6_129 = null;
			return null;
		} else {
			this.aClass6_129 = local6.aClass6_339;
			return local6;
		}
	}
}
