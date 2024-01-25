import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oga")
public final class Class253 {

	@OriginalMember(owner = "client!oga", name = "o", descriptor = "Lclient!mk;")
	private Class2_Sub2 aClass2_Sub2_45;

	@OriginalMember(owner = "client!oga", name = "n", descriptor = "Lclient!mk;")
	private final Class2_Sub2 aClass2_Sub2_44 = new Class2_Sub2();

	@OriginalMember(owner = "client!oga", name = "<init>", descriptor = "()V")
	public Class253() {
		this.aClass2_Sub2_44.aClass2_Sub2_61 = this.aClass2_Sub2_44;
		this.aClass2_Sub2_44.aClass2_Sub2_62 = this.aClass2_Sub2_44;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(Z)V")
	public void method5320() {
		while (true) {
			@Pc(9) Class2_Sub2 local9 = this.aClass2_Sub2_44.aClass2_Sub2_62;
			if (this.aClass2_Sub2_44 == local9) {
				this.aClass2_Sub2_45 = null;
				return;
			}
			local9.method7659();
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(I)Lclient!mk;")
	public Class2_Sub2 method5321() {
		@Pc(15) Class2_Sub2 local15 = this.aClass2_Sub2_44.aClass2_Sub2_62;
		if (local15 == this.aClass2_Sub2_44) {
			this.aClass2_Sub2_45 = null;
			return null;
		} else {
			this.aClass2_Sub2_45 = local15.aClass2_Sub2_62;
			return local15;
		}
	}

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "(Z)I")
	public int method5322() {
		@Pc(13) int local13 = 0;
		@Pc(17) Class2_Sub2 local17 = this.aClass2_Sub2_44.aClass2_Sub2_62;
		while (this.aClass2_Sub2_44 != local17) {
			local17 = local17.aClass2_Sub2_62;
			local13++;
		}
		return local13;
	}

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "(I)Lclient!mk;")
	public Class2_Sub2 method5323() {
		@Pc(12) Class2_Sub2 local12 = this.aClass2_Sub2_45;
		if (local12 == this.aClass2_Sub2_44) {
			this.aClass2_Sub2_45 = null;
			return null;
		} else {
			this.aClass2_Sub2_45 = local12.aClass2_Sub2_62;
			return local12;
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(B)Lclient!mk;")
	public Class2_Sub2 method5325() {
		@Pc(7) Class2_Sub2 local7 = this.aClass2_Sub2_44.aClass2_Sub2_61;
		if (local7 == this.aClass2_Sub2_44) {
			return null;
		} else {
			local7.method7659();
			return local7;
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(ILclient!mk;)V")
	public void method5326(@OriginalArg(1) Class2_Sub2 arg0) {
		if (arg0.aClass2_Sub2_61 != null) {
			arg0.method7659();
		}
		arg0.aClass2_Sub2_61 = this.aClass2_Sub2_44;
		arg0.aClass2_Sub2_62 = this.aClass2_Sub2_44.aClass2_Sub2_62;
		arg0.aClass2_Sub2_61.aClass2_Sub2_62 = arg0;
		arg0.aClass2_Sub2_62.aClass2_Sub2_61 = arg0;
	}

	@OriginalMember(owner = "client!oga", name = "c", descriptor = "(I)Lclient!mk;")
	public Class2_Sub2 method5327() {
		@Pc(7) Class2_Sub2 local7 = this.aClass2_Sub2_44.aClass2_Sub2_62;
		if (this.aClass2_Sub2_44 == local7) {
			return null;
		} else {
			local7.method7659();
			return local7;
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(Lclient!mk;I)V")
	public void method5329(@OriginalArg(0) Class2_Sub2 arg0) {
		if (arg0.aClass2_Sub2_61 != null) {
			arg0.method7659();
		}
		arg0.aClass2_Sub2_62 = this.aClass2_Sub2_44;
		arg0.aClass2_Sub2_61 = this.aClass2_Sub2_44.aClass2_Sub2_61;
		arg0.aClass2_Sub2_61.aClass2_Sub2_62 = arg0;
		arg0.aClass2_Sub2_62.aClass2_Sub2_61 = arg0;
	}
}
