import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hia")
public final class Class137 {

	@OriginalMember(owner = "client!hia", name = "h", descriptor = "Lclient!je;")
	private Class28_Sub4 aClass28_Sub4_2;

	@OriginalMember(owner = "client!hia", name = "b", descriptor = "Lclient!je;")
	public final Class28_Sub4 aClass28_Sub4_1 = new Class28_Sub4();

	@OriginalMember(owner = "client!hia", name = "<init>", descriptor = "()V")
	public Class137() {
		this.aClass28_Sub4_1.aClass28_Sub4_10 = this.aClass28_Sub4_1;
		this.aClass28_Sub4_1.aClass28_Sub4_9 = this.aClass28_Sub4_1;
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(BLclient!je;)V")
	public void method3829(@OriginalArg(1) Class28_Sub4 arg0) {
		if (arg0.aClass28_Sub4_10 != null) {
			arg0.method8430();
		}
		arg0.aClass28_Sub4_10 = this.aClass28_Sub4_1.aClass28_Sub4_10;
		arg0.aClass28_Sub4_9 = this.aClass28_Sub4_1;
		arg0.aClass28_Sub4_10.aClass28_Sub4_9 = arg0;
		arg0.aClass28_Sub4_9.aClass28_Sub4_10 = arg0;
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(B)I")
	public int method3830() {
		@Pc(12) int local12 = 0;
		for (@Pc(16) Class28_Sub4 local16 = this.aClass28_Sub4_1.aClass28_Sub4_9; local16 != this.aClass28_Sub4_1; local16 = local16.aClass28_Sub4_9) {
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(Z)Lclient!je;")
	public Class28_Sub4 method3831() {
		@Pc(6) Class28_Sub4 local6 = this.aClass28_Sub4_2;
		if (this.aClass28_Sub4_1 == local6) {
			this.aClass28_Sub4_2 = null;
			return null;
		} else {
			this.aClass28_Sub4_2 = local6.aClass28_Sub4_9;
			return local6;
		}
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(I)V")
	public void method3832() {
		while (true) {
			@Pc(14) Class28_Sub4 local14 = this.aClass28_Sub4_1.aClass28_Sub4_9;
			if (local14 == this.aClass28_Sub4_1) {
				this.aClass28_Sub4_2 = null;
				return;
			}
			local14.method8430();
		}
	}

	@OriginalMember(owner = "client!hia", name = "c", descriptor = "(I)Lclient!je;")
	public Class28_Sub4 method3834() {
		@Pc(7) Class28_Sub4 local7 = this.aClass28_Sub4_1.aClass28_Sub4_9;
		if (local7 == this.aClass28_Sub4_1) {
			this.aClass28_Sub4_2 = null;
			return null;
		} else {
			this.aClass28_Sub4_2 = local7.aClass28_Sub4_9;
			return local7;
		}
	}
}
