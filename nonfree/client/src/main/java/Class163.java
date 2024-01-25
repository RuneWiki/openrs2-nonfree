import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class163 {

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "Lclient!hn;")
	private final Class102 aClass102_33 = new Class102(64);

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "Lclient!hn;")
	public final Class102 aClass102_34 = new Class102(2);

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "Lclient!fo;")
	private final Class82 aClass82_61;

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "Lclient!fo;")
	public final Class82 aClass82_62;

	static {
		new Class119("Adventurer", "Abenteurer", "Aventurier", "Aventureira");
	}

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lclient!d;ILclient!fo;Lclient!fo;)V")
	public Class163(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class82 arg2, @OriginalArg(3) Class82 arg3) {
		this.aClass82_61 = arg2;
		this.aClass82_62 = arg3;
		this.aClass82_61.method1823(33);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
	public void method3748() {
		@Pc(13) Class102 local13 = this.aClass102_33;
		synchronized (this.aClass102_33) {
			this.aClass102_33.method2271();
		}
		local13 = this.aClass102_34;
		synchronized (this.aClass102_34) {
			this.aClass102_34.method2271();
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)Lclient!fn;")
	public Class81 method3752(@OriginalArg(1) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_33;
		@Pc(18) Class81 local18;
		synchronized (this.aClass102_33) {
			local18 = (Class81) this.aClass102_33.method2258((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class82 local31 = this.aClass82_61;
		@Pc(40) byte[] local40;
		synchronized (this.aClass82_61) {
			local40 = this.aClass82_61.method1817(33, arg0);
		}
		local18 = new Class81();
		local18.aClass163_2 = this;
		if (local40 != null) {
			local18.method1807(new Class1_Sub28(local40));
		}
		@Pc(67) Class102 local67 = this.aClass102_33;
		synchronized (this.aClass102_33) {
			this.aClass102_33.method2272((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
	public void method3753() {
		@Pc(12) Class102 local12 = this.aClass102_33;
		synchronized (this.aClass102_33) {
			this.aClass102_33.method2260();
		}
		local12 = this.aClass102_34;
		synchronized (this.aClass102_34) {
			this.aClass102_34.method2260();
		}
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(II)V")
	public void method3754() {
		@Pc(2) Class102 local2 = this.aClass102_33;
		synchronized (this.aClass102_33) {
			this.aClass102_33.method2262(5);
		}
		local2 = this.aClass102_34;
		synchronized (this.aClass102_34) {
			this.aClass102_34.method2262(5);
		}
	}
}
