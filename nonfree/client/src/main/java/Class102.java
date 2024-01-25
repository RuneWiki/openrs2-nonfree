import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class102 {

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "Lclient!lr;")
	private Class11_Sub5 aClass11_Sub5_2;

	@OriginalMember(owner = "client!fk", name = "i", descriptor = "Lclient!lr;")
	public final Class11_Sub5 aClass11_Sub5_1 = new Class11_Sub5();

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V")
	public Class102() {
		this.aClass11_Sub5_1.aClass11_Sub5_9 = this.aClass11_Sub5_1;
		this.aClass11_Sub5_1.aClass11_Sub5_10 = this.aClass11_Sub5_1;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)Lclient!lr;")
	public Class11_Sub5 method2415() {
		@Pc(6) Class11_Sub5 local6 = this.aClass11_Sub5_2;
		if (local6 == this.aClass11_Sub5_1) {
			this.aClass11_Sub5_2 = null;
			return null;
		} else {
			this.aClass11_Sub5_2 = local6.aClass11_Sub5_9;
			return local6;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZLclient!lr;)V")
	public void method2417(@OriginalArg(1) Class11_Sub5 arg0) {
		if (arg0.aClass11_Sub5_10 != null) {
			arg0.method3920();
		}
		arg0.aClass11_Sub5_9 = this.aClass11_Sub5_1;
		arg0.aClass11_Sub5_10 = this.aClass11_Sub5_1.aClass11_Sub5_10;
		arg0.aClass11_Sub5_10.aClass11_Sub5_9 = arg0;
		arg0.aClass11_Sub5_9.aClass11_Sub5_10 = arg0;
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)Lclient!lr;")
	public Class11_Sub5 method2420() {
		@Pc(12) Class11_Sub5 local12 = this.aClass11_Sub5_1.aClass11_Sub5_9;
		if (this.aClass11_Sub5_1 == local12) {
			this.aClass11_Sub5_2 = null;
			return null;
		} else {
			this.aClass11_Sub5_2 = local12.aClass11_Sub5_9;
			return local12;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)I")
	public int method2421() {
		@Pc(12) int local12 = 0;
		for (@Pc(16) Class11_Sub5 local16 = this.aClass11_Sub5_1.aClass11_Sub5_9; local16 != this.aClass11_Sub5_1; local16 = local16.aClass11_Sub5_9) {
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)V")
	public void method2423() {
		while (true) {
			@Pc(5) Class11_Sub5 local5 = this.aClass11_Sub5_1.aClass11_Sub5_9;
			if (this.aClass11_Sub5_1 == local5) {
				this.aClass11_Sub5_2 = null;
				return;
			}
			local5.method3920();
		}
	}
}
