import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class169 {

	@OriginalMember(owner = "client!ql", name = "r", descriptor = "Lclient!ds;")
	private Class1_Sub2 aClass1_Sub2_42;

	@OriginalMember(owner = "client!ql", name = "m", descriptor = "Lclient!ds;")
	private final Class1_Sub2 aClass1_Sub2_41 = new Class1_Sub2();

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "()V")
	public Class169() {
		this.aClass1_Sub2_41.aClass1_Sub2_62 = this.aClass1_Sub2_41;
		this.aClass1_Sub2_41.aClass1_Sub2_61 = this.aClass1_Sub2_41;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)Lclient!ds;")
	public Class1_Sub2 method4474() {
		@Pc(10) Class1_Sub2 local10 = this.aClass1_Sub2_42;
		if (local10 == this.aClass1_Sub2_41) {
			this.aClass1_Sub2_42 = null;
			return null;
		} else {
			this.aClass1_Sub2_42 = local10.aClass1_Sub2_62;
			return local10;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!ds;B)V")
	public void method4475(@OriginalArg(0) Class1_Sub2 arg0) {
		if (arg0.aClass1_Sub2_61 != null) {
			arg0.method5784();
		}
		arg0.aClass1_Sub2_61 = this.aClass1_Sub2_41.aClass1_Sub2_61;
		arg0.aClass1_Sub2_62 = this.aClass1_Sub2_41;
		arg0.aClass1_Sub2_61.aClass1_Sub2_62 = arg0;
		arg0.aClass1_Sub2_62.aClass1_Sub2_61 = arg0;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)Lclient!ds;")
	public Class1_Sub2 method4476() {
		@Pc(7) Class1_Sub2 local7 = this.aClass1_Sub2_41.aClass1_Sub2_62;
		if (this.aClass1_Sub2_41 == local7) {
			return null;
		} else {
			local7.method5784();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)Lclient!ds;")
	public Class1_Sub2 method4480() {
		@Pc(7) Class1_Sub2 local7 = this.aClass1_Sub2_41.aClass1_Sub2_62;
		if (this.aClass1_Sub2_41 == local7) {
			this.aClass1_Sub2_42 = null;
			return null;
		} else {
			this.aClass1_Sub2_42 = local7.aClass1_Sub2_62;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(I)V")
	public void method4481() {
		while (true) {
			@Pc(13) Class1_Sub2 local13 = this.aClass1_Sub2_41.aClass1_Sub2_62;
			if (local13 == this.aClass1_Sub2_41) {
				this.aClass1_Sub2_42 = null;
				return;
			}
			local13.method5784();
		}
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(B)I")
	public int method4482() {
		@Pc(10) int local10 = 0;
		@Pc(14) Class1_Sub2 local14 = this.aClass1_Sub2_41.aClass1_Sub2_62;
		while (this.aClass1_Sub2_41 != local14) {
			local14 = local14.aClass1_Sub2_62;
			local10++;
		}
		return local10;
	}
}
