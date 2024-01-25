import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jda")
public final class Class174 {

	@OriginalMember(owner = "client!jda", name = "c", descriptor = "I")
	private int anInt4852;

	@OriginalMember(owner = "client!jda", name = "g", descriptor = "I")
	public int anInt4856;

	@OriginalMember(owner = "client!jda", name = "h", descriptor = "Lclient!dp;")
	public Class81 aClass81_1;

	@OriginalMember(owner = "client!jda", name = "k", descriptor = "I")
	public int anInt4859;

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(I)Lclient!hb;")
	public synchronized Class139 method4277() {
		@Pc(13) Class139 local13 = (Class139) this.aClass81_1.aClass69_14.method1919((long) this.anInt4852);
		if (local13 != null) {
			return local13;
		}
		local13 = Static654.method3455(this.aClass81_1.aClass238_53, this.anInt4852, 0);
		if (local13 != null) {
			this.aClass81_1.aClass69_14.method1917((long) this.anInt4852, local13);
		}
		return local13;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(BILclient!sl;)V")
	private void method4279(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub17 arg1) {
		if (arg0 == 1) {
			this.anInt4852 = arg1.method2825();
		} else if (arg0 == 2) {
			this.anInt4856 = arg1.method2859();
			this.anInt4859 = arg1.method2859();
			return;
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lclient!sl;I)V")
	public void method4280(@OriginalArg(0) Class2_Sub17 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method2859();
			if (local3 == 0) {
				return;
			}
			this.method4279(local3, arg0);
		}
	}
}
