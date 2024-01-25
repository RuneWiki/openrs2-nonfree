import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class120 {

	@OriginalMember(owner = "client!hi", name = "n", descriptor = "Lclient!dw;")
	private Class2_Sub4 aClass2_Sub4_8;

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "Lclient!dw;")
	public final Class2_Sub4 aClass2_Sub4_7 = new Class2_Sub4();

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
	public Class120() {
		this.aClass2_Sub4_7.aClass2_Sub4_10 = this.aClass2_Sub4_7;
		this.aClass2_Sub4_7.aClass2_Sub4_9 = this.aClass2_Sub4_7;
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)I")
	public int method3471() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class2_Sub4 local11 = this.aClass2_Sub4_7.aClass2_Sub4_9; local11 != this.aClass2_Sub4_7; local11 = local11.aClass2_Sub4_9) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)V")
	public void method3472() {
		while (true) {
			@Pc(15) Class2_Sub4 local15 = this.aClass2_Sub4_7.aClass2_Sub4_9;
			if (this.aClass2_Sub4_7 == local15) {
				this.aClass2_Sub4_8 = null;
				return;
			}
			local15.method5684();
		}
	}

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "(I)Lclient!dw;")
	public Class2_Sub4 method3474() {
		@Pc(7) Class2_Sub4 local7 = this.aClass2_Sub4_7.aClass2_Sub4_9;
		if (local7 == this.aClass2_Sub4_7) {
			this.aClass2_Sub4_8 = null;
			return null;
		} else {
			this.aClass2_Sub4_8 = local7.aClass2_Sub4_9;
			return local7;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!dw;I)V")
	public void method3476(@OriginalArg(0) Class2_Sub4 arg0) {
		if (arg0.aClass2_Sub4_10 != null) {
			arg0.method5684();
		}
		arg0.aClass2_Sub4_10 = this.aClass2_Sub4_7.aClass2_Sub4_10;
		arg0.aClass2_Sub4_9 = this.aClass2_Sub4_7;
		arg0.aClass2_Sub4_10.aClass2_Sub4_9 = arg0;
		arg0.aClass2_Sub4_9.aClass2_Sub4_10 = arg0;
	}

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "(I)Lclient!dw;")
	public Class2_Sub4 method3477() {
		@Pc(6) Class2_Sub4 local6 = this.aClass2_Sub4_8;
		if (local6 == this.aClass2_Sub4_7) {
			this.aClass2_Sub4_8 = null;
			return null;
		} else {
			this.aClass2_Sub4_8 = local6.aClass2_Sub4_9;
			return local6;
		}
	}
}
