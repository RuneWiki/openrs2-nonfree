import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class216 {

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "Lclient!bu;")
	public Class38 aClass38_31;

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
	private int anInt6475;

	@OriginalMember(owner = "client!rj", name = "m", descriptor = "Lclient!bu;")
	private Class38 aClass38_32;

	@OriginalMember(owner = "client!rj", name = "o", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!rj", name = "s", descriptor = "Ljava/lang/String;")
	private String aString58 = "null";

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(BI)Z")
	public boolean method4941(@OriginalArg(1) int arg0) {
		if (this.aClass38_31 == null) {
			return false;
		}
		if (this.aClass38_32 == null) {
			this.method4951();
		}
		@Pc(30) Class1_Sub33 local30 = (Class1_Sub33) this.aClass38_32.method765((long) arg0);
		return local30 != null;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZ)I")
	public int method4943(@OriginalArg(0) int arg0) {
		if (this.aClass38_31 == null) {
			return this.anInt6475;
		} else {
			@Pc(25) Class1_Sub33 local25 = (Class1_Sub33) this.aClass38_31.method765((long) arg0);
			return local25 == null ? this.anInt6475 : local25.anInt5633;
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!ia;I)V")
	public void method4946(@OriginalArg(0) Class1_Sub3 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1171();
			if (local9 == 0) {
				return;
			}
			this.method4950(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method4947(@OriginalArg(0) String arg0) {
		if (this.aClass38_31 == null) {
			return false;
		}
		if (this.aClass38_32 == null) {
			this.method4948();
		}
		for (@Pc(23) Class1_Sub37 local23 = (Class1_Sub37) this.aClass38_32.method765(Static448.method6100(arg0)); local23 != null; local23 = (Class1_Sub37) this.aClass38_32.method775()) {
			if (local23.aString55.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V")
	private void method4948() {
		this.aClass38_32 = new Class38(this.aClass38_31.method768());
		for (@Pc(24) Class1_Sub44 local24 = (Class1_Sub44) this.aClass38_31.method767(); local24 != null; local24 = (Class1_Sub44) this.aClass38_31.method773()) {
			@Pc(34) Class1_Sub37 local34 = new Class1_Sub37(local24.aString66, (int) local24.aLong228);
			this.aClass38_32.method766(local34, Static448.method6100(local24.aString66));
		}
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(BI)Ljava/lang/String;")
	public String method4949(@OriginalArg(1) int arg0) {
		if (this.aClass38_31 == null) {
			return this.aString58;
		} else {
			@Pc(17) Class1_Sub44 local17 = (Class1_Sub44) this.aClass38_31.method765((long) arg0);
			return local17 == null ? this.aString58 : local17.aString66;
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILclient!ia;B)V")
	private void method4950(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub3 arg1) {
		if (arg0 == 1) {
			this.aChar4 = Static231.method3516(arg1.method1212());
		} else if (arg0 == 2) {
			this.aChar3 = Static231.method3516(arg1.method1212());
		} else if (arg0 == 3) {
			this.aString58 = arg1.method1201();
		} else if (arg0 == 4) {
			this.anInt6475 = arg1.method1188();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(43) int local43 = arg1.method1177();
			this.aClass38_31 = new Class38(Static427.method5762(local43));
			for (@Pc(53) int local53 = 0; local53 < local43; local53++) {
				@Pc(60) int local60 = arg1.method1188();
				@Pc(70) Class1 local70;
				if (arg0 == 5) {
					local70 = new Class1_Sub44(arg1.method1201());
				} else {
					local70 = new Class1_Sub33(arg1.method1188());
				}
				this.aClass38_31.method766(local70, (long) local60);
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)V")
	private void method4951() {
		this.aClass38_32 = new Class38(this.aClass38_31.method768());
		for (@Pc(23) Class1_Sub33 local23 = (Class1_Sub33) this.aClass38_31.method767(); local23 != null; local23 = (Class1_Sub33) this.aClass38_31.method773()) {
			@Pc(31) Class1_Sub33 local31 = new Class1_Sub33((int) local23.aLong228);
			this.aClass38_32.method766(local31, (long) local23.anInt5633);
		}
	}
}
