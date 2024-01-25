import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hca")
public final class Class139 {

	@OriginalMember(owner = "client!hca", name = "n", descriptor = "Lclient!mg;")
	private Class9 aClass9_32;

	@OriginalMember(owner = "client!hca", name = "l", descriptor = "Lclient!mg;")
	private final Class9 aClass9_31 = new Class9();

	@OriginalMember(owner = "client!hca", name = "<init>", descriptor = "()V")
	public Class139() {
		this.aClass9_31.aClass9_68 = this.aClass9_31;
		this.aClass9_31.aClass9_67 = this.aClass9_31;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(B)Z")
	public boolean method3196() {
		return this.aClass9_31.aClass9_68 == this.aClass9_31;
	}

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "(Z)Lclient!mg;")
	public Class9 method3198() {
		@Pc(12) Class9 local12 = this.aClass9_31.aClass9_68;
		if (local12 == this.aClass9_31) {
			this.aClass9_32 = null;
			return null;
		} else {
			this.aClass9_32 = local12.aClass9_68;
			return local12;
		}
	}

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "(B)I")
	public int method3199() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class9 local11 = this.aClass9_31.aClass9_68; local11 != this.aClass9_31; local11 = local11.aClass9_68) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)Lclient!mg;")
	public Class9 method3200() {
		@Pc(12) Class9 local12 = this.aClass9_31.aClass9_67;
		if (this.aClass9_31 == local12) {
			this.aClass9_32 = null;
			return null;
		} else {
			this.aClass9_32 = local12.aClass9_67;
			return local12;
		}
	}

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "(I)V")
	public void method3201() {
		while (true) {
			@Pc(5) Class9 local5 = this.aClass9_31.aClass9_68;
			if (this.aClass9_31 == local5) {
				this.aClass9_32 = null;
				return;
			}
			local5.method8593();
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lclient!mg;I)V")
	public void method3203(@OriginalArg(0) Class9 arg0) {
		if (arg0.aClass9_67 != null) {
			arg0.method8593();
		}
		arg0.aClass9_67 = this.aClass9_31.aClass9_67;
		arg0.aClass9_68 = this.aClass9_31;
		arg0.aClass9_67.aClass9_68 = arg0;
		arg0.aClass9_68.aClass9_67 = arg0;
	}

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "(I)Lclient!mg;")
	public Class9 method3204() {
		@Pc(14) Class9 local14 = this.aClass9_31.aClass9_68;
		if (local14 == this.aClass9_31) {
			return null;
		} else {
			local14.method8593();
			return local14;
		}
	}

	@OriginalMember(owner = "client!hca", name = "d", descriptor = "(I)Lclient!mg;")
	public Class9 method3205() {
		@Pc(10) Class9 local10 = this.aClass9_32;
		if (this.aClass9_31 == local10) {
			this.aClass9_32 = null;
			return null;
		} else {
			this.aClass9_32 = local10.aClass9_68;
			return local10;
		}
	}
}
