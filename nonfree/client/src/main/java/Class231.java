import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public final class Class231 {

	@OriginalMember(owner = "client!ss", name = "k", descriptor = "I")
	public int anInt6099;

	@OriginalMember(owner = "client!ss", name = "i", descriptor = "Lclient!jo;")
	private final Class126 aClass126_54 = new Class126(64);

	@OriginalMember(owner = "client!ss", name = "j", descriptor = "Lclient!jo;")
	public final Class126 aClass126_55 = new Class126(30);

	@OriginalMember(owner = "client!ss", name = "f", descriptor = "Lclient!ok;")
	private final Class178 aClass178_116;

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "Lclient!ok;")
	public final Class178 aClass178_115;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Lclient!kr;ILclient!ok;Lclient!ok;)V")
	public Class231(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class178 arg2, @OriginalArg(3) Class178 arg3) {
		this.aClass178_116 = arg2;
		this.aClass178_115 = arg3;
		@Pc(26) int local26 = this.aClass178_116.method3832() - 1;
		this.aClass178_116.method3833(local26);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V")
	public void method4829() {
		@Pc(6) Class126 local6 = this.aClass126_54;
		synchronized (this.aClass126_54) {
			this.aClass126_54.method2827();
		}
		local6 = this.aClass126_55;
		synchronized (this.aClass126_55) {
			this.aClass126_55.method2827();
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)Lclient!hk;")
	public Class105 method4830(@OriginalArg(1) int arg0) {
		@Pc(12) Class126 local12 = this.aClass126_54;
		@Pc(22) Class105 local22;
		synchronized (this.aClass126_54) {
			local22 = (Class105) this.aClass126_54.method2822((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class178 local35 = this.aClass178_116;
		@Pc(48) byte[] local48;
		synchronized (this.aClass178_116) {
			local48 = this.aClass178_116.method3838(Static326.method5719(arg0), Static2.method7(arg0));
		}
		local22 = new Class105();
		local22.anInt2897 = arg0;
		local22.aClass231_2 = this;
		if (local48 != null) {
			local22.method2339(new Class7_Sub14(local48));
		}
		@Pc(76) Class126 local76 = this.aClass126_54;
		synchronized (this.aClass126_54) {
			this.aClass126_54.method2824((long) arg0, local22);
			return local22;
		}
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(II)V")
	public void method4831(@OriginalArg(1) int arg0) {
		this.anInt6099 = arg0;
		@Pc(13) Class126 local13 = this.aClass126_55;
		synchronized (this.aClass126_55) {
			this.aClass126_55.method2827();
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZI)V")
	public void method4832() {
		@Pc(13) Class126 local13 = this.aClass126_54;
		synchronized (this.aClass126_54) {
			this.aClass126_54.method2828(5);
		}
		local13 = this.aClass126_55;
		synchronized (this.aClass126_55) {
			this.aClass126_55.method2828(5);
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Z)V")
	public void method4833() {
		@Pc(6) Class126 local6 = this.aClass126_54;
		synchronized (this.aClass126_54) {
			this.aClass126_54.method2821();
		}
		local6 = this.aClass126_55;
		synchronized (this.aClass126_55) {
			this.aClass126_55.method2821();
		}
	}
}
