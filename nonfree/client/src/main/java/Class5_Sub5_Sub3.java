import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class5_Sub5_Sub3 extends Class5_Sub5 {

	@OriginalMember(owner = "client!he", name = "S", descriptor = "Lclient!qb;")
	public final Class58 aClass58_27 = new Class58();

	@OriginalMember(owner = "client!he", name = "bb", descriptor = "Lclient!oa;")
	public final Class5_Sub5_Sub4 aClass5_Sub5_Sub4_1 = new Class5_Sub5_Sub4();

	@OriginalMember(owner = "client!he", name = "M", descriptor = "Lclient!bf;")
	private final Class5_Sub5_Sub1 aClass5_Sub5_Sub1_1;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lclient!bf;)V")
	public Class5_Sub5_Sub3(@OriginalArg(0) Class5_Sub5_Sub1 arg0) {
		this.aClass5_Sub5_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IILclient!od;II[I)V")
	private void method875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub16 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		if ((this.aClass5_Sub5_Sub1_1.anIntArray59[arg2.anInt2379] & 0x4) != 0 && arg2.anInt2386 < 0) {
			@Pc(32) int local32 = this.aClass5_Sub5_Sub1_1.anIntArray65[arg2.anInt2379] / Static78.anInt1981;
			while (true) {
				@Pc(41) int local41 = (local32 + 1048575 - arg2.anInt2396) / local32;
				if (local41 > arg1) {
					arg2.anInt2396 += arg1 * local32;
					break;
				}
				arg2.aClass5_Sub5_Sub2_3.method1561(arg4, arg0, local41);
				arg0 += local41;
				@Pc(61) Class5_Sub5_Sub2 local61 = arg2.aClass5_Sub5_Sub2_3;
				@Pc(65) int local65 = 262144 / local32;
				arg1 -= local41;
				@Pc(73) int local73 = Static78.anInt1981 / 100;
				if (local65 < local73) {
					local73 = local65;
				}
				arg2.anInt2396 += local32 * local41 - 1048576;
				if (this.aClass5_Sub5_Sub1_1.anIntArray67[arg2.anInt2379] == 0) {
					arg2.aClass5_Sub5_Sub2_3 = Static135.method836(arg2.aClass5_Sub21_Sub1_1, local61.method835(), local61.method818(), local61.method829());
				} else {
					arg2.aClass5_Sub5_Sub2_3 = Static135.method836(arg2.aClass5_Sub21_Sub1_1, local61.method835(), 0, local61.method829());
					this.aClass5_Sub5_Sub1_1.method262(arg2, arg2.aClass5_Sub10_1.aShortArray20[arg2.anInt2388] < 0);
					arg2.aClass5_Sub5_Sub2_3.method820(local73, local61.method818());
				}
				if (arg2.aClass5_Sub10_1.aShortArray20[arg2.anInt2388] < 0) {
					arg2.aClass5_Sub5_Sub2_3.method831(-1);
				}
				local61.method823(local73);
				local61.method1561(arg4, arg0, arg3 - arg0);
				if (local61.method833()) {
					this.aClass5_Sub5_Sub4_1.method1563(local61);
				}
			}
		}
		arg2.aClass5_Sub5_Sub2_3.method1561(arg4, arg0, arg1);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!od;I)V")
	private void method877(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub16 arg1) {
		if ((this.aClass5_Sub5_Sub1_1.anIntArray59[arg1.anInt2379] & 0x4) != 0 && arg1.anInt2386 < 0) {
			@Pc(31) int local31 = this.aClass5_Sub5_Sub1_1.anIntArray65[arg1.anInt2379] / Static78.anInt1981;
			@Pc(41) int local41 = (local31 + 1048575 - arg1.anInt2396) / local31;
			arg1.anInt2396 = local31 * arg0 + arg1.anInt2396 & 0xFFFFF;
			if (arg0 >= local41) {
				if (this.aClass5_Sub5_Sub1_1.anIntArray67[arg1.anInt2379] == 0) {
					arg1.aClass5_Sub5_Sub2_3 = Static135.method836(arg1.aClass5_Sub21_Sub1_1, arg1.aClass5_Sub5_Sub2_3.method835(), arg1.aClass5_Sub5_Sub2_3.method818(), arg1.aClass5_Sub5_Sub2_3.method829());
				} else {
					arg1.aClass5_Sub5_Sub2_3 = Static135.method836(arg1.aClass5_Sub21_Sub1_1, arg1.aClass5_Sub5_Sub2_3.method835(), 0, arg1.aClass5_Sub5_Sub2_3.method829());
					this.aClass5_Sub5_Sub1_1.method262(arg1, arg1.aClass5_Sub10_1.aShortArray20[arg1.anInt2388] < 0);
				}
				if (arg1.aClass5_Sub10_1.aShortArray20[arg1.anInt2388] < 0) {
					arg1.aClass5_Sub5_Sub2_3.method831(-1);
				}
				arg0 = arg1.anInt2396 / local31;
			}
		}
		arg1.aClass5_Sub5_Sub2_3.method1556(arg0);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "()I")
	@Override
	public int method1557() {
		return 0;
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "()Lclient!sd;")
	@Override
	public Class5_Sub5 method1560() {
		@Pc(9) Class5_Sub16 local9;
		do {
			local9 = (Class5_Sub16) this.aClass58_27.method1664();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass5_Sub5_Sub2_3 == null);
		return local9.aClass5_Sub5_Sub2_3;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "([III)V")
	@Override
	public void method1561(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass5_Sub5_Sub4_1.method1561(arg0, arg1, arg2);
		for (@Pc(17) Class5_Sub16 local17 = (Class5_Sub16) this.aClass58_27.method1669(); local17 != null; local17 = (Class5_Sub16) this.aClass58_27.method1664()) {
			if (!this.aClass5_Sub5_Sub1_1.method252(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local29 <= local17.anInt2401) {
						this.method875(local27, local29, local17, local29 + local27, arg0);
						local17.anInt2401 -= local29;
						break;
					}
					this.method875(local27, local17.anInt2401, local17, local27 + local29, arg0);
					local29 -= local17.anInt2401;
					local27 += local17.anInt2401;
				} while (!this.aClass5_Sub5_Sub1_1.method233(local29, local17, arg0, local27));
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "()Lclient!sd;")
	@Override
	public Class5_Sub5 method1558() {
		@Pc(5) Class5_Sub16 local5 = (Class5_Sub16) this.aClass58_27.method1669();
		if (local5 == null) {
			return null;
		} else if (local5.aClass5_Sub5_Sub2_3 == null) {
			return this.method1560();
		} else {
			return local5.aClass5_Sub5_Sub2_3;
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
	@Override
	public void method1556(@OriginalArg(0) int arg0) {
		this.aClass5_Sub5_Sub4_1.method1556(arg0);
		for (@Pc(15) Class5_Sub16 local15 = (Class5_Sub16) this.aClass58_27.method1669(); local15 != null; local15 = (Class5_Sub16) this.aClass58_27.method1664()) {
			if (!this.aClass5_Sub5_Sub1_1.method252(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt2401 >= local25) {
						this.method877(local25, local15);
						local15.anInt2401 -= local25;
						break;
					}
					this.method877(local15.anInt2401, local15);
					local25 -= local15.anInt2401;
				} while (!this.aClass5_Sub5_Sub1_1.method233(local25, local15, null, 0));
			}
		}
	}
}
