import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class193 {

	@OriginalMember(owner = "client!pa", name = "B", descriptor = "I")
	public int anInt5600;

	@OriginalMember(owner = "client!pa", name = "q", descriptor = "Lclient!ge;")
	private final Class83 aClass83_40 = new Class83(64);

	@OriginalMember(owner = "client!pa", name = "u", descriptor = "Lclient!ge;")
	public final Class83 aClass83_41 = new Class83(50);

	@OriginalMember(owner = "client!pa", name = "v", descriptor = "Lclient!hs;")
	public final Class100 aClass100_1 = new Class100(250);

	@OriginalMember(owner = "client!pa", name = "x", descriptor = "Lclient!cn;")
	private final Class40 aClass40_1 = new Class40();

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "Z")
	private boolean aBoolean413;

	@OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
	public final int anInt5592;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "Lclient!ci;")
	private final Class38 aClass38_61;

	@OriginalMember(owner = "client!pa", name = "n", descriptor = "Lclient!ci;")
	public final Class38 aClass38_62;

	@OriginalMember(owner = "client!pa", name = "y", descriptor = "Lclient!qd;")
	private final Class202 aClass202_2;

	@OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
	public final int anInt5591;

	@OriginalMember(owner = "client!pa", name = "z", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray28;

	@OriginalMember(owner = "client!pa", name = "A", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray29;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lclient!sn;IZLclient!qd;Lclient!ci;Lclient!ci;)V")
	public Class193(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class202 arg3, @OriginalArg(4) Class38 arg4, @OriginalArg(5) Class38 arg5) {
		this.aBoolean413 = arg2;
		this.anInt5592 = arg1;
		this.aClass38_61 = arg4;
		this.aClass38_62 = arg5;
		this.aClass202_2 = arg3;
		if (this.aClass38_61 == null) {
			this.anInt5591 = 0;
		} else {
			@Pc(54) int local54 = this.aClass38_61.method1035() - 1;
			this.anInt5591 = local54 * 256 + this.aClass38_61.method1032(local54);
		}
		this.aStringArray28 = new String[] { null, null, Static100.aClass21_26.method362(this.anInt5592), null, null };
		this.aStringArray29 = new String[] { null, null, null, null, Static253.aClass21_69.method362(this.anInt5592) };
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
	public void method4644() {
		@Pc(5) Class83 local5 = this.aClass83_40;
		synchronized (this.aClass83_40) {
			this.aClass83_40.method2336();
		}
		local5 = this.aClass83_41;
		synchronized (this.aClass83_41) {
			this.aClass83_41.method2336();
		}
		@Pc(41) Class100 local41 = this.aClass100_1;
		synchronized (this.aClass100_1) {
			this.aClass100_1.method2876();
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BZLclient!qa;Lclient!qa;ZIIILclient!gv;ILclient!ba;I)Lclient!aa;")
	public Class2 method4645(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class30 arg1, @OriginalArg(3) Class30 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class90 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class18 arg9, @OriginalArg(11) int arg10) {
		@Pc(22) Class2 local22 = this.method4655(arg5, arg7, arg8, arg4, arg6, arg10, arg1);
		if (local22 != null) {
			return local22;
		}
		@Pc(33) Class274 local33 = this.method4650(arg10);
		if (arg6 > 1 && local33.anIntArray623 != null) {
			@Pc(43) int local43 = -1;
			for (@Pc(45) int local45 = 0; local45 < 10; local45++) {
				if (local33.anIntArray624[local45] <= arg6 && local33.anIntArray624[local45] != 0) {
					local43 = local33.anIntArray623[local45];
				}
			}
			if (local43 != -1) {
				local33 = this.method4650(local43);
			}
		}
		@Pc(89) int[] local89 = local33.method6253(arg5, arg4, arg0, arg1, arg2, arg7, arg6, arg8, arg9);
		if (local89 == null) {
			return null;
		}
		@Pc(103) Class2 local103;
		if (arg3) {
			local103 = arg2.method2055(local89, 36, 36, 32);
		} else {
			local103 = arg1.method2055(local89, 36, 36, 32);
		}
		if (!arg3) {
			@Pc(119) Class40 local119 = new Class40();
			local119.anInt1239 = arg10;
			local119.anInt1244 = arg8;
			local119.anInt1237 = arg1.anInt2271;
			local119.anInt1245 = arg4;
			local119.anInt1238 = arg5;
			local119.anInt1246 = arg6;
			local119.aBoolean88 = arg7 != null;
			this.aClass100_1.method2870(local103, local119);
		}
		return local103;
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
	public void method4646() {
		@Pc(6) Class83 local6 = this.aClass83_40;
		synchronized (this.aClass83_40) {
			this.aClass83_40.method2346();
		}
		local6 = this.aClass83_41;
		synchronized (this.aClass83_41) {
			this.aClass83_41.method2346();
		}
		@Pc(44) Class100 local44 = this.aClass100_1;
		synchronized (this.aClass100_1) {
			this.aClass100_1.method2879();
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZ)V")
	public void method4647(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean413) {
			this.aBoolean413 = arg0;
			this.method4646();
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)V")
	public void method4648() {
		@Pc(6) Class83 local6 = this.aClass83_40;
		synchronized (this.aClass83_40) {
			this.aClass83_40.method2345(5);
		}
		local6 = this.aClass83_41;
		synchronized (this.aClass83_41) {
			this.aClass83_41.method2345(5);
		}
		@Pc(44) Class100 local44 = this.aClass100_1;
		synchronized (this.aClass100_1) {
			this.aClass100_1.method2871();
		}
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V")
	public void method4649() {
		@Pc(2) Class100 local2 = this.aClass100_1;
		synchronized (this.aClass100_1) {
			this.aClass100_1.method2879();
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)Lclient!wq;")
	public Class274 method4650(@OriginalArg(1) int arg0) {
		@Pc(8) Class83 local8 = this.aClass83_40;
		@Pc(18) Class274 local18;
		synchronized (this.aClass83_40) {
			local18 = (Class274) this.aClass83_40.method2338((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class38 local31 = this.aClass38_61;
		@Pc(44) byte[] local44;
		synchronized (this.aClass38_61) {
			local44 = this.aClass38_61.method1039(Static312.method5440(arg0), Static385.method3426(arg0));
		}
		local18 = new Class274();
		local18.anInt7917 = arg0;
		local18.aClass193_2 = this;
		local18.aStringArray37 = new String[] { null, null, Static100.aClass21_26.method362(this.anInt5592), null, null };
		local18.aStringArray36 = new String[] { null, null, null, null, Static253.aClass21_69.method362(this.anInt5592) };
		if (local44 != null) {
			local18.method6263(new Class4_Sub20(local44));
		}
		local18.method6255();
		if (local18.anInt7893 != -1) {
			local18.method6252(this.method4650(local18.anInt7893), this.method4650(local18.anInt7873));
		}
		if (local18.anInt7924 != -1) {
			local18.method6267(this.method4650(local18.anInt7869), this.method4650(local18.anInt7924));
		}
		if (!this.aBoolean413 && local18.aBoolean578) {
			local18.aString82 = Static326.aClass21_97.method362(this.anInt5592);
			local18.aStringArray37 = this.aStringArray28;
			local18.anIntArray625 = null;
			local18.anInt7864 = 0;
			local18.aBoolean579 = false;
			local18.aStringArray36 = this.aStringArray29;
			if (local18.aClass96_39 != null) {
				@Pc(204) boolean local204 = false;
				for (@Pc(209) Class4 local209 = local18.aClass96_39.method2798(); local209 != null; local209 = local18.aClass96_39.method2796()) {
					@Pc(219) Class176 local219 = this.aClass202_2.method4864((int) local209.aLong228);
					if (local219.aBoolean353) {
						local209.method6330();
					} else {
						local204 = true;
					}
				}
				if (!local204) {
					local18.aClass96_39 = null;
				}
			}
		}
		@Pc(244) Class83 local244 = this.aClass83_40;
		synchronized (this.aClass83_40) {
			this.aClass83_40.method2337(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(B)V")
	public void method4654() {
		@Pc(14) Class83 local14 = this.aClass83_41;
		synchronized (this.aClass83_41) {
			this.aClass83_41.method2346();
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!gv;IIIIBLclient!qa;)Lclient!aa;")
	public Class2 method4655(@OriginalArg(0) int arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class30 arg6) {
		this.aClass40_1.anInt1237 = arg6.anInt2271;
		this.aClass40_1.aBoolean88 = arg1 != null;
		this.aClass40_1.anInt1246 = arg4;
		this.aClass40_1.anInt1238 = arg0;
		this.aClass40_1.anInt1245 = arg3;
		this.aClass40_1.anInt1239 = arg5;
		this.aClass40_1.anInt1244 = arg2;
		return (Class2) this.aClass100_1.method2875(this.aClass40_1);
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(IZ)V")
	public void method4656(@OriginalArg(0) int arg0) {
		this.anInt5600 = arg0;
		@Pc(20) Class83 local20 = this.aClass83_41;
		synchronized (this.aClass83_41) {
			this.aClass83_41.method2346();
		}
	}
}
