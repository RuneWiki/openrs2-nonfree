import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class143 {

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "I")
	public int anInt3809;

	@OriginalMember(owner = "client!hq", name = "d", descriptor = "I")
	private int anInt3812;

	@OriginalMember(owner = "client!hq", name = "i", descriptor = "Lclient!av;")
	public Class18 aClass18_1;

	@OriginalMember(owner = "client!hq", name = "k", descriptor = "I")
	public int anInt3816;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!ac;I)V")
	public void method3093(@OriginalArg(0) Class1_Sub3 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method7974();
			if (local10 == 0) {
				return;
			}
			this.method3098(arg0, local10);
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)Lclient!qga;")
	public synchronized Class282 method3094() {
		@Pc(13) Class282 local13 = (Class282) this.aClass18_1.aClass207_2.method4390((long) this.anInt3812);
		if (local13 != null) {
			return local13;
		}
		local13 = Static604.method6027(this.aClass18_1.aClass308_9, this.anInt3812, 0);
		if (local13 != null) {
			this.aClass18_1.aClass207_2.method4391((long) this.anInt3812, local13);
		}
		return local13;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!ac;BI)V")
	private void method3098(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3812 = arg0.method7945();
		} else if (arg1 == 2) {
			this.anInt3816 = arg0.method7974();
			this.anInt3809 = arg0.method7974();
		}
	}
}
