import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class164 {

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "Lclient!ag;")
	private Class8_Sub1 aClass8_Sub1_63;

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "Lclient!ag;")
	private Class8_Sub1 aClass8_Sub1_62 = new Class8_Sub1();

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
	public Class164() {
		this.aClass8_Sub1_62.aClass8_Sub1_68 = this.aClass8_Sub1_62;
		this.aClass8_Sub1_62.aClass8_Sub1_69 = this.aClass8_Sub1_62;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)Lclient!ag;")
	public Class8_Sub1 method3988() {
		@Pc(13) Class8_Sub1 local13 = this.aClass8_Sub1_63;
		if (this.aClass8_Sub1_62 == local13) {
			this.aClass8_Sub1_63 = null;
			return null;
		} else {
			this.aClass8_Sub1_63 = local13.aClass8_Sub1_68;
			return local13;
		}
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)Lclient!ag;")
	public Class8_Sub1 method3989() {
		@Pc(7) Class8_Sub1 local7 = this.aClass8_Sub1_62.aClass8_Sub1_68;
		if (local7 == this.aClass8_Sub1_62) {
			this.aClass8_Sub1_63 = null;
			return null;
		} else {
			this.aClass8_Sub1_63 = local7.aClass8_Sub1_68;
			return local7;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)I")
	public int method3990() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class8_Sub1 local11 = this.aClass8_Sub1_62.aClass8_Sub1_68;
		while (local11 != this.aClass8_Sub1_62) {
			local11 = local11.aClass8_Sub1_68;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)Lclient!ag;")
	public Class8_Sub1 method3992() {
		@Pc(3) Class8_Sub1 local3 = this.aClass8_Sub1_62.aClass8_Sub1_68;
		if (this.aClass8_Sub1_62 == local3) {
			return null;
		} else {
			local3.method4277();
			return local3;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!ag;I)V")
	public void method3993(@OriginalArg(0) Class8_Sub1 arg0) {
		if (arg0.aClass8_Sub1_69 != null) {
			arg0.method4277();
		}
		arg0.aClass8_Sub1_68 = this.aClass8_Sub1_62;
		arg0.aClass8_Sub1_69 = this.aClass8_Sub1_62.aClass8_Sub1_69;
		arg0.aClass8_Sub1_69.aClass8_Sub1_68 = arg0;
		arg0.aClass8_Sub1_68.aClass8_Sub1_69 = arg0;
	}

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)V")
	public void method3994() {
		while (true) {
			@Pc(5) Class8_Sub1 local5 = this.aClass8_Sub1_62.aClass8_Sub1_68;
			if (local5 == this.aClass8_Sub1_62) {
				this.aClass8_Sub1_63 = null;
				return;
			}
			local5.method4277();
		}
	}
}
