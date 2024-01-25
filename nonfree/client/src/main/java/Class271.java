import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class271 {

	@OriginalMember(owner = "client!wp", name = "G", descriptor = "I")
	public int anInt7618;

	@OriginalMember(owner = "client!wp", name = "u", descriptor = "Lclient!of;")
	private final Class188 aClass188_60 = new Class188(64);

	@OriginalMember(owner = "client!wp", name = "A", descriptor = "Lclient!of;")
	public final Class188 aClass188_61 = new Class188(50);

	@OriginalMember(owner = "client!wp", name = "B", descriptor = "Lclient!qd;")
	public final Class202 aClass202_1 = new Class202(250);

	@OriginalMember(owner = "client!wp", name = "C", descriptor = "Lclient!ge;")
	private final Class90 aClass90_1 = new Class90();

	@OriginalMember(owner = "client!wp", name = "k", descriptor = "Z")
	private boolean aBoolean510;

	@OriginalMember(owner = "client!wp", name = "e", descriptor = "I")
	public final int anInt7604;

	@OriginalMember(owner = "client!wp", name = "D", descriptor = "Lclient!te;")
	private final Class235 aClass235_2;

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "Lclient!mn;")
	private final Class171 aClass171_103;

	@OriginalMember(owner = "client!wp", name = "i", descriptor = "Lclient!mn;")
	public final Class171 aClass171_104;

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "I")
	public final int anInt7603;

	@OriginalMember(owner = "client!wp", name = "E", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray68;

	@OriginalMember(owner = "client!wp", name = "F", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray69;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Lclient!pr;IZLclient!te;Lclient!mn;Lclient!mn;)V")
	public Class271(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class235 arg3, @OriginalArg(4) Class171 arg4, @OriginalArg(5) Class171 arg5) {
		this.aBoolean510 = arg2;
		this.anInt7604 = arg1;
		this.aClass235_2 = arg3;
		this.aClass171_103 = arg4;
		this.aClass171_104 = arg5;
		if (this.aClass171_103 == null) {
			this.anInt7603 = 0;
		} else {
			@Pc(49) int local49 = this.aClass171_103.method3677() - 1;
			this.anInt7603 = this.aClass171_103.method3662(local49) + local49 * 256;
		}
		this.aStringArray68 = new String[] { null, null, Static61.aClass231_20.method5261(this.anInt7604), null, null };
		this.aStringArray69 = new String[] { null, null, null, null, Static180.aClass231_63.method5261(this.anInt7604) };
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(BILclient!za;IIILclient!bk;I)Lclient!o;")
	public Class41 method6190(@OriginalArg(1) int arg0, @OriginalArg(2) Class75 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class26 arg5, @OriginalArg(7) int arg6) {
		this.aClass90_1.anInt2182 = arg0;
		this.aClass90_1.anInt2176 = arg4;
		this.aClass90_1.aBoolean133 = arg5 != null;
		this.aClass90_1.anInt2175 = arg1.anInt7407;
		this.aClass90_1.anInt2177 = arg3;
		this.aClass90_1.anInt2180 = arg2;
		this.aClass90_1.anInt2174 = arg6;
		return (Class41) this.aClass202_1.method4682(this.aClass90_1);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)V")
	public void method6191() {
		@Pc(2) Class188 local2 = this.aClass188_60;
		synchronized (this.aClass188_60) {
			this.aClass188_60.method4154();
		}
		local2 = this.aClass188_61;
		synchronized (this.aClass188_61) {
			this.aClass188_61.method4154();
		}
		@Pc(43) Class202 local43 = this.aClass202_1;
		synchronized (this.aClass202_1) {
			this.aClass202_1.method4688();
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IB)V")
	public void method6192() {
		@Pc(6) Class188 local6 = this.aClass188_60;
		synchronized (this.aClass188_60) {
			this.aClass188_60.method4169(5);
		}
		local6 = this.aClass188_61;
		synchronized (this.aClass188_61) {
			this.aClass188_61.method4169(5);
		}
		@Pc(38) Class202 local38 = this.aClass202_1;
		synchronized (this.aClass202_1) {
			this.aClass202_1.method4689();
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(BI)Lclient!ro;")
	public Class218 method6193(@OriginalArg(1) int arg0) {
		@Pc(6) Class188 local6 = this.aClass188_60;
		@Pc(16) Class218 local16;
		synchronized (this.aClass188_60) {
			local16 = (Class218) this.aClass188_60.method4158((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class171 local29 = this.aClass171_103;
		@Pc(44) byte[] local44;
		synchronized (this.aClass171_103) {
			local44 = this.aClass171_103.method3658(Static219.method3061(arg0), Static184.method2675(arg0));
		}
		local16 = new Class218();
		local16.anInt6289 = arg0;
		local16.aClass271_1 = this;
		local16.aStringArray61 = new String[] { null, null, Static61.aClass231_20.method5261(this.anInt7604), null, null };
		local16.aStringArray60 = new String[] { null, null, null, null, Static180.aClass231_63.method5261(this.anInt7604) };
		if (local44 != null) {
			local16.method5014(new Class2_Sub17(local44));
		}
		local16.method5016();
		if (local16.anInt6302 != -1) {
			local16.method5000(this.method6193(local16.anInt6302), this.method6193(local16.lb));
		}
		if (local16.anInt6281 != -1) {
			local16.method5013(this.method6193(local16.anInt6282), this.method6193(local16.anInt6281));
		}
		if (!this.aBoolean510 && local16.aBoolean434) {
			local16.aString65 = Static61.aClass231_21.method5261(this.anInt7604);
			local16.anIntArray521 = null;
			local16.aStringArray60 = this.aStringArray69;
			local16.aBoolean433 = false;
			local16.aStringArray61 = this.aStringArray68;
			local16.anInt6294 = 0;
			if (local16.aClass220_34 != null) {
				@Pc(200) boolean local200 = false;
				for (@Pc(205) Class2 local205 = local16.aClass220_34.method5096(); local205 != null; local205 = local16.aClass220_34.method5098()) {
					@Pc(214) Class198 local214 = this.aClass235_2.method5382((int) local205.aLong401);
					if (local214.aBoolean399) {
						local205.method6260();
					} else {
						local200 = true;
					}
				}
				if (!local200) {
					local16.aClass220_34 = null;
				}
			}
		}
		@Pc(244) Class188 local244 = this.aClass188_60;
		synchronized (this.aClass188_60) {
			this.aClass188_60.method4155((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(B)V")
	public void method6194() {
		@Pc(6) Class188 local6 = this.aClass188_61;
		synchronized (this.aClass188_61) {
			this.aClass188_61.method4156();
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZZ)V")
	public void method6196(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean510) {
			this.aBoolean510 = arg0;
			this.method6204();
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!bk;BILclient!la;ILclient!za;ZLclient!za;IZII)Lclient!o;")
	public Class41 method6197(@OriginalArg(0) Class26 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class14 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class75 arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) Class75 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(25) Class41 local25 = this.method6190(arg10, arg6, arg9, arg3, arg1, arg0, arg7);
		if (local25 != null) {
			return local25;
		}
		@Pc(34) Class218 local34 = this.method6193(arg3);
		if (arg7 > 1 && local34.anIntArray519 != null) {
			@Pc(44) int local44 = -1;
			for (@Pc(46) int local46 = 0; local46 < 10; local46++) {
				if (arg7 >= local34.anIntArray520[local46] && local34.anIntArray520[local46] != 0) {
					local44 = local34.anIntArray519[local46];
				}
			}
			if (local44 != -1) {
				local34 = this.method6193(local44);
			}
		}
		@Pc(97) int[] local97 = local34.method4998(arg2, arg7, arg0, arg4, arg5, arg6, arg10, arg9, arg1);
		if (local97 == null) {
			return null;
		}
		@Pc(111) Class41 local111;
		if (arg8) {
			local111 = arg4.method6006(local97, 36, 36, 32);
		} else {
			local111 = arg6.method6006(local97, 36, 36, 32);
		}
		if (!arg8) {
			@Pc(127) Class90 local127 = new Class90();
			local127.anInt2174 = arg7;
			local127.anInt2177 = arg3;
			local127.anInt2175 = arg6.anInt7407;
			local127.anInt2180 = arg9;
			local127.anInt2176 = arg1;
			local127.aBoolean133 = arg0 != null;
			local127.anInt2182 = arg10;
			this.aClass202_1.method4683(local127, local111);
		}
		return local111;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)V")
	public void method6200(@OriginalArg(0) int arg0) {
		this.anInt7618 = arg0;
		@Pc(9) Class188 local9 = this.aClass188_61;
		synchronized (this.aClass188_61) {
			this.aClass188_61.method4156();
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Z)V")
	public void method6203() {
		@Pc(10) Class202 local10 = this.aClass202_1;
		synchronized (this.aClass202_1) {
			this.aClass202_1.method4686();
		}
	}

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "(I)V")
	public void method6204() {
		@Pc(2) Class188 local2 = this.aClass188_60;
		synchronized (this.aClass188_60) {
			this.aClass188_60.method4156();
		}
		@Pc(29) Class188 local29 = this.aClass188_61;
		synchronized (this.aClass188_61) {
			this.aClass188_61.method4156();
		}
		@Pc(44) Class202 local44 = this.aClass202_1;
		synchronized (this.aClass202_1) {
			this.aClass202_1.method4686();
		}
	}
}
