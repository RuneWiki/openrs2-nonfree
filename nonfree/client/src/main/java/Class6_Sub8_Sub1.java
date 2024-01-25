import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class Class6_Sub8_Sub1 extends Class6_Sub8 {

	@OriginalMember(owner = "client!bp", name = "p", descriptor = "Lclient!v;")
	public final Class362 aClass362_7 = new Class362();

	@OriginalMember(owner = "client!bp", name = "y", descriptor = "Lclient!kca;")
	public final Class6_Sub8_Sub3 aClass6_Sub8_Sub3_1 = new Class6_Sub8_Sub3();

	@OriginalMember(owner = "client!bp", name = "t", descriptor = "Lclient!lp;")
	private final Class6_Sub8_Sub4 aClass6_Sub8_Sub4_1;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!lp;)V")
	public Class6_Sub8_Sub1(@OriginalArg(0) Class6_Sub8_Sub4 arg0) {
		this.aClass6_Sub8_Sub4_1 = arg0;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ILclient!bf;I)V")
	private void method1056(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub5 arg1) {
		if ((this.aClass6_Sub8_Sub4_1.anIntArray347[arg1.anInt917] & 0x4) != 0 && arg1.anInt911 < 0) {
			@Pc(31) int local31 = this.aClass6_Sub8_Sub4_1.anIntArray350[arg1.anInt917] / Static328.anInt8868;
			@Pc(40) int local40 = (local31 + 1048575 - arg1.anInt919) / local31;
			arg1.anInt919 = arg1.anInt919 + local31 * arg0 & 0xFFFFF;
			if (local40 <= arg0) {
				if (this.aClass6_Sub8_Sub4_1.anIntArray342[arg1.anInt917] == 0) {
					arg1.aClass6_Sub8_Sub5_1 = Static687.method9151(arg1.aClass6_Sub21_Sub1_1, arg1.aClass6_Sub8_Sub5_1.method9162(), arg1.aClass6_Sub8_Sub5_1.method9135(), arg1.aClass6_Sub8_Sub5_1.method9138());
				} else {
					arg1.aClass6_Sub8_Sub5_1 = Static687.method9151(arg1.aClass6_Sub21_Sub1_1, arg1.aClass6_Sub8_Sub5_1.method9162(), 0, arg1.aClass6_Sub8_Sub5_1.method9138());
					this.aClass6_Sub8_Sub4_1.method5087(arg1, arg1.aClass6_Sub10_1.aShortArray24[arg1.anInt910] < 0);
				}
				if (arg1.aClass6_Sub10_1.aShortArray24[arg1.anInt910] < 0) {
					arg1.aClass6_Sub8_Sub5_1.method9131(-1);
				}
				arg0 = arg1.anInt919 / local31;
			}
		}
		arg1.aClass6_Sub8_Sub5_1.method9119(arg0);
	}

	@OriginalMember(owner = "client!bp", name = "d", descriptor = "()I")
	@Override
	public int method9125() {
		return 0;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "()Lclient!qp;")
	@Override
	public Class6_Sub8 method9121() {
		@Pc(9) Class6_Sub5 local9 = (Class6_Sub5) this.aClass362_7.method8538();
		if (local9 == null) {
			return null;
		} else if (local9.aClass6_Sub8_Sub5_1 == null) {
			return this.method9124();
		} else {
			return local9.aClass6_Sub8_Sub5_1;
		}
	}

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "()Lclient!qp;")
	@Override
	public Class6_Sub8 method9124() {
		@Pc(9) Class6_Sub5 local9;
		do {
			local9 = (Class6_Sub5) this.aClass362_7.method8530();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass6_Sub8_Sub5_1 == null);
		return local9.aClass6_Sub8_Sub5_1;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V")
	@Override
	public void method9119(@OriginalArg(0) int arg0) {
		this.aClass6_Sub8_Sub3_1.method9119(arg0);
		for (@Pc(15) Class6_Sub5 local15 = (Class6_Sub5) this.aClass362_7.method8538(); local15 != null; local15 = (Class6_Sub5) this.aClass362_7.method8530()) {
			if (!this.aClass6_Sub8_Sub4_1.method5090(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt914) {
						this.method1056(local25, local15);
						local15.anInt914 -= local25;
						break;
					}
					this.method1056(local15.anInt914, local15);
					local25 -= local15.anInt914;
				} while (!this.aClass6_Sub8_Sub4_1.method5083((int[]) null, local25, local15, 0));
			}
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "([III)V")
	@Override
	public void method9120(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass6_Sub8_Sub3_1.method9120(arg0, arg1, arg2);
		for (@Pc(17) Class6_Sub5 local17 = (Class6_Sub5) this.aClass362_7.method8538(); local17 != null; local17 = (Class6_Sub5) this.aClass362_7.method8530()) {
			if (!this.aClass6_Sub8_Sub4_1.method5090(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local17.anInt914 >= local29) {
						this.method1060(local29 + local27, local27, local29, local17, arg0);
						local17.anInt914 -= local29;
						break;
					}
					this.method1060(local27 + local29, local27, local17.anInt914, local17, arg0);
					local29 -= local17.anInt914;
					local27 += local17.anInt914;
				} while (!this.aClass6_Sub8_Sub4_1.method5083(arg0, local29, local17, local27));
			}
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIILclient!bf;[I)V")
	private void method1060(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class6_Sub5 arg3, @OriginalArg(5) int[] arg4) {
		if ((this.aClass6_Sub8_Sub4_1.anIntArray347[arg3.anInt917] & 0x4) != 0 && arg3.anInt911 < 0) {
			@Pc(32) int local32 = this.aClass6_Sub8_Sub4_1.anIntArray350[arg3.anInt917] / Static328.anInt8868;
			while (true) {
				@Pc(42) int local42 = (local32 + 1048575 - arg3.anInt919) / local32;
				if (arg2 < local42) {
					arg3.anInt919 += local32 * arg2;
					break;
				}
				arg3.aClass6_Sub8_Sub5_1.method9120(arg4, arg1, local42);
				arg3.anInt919 += local42 * local32 - 1048576;
				arg1 += local42;
				arg2 -= local42;
				@Pc(73) int local73 = Static328.anInt8868 / 100;
				@Pc(77) int local77 = 262144 / local32;
				if (local73 > local77) {
					local73 = local77;
				}
				@Pc(89) Class6_Sub8_Sub5 local89 = arg3.aClass6_Sub8_Sub5_1;
				if (this.aClass6_Sub8_Sub4_1.anIntArray342[arg3.anInt917] == 0) {
					arg3.aClass6_Sub8_Sub5_1 = Static687.method9151(arg3.aClass6_Sub21_Sub1_1, local89.method9162(), local89.method9135(), local89.method9138());
				} else {
					arg3.aClass6_Sub8_Sub5_1 = Static687.method9151(arg3.aClass6_Sub21_Sub1_1, local89.method9162(), 0, local89.method9138());
					this.aClass6_Sub8_Sub4_1.method5087(arg3, arg3.aClass6_Sub10_1.aShortArray24[arg3.anInt910] < 0);
					arg3.aClass6_Sub8_Sub5_1.method9129(local73, local89.method9135());
				}
				if (arg3.aClass6_Sub10_1.aShortArray24[arg3.anInt910] < 0) {
					arg3.aClass6_Sub8_Sub5_1.method9131(-1);
				}
				local89.method9145(local73);
				local89.method9120(arg4, arg1, arg0 - arg1);
				if (local89.method9134()) {
					this.aClass6_Sub8_Sub3_1.method4256(local89);
				}
			}
		}
		arg3.aClass6_Sub8_Sub5_1.method9120(arg4, arg1, arg2);
	}
}
