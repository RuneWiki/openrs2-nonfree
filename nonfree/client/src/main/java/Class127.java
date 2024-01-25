import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class127 {

	@OriginalMember(owner = "client!l", name = "i", descriptor = "Lclient!of;")
	private Class36_Sub2 aClass36_Sub2_6;

	@OriginalMember(owner = "client!l", name = "d", descriptor = "Lclient!of;")
	public final Class36_Sub2 aClass36_Sub2_5 = new Class36_Sub2();

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
	public Class127() {
		this.aClass36_Sub2_5.aClass36_Sub2_7 = this.aClass36_Sub2_5;
		this.aClass36_Sub2_5.aClass36_Sub2_8 = this.aClass36_Sub2_5;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)Lclient!of;")
	public Class36_Sub2 method3306() {
		@Pc(13) Class36_Sub2 local13 = this.aClass36_Sub2_6;
		if (local13 == this.aClass36_Sub2_5) {
			this.aClass36_Sub2_6 = null;
			return null;
		} else {
			this.aClass36_Sub2_6 = local13.aClass36_Sub2_8;
			return local13;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!of;I)V")
	public void method3307(@OriginalArg(0) Class36_Sub2 arg0) {
		if (arg0.aClass36_Sub2_7 != null) {
			arg0.method5323();
		}
		arg0.aClass36_Sub2_8 = this.aClass36_Sub2_5;
		arg0.aClass36_Sub2_7 = this.aClass36_Sub2_5.aClass36_Sub2_7;
		arg0.aClass36_Sub2_7.aClass36_Sub2_8 = arg0;
		arg0.aClass36_Sub2_8.aClass36_Sub2_7 = arg0;
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(I)Lclient!of;")
	public Class36_Sub2 method3311() {
		@Pc(7) Class36_Sub2 local7 = this.aClass36_Sub2_5.aClass36_Sub2_8;
		if (this.aClass36_Sub2_5 == local7) {
			this.aClass36_Sub2_6 = null;
			return null;
		} else {
			this.aClass36_Sub2_6 = local7.aClass36_Sub2_8;
			return local7;
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(B)V")
	public void method3313() {
		while (true) {
			@Pc(3) Class36_Sub2 local3 = this.aClass36_Sub2_5.aClass36_Sub2_8;
			if (local3 == this.aClass36_Sub2_5) {
				this.aClass36_Sub2_6 = null;
				return;
			}
			local3.method5323();
		}
	}
}
