import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class24 {

	@OriginalMember(owner = "client!bg", name = "n", descriptor = "Lclient!tm;")
	private Class7_Sub4 aClass7_Sub4_10;

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "Lclient!tm;")
	private final Class7_Sub4 aClass7_Sub4_9 = new Class7_Sub4();

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V")
	public Class24() {
		this.aClass7_Sub4_9.aClass7_Sub4_57 = this.aClass7_Sub4_9;
		this.aClass7_Sub4_9.aClass7_Sub4_58 = this.aClass7_Sub4_9;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLclient!tm;)V")
	public void method298(@OriginalArg(1) Class7_Sub4 arg0) {
		if (arg0.aClass7_Sub4_58 != null) {
			arg0.method5661();
		}
		arg0.aClass7_Sub4_57 = this.aClass7_Sub4_9;
		arg0.aClass7_Sub4_58 = this.aClass7_Sub4_9.aClass7_Sub4_58;
		arg0.aClass7_Sub4_58.aClass7_Sub4_57 = arg0;
		arg0.aClass7_Sub4_57.aClass7_Sub4_58 = arg0;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
	public void method299() {
		while (true) {
			@Pc(5) Class7_Sub4 local5 = this.aClass7_Sub4_9.aClass7_Sub4_57;
			if (this.aClass7_Sub4_9 == local5) {
				this.aClass7_Sub4_10 = null;
				return;
			}
			local5.method5661();
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)Lclient!tm;")
	public Class7_Sub4 method301() {
		@Pc(11) Class7_Sub4 local11 = this.aClass7_Sub4_10;
		if (local11 == this.aClass7_Sub4_9) {
			this.aClass7_Sub4_10 = null;
			return null;
		} else {
			this.aClass7_Sub4_10 = local11.aClass7_Sub4_57;
			return local11;
		}
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)I")
	public int method302() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class7_Sub4 local11 = this.aClass7_Sub4_9.aClass7_Sub4_57; local11 != this.aClass7_Sub4_9; local11 = local11.aClass7_Sub4_57) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)Lclient!tm;")
	public Class7_Sub4 method303() {
		@Pc(7) Class7_Sub4 local7 = this.aClass7_Sub4_9.aClass7_Sub4_57;
		if (this.aClass7_Sub4_9 == local7) {
			this.aClass7_Sub4_10 = null;
			return null;
		} else {
			this.aClass7_Sub4_10 = local7.aClass7_Sub4_57;
			return local7;
		}
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(B)Lclient!tm;")
	public Class7_Sub4 method308() {
		@Pc(7) Class7_Sub4 local7 = this.aClass7_Sub4_9.aClass7_Sub4_57;
		if (this.aClass7_Sub4_9 == local7) {
			return null;
		} else {
			local7.method5661();
			return local7;
		}
	}
}
