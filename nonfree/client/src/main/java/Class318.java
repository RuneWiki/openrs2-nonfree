import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class318 {

	@OriginalMember(owner = "client!th", name = "e", descriptor = "[Lclient!li;")
	public static final Class209[] aClass209Array1 = new Class209[5];

	@OriginalMember(owner = "client!th", name = "f", descriptor = "Lclient!mf;")
	private final Class222 aClass222_56 = new Class222(16);

	@OriginalMember(owner = "client!th", name = "g", descriptor = "Lclient!pu;")
	private final Class270 aClass270_104;

	static {
		for (@Pc(4) int local4 = 0; local4 < aClass209Array1.length; local4++) {
			aClass209Array1[local4] = new Class209();
		}
	}

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!kr;ILclient!pu;)V")
	public Class318(@OriginalArg(0) Class195 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class270 arg2) {
		this.aClass270_104 = arg2;
		this.aClass270_104.method5685(29);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
	public void method6996() {
		@Pc(16) Class222 local16 = this.aClass222_56;
		synchronized (this.aClass222_56) {
			this.aClass222_56.method4428();
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V")
	public void method6998() {
		@Pc(2) Class222 local2 = this.aClass222_56;
		synchronized (this.aClass222_56) {
			this.aClass222_56.method4433(5);
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILclient!qv;IIII)Lclient!kt;")
	public Class197 method6999(@OriginalArg(0) int arg0, @OriginalArg(1) Class279 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) Class133[] local12 = null;
		@Pc(17) Class320 local17 = this.method7003(arg2);
		if (local17.anIntArray652 != null) {
			local12 = new Class133[local17.anIntArray652.length];
			for (@Pc(27) int local27 = 0; local27 < local12.length; local27++) {
				@Pc(37) Class325 local37 = arg1.method6095(local17.anIntArray652[local27]);
				local12[local27] = new Class133(local37.anInt8844, local37.anInt8845, local37.anInt8842, local37.anInt8841, local37.anInt8836, local37.anInt8838, local37.anInt8839, local37.aBoolean685);
			}
		}
		return new Class197(local17.anInt8651, local12, local17.anInt8653, arg0, arg4, arg3);
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V")
	public void method7001() {
		@Pc(2) Class222 local2 = this.aClass222_56;
		synchronized (this.aClass222_56) {
			this.aClass222_56.method4422();
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZI)Lclient!tp;")
	private Class320 method7003(@OriginalArg(1) int arg0) {
		@Pc(6) Class222 local6 = this.aClass222_56;
		@Pc(16) Class320 local16;
		synchronized (this.aClass222_56) {
			local16 = (Class320) this.aClass222_56.method4430((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class270 local29 = this.aClass270_104;
		@Pc(38) byte[] local38;
		synchronized (this.aClass270_104) {
			local38 = this.aClass270_104.method5704(29, arg0);
		}
		local16 = new Class320();
		if (local38 != null) {
			local16.method7079(new Class1_Sub35(local38));
		}
		@Pc(66) Class222 local66 = this.aClass222_56;
		synchronized (this.aClass222_56) {
			this.aClass222_56.method4434(local16, (long) arg0);
			return local16;
		}
	}
}
