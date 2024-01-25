import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class139 {

	@OriginalMember(owner = "client!kk", name = "A", descriptor = "I")
	public int anInt3876;

	@OriginalMember(owner = "client!kk", name = "s", descriptor = "Lclient!ff;")
	private final Class83 aClass83_34 = new Class83(64);

	@OriginalMember(owner = "client!kk", name = "w", descriptor = "Lclient!ff;")
	public final Class83 aClass83_35 = new Class83(50);

	@OriginalMember(owner = "client!kk", name = "y", descriptor = "Lclient!ik;")
	public final Class117 aClass117_1 = new Class117(250);

	@OriginalMember(owner = "client!kk", name = "z", descriptor = "Lclient!gs;")
	private final Class98 aClass98_1 = new Class98();

	@OriginalMember(owner = "client!kk", name = "D", descriptor = "Lclient!up;")
	private final Class243 aClass243_1;

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "Lclient!vh;")
	private final Class250 aClass250_48;

	@OriginalMember(owner = "client!kk", name = "m", descriptor = "Z")
	private boolean aBoolean267;

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "I")
	public final int anInt3865;

	@OriginalMember(owner = "client!kk", name = "i", descriptor = "Lclient!vh;")
	public final Class250 aClass250_49;

	@OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
	public final int anInt3869;

	@OriginalMember(owner = "client!kk", name = "C", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray36;

	@OriginalMember(owner = "client!kk", name = "B", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray35;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lclient!lf;IZLclient!up;Lclient!vh;Lclient!vh;)V")
	public Class139(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class243 arg3, @OriginalArg(4) Class250 arg4, @OriginalArg(5) Class250 arg5) {
		this.aClass243_1 = arg3;
		this.aClass250_48 = arg4;
		this.aBoolean267 = arg2;
		this.anInt3865 = arg1;
		this.aClass250_49 = arg5;
		if (this.aClass250_48 == null) {
			this.anInt3869 = 0;
		} else {
			@Pc(54) int local54 = this.aClass250_48.method5666() - 1;
			this.anInt3869 = local54 * 256 + this.aClass250_48.method5653(local54);
		}
		this.aStringArray36 = new String[] { null, null, Static229.aClass84_67.method1678(this.anInt3865), null, null };
		this.aStringArray35 = new String[] { null, null, null, null, Static294.aClass84_79.method1678(this.anInt3865) };
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
	public void method3223() {
		@Pc(13) Class83 local13 = this.aClass83_35;
		synchronized (this.aClass83_35) {
			this.aClass83_35.method1669();
		}
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)V")
	public void method3224() {
		@Pc(2) Class83 local2 = this.aClass83_34;
		synchronized (this.aClass83_34) {
			this.aClass83_34.method1669();
		}
		local2 = this.aClass83_35;
		synchronized (this.aClass83_35) {
			this.aClass83_35.method1669();
		}
		@Pc(44) Class117 local44 = this.aClass117_1;
		synchronized (this.aClass117_1) {
			this.aClass117_1.method2730();
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)V")
	public void method3226() {
		@Pc(6) Class83 local6 = this.aClass83_34;
		synchronized (this.aClass83_34) {
			this.aClass83_34.method1663(5);
		}
		local6 = this.aClass83_35;
		synchronized (this.aClass83_35) {
			this.aClass83_35.method1663(5);
		}
		@Pc(44) Class117 local44 = this.aClass117_1;
		synchronized (this.aClass117_1) {
			this.aClass117_1.method2732();
		}
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V")
	public void method3227() {
		@Pc(2) Class83 local2 = this.aClass83_34;
		synchronized (this.aClass83_34) {
			this.aClass83_34.method1667();
		}
		local2 = this.aClass83_35;
		synchronized (this.aClass83_35) {
			this.aClass83_35.method1667();
		}
		@Pc(40) Class117 local40 = this.aClass117_1;
		synchronized (this.aClass117_1) {
			this.aClass117_1.method2729();
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZI)Lclient!wr;")
	public Class268 method3228(@OriginalArg(1) int arg0) {
		@Pc(8) Class83 local8 = this.aClass83_34;
		@Pc(18) Class268 local18;
		synchronized (this.aClass83_34) {
			local18 = (Class268) this.aClass83_34.method1658((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(39) byte[] local39 = this.aClass250_48.method5667(Static366.method4346(arg0), Static35.method1643(arg0));
		local18 = new Class268();
		local18.anInt7738 = arg0;
		local18.aClass139_2 = this;
		local18.aStringArray55 = new String[] { null, null, Static229.aClass84_67.method1678(this.anInt3865), null, null };
		local18.aStringArray56 = new String[] { null, null, null, null, Static294.aClass84_79.method1678(this.anInt3865) };
		if (local39 != null) {
			local18.method6039(new Class1_Sub1(local39));
		}
		local18.method6034();
		if (local18.anInt7768 != -1) {
			local18.method6035(this.method3228(local18.anInt7757), this.method3228(local18.anInt7768));
		}
		if (local18.anInt7780 != -1) {
			local18.method6041(this.method3228(local18.anInt7780), this.method3228(local18.anInt7782));
		}
		if (!this.aBoolean267 && local18.aBoolean491) {
			local18.aString66 = Static145.aClass84_38.method1678(this.anInt3865);
			local18.aBoolean492 = false;
			local18.aStringArray55 = this.aStringArray36;
			local18.anIntArray684 = null;
			local18.anInt7733 = 0;
			local18.aStringArray56 = this.aStringArray35;
			if (local18.aClass27_44 != null) {
				@Pc(187) boolean local187 = false;
				for (@Pc(192) Class1 local192 = local18.aClass27_44.method555(); local192 != null; local192 = local18.aClass27_44.method563()) {
					@Pc(202) Class256 local202 = this.aClass243_1.method5551((int) local192.aLong227);
					if (local202.aBoolean477) {
						local192.method6071();
					} else {
						local187 = true;
					}
				}
				if (!local187) {
					local18.aClass27_44 = null;
				}
			}
		}
		@Pc(227) Class83 local227 = this.aClass83_34;
		synchronized (this.aClass83_34) {
			this.aClass83_34.method1675((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(II)V")
	public void method3230(@OriginalArg(0) int arg0) {
		this.anInt3876 = arg0;
		@Pc(9) Class83 local9 = this.aClass83_35;
		synchronized (this.aClass83_35) {
			this.aClass83_35.method1669();
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)V")
	public void method3231() {
		@Pc(11) Class117 local11 = this.aClass117_1;
		synchronized (this.aClass117_1) {
			this.aClass117_1.method2730();
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IZIIILclient!qa;Lclient!oa;ZILclient!qa;ZLclient!jh;)Lclient!f;")
	public Class80 method3232(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class109 arg5, @OriginalArg(6) Class129 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class109 arg9, @OriginalArg(11) Class127 arg10) {
		@Pc(16) Class80 local16 = this.method3234(arg4, arg3, arg10, arg0, arg8, arg9, arg2);
		if (local16 != null) {
			return local16;
		}
		@Pc(25) Class268 local25 = this.method3228(arg3);
		if (arg4 > 1 && local25.anIntArray683 != null) {
			@Pc(35) int local35 = -1;
			for (@Pc(37) int local37 = 0; local37 < 10; local37++) {
				if (local25.anIntArray682[local37] <= arg4 && local25.anIntArray682[local37] != 0) {
					local35 = local25.anIntArray683[local37];
				}
			}
			if (local35 != -1) {
				local25 = this.method3228(local35);
			}
		}
		@Pc(86) int[] local86 = local25.method6024(arg8, arg10, arg7, arg4, arg9, arg5, arg0, arg2, arg6);
		if (local86 == null) {
			return null;
		}
		@Pc(100) Class80 local100;
		if (arg1) {
			local100 = arg5.method4739(local86, 36, 36, 32);
		} else {
			local100 = arg9.method4739(local86, 36, 36, 32);
		}
		if (!arg1) {
			@Pc(116) Class98 local116 = new Class98();
			local116.anInt2354 = arg3;
			local116.anInt2349 = arg0;
			local116.anInt2348 = arg9.anInt5850;
			local116.anInt2352 = arg8;
			local116.anInt2347 = arg4;
			local116.aBoolean129 = arg10 != null;
			local116.anInt2357 = arg2;
			this.aClass117_1.method2733(local116, local100);
		}
		return local100;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZZ)V")
	public void method3233(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean267) {
			this.aBoolean267 = arg0;
			this.method3224();
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(BIILclient!jh;IILclient!qa;I)Lclient!f;")
	public Class80 method3234(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class127 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class109 arg5, @OriginalArg(7) int arg6) {
		this.aClass98_1.anInt2352 = arg4;
		this.aClass98_1.anInt2347 = arg0;
		this.aClass98_1.anInt2357 = arg6;
		this.aClass98_1.anInt2349 = arg3;
		this.aClass98_1.anInt2348 = arg5.anInt5850;
		this.aClass98_1.anInt2354 = arg1;
		this.aClass98_1.aBoolean129 = arg2 != null;
		return (Class80) this.aClass117_1.method2735(this.aClass98_1);
	}
}
