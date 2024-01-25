import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class67 {

	@OriginalMember(owner = "client!ei", name = "k", descriptor = "Lclient!tl;")
	private final Class227 aClass227_14 = new Class227(64);

	@OriginalMember(owner = "client!ei", name = "n", descriptor = "Lclient!tl;")
	private final Class227 aClass227_15 = new Class227(100);

	@OriginalMember(owner = "client!ei", name = "j", descriptor = "Lclient!ui;")
	private final Class230 aClass230_29;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lclient!gp;ILclient!ui;Lclient!ui;Lclient!ui;)V")
	public Class67(@OriginalArg(0) Class94 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class230 arg2, @OriginalArg(3) Class230 arg3, @OriginalArg(4) Class230 arg4) {
		this.aClass230_29 = arg2;
		if (this.aClass230_29 != null) {
			@Pc(26) int local26 = this.aClass230_29.method4969() - 1;
			this.aClass230_29.method4956(local26);
		}
		Static158.method2163(arg4, arg3);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)Lclient!un;")
	public Class1_Sub6_Sub15 method1221(@OriginalArg(1) int arg0) {
		@Pc(6) Class227 local6 = this.aClass227_15;
		@Pc(18) Class1_Sub6_Sub15 local18;
		synchronized (this.aClass227_15) {
			local18 = (Class1_Sub6_Sub15) this.aClass227_15.method4863((long) arg0);
			if (local18 == null) {
				local18 = new Class1_Sub6_Sub15(arg0);
				this.aClass227_15.method4865(local18, (long) arg0);
			}
		}
		synchronized (local18) {
			return local18.method5011() ? local18 : null;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
	public void method1223() {
		@Pc(6) Class227 local6 = this.aClass227_14;
		synchronized (this.aClass227_14) {
			this.aClass227_14.method4871();
		}
		local6 = this.aClass227_15;
		synchronized (this.aClass227_15) {
			this.aClass227_15.method4871();
		}
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)V")
	public void method1225() {
		@Pc(6) Class227 local6 = this.aClass227_14;
		synchronized (this.aClass227_14) {
			this.aClass227_14.method4859(5);
		}
		local6 = this.aClass227_15;
		synchronized (this.aClass227_15) {
			this.aClass227_15.method4859(5);
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IB)Lclient!pp;")
	public Class185 method1227(@OriginalArg(0) int arg0) {
		@Pc(11) Class227 local11 = this.aClass227_14;
		@Pc(21) Class185 local21;
		synchronized (this.aClass227_14) {
			local21 = (Class185) this.aClass227_14.method4863((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(42) byte[] local42 = this.aClass230_29.method4985(Static285.method4335(arg0), Static328.method4758(arg0));
		local21 = new Class185();
		local21.aClass67_2 = this;
		local21.anInt4803 = arg0;
		if (local42 != null) {
			local21.method4227(new Class1_Sub33(local42));
		}
		local21.method4235();
		@Pc(69) Class227 local69 = this.aClass227_14;
		synchronized (this.aClass227_14) {
			this.aClass227_14.method4865(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)V")
	public void method1228() {
		@Pc(6) Class227 local6 = this.aClass227_14;
		synchronized (this.aClass227_14) {
			this.aClass227_14.method4858();
		}
		local6 = this.aClass227_15;
		synchronized (this.aClass227_15) {
			this.aClass227_15.method4858();
		}
	}
}
