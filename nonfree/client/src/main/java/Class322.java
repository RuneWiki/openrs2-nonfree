import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class322 {

	@OriginalMember(owner = "client!tr", name = "y", descriptor = "I")
	public int anInt8726;

	@OriginalMember(owner = "client!tr", name = "k", descriptor = "Lclient!hm;")
	private final Class136 aClass136_99 = new Class136(64);

	@OriginalMember(owner = "client!tr", name = "s", descriptor = "Lclient!hm;")
	public final Class136 aClass136_100 = new Class136(50);

	@OriginalMember(owner = "client!tr", name = "t", descriptor = "Lclient!jc;")
	public final Class152 aClass152_1 = new Class152(250);

	@OriginalMember(owner = "client!tr", name = "u", descriptor = "Lclient!ct;")
	private final Class56 aClass56_1 = new Class56();

	@OriginalMember(owner = "client!tr", name = "w", descriptor = "Lclient!kw;")
	private final Class185 aClass185_1;

	@OriginalMember(owner = "client!tr", name = "r", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_120;

	@OriginalMember(owner = "client!tr", name = "h", descriptor = "Lclient!pfa;")
	public final Class251 aClass251_119;

	@OriginalMember(owner = "client!tr", name = "o", descriptor = "Z")
	private boolean aBoolean632;

	@OriginalMember(owner = "client!tr", name = "p", descriptor = "I")
	public final int anInt8724;

	@OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
	public final int anInt8716;

	@OriginalMember(owner = "client!tr", name = "v", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray36;

	@OriginalMember(owner = "client!tr", name = "x", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray37;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Lclient!bs;IZLclient!kw;Lclient!pfa;Lclient!pfa;)V")
	public Class322(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class185 arg3, @OriginalArg(4) Class251 arg4, @OriginalArg(5) Class251 arg5) {
		this.aClass185_1 = arg3;
		this.aClass251_120 = arg4;
		this.aClass251_119 = arg5;
		this.aBoolean632 = arg2;
		this.anInt8724 = arg1;
		if (this.aClass251_120 == null) {
			this.anInt8716 = 0;
		} else {
			@Pc(54) int local54 = this.aClass251_120.method5755() - 1;
			this.anInt8716 = this.aClass251_120.method5768(local54) + local54 * 256;
		}
		this.aStringArray36 = new String[] { null, null, Static230.aClass156_6.method4065(this.anInt8724), null, null };
		this.aStringArray37 = new String[] { null, null, null, null, Static230.aClass156_7.method4065(this.anInt8724) };
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZI)V")
	public void method7134(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean632 != arg0) {
			this.aBoolean632 = arg0;
			this.method7143();
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V")
	public void method7135() {
		@Pc(10) Class152 local10 = this.aClass152_1;
		synchronized (this.aClass152_1) {
			this.aClass152_1.method3994();
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)V")
	public void method7137() {
		@Pc(6) Class136 local6 = this.aClass136_99;
		synchronized (this.aClass136_99) {
			this.aClass136_99.method3474(5);
		}
		local6 = this.aClass136_100;
		synchronized (this.aClass136_100) {
			this.aClass136_100.method3474(5);
		}
		@Pc(44) Class152 local44 = this.aClass152_1;
		synchronized (this.aClass152_1) {
			this.aClass152_1.method3996();
		}
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(II)V")
	public void method7138(@OriginalArg(1) int arg0) {
		this.anInt8726 = arg0;
		@Pc(9) Class136 local9 = this.aClass136_100;
		synchronized (this.aClass136_100) {
			this.aClass136_100.method3470();
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V")
	public void method7140() {
		@Pc(10) Class136 local10 = this.aClass136_100;
		synchronized (this.aClass136_100) {
			this.aClass136_100.method3470();
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IB)Lclient!oi;")
	public Class237 method7141(@OriginalArg(0) int arg0) {
		@Pc(8) Class136 local8 = this.aClass136_99;
		@Pc(18) Class237 local18;
		synchronized (this.aClass136_99) {
			local18 = (Class237) this.aClass136_99.method3473((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class251 local31 = this.aClass251_120;
		@Pc(44) byte[] local44;
		synchronized (this.aClass251_120) {
			local44 = this.aClass251_120.method5772(Static190.method3453(arg0), Static376.method5587(arg0));
		}
		local18 = new Class237();
		local18.anInt6528 = arg0;
		local18.aClass322_1 = this;
		local18.aStringArray26 = new String[] { null, null, Static230.aClass156_6.method4065(this.anInt8724), null, null };
		local18.aStringArray25 = new String[] { null, null, null, null, Static230.aClass156_7.method4065(this.anInt8724) };
		if (local44 != null) {
			local18.method5539(new Class6_Sub21(local44));
		}
		local18.method5529();
		if (local18.anInt6539 != -1) {
			local18.method5540(this.method7141(local18.anInt6520), this.method7141(local18.anInt6539));
		}
		if (local18.anInt6560 != -1) {
			local18.method5542(this.method7141(local18.anInt6560), this.method7141(local18.anInt6510));
		}
		if (!this.aBoolean632 && local18.aBoolean452) {
			local18.aString58 = Static230.aClass156_4.method4065(this.anInt8724);
			local18.anInt6551 = 0;
			local18.aStringArray26 = this.aStringArray36;
			local18.aBoolean453 = false;
			local18.aStringArray25 = this.aStringArray37;
			local18.anIntArray485 = null;
			if (local18.aClass128_29 != null) {
				@Pc(204) boolean local204 = false;
				for (@Pc(209) Class6 local209 = local18.aClass128_29.method3265(); local209 != null; local209 = local18.aClass128_29.method3273()) {
					@Pc(219) Class320 local219 = this.aClass185_1.method4519((int) local209.aLong263);
					if (local219.aBoolean630) {
						local209.method7804();
					} else {
						local204 = true;
					}
				}
				if (!local204) {
					local18.aClass128_29 = null;
				}
			}
		}
		@Pc(244) Class136 local244 = this.aClass136_99;
		synchronized (this.aClass136_99) {
			this.aClass136_99.method3482((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "(B)V")
	public void method7142() {
		@Pc(9) Class136 local9 = this.aClass136_99;
		synchronized (this.aClass136_99) {
			this.aClass136_99.method3476();
		}
		local9 = this.aClass136_100;
		synchronized (this.aClass136_100) {
			this.aClass136_100.method3476();
		}
		@Pc(43) Class152 local43 = this.aClass152_1;
		synchronized (this.aClass152_1) {
			this.aClass152_1.method3999();
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Z)V")
	public void method7143() {
		@Pc(2) Class136 local2 = this.aClass136_99;
		synchronized (this.aClass136_99) {
			this.aClass136_99.method3470();
		}
		local2 = this.aClass136_100;
		synchronized (this.aClass136_100) {
			this.aClass136_100.method3470();
		}
		@Pc(42) Class152 local42 = this.aClass152_1;
		synchronized (this.aClass152_1) {
			this.aClass152_1.method3994();
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZILclient!oa;Lclient!oa;ILclient!ta;ZIIIILclient!h;)Lclient!xa;")
	public Class58 method7144(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14 arg2, @OriginalArg(3) Class14 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class92 arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class123 arg10) {
		@Pc(16) Class58 local16 = this.method7145(arg8, arg4, arg7, arg1, arg10, arg9, arg2);
		if (local16 != null) {
			return local16;
		}
		@Pc(25) Class237 local25 = this.method7141(arg4);
		if (arg1 > 1 && local25.anIntArray487 != null) {
			@Pc(35) int local35 = -1;
			for (@Pc(37) int local37 = 0; local37 < 10; local37++) {
				if (arg1 >= local25.anIntArray486[local37] && local25.anIntArray486[local37] != 0) {
					local35 = local25.anIntArray487[local37];
				}
			}
			if (local35 != -1) {
				local25 = this.method7141(local35);
			}
		}
		@Pc(82) int[] local82 = local25.method5537(arg8, arg0, arg2, arg7, arg10, arg1, arg3, arg5, arg9);
		if (local82 == null) {
			return null;
		}
		@Pc(96) Class58 local96;
		if (arg6) {
			local96 = arg3.method6863(local82, 36, 36, 32);
		} else {
			local96 = arg2.method6863(local82, 36, 36, 32);
		}
		if (!arg6) {
			@Pc(112) Class56 local112 = new Class56();
			local112.anInt1524 = arg8;
			local112.anInt1528 = arg2.anInt8396;
			local112.anInt1525 = arg7;
			local112.anInt1527 = arg9;
			local112.anInt1530 = arg1;
			local112.anInt1526 = arg4;
			local112.aBoolean109 = arg10 != null;
			this.aClass152_1.method3995(local112, local96);
		}
		return local96;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IBIIILclient!h;ILclient!oa;)Lclient!xa;")
	public Class58 method7145(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class123 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class14 arg6) {
		this.aClass56_1.anInt1530 = arg3;
		this.aClass56_1.anInt1527 = arg5;
		this.aClass56_1.anInt1525 = arg2;
		this.aClass56_1.anInt1528 = arg6.anInt8396;
		this.aClass56_1.anInt1524 = arg0;
		this.aClass56_1.aBoolean109 = arg4 != null;
		this.aClass56_1.anInt1526 = arg1;
		return (Class58) this.aClass152_1.method3991(this.aClass56_1);
	}
}
