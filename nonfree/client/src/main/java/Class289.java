import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qha")
public final class Class289 {

	@OriginalMember(owner = "client!qha", name = "d", descriptor = "Lclient!eda;")
	private final Class87 aClass87_189 = new Class87(64);

	@OriginalMember(owner = "client!qha", name = "k", descriptor = "I")
	public int anInt7734 = 0;

	@OriginalMember(owner = "client!qha", name = "i", descriptor = "Lclient!la;")
	private final Class207 aClass207_93;

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "I")
	public final int anInt7727;

	@OriginalMember(owner = "client!qha", name = "<init>", descriptor = "(Lclient!cr;ILclient!la;)V")
	public Class289(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class207 arg2) {
		this.aClass207_93 = arg2;
		this.anInt7727 = this.aClass207_93.method4672(4);
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(B)V")
	public void method6818() {
		@Pc(6) Class87 local6 = this.aClass87_189;
		synchronized (this.aClass87_189) {
			this.aClass87_189.method1796();
		}
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(I)V")
	public void method6819() {
		@Pc(2) Class87 local2 = this.aClass87_189;
		synchronized (this.aClass87_189) {
			this.aClass87_189.method1801();
		}
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(II)Lclient!mw;")
	public Class239 method6822(@OriginalArg(1) int arg0) {
		@Pc(6) Class87 local6 = this.aClass87_189;
		@Pc(16) Class239 local16;
		synchronized (this.aClass87_189) {
			local16 = (Class239) this.aClass87_189.method1805((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class207 local29 = this.aClass207_93;
		@Pc(38) byte[] local38;
		synchronized (this.aClass207_93) {
			local38 = this.aClass207_93.method4681(4, arg0);
		}
		local16 = new Class239();
		local16.aClass289_4 = this;
		local16.anInt5974 = arg0;
		if (local38 != null) {
			local16.method5308(new Class5_Sub22(local38));
		}
		local16.method5310();
		@Pc(69) Class87 local69 = this.aClass87_189;
		synchronized (this.aClass87_189) {
			this.aClass87_189.method1792((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(BI)V")
	public void method6824() {
		@Pc(6) Class87 local6 = this.aClass87_189;
		synchronized (this.aClass87_189) {
			this.aClass87_189.method1793(5);
		}
	}
}
