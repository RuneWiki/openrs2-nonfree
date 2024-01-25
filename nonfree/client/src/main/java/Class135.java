import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class135 {

	@OriginalMember(owner = "client!gl", name = "E", descriptor = "I")
	public int anInt3163;

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "Lclient!pa;")
	private final Class265 aClass265_13 = new Class265(64);

	@OriginalMember(owner = "client!gl", name = "y", descriptor = "Lclient!pa;")
	public final Class265 aClass265_14 = new Class265(50);

	@OriginalMember(owner = "client!gl", name = "z", descriptor = "Lclient!cba;")
	public final Class51 aClass51_1 = new Class51(250);

	@OriginalMember(owner = "client!gl", name = "A", descriptor = "Lclient!qg;")
	private final Class285 aClass285_1 = new Class285();

	@OriginalMember(owner = "client!gl", name = "k", descriptor = "Lclient!cb;")
	public final Class50 aClass50_50;

	@OriginalMember(owner = "client!gl", name = "B", descriptor = "Lclient!qb;")
	private final Class282 aClass282_1;

	@OriginalMember(owner = "client!gl", name = "h", descriptor = "Z")
	private boolean aBoolean221;

	@OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
	public final int anInt3153;

	@OriginalMember(owner = "client!gl", name = "t", descriptor = "Lclient!cb;")
	private final Class50 aClass50_51;

	@OriginalMember(owner = "client!gl", name = "x", descriptor = "I")
	public final int anInt3162;

	@OriginalMember(owner = "client!gl", name = "D", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray9;

	@OriginalMember(owner = "client!gl", name = "F", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray10;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lclient!iv;IZLclient!qb;Lclient!cb;Lclient!cb;)V")
	public Class135(@OriginalArg(0) Class174 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class282 arg3, @OriginalArg(4) Class50 arg4, @OriginalArg(5) Class50 arg5) {
		this.aClass50_50 = arg5;
		this.aClass282_1 = arg3;
		this.aBoolean221 = arg2;
		this.anInt3153 = arg1;
		this.aClass50_51 = arg4;
		if (this.aClass50_51 == null) {
			this.anInt3162 = 0;
		} else {
			@Pc(49) int local49 = this.aClass50_51.method902() - 1;
			this.anInt3162 = local49 * 256 + this.aClass50_51.method913(local49);
		}
		this.aStringArray9 = new String[] { null, null, Static49.aClass42_8.method730(this.anInt3153), null, null };
		this.aStringArray10 = new String[] { null, null, null, null, Static49.aClass42_9.method730(this.anInt3153) };
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IZ)V")
	public void method2771() {
		@Pc(6) Class265 local6 = this.aClass265_13;
		synchronized (this.aClass265_13) {
			this.aClass265_13.method6570(5);
		}
		local6 = this.aClass265_14;
		synchronized (this.aClass265_14) {
			this.aClass265_14.method6570(5);
		}
		@Pc(38) Class51 local38 = this.aClass51_1;
		synchronized (this.aClass51_1) {
			this.aClass51_1.method929();
		}
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(IZ)V")
	public void method2773(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean221) {
			this.aBoolean221 = arg0;
			this.method2779();
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IILclient!mw;IZLclient!ha;IZLclient!da;Lclient!ha;II)Lclient!qda;")
	public Class59 method2774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class239 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class143 arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) Class72 arg7, @OriginalArg(9) Class143 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(14) Class59 local14 = this.method2778(arg2, arg10, arg8, arg0, arg1, arg9, arg3);
		if (local14 != null) {
			return local14;
		}
		@Pc(23) Class219 local23 = this.method2776(arg3);
		if (arg1 > 1 && local23.anIntArray349 != null) {
			@Pc(31) int local31 = -1;
			for (@Pc(33) int local33 = 0; local33 < 10; local33++) {
				if (local23.anIntArray350[local33] <= arg1 && local23.anIntArray350[local33] != 0) {
					local31 = local23.anIntArray349[local33];
				}
			}
			if (local31 != -1) {
				local23 = this.method2776(local31);
			}
		}
		@Pc(76) int[] local76 = local23.method5180(arg2, arg10, arg1, arg8, arg0, arg9, arg5, arg7, arg6);
		if (local76 == null) {
			return null;
		}
		@Pc(97) Class59 local97;
		if (arg4) {
			local97 = arg5.method6241(32, 36, 36, local76);
		} else {
			local97 = arg8.method6241(32, 36, 36, local76);
		}
		if (!arg4) {
			@Pc(113) Class285 local113 = new Class285();
			local113.anInt8244 = arg8.anInt7197;
			local113.anInt8243 = arg10;
			local113.anInt8237 = arg1;
			local113.anInt8245 = arg3;
			local113.anInt8239 = arg0;
			local113.aBoolean591 = arg2 != null;
			local113.anInt8238 = arg9;
			this.aClass51_1.method933(local97, local113);
		}
		return local97;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZI)V")
	public void method2775(@OriginalArg(1) int arg0) {
		this.anInt3163 = arg0;
		@Pc(16) Class265 local16 = this.aClass265_14;
		synchronized (this.aClass265_14) {
			this.aClass265_14.method6568();
		}
	}

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(IZ)Lclient!lia;")
	public Class219 method2776(@OriginalArg(0) int arg0) {
		@Pc(6) Class265 local6 = this.aClass265_13;
		@Pc(16) Class219 local16;
		synchronized (this.aClass265_13) {
			local16 = (Class219) this.aClass265_13.method6577((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class50 local29 = this.aClass50_51;
		@Pc(42) byte[] local42;
		synchronized (this.aClass50_51) {
			local42 = this.aClass50_51.method916(Static472.method6974(arg0), Static583.method7971(arg0));
		}
		local16 = new Class219();
		local16.anInt6130 = arg0;
		local16.aClass135_2 = this;
		local16.aStringArray20 = new String[] { null, null, Static49.aClass42_8.method730(this.anInt3153), null, null };
		local16.aStringArray19 = new String[] { null, null, null, null, Static49.aClass42_9.method730(this.anInt3153) };
		if (local42 != null) {
			local16.method5169(new Class5_Sub15(local42));
		}
		local16.method5176();
		if (local16.anInt6104 != -1) {
			local16.method5171(this.method2776(local16.anInt6142), this.method2776(local16.anInt6104));
		}
		if (local16.anInt6116 != -1) {
			local16.method5178(this.method2776(local16.anInt6116), this.method2776(local16.anInt6133));
		}
		if (local16.anInt6126 != -1) {
			local16.method5177(this.method2776(local16.anInt6131), this.method2776(local16.anInt6126));
		}
		if (!this.aBoolean221 && local16.aBoolean451) {
			local16.aString61 = Static49.aClass42_5.method730(this.anInt3153);
			local16.aBoolean450 = false;
			local16.anInt6125 = 0;
			local16.anIntArray351 = null;
			local16.aStringArray19 = this.aStringArray10;
			local16.aStringArray20 = this.aStringArray9;
			if (local16.aClass335_26 != null) {
				@Pc(215) boolean local215 = false;
				for (@Pc(220) Class5 local220 = local16.aClass335_26.method7768(); local220 != null; local220 = local16.aClass335_26.method7777()) {
					@Pc(229) Class53 local229 = this.aClass282_1.method6901((int) local220.aLong329);
					if (local229.aBoolean64) {
						local220.method8829();
					} else {
						local215 = true;
					}
				}
				if (!local215) {
					local16.aClass335_26 = null;
				}
			}
		}
		@Pc(258) Class265 local258 = this.aClass265_13;
		synchronized (this.aClass265_13) {
			this.aClass265_13.method6566(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
	public void method2777() {
		@Pc(24) Class265 local24 = this.aClass265_14;
		synchronized (this.aClass265_14) {
			this.aClass265_14.method6568();
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lclient!mw;IILclient!ha;IIII)Lclient!qda;")
	public Class59 method2778(@OriginalArg(0) Class239 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class143 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aClass285_1.anInt8244 = arg2.anInt7197;
		this.aClass285_1.anInt8237 = arg4;
		this.aClass285_1.aBoolean591 = arg0 != null;
		this.aClass285_1.anInt8239 = arg3;
		this.aClass285_1.anInt8245 = arg6;
		this.aClass285_1.anInt8238 = arg5;
		this.aClass285_1.anInt8243 = arg1;
		return (Class59) this.aClass51_1.method931(this.aClass285_1);
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V")
	public void method2779() {
		@Pc(10) Class265 local10 = this.aClass265_13;
		synchronized (this.aClass265_13) {
			this.aClass265_13.method6568();
		}
		local10 = this.aClass265_14;
		synchronized (this.aClass265_14) {
			this.aClass265_14.method6568();
		}
		@Pc(40) Class51 local40 = this.aClass51_1;
		synchronized (this.aClass51_1) {
			this.aClass51_1.method932();
		}
	}

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)V")
	public void method2780() {
		@Pc(2) Class265 local2 = this.aClass265_13;
		synchronized (this.aClass265_13) {
			this.aClass265_13.method6573();
		}
		local2 = this.aClass265_14;
		synchronized (this.aClass265_14) {
			this.aClass265_14.method6573();
		}
		@Pc(42) Class51 local42 = this.aClass51_1;
		synchronized (this.aClass51_1) {
			this.aClass51_1.method934();
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V")
	public void method2781() {
		@Pc(6) Class51 local6 = this.aClass51_1;
		synchronized (this.aClass51_1) {
			this.aClass51_1.method932();
		}
	}
}
