import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class77 {

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "Lclient!aj;")
	private Class12_Sub1 aClass12_Sub1_6;

	@OriginalMember(owner = "client!dp", name = "d", descriptor = "Lclient!aj;")
	public final Class12_Sub1 aClass12_Sub1_5 = new Class12_Sub1();

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "()V")
	public Class77() {
		this.aClass12_Sub1_5.aClass12_Sub1_9 = this.aClass12_Sub1_5;
		this.aClass12_Sub1_5.aClass12_Sub1_10 = this.aClass12_Sub1_5;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)Lclient!aj;")
	public Class12_Sub1 method1505() {
		@Pc(14) Class12_Sub1 local14 = this.aClass12_Sub1_6;
		if (local14 == this.aClass12_Sub1_5) {
			this.aClass12_Sub1_6 = null;
			return null;
		} else {
			this.aClass12_Sub1_6 = local14.aClass12_Sub1_9;
			return local14;
		}
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)Lclient!aj;")
	public Class12_Sub1 method1506() {
		@Pc(7) Class12_Sub1 local7 = this.aClass12_Sub1_5.aClass12_Sub1_9;
		if (this.aClass12_Sub1_5 == local7) {
			this.aClass12_Sub1_6 = null;
			return null;
		} else {
			this.aClass12_Sub1_6 = local7.aClass12_Sub1_9;
			return local7;
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)V")
	public void method1507() {
		while (true) {
			@Pc(5) Class12_Sub1 local5 = this.aClass12_Sub1_5.aClass12_Sub1_9;
			if (local5 == this.aClass12_Sub1_5) {
				this.aClass12_Sub1_6 = null;
				return;
			}
			local5.method5462();
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILclient!aj;)V")
	public void method1510(@OriginalArg(1) Class12_Sub1 arg0) {
		if (arg0.aClass12_Sub1_10 != null) {
			arg0.method5462();
		}
		arg0.aClass12_Sub1_10 = this.aClass12_Sub1_5.aClass12_Sub1_10;
		arg0.aClass12_Sub1_9 = this.aClass12_Sub1_5;
		arg0.aClass12_Sub1_10.aClass12_Sub1_9 = arg0;
		arg0.aClass12_Sub1_9.aClass12_Sub1_10 = arg0;
	}

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "(I)I")
	public int method1512() {
		@Pc(7) int local7 = 0;
		for (@Pc(19) Class12_Sub1 local19 = this.aClass12_Sub1_5.aClass12_Sub1_9; local19 != this.aClass12_Sub1_5; local19 = local19.aClass12_Sub1_9) {
			local7++;
		}
		return local7;
	}
}
