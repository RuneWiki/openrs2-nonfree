import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kea")
public final class Class190 {

	@OriginalMember(owner = "client!kea", name = "d", descriptor = "Lclient!af;")
	private final Class10 aClass10_30 = new Class10(128);

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "Lclient!ae;")
	private final Class8 aClass8_81;

	@OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(Lclient!jk;ILclient!ae;)V")
	public Class190(@OriginalArg(0) Class176 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2) {
		this.aClass8_81 = arg2;
		if (this.aClass8_81 != null) {
			@Pc(20) int local20 = this.aClass8_81.method279() - 1;
			this.aClass8_81.method280(local20);
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(II)Lclient!oha;")
	public Class255 method4283(@OriginalArg(1) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_30;
		@Pc(16) Class255 local16;
		synchronized (this.aClass10_30) {
			local16 = (Class255) this.aClass10_30.method373((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass8_81.method262(Static372.method5336(arg0), Static110.method1760(arg0));
		local16 = new Class255();
		if (local37 != null) {
			local16.method6289(new Class6_Sub23(local37));
		}
		@Pc(59) Class10 local59 = this.aClass10_30;
		synchronized (this.aClass10_30) {
			this.aClass10_30.method366(local16, (long) arg0);
			return local16;
		}
	}
}
