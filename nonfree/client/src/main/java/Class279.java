import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class279 {

	@OriginalMember(owner = "client!pf", name = "m", descriptor = "Lclient!daa;")
	private Class2_Sub1 aClass2_Sub1_55;

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "Lclient!daa;")
	public final Class2_Sub1 aClass2_Sub1_54 = new Class2_Sub1();

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
	public Class279() {
		this.aClass2_Sub1_54.aClass2_Sub1_67 = this.aClass2_Sub1_54;
		this.aClass2_Sub1_54.aClass2_Sub1_66 = this.aClass2_Sub1_54;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)Lclient!daa;")
	public Class2_Sub1 method7291() {
		@Pc(13) Class2_Sub1 local13 = this.aClass2_Sub1_54.aClass2_Sub1_67;
		if (local13 == this.aClass2_Sub1_54) {
			return null;
		} else {
			local13.method9377();
			return local13;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLclient!daa;)V")
	public void method7292(@OriginalArg(1) Class2_Sub1 arg0) {
		if (arg0.aClass2_Sub1_66 != null) {
			arg0.method9377();
		}
		arg0.aClass2_Sub1_66 = this.aClass2_Sub1_54.aClass2_Sub1_66;
		arg0.aClass2_Sub1_67 = this.aClass2_Sub1_54;
		arg0.aClass2_Sub1_66.aClass2_Sub1_67 = arg0;
		arg0.aClass2_Sub1_67.aClass2_Sub1_66 = arg0;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)Lclient!daa;")
	public Class2_Sub1 method7293() {
		@Pc(12) Class2_Sub1 local12 = this.aClass2_Sub1_54.aClass2_Sub1_67;
		if (this.aClass2_Sub1_54 == local12) {
			this.aClass2_Sub1_55 = null;
			return null;
		} else {
			this.aClass2_Sub1_55 = local12.aClass2_Sub1_67;
			return local12;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)I")
	public int method7296() {
		@Pc(12) int local12 = 0;
		@Pc(16) Class2_Sub1 local16 = this.aClass2_Sub1_54.aClass2_Sub1_67;
		while (this.aClass2_Sub1_54 != local16) {
			local16 = local16.aClass2_Sub1_67;
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
	public void method7297() {
		while (true) {
			@Pc(13) Class2_Sub1 local13 = this.aClass2_Sub1_54.aClass2_Sub1_67;
			if (this.aClass2_Sub1_54 == local13) {
				this.aClass2_Sub1_55 = null;
				return;
			}
			local13.method9377();
		}
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)Lclient!daa;")
	public Class2_Sub1 method7298() {
		@Pc(11) Class2_Sub1 local11 = this.aClass2_Sub1_55;
		if (local11 == this.aClass2_Sub1_54) {
			this.aClass2_Sub1_55 = null;
			return null;
		} else {
			this.aClass2_Sub1_55 = local11.aClass2_Sub1_67;
			return local11;
		}
	}
}
