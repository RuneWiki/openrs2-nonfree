import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class92 {

	@OriginalMember(owner = "client!fb", name = "A", descriptor = "I")
	public int anInt2980;

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "Lclient!ad;")
	private final Class6 aClass6_13 = new Class6(64);

	@OriginalMember(owner = "client!fb", name = "v", descriptor = "Lclient!ad;")
	public final Class6 aClass6_14 = new Class6(50);

	@OriginalMember(owner = "client!fb", name = "w", descriptor = "Lclient!kga;")
	public final Class179 aClass179_1 = new Class179(250);

	@OriginalMember(owner = "client!fb", name = "x", descriptor = "Lclient!ve;")
	private final Class348 aClass348_1 = new Class348();

	@OriginalMember(owner = "client!fb", name = "z", descriptor = "Lclient!hda;")
	private final Class124 aClass124_2;

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "Z")
	private boolean aBoolean239;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "Lclient!tf;")
	public final Class322 aClass322_53;

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "Lclient!tf;")
	private final Class322 aClass322_54;

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
	public final int anInt2979;

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
	public final int anInt2968;

	@OriginalMember(owner = "client!fb", name = "B", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray13;

	@OriginalMember(owner = "client!fb", name = "y", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray12;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!qh;IZLclient!hda;Lclient!tf;Lclient!tf;)V")
	public Class92(@OriginalArg(0) Class274 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class124 arg3, @OriginalArg(4) Class322 arg4, @OriginalArg(5) Class322 arg5) {
		this.aClass124_2 = arg3;
		this.aBoolean239 = arg2;
		this.aClass322_53 = arg5;
		this.aClass322_54 = arg4;
		this.anInt2979 = arg1;
		if (this.aClass322_54 == null) {
			this.anInt2968 = 0;
		} else {
			@Pc(54) int local54 = this.aClass322_54.method6825() - 1;
			this.anInt2968 = local54 * 256 + this.aClass322_54.method6831(local54);
		}
		this.aStringArray13 = new String[] { null, null, Static544.aClass343_11.method7222(this.anInt2979), null, null };
		this.aStringArray12 = new String[] { null, null, null, null, Static544.aClass343_12.method7222(this.anInt2979) };
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILclient!r;IIIZLclient!ea;I)Lclient!f;")
	public Class14 method2672(@OriginalArg(0) int arg0, @OriginalArg(1) Class45 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class78 arg5, @OriginalArg(7) int arg6) {
		this.aClass348_1.anInt8762 = arg3;
		this.aClass348_1.anInt8765 = arg6;
		this.aClass348_1.anInt8763 = arg2;
		this.aClass348_1.anInt8760 = arg0;
		this.aClass348_1.aBoolean671 = arg5 != null;
		this.aClass348_1.anInt8770 = arg1.anInt8843;
		this.aClass348_1.anInt8766 = arg4;
		return (Class14) this.aClass179_1.method4179(this.aClass348_1);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)Lclient!lo;")
	public Class197 method2673(@OriginalArg(0) int arg0) {
		@Pc(8) Class6 local8 = this.aClass6_13;
		@Pc(18) Class197 local18;
		synchronized (this.aClass6_13) {
			local18 = (Class197) this.aClass6_13.method92((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class322 local31 = this.aClass322_54;
		@Pc(44) byte[] local44;
		synchronized (this.aClass322_54) {
			local44 = this.aClass322_54.method6802(Static9.method3873(arg0), Static138.method2697(arg0));
		}
		local18 = new Class197();
		local18.anInt5246 = arg0;
		local18.aClass92_2 = this;
		local18.aStringArray21 = new String[] { null, null, Static544.aClass343_11.method7222(this.anInt2979), null, null };
		local18.aStringArray20 = new String[] { null, null, null, null, Static544.aClass343_12.method7222(this.anInt2979) };
		if (local44 != null) {
			local18.method4511(new Class3_Sub11(local44));
		}
		local18.method4520();
		if (local18.anInt5214 != -1) {
			local18.method4524(this.method2673(local18.anInt5214), this.method2673(local18.anInt5201));
		}
		if (local18.anInt5211 != -1) {
			local18.method4526(this.method2673(local18.anInt5202), this.method2673(local18.anInt5211));
		}
		if (!this.aBoolean239 && local18.aBoolean387) {
			local18.aString38 = Static544.aClass343_9.method7222(this.anInt2979);
			local18.anIntArray291 = null;
			local18.anInt5197 = 0;
			local18.aStringArray20 = this.aStringArray12;
			local18.aBoolean386 = false;
			local18.aStringArray21 = this.aStringArray13;
			if (local18.aClass354_25 != null) {
				@Pc(202) boolean local202 = false;
				for (@Pc(207) Class3 local207 = local18.aClass354_25.method7694(); local207 != null; local207 = local18.aClass354_25.method7692()) {
					@Pc(217) Class10 local217 = this.aClass124_2.method3255((int) local207.aLong273);
					if (local217.aBoolean6) {
						local207.method7825();
					} else {
						local202 = true;
					}
				}
				if (!local202) {
					local18.aClass354_25 = null;
				}
			}
		}
		@Pc(242) Class6 local242 = this.aClass6_13;
		synchronized (this.aClass6_13) {
			this.aClass6_13.method106((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V")
	public void method2674() {
		@Pc(6) Class179 local6 = this.aClass179_1;
		synchronized (this.aClass179_1) {
			this.aClass179_1.method4176();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZI)V")
	public void method2675(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean239) {
			this.aBoolean239 = arg0;
			this.method2679();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILclient!r;IZLclient!la;ILclient!ea;ZBLclient!r;II)Lclient!f;")
	public Class14 method2676(@OriginalArg(0) int arg0, @OriginalArg(1) Class45 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class54 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class78 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(9) Class45 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(16) Class14 local16 = this.method2672(arg2, arg8, arg0, arg10, arg9, arg6, arg5);
		if (local16 != null) {
			return local16;
		}
		@Pc(25) Class197 local25 = this.method2673(arg9);
		if (arg10 > 1 && local25.anIntArray292 != null) {
			@Pc(33) int local33 = -1;
			for (@Pc(35) int local35 = 0; local35 < 10; local35++) {
				if (arg10 >= local25.anIntArray290[local35] && local25.anIntArray290[local35] != 0) {
					local33 = local25.anIntArray292[local35];
				}
			}
			if (local33 != -1) {
				local25 = this.method2673(local33);
			}
		}
		@Pc(88) int[] local88 = local25.method4521(arg10, arg0, arg2, arg6, arg3, arg4, arg8, arg5, arg1);
		if (local88 == null) {
			return null;
		}
		@Pc(108) Class14 local108;
		if (arg7) {
			local108 = arg1.method7395(local88, 36, 36, 32);
		} else {
			local108 = arg8.method7395(local88, 36, 36, 32);
		}
		if (!arg7) {
			@Pc(124) Class348 local124 = new Class348();
			local124.anInt8762 = arg10;
			local124.anInt8765 = arg5;
			local124.anInt8770 = arg8.anInt8843;
			local124.anInt8763 = arg0;
			local124.anInt8766 = arg9;
			local124.anInt8760 = arg2;
			local124.aBoolean671 = arg6 != null;
			this.aClass179_1.method4171(local124, local108);
		}
		return local108;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IB)V")
	public void method2678() {
		@Pc(6) Class6 local6 = this.aClass6_13;
		synchronized (this.aClass6_13) {
			this.aClass6_13.method97(5);
		}
		local6 = this.aClass6_14;
		synchronized (this.aClass6_14) {
			this.aClass6_14.method97(5);
		}
		@Pc(38) Class179 local38 = this.aClass179_1;
		synchronized (this.aClass179_1) {
			this.aClass179_1.method4170();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	public void method2679() {
		@Pc(2) Class6 local2 = this.aClass6_13;
		synchronized (this.aClass6_13) {
			this.aClass6_13.method102();
		}
		local2 = this.aClass6_14;
		synchronized (this.aClass6_14) {
			this.aClass6_14.method102();
		}
		@Pc(44) Class179 local44 = this.aClass179_1;
		synchronized (this.aClass179_1) {
			this.aClass179_1.method4176();
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
	public void method2681() {
		@Pc(2) Class6 local2 = this.aClass6_13;
		synchronized (this.aClass6_13) {
			this.aClass6_13.method94();
		}
		local2 = this.aClass6_14;
		synchronized (this.aClass6_14) {
			this.aClass6_14.method94();
		}
		@Pc(36) Class179 local36 = this.aClass179_1;
		synchronized (this.aClass179_1) {
			this.aClass179_1.method4177();
		}
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V")
	public void method2682() {
		@Pc(6) Class6 local6 = this.aClass6_14;
		synchronized (this.aClass6_14) {
			this.aClass6_14.method102();
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(ZI)V")
	public void method2683(@OriginalArg(1) int arg0) {
		this.anInt2980 = arg0;
		@Pc(15) Class6 local15 = this.aClass6_14;
		synchronized (this.aClass6_14) {
			this.aClass6_14.method102();
		}
	}
}
