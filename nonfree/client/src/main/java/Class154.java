import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hca")
public final class Class154 {

	@OriginalMember(owner = "client!hca", name = "m", descriptor = "Lclient!oc;")
	private Class8_Sub8 aClass8_Sub8_2;

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "Lclient!oc;")
	public final Class8_Sub8 aClass8_Sub8_1 = new Class8_Sub8();

	@OriginalMember(owner = "client!hca", name = "<init>", descriptor = "()V")
	public Class154() {
		this.aClass8_Sub8_1.aClass8_Sub8_9 = this.aClass8_Sub8_1;
		this.aClass8_Sub8_1.aClass8_Sub8_10 = this.aClass8_Sub8_1;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(BLclient!oc;)V")
	public void method3046(@OriginalArg(1) Class8_Sub8 arg0) {
		if (arg0.aClass8_Sub8_9 != null) {
			arg0.method6981();
		}
		arg0.aClass8_Sub8_9 = this.aClass8_Sub8_1.aClass8_Sub8_9;
		arg0.aClass8_Sub8_10 = this.aClass8_Sub8_1;
		arg0.aClass8_Sub8_9.aClass8_Sub8_10 = arg0;
		arg0.aClass8_Sub8_10.aClass8_Sub8_9 = arg0;
	}

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "(B)V")
	public void method3047() {
		while (true) {
			@Pc(5) Class8_Sub8 local5 = this.aClass8_Sub8_1.aClass8_Sub8_10;
			if (local5 == this.aClass8_Sub8_1) {
				this.aClass8_Sub8_2 = null;
				return;
			}
			local5.method6981();
		}
	}

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "(I)Lclient!oc;")
	public Class8_Sub8 method3049() {
		@Pc(7) Class8_Sub8 local7 = this.aClass8_Sub8_1.aClass8_Sub8_10;
		if (this.aClass8_Sub8_1 == local7) {
			this.aClass8_Sub8_2 = null;
			return null;
		} else {
			this.aClass8_Sub8_2 = local7.aClass8_Sub8_10;
			return local7;
		}
	}

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "(B)I")
	public int method3050() {
		@Pc(16) int local16 = 0;
		for (@Pc(20) Class8_Sub8 local20 = this.aClass8_Sub8_1.aClass8_Sub8_10; local20 != this.aClass8_Sub8_1; local20 = local20.aClass8_Sub8_10) {
			local16++;
		}
		return local16;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(B)Lclient!oc;")
	public Class8_Sub8 method3051() {
		@Pc(12) Class8_Sub8 local12 = this.aClass8_Sub8_2;
		if (local12 == this.aClass8_Sub8_1) {
			this.aClass8_Sub8_2 = null;
			return null;
		} else {
			this.aClass8_Sub8_2 = local12.aClass8_Sub8_10;
			return local12;
		}
	}
}
