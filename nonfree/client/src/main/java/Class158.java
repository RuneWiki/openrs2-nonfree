import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iv")
public final class Class158 {

	@OriginalMember(owner = "client!iv", name = "j", descriptor = "Lclient!fh;")
	private Class21 aClass21_36;

	@OriginalMember(owner = "client!iv", name = "h", descriptor = "Lclient!fh;")
	private final Class21 aClass21_35 = new Class21();

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "()V")
	public Class158() {
		this.aClass21_35.aClass21_68 = this.aClass21_35;
		this.aClass21_35.aClass21_67 = this.aClass21_35;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)Z")
	public boolean method3718() {
		return this.aClass21_35 == this.aClass21_35.aClass21_67;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(B)Lclient!fh;")
	public Class21 method3719() {
		@Pc(12) Class21 local12 = this.aClass21_35.aClass21_67;
		if (this.aClass21_35 == local12) {
			return null;
		} else {
			local12.method8246();
			return local12;
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(ILclient!fh;)V")
	public void method3720(@OriginalArg(1) Class21 arg0) {
		if (arg0.aClass21_68 != null) {
			arg0.method8246();
		}
		arg0.aClass21_68 = this.aClass21_35.aClass21_68;
		arg0.aClass21_67 = this.aClass21_35;
		arg0.aClass21_68.aClass21_67 = arg0;
		arg0.aClass21_67.aClass21_68 = arg0;
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)Lclient!fh;")
	public Class21 method3721() {
		@Pc(14) Class21 local14 = this.aClass21_36;
		if (local14 == this.aClass21_35) {
			this.aClass21_36 = null;
			return null;
		} else {
			this.aClass21_36 = local14.aClass21_67;
			return local14;
		}
	}

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "(I)Lclient!fh;")
	public Class21 method3722() {
		@Pc(14) Class21 local14 = this.aClass21_35.aClass21_68;
		if (local14 == this.aClass21_35) {
			this.aClass21_36 = null;
			return null;
		} else {
			this.aClass21_36 = local14.aClass21_68;
			return local14;
		}
	}

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "(I)V")
	public void method3724() {
		while (true) {
			@Pc(9) Class21 local9 = this.aClass21_35.aClass21_67;
			if (local9 == this.aClass21_35) {
				this.aClass21_36 = null;
				return;
			}
			local9.method8246();
		}
	}

	@OriginalMember(owner = "client!iv", name = "e", descriptor = "(I)I")
	public int method3725() {
		@Pc(14) int local14 = 0;
		for (@Pc(18) Class21 local18 = this.aClass21_35.aClass21_67; local18 != this.aClass21_35; local18 = local18.aClass21_67) {
			local14++;
		}
		return local14;
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(B)Lclient!fh;")
	public Class21 method3726() {
		@Pc(15) Class21 local15 = this.aClass21_35.aClass21_67;
		if (local15 == this.aClass21_35) {
			this.aClass21_36 = null;
			return null;
		} else {
			this.aClass21_36 = local15.aClass21_67;
			return local15;
		}
	}
}
