import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class313 {

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "Lclient!bw;")
	private Class7_Sub1 aClass7_Sub1_10;

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "Lclient!bw;")
	public final Class7_Sub1 aClass7_Sub1_9 = new Class7_Sub1();

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
	public Class313() {
		this.aClass7_Sub1_9.aClass7_Sub1_7 = this.aClass7_Sub1_9;
		this.aClass7_Sub1_9.aClass7_Sub1_8 = this.aClass7_Sub1_9;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!bw;B)V")
	public void method7870(@OriginalArg(0) Class7_Sub1 arg0) {
		if (arg0.aClass7_Sub1_7 != null) {
			arg0.method7360();
		}
		arg0.aClass7_Sub1_7 = this.aClass7_Sub1_9.aClass7_Sub1_7;
		arg0.aClass7_Sub1_8 = this.aClass7_Sub1_9;
		arg0.aClass7_Sub1_7.aClass7_Sub1_8 = arg0;
		arg0.aClass7_Sub1_8.aClass7_Sub1_7 = arg0;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)I")
	public int method7871() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class7_Sub1 local11 = this.aClass7_Sub1_9.aClass7_Sub1_8; local11 != this.aClass7_Sub1_9; local11 = local11.aClass7_Sub1_8) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)Lclient!bw;")
	public Class7_Sub1 method7872() {
		@Pc(15) Class7_Sub1 local15 = this.aClass7_Sub1_10;
		if (this.aClass7_Sub1_9 == local15) {
			this.aClass7_Sub1_10 = null;
			return null;
		} else {
			this.aClass7_Sub1_10 = local15.aClass7_Sub1_8;
			return local15;
		}
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)Lclient!bw;")
	public Class7_Sub1 method7873() {
		@Pc(7) Class7_Sub1 local7 = this.aClass7_Sub1_9.aClass7_Sub1_8;
		if (this.aClass7_Sub1_9 == local7) {
			this.aClass7_Sub1_10 = null;
			return null;
		} else {
			this.aClass7_Sub1_10 = local7.aClass7_Sub1_8;
			return local7;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
	public void method7876() {
		while (true) {
			@Pc(5) Class7_Sub1 local5 = this.aClass7_Sub1_9.aClass7_Sub1_8;
			if (this.aClass7_Sub1_9 == local5) {
				this.aClass7_Sub1_10 = null;
				return;
			}
			local5.method7360();
		}
	}
}
