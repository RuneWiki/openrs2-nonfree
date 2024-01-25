import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class187 {

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "Lclient!hq;")
	private Class21_Sub1 aClass21_Sub1_10;

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "Lclient!hq;")
	public final Class21_Sub1 aClass21_Sub1_9 = new Class21_Sub1();

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
	public Class187() {
		this.aClass21_Sub1_9.aClass21_Sub1_8 = this.aClass21_Sub1_9;
		this.aClass21_Sub1_9.aClass21_Sub1_7 = this.aClass21_Sub1_9;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)Lclient!hq;")
	public Class21_Sub1 method3970() {
		@Pc(6) Class21_Sub1 local6 = this.aClass21_Sub1_10;
		if (this.aClass21_Sub1_9 == local6) {
			this.aClass21_Sub1_10 = null;
			return null;
		} else {
			this.aClass21_Sub1_10 = local6.aClass21_Sub1_7;
			return local6;
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)I")
	public int method3972() {
		@Pc(7) int local7 = 0;
		for (@Pc(19) Class21_Sub1 local19 = this.aClass21_Sub1_9.aClass21_Sub1_7; local19 != this.aClass21_Sub1_9; local19 = local19.aClass21_Sub1_7) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)Lclient!hq;")
	public Class21_Sub1 method3974() {
		@Pc(7) Class21_Sub1 local7 = this.aClass21_Sub1_9.aClass21_Sub1_7;
		if (this.aClass21_Sub1_9 == local7) {
			this.aClass21_Sub1_10 = null;
			return null;
		} else {
			this.aClass21_Sub1_10 = local7.aClass21_Sub1_7;
			return local7;
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
	public void method3975() {
		while (true) {
			@Pc(13) Class21_Sub1 local13 = this.aClass21_Sub1_9.aClass21_Sub1_7;
			if (local13 == this.aClass21_Sub1_9) {
				this.aClass21_Sub1_10 = null;
				return;
			}
			local13.method2008();
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!hq;)V")
	public void method3978(@OriginalArg(1) Class21_Sub1 arg0) {
		if (arg0.aClass21_Sub1_8 != null) {
			arg0.method2008();
		}
		arg0.aClass21_Sub1_7 = this.aClass21_Sub1_9;
		arg0.aClass21_Sub1_8 = this.aClass21_Sub1_9.aClass21_Sub1_8;
		arg0.aClass21_Sub1_8.aClass21_Sub1_7 = arg0;
		arg0.aClass21_Sub1_7.aClass21_Sub1_8 = arg0;
	}
}
