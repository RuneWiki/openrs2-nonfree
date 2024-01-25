import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public final class Class6_Sub15_Sub4 extends Class6_Sub15 {

	@OriginalMember(owner = "client!wu", name = "v", descriptor = "Ljava/lang/String;")
	public static final String aString94;

	@OriginalMember(owner = "client!wu", name = "z", descriptor = "Ljava/lang/String;")
	public static final String aString95;

	@OriginalMember(owner = "client!wu", name = "B", descriptor = "Lclient!su;")
	public final Class298 aClass298_206 = new Class298();

	@OriginalMember(owner = "client!wu", name = "C", descriptor = "Lclient!fk;")
	public final Class6_Sub15_Sub1 aClass6_Sub15_Sub1_2 = new Class6_Sub15_Sub1();

	@OriginalMember(owner = "client!wu", name = "u", descriptor = "Lclient!so;")
	private final Class6_Sub15_Sub3 aClass6_Sub15_Sub3_3;

	static {
		@Pc(1) String local1 = "Unknown";
		try {
			local1 = System.getProperty("java.vendor").toLowerCase();
		} catch (@Pc(7) Exception local7) {
		}
		local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("java.version").toLowerCase();
		} catch (@Pc(18) Exception local18) {
		}
		local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(29) Exception local29) {
		}
		aString94 = local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(40) Exception local40) {
		}
		aString95 = local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(51) Exception local51) {
		}
		local1.toLowerCase();
		local1 = "~/";
		try {
			local1 = System.getProperty("user.home").toLowerCase();
		} catch (@Pc(62) Exception local62) {
		}
		new File(local1);
	}

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lclient!so;)V")
	public Class6_Sub15_Sub4(@OriginalArg(0) Class6_Sub15_Sub3 arg0) {
		this.aClass6_Sub15_Sub3_3 = arg0;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(BIII[ILclient!gi;)V")
	private void method7940(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class6_Sub18 arg4) {
		if ((this.aClass6_Sub15_Sub3_3.anIntArray598[arg4.anInt3178] & 0x4) != 0 && arg4.anInt3164 < 0) {
			@Pc(25) int local25 = this.aClass6_Sub15_Sub3_3.anIntArray585[arg4.anInt3178] / Static313.anInt6055;
			while (true) {
				@Pc(35) int local35 = (local25 + 1048575 - arg4.anInt3169) / local25;
				if (local35 > arg0) {
					arg4.anInt3169 += arg0 * local25;
					break;
				}
				arg4.aClass6_Sub15_Sub2_1.method7933(arg3, arg1, local35);
				arg0 -= local35;
				arg1 += local35;
				arg4.anInt3169 += local25 * local35 - 1048576;
				@Pc(70) int local70 = Static313.anInt6055 / 100;
				@Pc(74) int local74 = 262144 / local25;
				if (local70 > local74) {
					local70 = local74;
				}
				@Pc(86) Class6_Sub15_Sub2 local86 = arg4.aClass6_Sub15_Sub2_1;
				if (this.aClass6_Sub15_Sub3_3.anIntArray589[arg4.anInt3178] == 0) {
					arg4.aClass6_Sub15_Sub2_1 = Static591.method3860(arg4.aClass6_Sub6_Sub1_1, local86.method3857(), local86.method3872(), local86.method3870());
				} else {
					arg4.aClass6_Sub15_Sub2_1 = Static591.method3860(arg4.aClass6_Sub6_Sub1_1, local86.method3857(), 0, local86.method3870());
					this.aClass6_Sub15_Sub3_3.method6640(arg4, arg4.aClass6_Sub40_1.aShortArray121[arg4.anInt3166] < 0);
					arg4.aClass6_Sub15_Sub2_1.method3873(local70, local86.method3872());
				}
				if (arg4.aClass6_Sub40_1.aShortArray121[arg4.anInt3166] < 0) {
					arg4.aClass6_Sub15_Sub2_1.method3880(-1);
				}
				local86.method3850(local70);
				local86.method7933(arg3, arg1, arg2 - arg1);
				if (local86.method3859()) {
					this.aClass6_Sub15_Sub1_2.method2422(local86);
				}
			}
		}
		arg4.aClass6_Sub15_Sub2_1.method7933(arg3, arg1, arg0);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "()Lclient!vw;")
	@Override
	public Class6_Sub15 method7934() {
		@Pc(9) Class6_Sub18 local9 = (Class6_Sub18) this.aClass298_206.method6809();
		if (local9 == null) {
			return null;
		} else if (local9.aClass6_Sub15_Sub2_1 == null) {
			return this.method7937();
		} else {
			return local9.aClass6_Sub15_Sub2_1;
		}
	}

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "()Lclient!vw;")
	@Override
	public Class6_Sub15 method7937() {
		@Pc(9) Class6_Sub18 local9;
		do {
			local9 = (Class6_Sub18) this.aClass298_206.method6821();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass6_Sub15_Sub2_1 == null);
		return local9.aClass6_Sub15_Sub2_1;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)V")
	@Override
	public void method7939(@OriginalArg(0) int arg0) {
		this.aClass6_Sub15_Sub1_2.method7939(arg0);
		for (@Pc(15) Class6_Sub18 local15 = (Class6_Sub18) this.aClass298_206.method6809(); local15 != null; local15 = (Class6_Sub18) this.aClass298_206.method6821()) {
			if (!this.aClass6_Sub15_Sub3_3.method6671(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt3170 >= local25) {
						this.method7944(local25, local15);
						local15.anInt3170 -= local25;
						break;
					}
					this.method7944(local15.anInt3170, local15);
					local25 -= local15.anInt3170;
				} while (!this.aClass6_Sub15_Sub3_3.method6674(0, local15, local25, null));
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "()I")
	@Override
	public int method7935() {
		return 0;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILclient!gi;I)V")
	private void method7944(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub18 arg1) {
		if ((this.aClass6_Sub15_Sub3_3.anIntArray598[arg1.anInt3178] & 0x4) != 0 && arg1.anInt3164 < 0) {
			@Pc(33) int local33 = this.aClass6_Sub15_Sub3_3.anIntArray585[arg1.anInt3178] / Static313.anInt6055;
			@Pc(44) int local44 = (local33 + 1048575 - arg1.anInt3169) / local33;
			arg1.anInt3169 = local33 * arg0 + arg1.anInt3169 & 0xFFFFF;
			if (arg0 >= local44) {
				if (this.aClass6_Sub15_Sub3_3.anIntArray589[arg1.anInt3178] == 0) {
					arg1.aClass6_Sub15_Sub2_1 = Static591.method3860(arg1.aClass6_Sub6_Sub1_1, arg1.aClass6_Sub15_Sub2_1.method3857(), arg1.aClass6_Sub15_Sub2_1.method3872(), arg1.aClass6_Sub15_Sub2_1.method3870());
				} else {
					arg1.aClass6_Sub15_Sub2_1 = Static591.method3860(arg1.aClass6_Sub6_Sub1_1, arg1.aClass6_Sub15_Sub2_1.method3857(), 0, arg1.aClass6_Sub15_Sub2_1.method3870());
					this.aClass6_Sub15_Sub3_3.method6640(arg1, arg1.aClass6_Sub40_1.aShortArray121[arg1.anInt3166] < 0);
				}
				if (arg1.aClass6_Sub40_1.aShortArray121[arg1.anInt3166] < 0) {
					arg1.aClass6_Sub15_Sub2_1.method3880(-1);
				}
				arg0 = arg1.anInt3169 / local33;
			}
		}
		arg1.aClass6_Sub15_Sub2_1.method7939(arg0);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "([III)V")
	@Override
	public void method7933(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass6_Sub15_Sub1_2.method7933(arg0, arg1, arg2);
		for (@Pc(17) Class6_Sub18 local17 = (Class6_Sub18) this.aClass298_206.method6809(); local17 != null; local17 = (Class6_Sub18) this.aClass298_206.method6821()) {
			if (!this.aClass6_Sub15_Sub3_3.method6671(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local17.anInt3170 >= local27) {
						this.method7940(local27, local29, local27 + local29, arg0, local17);
						local17.anInt3170 -= local27;
						break;
					}
					this.method7940(local17.anInt3170, local29, local29 + local27, arg0, local17);
					local27 -= local17.anInt3170;
					local29 += local17.anInt3170;
				} while (!this.aClass6_Sub15_Sub3_3.method6674(local29, local17, local27, arg0));
			}
		}
	}
}
