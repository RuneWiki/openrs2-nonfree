import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class60 {

	@OriginalMember(owner = "client!dq", name = "l", descriptor = "Lclient!sp;")
	private Class41_Sub3 aClass41_Sub3_2;

	@OriginalMember(owner = "client!dq", name = "f", descriptor = "Lclient!sp;")
	public final Class41_Sub3 aClass41_Sub3_1 = new Class41_Sub3();

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "()V")
	public Class60() {
		this.aClass41_Sub3_1.aClass41_Sub3_10 = this.aClass41_Sub3_1;
		this.aClass41_Sub3_1.aClass41_Sub3_9 = this.aClass41_Sub3_1;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)I")
	public int method1505() {
		@Pc(7) int local7 = 0;
		for (@Pc(19) Class41_Sub3 local19 = this.aClass41_Sub3_1.aClass41_Sub3_9; local19 != this.aClass41_Sub3_1; local19 = local19.aClass41_Sub3_9) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)V")
	public void method1508() {
		while (true) {
			@Pc(8) Class41_Sub3 local8 = this.aClass41_Sub3_1.aClass41_Sub3_9;
			if (this.aClass41_Sub3_1 == local8) {
				this.aClass41_Sub3_2 = null;
				return;
			}
			local8.method4327();
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILclient!sp;)V")
	public void method1511(@OriginalArg(1) Class41_Sub3 arg0) {
		if (arg0.aClass41_Sub3_10 != null) {
			arg0.method4327();
		}
		arg0.aClass41_Sub3_10 = this.aClass41_Sub3_1.aClass41_Sub3_10;
		arg0.aClass41_Sub3_9 = this.aClass41_Sub3_1;
		arg0.aClass41_Sub3_10.aClass41_Sub3_9 = arg0;
		arg0.aClass41_Sub3_9.aClass41_Sub3_10 = arg0;
	}

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "(B)Lclient!sp;")
	public Class41_Sub3 method1512() {
		@Pc(14) Class41_Sub3 local14 = this.aClass41_Sub3_2;
		if (this.aClass41_Sub3_1 == local14) {
			this.aClass41_Sub3_2 = null;
			return null;
		} else {
			this.aClass41_Sub3_2 = local14.aClass41_Sub3_9;
			return local14;
		}
	}

	@OriginalMember(owner = "client!dq", name = "d", descriptor = "(I)Lclient!sp;")
	public Class41_Sub3 method1513() {
		@Pc(11) Class41_Sub3 local11 = this.aClass41_Sub3_1.aClass41_Sub3_9;
		if (this.aClass41_Sub3_1 == local11) {
			this.aClass41_Sub3_2 = null;
			return null;
		} else {
			this.aClass41_Sub3_2 = local11.aClass41_Sub3_9;
			return local11;
		}
	}
}
