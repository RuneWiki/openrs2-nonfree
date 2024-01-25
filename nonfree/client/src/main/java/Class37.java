import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class37 {

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "Lclient!fc;")
	private final Class77 aClass77_11 = new Class77(64);

	@OriginalMember(owner = "client!cf", name = "o", descriptor = "Lclient!fc;")
	private final Class77 aClass77_12 = new Class77(100);

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "Lclient!oi;")
	private final Class185 aClass185_13;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!le;ILclient!oi;Lclient!oi;Lclient!oi;)V")
	public Class37(@OriginalArg(0) Class148 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class185 arg2, @OriginalArg(3) Class185 arg3, @OriginalArg(4) Class185 arg4) {
		this.aClass185_13 = arg2;
		if (this.aClass185_13 != null) {
			@Pc(26) int local26 = this.aClass185_13.method4010() - 1;
			this.aClass185_13.method4011(local26);
		}
		Static214.method3094(arg3, arg4);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
	public void method664() {
		@Pc(6) Class77 local6 = this.aClass77_11;
		synchronized (this.aClass77_11) {
			this.aClass77_11.method1395();
		}
		local6 = this.aClass77_12;
		synchronized (this.aClass77_12) {
			this.aClass77_12.method1395();
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)Lclient!eb;")
	public Class64 method665(@OriginalArg(0) int arg0) {
		@Pc(6) Class77 local6 = this.aClass77_11;
		@Pc(16) Class64 local16;
		synchronized (this.aClass77_11) {
			local16 = (Class64) this.aClass77_11.method1387((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class185 local29 = this.aClass185_13;
		@Pc(44) byte[] local44;
		synchronized (this.aClass185_13) {
			local44 = this.aClass185_13.method4002(Static129.method1587(arg0), Static97.method1143(arg0));
		}
		local16 = new Class64();
		local16.aClass37_1 = this;
		local16.anInt1195 = arg0;
		if (local44 != null) {
			local16.method1058(new Class1_Sub19(local44));
		}
		local16.method1057();
		@Pc(77) Class77 local77 = this.aClass77_11;
		synchronized (this.aClass77_11) {
			this.aClass77_11.method1396(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
	public void method667() {
		@Pc(6) Class77 local6 = this.aClass77_11;
		synchronized (this.aClass77_11) {
			this.aClass77_11.method1394();
		}
		local6 = this.aClass77_12;
		synchronized (this.aClass77_12) {
			this.aClass77_12.method1394();
		}
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)V")
	public void method669() {
		@Pc(2) Class77 local2 = this.aClass77_11;
		synchronized (this.aClass77_11) {
			this.aClass77_11.method1386(5);
		}
		@Pc(30) Class77 local30 = this.aClass77_12;
		synchronized (this.aClass77_12) {
			this.aClass77_12.method1386(5);
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)Lclient!mh;")
	public Class1_Sub3_Sub14 method671(@OriginalArg(0) int arg0) {
		@Pc(6) Class77 local6 = this.aClass77_12;
		@Pc(25) Class1_Sub3_Sub14 local25;
		synchronized (this.aClass77_12) {
			local25 = (Class1_Sub3_Sub14) this.aClass77_12.method1387((long) arg0);
			if (local25 == null) {
				local25 = new Class1_Sub3_Sub14(arg0);
				this.aClass77_12.method1396(local25, (long) arg0);
			}
		}
		synchronized (local25) {
			return local25.method3590() ? local25 : null;
		}
	}
}
