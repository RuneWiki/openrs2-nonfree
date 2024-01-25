import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class184 {

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "Lclient!laa;")
	private Class46 aClass46_18;

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "Lclient!laa;")
	private final Class46 aClass46_17 = new Class46();

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
	public Class184() {
		this.aClass46_17.aClass46_25 = this.aClass46_17;
		this.aClass46_17.aClass46_26 = this.aClass46_17;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
	public void method5136() {
		while (true) {
			@Pc(5) Class46 local5 = this.aClass46_17.aClass46_25;
			if (this.aClass46_17 == local5) {
				this.aClass46_18 = null;
				return;
			}
			local5.method8227();
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)Lclient!laa;")
	public Class46 method5138() {
		@Pc(7) Class46 local7 = this.aClass46_17.aClass46_25;
		if (local7 == this.aClass46_17) {
			this.aClass46_18 = null;
			return null;
		} else {
			this.aClass46_18 = local7.aClass46_25;
			return local7;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)Lclient!laa;")
	public Class46 method5139() {
		@Pc(7) Class46 local7 = this.aClass46_17.aClass46_25;
		if (this.aClass46_17 == local7) {
			return null;
		} else {
			local7.method8227();
			return local7;
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)Z")
	public boolean method5140() {
		return this.aClass46_17 == this.aClass46_17.aClass46_25;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!laa;I)V")
	public void method5142(@OriginalArg(0) Class46 arg0) {
		if (arg0.aClass46_26 != null) {
			arg0.method8227();
		}
		arg0.aClass46_26 = this.aClass46_17.aClass46_26;
		arg0.aClass46_25 = this.aClass46_17;
		arg0.aClass46_26.aClass46_25 = arg0;
		arg0.aClass46_25.aClass46_26 = arg0;
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)I")
	public int method5144() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class46 local11 = this.aClass46_17.aClass46_25;
		while (local11 != this.aClass46_17) {
			local11 = local11.aClass46_25;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)Lclient!laa;")
	public Class46 method5145() {
		@Pc(11) Class46 local11 = this.aClass46_18;
		if (local11 == this.aClass46_17) {
			this.aClass46_18 = null;
			return null;
		} else {
			this.aClass46_18 = local11.aClass46_25;
			return local11;
		}
	}

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)Lclient!laa;")
	public Class46 method5146() {
		@Pc(11) Class46 local11 = this.aClass46_17.aClass46_26;
		if (local11 == this.aClass46_17) {
			this.aClass46_18 = null;
			return null;
		} else {
			this.aClass46_18 = local11.aClass46_26;
			return local11;
		}
	}
}
