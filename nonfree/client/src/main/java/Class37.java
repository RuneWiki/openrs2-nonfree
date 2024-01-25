import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class37 {

	@OriginalMember(owner = "client!bg", name = "r", descriptor = "I")
	public int anInt622;

	@OriginalMember(owner = "client!bg", name = "p", descriptor = "Lclient!dka;")
	private final Class85 aClass85_5 = new Class85(64);

	@OriginalMember(owner = "client!bg", name = "u", descriptor = "Lclient!dka;")
	public final Class85 aClass85_6 = new Class85(50);

	@OriginalMember(owner = "client!bg", name = "C", descriptor = "Lclient!oba;")
	public final Class269 aClass269_1 = new Class269(250);

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "Lclient!iv;")
	private final Class188 aClass188_1 = new Class188();

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
	public final int anInt616;

	@OriginalMember(owner = "client!bg", name = "z", descriptor = "Lclient!hda;")
	private final Class150 aClass150_1;

	@OriginalMember(owner = "client!bg", name = "m", descriptor = "Lclient!rp;")
	private final Class328 aClass328_1;

	@OriginalMember(owner = "client!bg", name = "n", descriptor = "Lclient!nca;")
	public final Class254 aClass254_22;

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "Lclient!nca;")
	private final Class254 aClass254_23;

	@OriginalMember(owner = "client!bg", name = "o", descriptor = "Z")
	private boolean aBoolean78;

	@OriginalMember(owner = "client!bg", name = "w", descriptor = "I")
	public final int anInt613;

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray4;

	@OriginalMember(owner = "client!bg", name = "l", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray5;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lclient!hda;IZLclient!rp;Lclient!nca;Lclient!nca;)V")
	public Class37(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class328 arg3, @OriginalArg(4) Class254 arg4, @OriginalArg(5) Class254 arg5) {
		this.anInt616 = arg1;
		this.aClass150_1 = arg0;
		this.aClass328_1 = arg3;
		this.aClass254_22 = arg5;
		this.aClass254_23 = arg4;
		this.aBoolean78 = arg2;
		if (this.aClass254_23 == null) {
			this.anInt613 = 0;
		} else {
			@Pc(54) int local54 = this.aClass254_23.method6094() - 1;
			this.anInt613 = this.aClass254_23.method6101(local54) + local54 * 256;
		}
		if (this.aClass150_1 == Static395.aClass150_8) {
			this.aStringArray4 = new String[] { null, null, Static289.aClass191_8.method4067(this.anInt616), null, null, Static289.aClass191_22.method4067(this.anInt616) };
		} else {
			this.aStringArray4 = new String[] { null, null, Static289.aClass191_8.method4067(this.anInt616), null, null, null };
		}
		this.aStringArray5 = new String[] { null, null, null, null, Static289.aClass191_9.method4067(this.anInt616) };
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
	public void method596() {
		@Pc(6) Class85 local6 = this.aClass85_5;
		synchronized (this.aClass85_5) {
			this.aClass85_5.method1748();
		}
		local6 = this.aClass85_6;
		synchronized (this.aClass85_6) {
			this.aClass85_6.method1748();
		}
		@Pc(42) Class269 local42 = this.aClass269_1;
		synchronized (this.aClass269_1) {
			this.aClass269_1.method6528();
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
	public void method597() {
		@Pc(2) Class85 local2 = this.aClass85_6;
		synchronized (this.aClass85_6) {
			this.aClass85_6.method1748();
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BZ)V")
	public void method599(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean78) {
			this.aBoolean78 = arg0;
			this.method596();
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)V")
	public void method600(@OriginalArg(0) int arg0) {
		this.anInt622 = arg0;
		@Pc(17) Class85 local17 = this.aClass85_6;
		synchronized (this.aClass85_6) {
			this.aClass85_6.method1748();
		}
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)V")
	public void method602() {
		@Pc(6) Class85 local6 = this.aClass85_5;
		synchronized (this.aClass85_5) {
			this.aClass85_5.method1741();
		}
		local6 = this.aClass85_6;
		synchronized (this.aClass85_6) {
			this.aClass85_6.method1741();
		}
		@Pc(38) Class269 local38 = this.aClass269_1;
		synchronized (this.aClass269_1) {
			this.aClass269_1.method6523();
		}
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(II)V")
	public void method604() {
		@Pc(10) Class85 local10 = this.aClass85_5;
		synchronized (this.aClass85_5) {
			this.aClass85_5.method1742(5);
		}
		local10 = this.aClass85_6;
		synchronized (this.aClass85_6) {
			this.aClass85_6.method1742(5);
		}
		@Pc(46) Class269 local46 = this.aClass269_1;
		synchronized (this.aClass269_1) {
			this.aClass269_1.method6532();
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZI)Lclient!k;")
	public Class203 method605(@OriginalArg(1) int arg0) {
		@Pc(8) Class85 local8 = this.aClass85_5;
		@Pc(18) Class203 local18;
		synchronized (this.aClass85_5) {
			local18 = (Class203) this.aClass85_5.method1737((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(32) Class254 local32 = this.aClass254_23;
		@Pc(45) byte[] local45;
		synchronized (this.aClass254_23) {
			local45 = this.aClass254_23.method6087(Static23.method6108(arg0), Static196.method2790(arg0));
		}
		local18 = new Class203();
		local18.aClass37_1 = this;
		local18.anInt4839 = arg0;
		local18.aStringArray21 = (String[]) this.aStringArray4.clone();
		local18.aStringArray20 = (String[]) this.aStringArray5.clone();
		if (local45 != null) {
			local18.method4413(new Class2_Sub20(local45));
		}
		local18.method4416();
		if (local18.anInt4849 != -1) {
			local18.method4408(this.method605(local18.anInt4851), this.method605(local18.anInt4849));
		}
		if (local18.anInt4845 != -1) {
			local18.method4406(this.method605(local18.anInt4844), this.method605(local18.anInt4845));
		}
		if (local18.anInt4855 != -1) {
			local18.method4417(this.method605(local18.anInt4855), this.method605(local18.anInt4854));
		}
		if (!this.aBoolean78 && local18.aBoolean418) {
			local18.aString52 = Static289.aClass191_5.method4067(this.anInt616);
			local18.aStringArray20 = this.aStringArray5;
			local18.aStringArray21 = this.aStringArray4;
			local18.aBoolean419 = false;
			local18.anIntArray350 = null;
			local18.anInt4872 = 0;
			if (local18.aClass218_23 != null) {
				@Pc(185) boolean local185 = false;
				for (@Pc(190) Class2 local190 = local18.aClass218_23.method5092(); local190 != null; local190 = local18.aClass218_23.method5096()) {
					@Pc(200) Class22 local200 = this.aClass328_1.method7810((int) local190.aLong352);
					if (local200.aBoolean49) {
						local190.method9872();
					} else {
						local185 = true;
					}
				}
				if (!local185) {
					local18.aClass218_23 = null;
				}
			}
		}
		@Pc(231) Class85 local231 = this.aClass85_5;
		synchronized (this.aClass85_5) {
			this.aClass85_5.method1745((long) arg0, 16383, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIILclient!ffa;ILclient!ha;I)Lclient!ug;")
	public Class43 method606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class116 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class145 arg5, @OriginalArg(7) int arg6) {
		this.aClass188_1.anInt4416 = arg2;
		this.aClass188_1.aBoolean386 = arg3 != null;
		this.aClass188_1.anInt4412 = arg5.anInt11056;
		this.aClass188_1.anInt4415 = arg4;
		this.aClass188_1.anInt4413 = arg1;
		this.aClass188_1.anInt4411 = arg0;
		this.aClass188_1.anInt4410 = arg6;
		return (Class43) this.aClass269_1.method6521(this.aClass188_1);
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
	public void method607() {
		@Pc(9) Class269 local9 = this.aClass269_1;
		synchronized (this.aClass269_1) {
			this.aClass269_1.method6528();
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILclient!da;IIIZZLclient!ffa;Lclient!ha;Lclient!ha;II)Lclient!ug;")
	public Class43 method608(@OriginalArg(0) int arg0, @OriginalArg(1) Class68 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) Class116 arg6, @OriginalArg(8) Class145 arg7, @OriginalArg(9) Class145 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(16) Class43 local16 = this.method606(arg9, arg3, arg10, arg6, arg0, arg7, arg2);
		if (local16 != null) {
			return local16;
		}
		@Pc(32) Class203 local32 = this.method605(arg10);
		if (arg2 > 1 && local32.anIntArray348 != null) {
			@Pc(42) int local42 = -1;
			for (@Pc(44) int local44 = 0; local44 < 10; local44++) {
				if (arg2 >= local32.anIntArray349[local44] && local32.anIntArray349[local44] != 0) {
					local42 = local32.anIntArray348[local44];
				}
			}
			if (local42 != -1) {
				local32 = this.method605(local42);
			}
		}
		@Pc(100) int[] local100 = local32.method4401(arg1, arg2, arg7, arg3, arg9, arg8, arg0, arg6, arg5);
		if (local100 == null) {
			return null;
		}
		@Pc(116) Class43 local116;
		if (arg4) {
			local116 = arg8.method9711(36, 36, 32, local100);
		} else {
			local116 = arg7.method9711(36, 36, 32, local100);
		}
		if (!arg4) {
			@Pc(133) Class188 local133 = new Class188();
			local133.aBoolean386 = arg6 != null;
			local133.anInt4413 = arg3;
			local133.anInt4415 = arg0;
			local133.anInt4416 = arg10;
			local133.anInt4412 = arg7.anInt11056;
			local133.anInt4411 = arg9;
			local133.anInt4410 = arg2;
			this.aClass269_1.method6522(local133, local116);
		}
		return local116;
	}
}
