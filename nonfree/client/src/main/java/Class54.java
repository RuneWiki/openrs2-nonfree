import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class54 {

	@OriginalMember(owner = "client!ek", name = "o", descriptor = "Lclient!fs;")
	private Class2_Sub11 aClass2_Sub11_9;

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "Lclient!fs;")
	private final Class2_Sub11 aClass2_Sub11_8 = new Class2_Sub11();

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
	public Class54() {
		this.aClass2_Sub11_8.aClass2_Sub11_61 = this.aClass2_Sub11_8;
		this.aClass2_Sub11_8.aClass2_Sub11_62 = this.aClass2_Sub11_8;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)Lclient!fs;")
	public Class2_Sub11 method1657() {
		@Pc(14) Class2_Sub11 local14 = this.aClass2_Sub11_9;
		if (local14 == this.aClass2_Sub11_8) {
			this.aClass2_Sub11_9 = null;
			return null;
		} else {
			this.aClass2_Sub11_9 = local14.aClass2_Sub11_62;
			return local14;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)Lclient!fs;")
	public Class2_Sub11 method1658() {
		@Pc(13) Class2_Sub11 local13 = this.aClass2_Sub11_8.aClass2_Sub11_62;
		if (this.aClass2_Sub11_8 == local13) {
			return null;
		} else {
			local13.method5914();
			return local13;
		}
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)I")
	public int method1659() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class2_Sub11 local11 = this.aClass2_Sub11_8.aClass2_Sub11_62;
		while (this.aClass2_Sub11_8 != local11) {
			local11 = local11.aClass2_Sub11_62;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)V")
	public void method1660() {
		while (true) {
			@Pc(17) Class2_Sub11 local17 = this.aClass2_Sub11_8.aClass2_Sub11_62;
			if (this.aClass2_Sub11_8 == local17) {
				this.aClass2_Sub11_9 = null;
				return;
			}
			local17.method5914();
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)Lclient!fs;")
	public Class2_Sub11 method1661() {
		@Pc(7) Class2_Sub11 local7 = this.aClass2_Sub11_8.aClass2_Sub11_62;
		if (local7 == this.aClass2_Sub11_8) {
			this.aClass2_Sub11_9 = null;
			return null;
		} else {
			this.aClass2_Sub11_9 = local7.aClass2_Sub11_62;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILclient!fs;)V")
	public void method1662(@OriginalArg(1) Class2_Sub11 arg0) {
		if (arg0.aClass2_Sub11_61 != null) {
			arg0.method5914();
		}
		arg0.aClass2_Sub11_62 = this.aClass2_Sub11_8;
		arg0.aClass2_Sub11_61 = this.aClass2_Sub11_8.aClass2_Sub11_61;
		arg0.aClass2_Sub11_61.aClass2_Sub11_62 = arg0;
		arg0.aClass2_Sub11_62.aClass2_Sub11_61 = arg0;
	}
}
