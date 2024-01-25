import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cca")
public final class Class56 {

	@OriginalMember(owner = "client!cca", name = "o", descriptor = "I")
	public int anInt1020;

	@OriginalMember(owner = "client!cca", name = "t", descriptor = "Lclient!rl;")
	private final Class317 aClass317_4 = new Class317(64);

	@OriginalMember(owner = "client!cca", name = "q", descriptor = "Lclient!rl;")
	public final Class317 aClass317_5 = new Class317(50);

	@OriginalMember(owner = "client!cca", name = "w", descriptor = "Lclient!hg;")
	public final Class151 aClass151_1 = new Class151(250);

	@OriginalMember(owner = "client!cca", name = "v", descriptor = "Lclient!ht;")
	private final Class163 aClass163_1 = new Class163();

	@OriginalMember(owner = "client!cca", name = "z", descriptor = "Z")
	private boolean aBoolean70;

	@OriginalMember(owner = "client!cca", name = "y", descriptor = "Lclient!dja;")
	private final Class80 aClass80_4;

	@OriginalMember(owner = "client!cca", name = "k", descriptor = "Lclient!rg;")
	public final Class310 aClass310_14;

	@OriginalMember(owner = "client!cca", name = "r", descriptor = "Lclient!et;")
	private final Class104 aClass104_1;

	@OriginalMember(owner = "client!cca", name = "B", descriptor = "Lclient!rg;")
	private final Class310 aClass310_15;

	@OriginalMember(owner = "client!cca", name = "g", descriptor = "I")
	public final int anInt1012;

	@OriginalMember(owner = "client!cca", name = "f", descriptor = "I")
	public final int anInt1014;

