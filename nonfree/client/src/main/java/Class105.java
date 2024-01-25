import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fga")
public final class Class105 {

	@OriginalMember(owner = "client!fga", name = "f", descriptor = "Lclient!eda;")
	private final Class87 aClass87_83 = new Class87(128);

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "Lclient!la;")
	private final Class207 aClass207_32;

	@OriginalMember(owner = "client!fga", name = "<init>", descriptor = "(Lclient!cr;ILclient!la;)V")
	public Class105(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class207 arg2) {
		this.aClass207_32 = arg2;
		if (this.aClass207_32 != null) {
			@Pc(20) int local20 = this.aClass207_32.method4685() - 1;
			this.aClass207_32.method4672(local20);
		}
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(II)Lclient!sia;")
	public Class318 method2218(@OriginalArg(1) int arg0) {
		@Pc(6) Class87 local6 = this.aClass87_83;
		@Pc(22) Class318 local22;
		synchronized (this.aClass87_83) {
			local22 = (Class318) this.aClass87_83.method1805((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(43) byte[] local43 = this.aClass207_32.method4681(Static122.method1867(arg0), Static164.method2363(arg0));
		local22 = new Class318();
		if (local43 != null) {
			local22.method7629(new Class5_Sub22(local43));
		}
		@Pc(59) Class87 local59 = this.aClass87_83;
		synchronized (this.aClass87_83) {
			this.aClass87_83.method1792((long) arg0, local22);
			return local22;
		}
	}
}
