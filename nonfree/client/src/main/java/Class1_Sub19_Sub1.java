import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public final class Class1_Sub19_Sub1 extends Class1_Sub19 {

	@OriginalMember(owner = "client!fq", name = "y", descriptor = "Lclient!pu;")
	public final Class203 aClass203_16 = new Class203();

	@OriginalMember(owner = "client!fq", name = "G", descriptor = "Lclient!jo;")
	public final Class1_Sub19_Sub2 aClass1_Sub19_Sub2_2 = new Class1_Sub19_Sub2();

	@OriginalMember(owner = "client!fq", name = "C", descriptor = "Lclient!td;")
	private final Class1_Sub19_Sub3 aClass1_Sub19_Sub3_2;

	static {
		new Class158("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lclient!td;)V")
	public Class1_Sub19_Sub1(@OriginalArg(0) Class1_Sub19_Sub3 arg0) {
		this.aClass1_Sub19_Sub3_2 = arg0;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IILclient!bv;)V")
	private void method1981(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if ((this.aClass1_Sub19_Sub3_2.anIntArray654[arg1.anInt1076] & 0x4) != 0 && arg1.anInt1077 < 0) {
			@Pc(23) int local23 = this.aClass1_Sub19_Sub3_2.anIntArray653[arg1.anInt1076] / Static84.anInt2035;
			@Pc(34) int local34 = (local23 + 1048575 - arg1.anInt1082) / local23;
			arg1.anInt1082 = local23 * arg0 + arg1.anInt1082 & 0xFFFFF;
			if (local34 <= arg0) {
				if (this.aClass1_Sub19_Sub3_2.anIntArray656[arg1.anInt1076] == 0) {
					arg1.aClass1_Sub19_Sub4_1 = Static468.method5845(arg1.aClass1_Sub12_Sub1_1, arg1.aClass1_Sub19_Sub4_1.method5812(), arg1.aClass1_Sub19_Sub4_1.method5811(), arg1.aClass1_Sub19_Sub4_1.method5846());
				} else {
					arg1.aClass1_Sub19_Sub4_1 = Static468.method5845(arg1.aClass1_Sub12_Sub1_1, arg1.aClass1_Sub19_Sub4_1.method5812(), 0, arg1.aClass1_Sub19_Sub4_1.method5846());
					this.aClass1_Sub19_Sub3_2.method5309(arg1.aClass1_Sub20_1.aShortArray64[arg1.anInt1072] < 0, arg1);
				}
				if (arg1.aClass1_Sub20_1.aShortArray64[arg1.anInt1072] < 0) {
					arg1.aClass1_Sub19_Sub4_1.method5828(-1);
				}
				arg0 = arg1.anInt1082 / local23;
			}
		}
		arg1.aClass1_Sub19_Sub4_1.method5802(arg0);
	}

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "()Lclient!oa;")
	@Override
	public Class1_Sub19 method5807() {
		@Pc(9) Class1_Sub7 local9 = (Class1_Sub7) this.aClass203_16.method4548();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub19_Sub4_1 == null) {
			return this.method5805();
		} else {
			return local9.aClass1_Sub19_Sub4_1;
		}
	}

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "()I")
	@Override
	public int method5808() {
		return 0;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
	@Override
	public void method5802(@OriginalArg(0) int arg0) {
		this.aClass1_Sub19_Sub2_2.method5802(arg0);
		for (@Pc(13) Class1_Sub7 local13 = (Class1_Sub7) this.aClass203_16.method4548(); local13 != null; local13 = (Class1_Sub7) this.aClass203_16.method4545()) {
			if (!this.aClass1_Sub19_Sub3_2.method5327(local13)) {
				@Pc(22) int local22 = arg0;
				do {
					if (local22 <= local13.anInt1075) {
						this.method1981(local22, local13);
						local13.anInt1075 -= local22;
						break;
					}
					this.method1981(local13.anInt1075, local13);
					local22 -= local13.anInt1075;
				} while (!this.aClass1_Sub19_Sub3_2.method5313(0, local13, null, local22));
			}
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "()Lclient!oa;")
	@Override
	public Class1_Sub19 method5805() {
		@Pc(9) Class1_Sub7 local9;
		do {
			local9 = (Class1_Sub7) this.aClass203_16.method4545();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub19_Sub4_1 == null);
		return local9.aClass1_Sub19_Sub4_1;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "([III)V")
	@Override
	public void method5803(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub19_Sub2_2.method5803(arg0, arg1, arg2);
		for (@Pc(15) Class1_Sub7 local15 = (Class1_Sub7) this.aClass203_16.method4548(); local15 != null; local15 = (Class1_Sub7) this.aClass203_16.method4545()) {
			if (!this.aClass1_Sub19_Sub3_2.method5327(local15)) {
				@Pc(24) int local24 = arg2;
				@Pc(26) int local26 = arg1;
				do {
					if (local24 <= local15.anInt1075) {
						this.method1986(local26, arg0, local15, local24 + local26, local24);
						local15.anInt1075 -= local24;
						break;
					}
					this.method1986(local26, arg0, local15, local24 + local26, local15.anInt1075);
					local26 += local15.anInt1075;
					local24 -= local15.anInt1075;
				} while (!this.aClass1_Sub19_Sub3_2.method5313(local26, local15, arg0, local24));
			}
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I[ILclient!bv;III)V")
	private void method1986(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class1_Sub7 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass1_Sub19_Sub3_2.anIntArray654[arg2.anInt1076] & 0x4) != 0 && arg2.anInt1077 < 0) {
			@Pc(37) int local37 = this.aClass1_Sub19_Sub3_2.anIntArray653[arg2.anInt1076] / Static84.anInt2035;
			while (true) {
				@Pc(47) int local47 = (local37 + 1048575 - arg2.anInt1082) / local37;
				if (local47 > arg4) {
					arg2.anInt1082 += local37 * arg4;
					break;
				}
				arg2.aClass1_Sub19_Sub4_1.method5803(arg1, arg0, local47);
				arg4 -= local47;
				arg0 += local47;
				arg2.anInt1082 += local47 * local37 - 1048576;
				@Pc(82) int local82 = Static84.anInt2035 / 100;
				@Pc(86) int local86 = 262144 / local37;
				if (local82 > local86) {
					local82 = local86;
				}
				@Pc(94) Class1_Sub19_Sub4 local94 = arg2.aClass1_Sub19_Sub4_1;
				if (this.aClass1_Sub19_Sub3_2.anIntArray656[arg2.anInt1076] == 0) {
					arg2.aClass1_Sub19_Sub4_1 = Static468.method5845(arg2.aClass1_Sub12_Sub1_1, local94.method5812(), local94.method5811(), local94.method5846());
				} else {
					arg2.aClass1_Sub19_Sub4_1 = Static468.method5845(arg2.aClass1_Sub12_Sub1_1, local94.method5812(), 0, local94.method5846());
					this.aClass1_Sub19_Sub3_2.method5309(arg2.aClass1_Sub20_1.aShortArray64[arg2.anInt1072] < 0, arg2);
					arg2.aClass1_Sub19_Sub4_1.method5827(local82, local94.method5811());
				}
				if (arg2.aClass1_Sub20_1.aShortArray64[arg2.anInt1072] < 0) {
					arg2.aClass1_Sub19_Sub4_1.method5828(-1);
				}
				local94.method5810(local82);
				local94.method5803(arg1, arg0, arg3 - arg0);
				if (local94.method5809()) {
					this.aClass1_Sub19_Sub2_2.method3187(local94);
				}
			}
		}
		arg2.aClass1_Sub19_Sub4_1.method5803(arg1, arg0, arg4);
	}
}
