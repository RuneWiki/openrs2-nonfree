import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class4 {

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "Lclient!mo;")
	private Class1_Sub1 aClass1_Sub1_10;

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "Lclient!mo;")
	private final Class1_Sub1 aClass1_Sub1_9 = new Class1_Sub1();

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
	public Class4() {
		this.aClass1_Sub1_9.aClass1_Sub1_61 = this.aClass1_Sub1_9;
		this.aClass1_Sub1_9.aClass1_Sub1_62 = this.aClass1_Sub1_9;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)Lclient!mo;")
	public Class1_Sub1 method177() {
		@Pc(7) Class1_Sub1 local7 = this.aClass1_Sub1_9.aClass1_Sub1_61;
		if (this.aClass1_Sub1_9 == local7) {
			this.aClass1_Sub1_10 = null;
			return null;
		} else {
			this.aClass1_Sub1_10 = local7.aClass1_Sub1_61;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)I")
	public int method178() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class1_Sub1 local11 = this.aClass1_Sub1_9.aClass1_Sub1_61; local11 != this.aClass1_Sub1_9; local11 = local11.aClass1_Sub1_61) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
	public void method179() {
		while (true) {
			@Pc(5) Class1_Sub1 local5 = this.aClass1_Sub1_9.aClass1_Sub1_61;
			if (this.aClass1_Sub1_9 == local5) {
				this.aClass1_Sub1_10 = null;
				return;
			}
			local5.method5564();
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!mo;Z)V")
	public void method180(@OriginalArg(0) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_62 != null) {
			arg0.method5564();
		}
		arg0.aClass1_Sub1_61 = this.aClass1_Sub1_9;
		arg0.aClass1_Sub1_62 = this.aClass1_Sub1_9.aClass1_Sub1_62;
		arg0.aClass1_Sub1_62.aClass1_Sub1_61 = arg0;
		arg0.aClass1_Sub1_61.aClass1_Sub1_62 = arg0;
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)Lclient!mo;")
	public Class1_Sub1 method182() {
		@Pc(12) Class1_Sub1 local12 = this.aClass1_Sub1_10;
		if (local12 == this.aClass1_Sub1_9) {
			this.aClass1_Sub1_10 = null;
			return null;
		} else {
			this.aClass1_Sub1_10 = local12.aClass1_Sub1_61;
			return local12;
		}
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)Lclient!mo;")
	public Class1_Sub1 method183() {
		@Pc(7) Class1_Sub1 local7 = this.aClass1_Sub1_9.aClass1_Sub1_61;
		if (this.aClass1_Sub1_9 == local7) {
			return null;
		} else {
			local7.method5564();
			return local7;
		}
	}
}
