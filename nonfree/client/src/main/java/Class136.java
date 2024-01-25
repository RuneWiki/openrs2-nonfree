import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class136 {

	@OriginalMember(owner = "client!hf", name = "k", descriptor = "Lclient!sj;")
	private Class1 aClass1_24;

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "Lclient!sj;")
	private final Class1 aClass1_23 = new Class1();

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
	public Class136() {
		this.aClass1_23.aClass1_67 = this.aClass1_23;
		this.aClass1_23.aClass1_68 = this.aClass1_23;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)Z")
	public boolean method3283() {
		return this.aClass1_23 == this.aClass1_23.aClass1_68;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)I")
	public int method3285() {
		@Pc(15) int local15 = 0;
		for (@Pc(19) Class1 local19 = this.aClass1_23.aClass1_68; local19 != this.aClass1_23; local19 = local19.aClass1_68) {
			local15++;
		}
		return local15;
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)Lclient!sj;")
	public Class1 method3286() {
		@Pc(6) Class1 local6 = this.aClass1_24;
		if (this.aClass1_23 == local6) {
			this.aClass1_24 = null;
			return null;
		} else {
			this.aClass1_24 = local6.aClass1_68;
			return local6;
		}
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)Lclient!sj;")
	public Class1 method3287() {
		@Pc(7) Class1 local7 = this.aClass1_23.aClass1_67;
		if (local7 == this.aClass1_23) {
			this.aClass1_24 = null;
			return null;
		} else {
			this.aClass1_24 = local7.aClass1_67;
			return local7;
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)Lclient!sj;")
	public Class1 method3288() {
		@Pc(15) Class1 local15 = this.aClass1_23.aClass1_68;
		if (this.aClass1_23 == local15) {
			this.aClass1_24 = null;
			return null;
		} else {
			this.aClass1_24 = local15.aClass1_68;
			return local15;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLclient!sj;)V")
	public void method3289(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_67 != null) {
			arg0.method8252();
		}
		arg0.aClass1_67 = this.aClass1_23.aClass1_67;
		arg0.aClass1_68 = this.aClass1_23;
		arg0.aClass1_67.aClass1_68 = arg0;
		arg0.aClass1_68.aClass1_67 = arg0;
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(B)V")
	public void method3290() {
		while (true) {
			@Pc(5) Class1 local5 = this.aClass1_23.aClass1_68;
			if (this.aClass1_23 == local5) {
				this.aClass1_24 = null;
				return;
			}
			local5.method8252();
		}
	}

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)Lclient!sj;")
	public Class1 method3292() {
		@Pc(12) Class1 local12 = this.aClass1_23.aClass1_68;
		if (this.aClass1_23 == local12) {
			return null;
		} else {
			local12.method8252();
			return local12;
		}
	}
}
