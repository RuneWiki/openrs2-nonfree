import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class10 {

	@OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
	public int anInt231;

	@OriginalMember(owner = "client!ag", name = "m", descriptor = "Lclient!eda;")
	private final Class87 aClass87_10 = new Class87(64);

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "Lclient!eda;")
	public final Class87 aClass87_11 = new Class87(60);

	@OriginalMember(owner = "client!ag", name = "n", descriptor = "Lclient!la;")
	private final Class207 aClass207_4;

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "Lclient!la;")
	public final Class207 aClass207_3;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lclient!cr;ILclient!la;Lclient!la;)V")
	public Class10(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class207 arg2, @OriginalArg(3) Class207 arg3) {
		this.aClass207_4 = arg2;
		this.aClass207_3 = arg3;
		@Pc(26) int local26 = this.aClass207_4.method4685() - 1;
		this.aClass207_4.method4672(local26);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)V")
	public void method210() {
		@Pc(2) Class87 local2 = this.aClass87_10;
		synchronized (this.aClass87_10) {
			this.aClass87_10.method1801();
		}
		local2 = this.aClass87_11;
		synchronized (this.aClass87_11) {
			this.aClass87_11.method1801();
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BI)Lclient!du;")
	public Class82 method211(@OriginalArg(1) int arg0) {
		@Pc(11) Class87 local11 = this.aClass87_10;
		@Pc(21) Class82 local21;
		synchronized (this.aClass87_10) {
			local21 = (Class82) this.aClass87_10.method1805((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class207 local34 = this.aClass207_4;
		@Pc(47) byte[] local47;
		synchronized (this.aClass207_4) {
			local47 = this.aClass207_4.method4681(Static139.method2024(arg0), Static361.method8005(arg0));
		}
		local21 = new Class82();
		local21.aClass10_2 = this;
		local21.anInt2047 = arg0;
		if (local47 != null) {
			local21.method1688(new Class5_Sub22(local47));
		}
		@Pc(75) Class87 local75 = this.aClass87_10;
		synchronized (this.aClass87_10) {
			this.aClass87_10.method1792((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)V")
	public void method213() {
		@Pc(2) Class87 local2 = this.aClass87_10;
		synchronized (this.aClass87_10) {
			this.aClass87_10.method1793(5);
		}
		local2 = this.aClass87_11;
		synchronized (this.aClass87_11) {
			this.aClass87_11.method1793(5);
		}
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(BI)V")
	public void method214(@OriginalArg(1) int arg0) {
		this.anInt231 = arg0;
		@Pc(9) Class87 local9 = this.aClass87_11;
		synchronized (this.aClass87_11) {
			this.aClass87_11.method1801();
		}
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(Z)V")
	public void method215() {
		@Pc(6) Class87 local6 = this.aClass87_10;
		synchronized (this.aClass87_10) {
			this.aClass87_10.method1796();
		}
		local6 = this.aClass87_11;
		synchronized (this.aClass87_11) {
			this.aClass87_11.method1796();
		}
	}
}
