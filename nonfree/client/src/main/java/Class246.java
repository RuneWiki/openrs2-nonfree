import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!up")
public final class Class246 {

	@OriginalMember(owner = "client!up", name = "e", descriptor = "Lclient!fi;")
	private Class48_Sub2 aClass48_Sub2_8;

	@OriginalMember(owner = "client!up", name = "a", descriptor = "Lclient!fi;")
	public final Class48_Sub2 aClass48_Sub2_7 = new Class48_Sub2();

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "()V")
	public Class246() {
		this.aClass48_Sub2_7.aClass48_Sub2_5 = this.aClass48_Sub2_7;
		this.aClass48_Sub2_7.aClass48_Sub2_6 = this.aClass48_Sub2_7;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(I)Lclient!fi;")
	public Class48_Sub2 method5591() {
		@Pc(12) Class48_Sub2 local12 = this.aClass48_Sub2_7.aClass48_Sub2_6;
		if (local12 == this.aClass48_Sub2_7) {
			this.aClass48_Sub2_8 = null;
			return null;
		} else {
			this.aClass48_Sub2_8 = local12.aClass48_Sub2_6;
			return local12;
		}
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(I)Lclient!fi;")
	public Class48_Sub2 method5592() {
		@Pc(6) Class48_Sub2 local6 = this.aClass48_Sub2_8;
		if (this.aClass48_Sub2_7 == local6) {
			this.aClass48_Sub2_8 = null;
			return null;
		} else {
			this.aClass48_Sub2_8 = local6.aClass48_Sub2_6;
			return local6;
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(B)V")
	public void method5593() {
		while (true) {
			@Pc(5) Class48_Sub2 local5 = this.aClass48_Sub2_7.aClass48_Sub2_6;
			if (this.aClass48_Sub2_7 == local5) {
				this.aClass48_Sub2_8 = null;
				return;
			}
			local5.method2514();
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!fi;B)V")
	public void method5594(@OriginalArg(0) Class48_Sub2 arg0) {
		if (arg0.aClass48_Sub2_5 != null) {
			arg0.method2514();
		}
		arg0.aClass48_Sub2_6 = this.aClass48_Sub2_7;
		arg0.aClass48_Sub2_5 = this.aClass48_Sub2_7.aClass48_Sub2_5;
		arg0.aClass48_Sub2_5.aClass48_Sub2_6 = arg0;
		arg0.aClass48_Sub2_6.aClass48_Sub2_5 = arg0;
	}
}
