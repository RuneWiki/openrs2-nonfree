import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gja")
public final class Class134 {

	@OriginalMember(owner = "client!gja", name = "q", descriptor = "I")
	public int anInt3487;

	@OriginalMember(owner = "client!gja", name = "y", descriptor = "Lclient!iha;")
	private final Class168 aClass168_29 = new Class168(64);

	@OriginalMember(owner = "client!gja", name = "j", descriptor = "Lclient!iha;")
	public final Class168 aClass168_30 = new Class168(50);

	@OriginalMember(owner = "client!gja", name = "k", descriptor = "Lclient!eaa;")
	public final Class90 aClass90_1 = new Class90(250);

	@OriginalMember(owner = "client!gja", name = "p", descriptor = "Lclient!cw;")
	private final Class69 aClass69_1 = new Class69();

	@OriginalMember(owner = "client!gja", name = "n", descriptor = "Lclient!gda;")
	public final Class126 aClass126_100;

	@OriginalMember(owner = "client!gja", name = "g", descriptor = "Z")
	private boolean aBoolean249;

	@OriginalMember(owner = "client!gja", name = "b", descriptor = "I")
	public final int anInt3479;

	@OriginalMember(owner = "client!gja", name = "l", descriptor = "Lclient!vl;")
	private final Class380 aClass380_1;

	@OriginalMember(owner = "client!gja", name = "o", descriptor = "Lclient!gda;")
	private final Class126 aClass126_99;

	@OriginalMember(owner = "client!gja", name = "f", descriptor = "I")
	public final int anInt3482;