	@OriginalMember(owner = "client!cca", name = "l", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray7;

	@OriginalMember(owner = "client!cca", name = "c", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray8;

	@OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(Lclient!dja;IZLclient!et;Lclient!rg;Lclient!rg;)V")
	public Class56(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class104 arg3, @OriginalArg(4) Class310 arg4, @OriginalArg(5) Class310 arg5) {
		this.aBoolean70 = arg2;
		this.aClass80_4 = arg0;
		this.aClass310_14 = arg5;
		this.aClass104_1 = arg3;
		this.aClass310_15 = arg4;
		this.anInt1012 = arg1;
		if (this.aClass310_15 == null) {
			this.anInt1014 = 0;
		} else {
			@Pc(54) int local54 = this.aClass310_15.method7800() - 1;
			this.anInt1014 = local54 * 256 + this.aClass310_15.method7773(local54);
		}
		if (Static344.aClass80_7 == this.aClass80_4) {
			this.aStringArray7 = new String[] { null, null, Static21.aClass21_7.method324(this.anInt1012), null, null, Static21.aClass21_21.method324(this.anInt1012) };
		} else {
			this.aStringArray7 = new String[] { null, null, Static21.aClass21_7.method324(this.anInt1012), null, null, null };
		}
		this.aStringArray8 = new String[] { null, null, null, null, Static21.aClass21_8.method324(this.anInt1012) };
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(II)V")
	public void method1043(@OriginalArg(0) int arg0) {
		this.anInt1020 = arg0;
		@Pc(14) Class317 local14 = this.aClass317_5;
		synchronized (this.aClass317_5) {
			this.aClass317_5.method7873();
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(ZIZIIZLclient!ha;ILclient!ha;Lclient!wt;Lclient!da;I)Lclient!fia;")
	public Class45 method1044(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class144 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class144 arg7, @OriginalArg(9) Class398 arg8, @OriginalArg(10) Class68 arg9, @OriginalArg(11) int arg10) {
		@Pc(14) Class45 local14 = this.method1051(arg6, arg10, arg5, arg8, arg0, arg3, arg2);
		if (local14 != null) {
			return local14;
		}
		@Pc(24) Class284 local24 = this.method1052(arg2);
		if (arg3 > 1 && local24.anIntArray411 != null) {
			@Pc(36) int local36 = -1;
			for (@Pc(38) int local38 = 0; local38 < 10; local38++) {
				if (arg3 >= local24.anIntArray410[local38] && local24.anIntArray410[local38] != 0) {
					local36 = local24.anIntArray411[local38];
				}
			}
			if (local36 != -1) {
				local24 = this.method1052(local36);
			}
		}
		@Pc(92) int[] local92 = local24.method6843(arg8, arg0, arg10, arg5, arg6, arg7, arg9, arg3, arg1);
		if (local92 == null) {
			return null;
		}
		@Pc(108) Class45 local108;
		if (arg4) {
			local108 = arg7.method6941(32, 36, local92, 36);
		} else {
			local108 = arg5.method6941(32, 36, local92, 36);
		}
		if (!arg4) {
			@Pc(124) Class163 local124 = new Class163();
			local124.anInt4571 = arg2;
			local124.anInt4568 = arg0;
			local124.anInt4565 = arg6;
			local124.anInt4570 = arg10;
			local124.anInt4569 = arg3;
			local124.aBoolean349 = arg8 != null;
			local124.anInt4567 = arg5.anInt7839;
			this.aClass151_1.method3785(local124, local108);
		}
		return local108;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IZ)V")
	public void method1045(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean70 != arg0) {
			this.aBoolean70 = arg0;
			this.method1049();
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(B)V")
	public void method1047() {
		@Pc(2) Class151 local2 = this.aClass151_1;
		synchronized (this.aClass151_1) {
			this.aClass151_1.method3795();
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Z)V")
	public void method1048() {
		@Pc(6) Class317 local6 = this.aClass317_4;
		synchronized (this.aClass317_4) {
			this.aClass317_4.method7874();
		}
		local6 = this.aClass317_5;
		synchronized (this.aClass317_5) {
			this.aClass317_5.method7874();
		}
		@Pc(44) Class151 local44 = this.aClass151_1;
		synchronized (this.aClass151_1) {
			this.aClass151_1.method3788();
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(I)V")
	public void method1049() {
		@Pc(2) Class317 local2 = this.aClass317_4;
		synchronized (this.aClass317_4) {
			this.aClass317_4.method7873();
		}
		local2 = this.aClass317_5;
		synchronized (this.aClass317_5) {
			this.aClass317_5.method7873();
		}
		@Pc(42) Class151 local42 = this.aClass151_1;
		synchronized (this.aClass151_1) {
			this.aClass151_1.method3795();
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(BI)V")
	public void method1050() {
		@Pc(2) Class317 local2 = this.aClass317_4;
		synchronized (this.aClass317_4) {
			this.aClass317_4.method7870(5);
		}
		local2 = this.aClass317_5;
		synchronized (this.aClass317_5) {
			this.aClass317_5.method7870(5);
		}
		@Pc(38) Class151 local38 = this.aClass151_1;
		synchronized (this.aClass151_1) {
			this.aClass151_1.method3792();
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IILclient!ha;Lclient!wt;IIIB)Lclient!fia;")
	public Class45 method1051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class144 arg2, @OriginalArg(3) Class398 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass163_1.anInt4571 = arg6;
		this.aClass163_1.anInt4565 = arg0;
		this.aClass163_1.aBoolean349 = arg3 != null;
		this.aClass163_1.anInt4567 = arg2.anInt7839;
		this.aClass163_1.anInt4569 = arg5;
		this.aClass163_1.anInt4570 = arg1;
		this.aClass163_1.anInt4568 = arg4;
		return (Class45) this.aClass151_1.method3786(this.aClass163_1);
	}

	@OriginalMember(owner = "client!cca", name = "b", descriptor = "(IZ)Lclient!pf;")
	public Class284 method1052(@OriginalArg(0) int arg0) {
		@Pc(6) Class317 local6 = this.aClass317_4;
		@Pc(16) Class284 local16;
		synchronized (this.aClass317_4) {
			local16 = (Class284) this.aClass317_4.method7882((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class310 local30 = this.aClass310_15;
		@Pc(43) byte[] local43;
		synchronized (this.aClass310_15) {
			local43 = this.aClass310_15.method7803(Static570.method8143(arg0), Static62.method9400(arg0));
		}
		local16 = new Class284();
		local16.aClass56_2 = this;
		local16.anInt7740 = arg0;
		local16.aStringArray33 = (String[]) this.aStringArray7.clone();
		local16.aStringArray32 = (String[]) this.aStringArray8.clone();
		if (local43 != null) {
			local16.method6834(new Class14_Sub21(local43));
		}
		local16.method6844();
		if (local16.anInt7752 != -1) {
			local16.method6847(this.method1052(local16.anInt7779), this.method1052(local16.anInt7752));
		}
		if (local16.anInt7731 != -1) {
			local16.method6840(this.method1052(local16.anInt7738), this.method1052(local16.anInt7731));
		}
		if (local16.anInt7744 != -1) {
			local16.method6845(this.method1052(local16.anInt7786), this.method1052(local16.anInt7744));
		}
		if (!this.aBoolean70 && local16.aBoolean543) {
			local16.aString89 = Static21.aClass21_4.method324(this.anInt1012);
			local16.aBoolean544 = false;
			local16.anInt7788 = 0;
			local16.aStringArray32 = this.aStringArray8;
			local16.aStringArray33 = this.aStringArray7;
			local16.anIntArray409 = null;
			if (local16.aClass125_31 != null) {
				@Pc(182) boolean local182 = false;
				for (@Pc(187) Class14 local187 = local16.aClass125_31.method2633(); local187 != null; local187 = local16.aClass125_31.method2627()) {
					@Pc(196) Class108 local196 = this.aClass104_1.method2173((int) local187.aLong324);
					if (local196.aBoolean161) {
						local187.method9513();
					} else {
						local182 = true;
					}
				}
				if (!local182) {
					local16.aClass125_31 = null;
				}
			}
		}
		@Pc(224) Class317 local224 = this.aClass317_4;
		synchronized (this.aClass317_4) {
			this.aClass317_4.method7875((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cca", name = "b", descriptor = "(Z)V")
	public void method1053() {
		@Pc(11) Class317 local11 = this.aClass317_5;
		synchronized (this.aClass317_5) {
			this.aClass317_5.method7873();
		}
	}
}