	@OriginalMember(owner = "client!gja", name = "m", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray17;

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray16;

	@OriginalMember(owner = "client!gja", name = "<init>", descriptor = "(Lclient!po;IZLclient!vl;Lclient!gda;Lclient!gda;)V")
	public Class134(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class380 arg3, @OriginalArg(4) Class126 arg4, @OriginalArg(5) Class126 arg5) {
		this.aClass126_100 = arg5;
		this.aBoolean249 = arg2;
		this.anInt3479 = arg1;
		this.aClass380_1 = arg3;
		this.aClass126_99 = arg4;
		if (this.aClass126_99 == null) {
			this.anInt3482 = 0;
		} else {
			@Pc(49) int local49 = this.aClass126_99.method3082() - 1;
			this.anInt3482 = this.aClass126_99.method3062(local49) + local49 * 256;
		}
		this.aStringArray17 = new String[] { null, null, Static184.aClass131_9.method3168(this.anInt3479), null, null };
		this.aStringArray16 = new String[] { null, null, null, null, Static184.aClass131_10.method3168(this.anInt3479) };
	}

	@OriginalMember(owner = "client!gja", name = "c", descriptor = "(B)V")
	public void method3184() {
		@Pc(2) Class168 local2 = this.aClass168_29;
		synchronized (this.aClass168_29) {
			this.aClass168_29.method3856();
		}
		local2 = this.aClass168_30;
		synchronized (this.aClass168_30) {
			this.aClass168_30.method3856();
		}
		@Pc(41) Class90 local41 = this.aClass90_1;
		synchronized (this.aClass90_1) {
			this.aClass90_1.method1664();
		}
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(ZI)V")
	public void method3185() {
		@Pc(6) Class168 local6 = this.aClass168_29;
		synchronized (this.aClass168_29) {
			this.aClass168_29.method3852(5);
		}
		local6 = this.aClass168_30;
		synchronized (this.aClass168_30) {
			this.aClass168_30.method3852(5);
		}
		@Pc(43) Class90 local43 = this.aClass90_1;
		synchronized (this.aClass90_1) {
			this.aClass90_1.method1665();
		}
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(ZIZIZLclient!da;Lclient!ha;ILclient!uaa;Lclient!ha;II)Lclient!hk;")
	public Class155 method3186(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class70 arg4, @OriginalArg(6) Class100 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class359 arg7, @OriginalArg(9) Class100 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(16) Class155 local16 = this.method3197(arg10, arg2, arg7, arg9, arg8, arg0, arg6);
		if (local16 != null) {
			return local16;
		}
		@Pc(26) Class246 local26 = this.method3191(arg2);
		if (arg6 > 1 && local26.anIntArray371 != null) {
			@Pc(38) int local38 = -1;
			for (@Pc(40) int local40 = 0; local40 < 10; local40++) {
				if (arg6 >= local26.anIntArray370[local40] && local26.anIntArray370[local40] != 0) {
					local38 = local26.anIntArray371[local40];
				}
			}
			if (local38 != -1) {
				local26 = this.method3191(local38);
			}
		}
		@Pc(98) int[] local98 = local26.method5696(arg5, arg8, arg7, arg9, arg0, arg4, arg3, arg10, arg6);
		if (local98 == null) {
			return null;
		}
		@Pc(114) Class155 local114;
		if (arg1) {
			local114 = arg5.method8645(36, 36, local98, 32);
		} else {
			local114 = arg8.method8645(36, 36, local98, 32);
		}
		if (!arg1) {
			@Pc(131) Class69 local131 = new Class69();
			local131.anInt1441 = arg0;
			local131.anInt1445 = arg2;
			local131.anInt1440 = arg10;
			local131.anInt1448 = arg6;
			local131.aBoolean121 = arg7 != null;
			local131.anInt1438 = arg8.anInt10048;
			local131.anInt1447 = arg9;
			this.aClass90_1.method1667(local114, local131);
		}
		return local114;
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(Z)V")
	public void method3187() {
		@Pc(2) Class168 local2 = this.aClass168_29;
		synchronized (this.aClass168_29) {
			this.aClass168_29.method3862();
		}
		local2 = this.aClass168_30;
		synchronized (this.aClass168_30) {
			this.aClass168_30.method3862();
		}
		@Pc(44) Class90 local44 = this.aClass90_1;
		synchronized (this.aClass90_1) {
			this.aClass90_1.method1662();
		}
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(I)V")
	public void method3188() {
		@Pc(2) Class168 local2 = this.aClass168_30;
		synchronized (this.aClass168_30) {
			this.aClass168_30.method3862();
		}
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(BZ)V")
	public void method3190(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean249) {
			this.aBoolean249 = arg0;
			this.method3187();
		}
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(IB)Lclient!nda;")
	public Class246 method3191(@OriginalArg(0) int arg0) {
		@Pc(8) Class168 local8 = this.aClass168_29;
		@Pc(18) Class246 local18;
		synchronized (this.aClass168_29) {
			local18 = (Class246) this.aClass168_29.method3860((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(32) Class126 local32 = this.aClass126_99;
		@Pc(45) byte[] local45;
		synchronized (this.aClass126_99) {
			local45 = this.aClass126_99.method3086(Static358.method5236(arg0), Static63.method1075(arg0));
		}
		local18 = new Class246();
		local18.aClass134_2 = this;
		local18.anInt6467 = arg0;
		local18.aStringArray30 = new String[] { null, null, Static184.aClass131_9.method3168(this.anInt3479), null, null };
		local18.aStringArray29 = new String[] { null, null, null, null, Static184.aClass131_10.method3168(this.anInt3479) };
		if (local45 != null) {
			local18.method5683(new Class5_Sub36(local45));
		}
		local18.method5698();
		if (local18.anInt6490 != -1) {
			local18.method5695(this.method3191(local18.anInt6510), this.method3191(local18.anInt6490));
		}
		if (local18.anInt6512 != -1) {
			local18.method5686(this.method3191(local18.anInt6470), this.method3191(local18.anInt6512));
		}
		if (local18.anInt6513 != -1) {
			local18.method5684(this.method3191(local18.anInt6513), this.method3191(local18.anInt6507));
		}
		if (!this.aBoolean249 && local18.aBoolean425) {
			local18.aString77 = Static184.aClass131_7.method3168(this.anInt3479);
			local18.aStringArray29 = this.aStringArray16;
			local18.aStringArray30 = this.aStringArray17;
			local18.anIntArray372 = null;
			local18.aBoolean426 = false;
			local18.anInt6515 = 0;
			if (local18.aClass306_28 != null) {
				@Pc(228) boolean local228 = false;
				for (@Pc(233) Class5 local233 = local18.aClass306_28.method6941(); local233 != null; local233 = local18.aClass306_28.method6940()) {
					@Pc(243) Class22 local243 = this.aClass380_1.method8839((int) local233.aLong312);
					if (local243.aBoolean18) {
						local233.method9222();
					} else {
						local228 = true;
					}
				}
				if (!local228) {
					local18.aClass306_28 = null;
				}
			}
		}
		@Pc(274) Class168 local274 = this.aClass168_29;
		synchronized (this.aClass168_29) {
			this.aClass168_29.method3853((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(B)V")
	public void method3194() {
		@Pc(14) Class90 local14 = this.aClass90_1;
		synchronized (this.aClass90_1) {
			this.aClass90_1.method1662();
		}
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(II)V")
	public void method3196(@OriginalArg(1) int arg0) {
		this.anInt3487 = arg0;
		@Pc(17) Class168 local17 = this.aClass168_30;
		synchronized (this.aClass168_30) {
			this.aClass168_30.method3862();
		}
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(IIILclient!uaa;ILclient!ha;II)Lclient!hk;")
	public Class155 method3197(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class359 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class100 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aClass69_1.aBoolean121 = arg2 != null;
		this.aClass69_1.anInt1440 = arg0;
		this.aClass69_1.anInt1448 = arg6;
		this.aClass69_1.anInt1447 = arg3;
		this.aClass69_1.anInt1438 = arg4.anInt10048;
		this.aClass69_1.anInt1441 = arg5;
		this.aClass69_1.anInt1445 = arg1;
		return (Class155) this.aClass90_1.method1661(this.aClass69_1);
	}
}
