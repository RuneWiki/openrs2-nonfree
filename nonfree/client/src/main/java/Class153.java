import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class153 {

	@OriginalMember(owner = "client!jn", name = "y", descriptor = "I")
	public int anInt4595;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "Lclient!wf;")
	private final Class316 aClass316_29 = new Class316(64);

	@OriginalMember(owner = "client!jn", name = "v", descriptor = "Lclient!wf;")
	public final Class316 aClass316_30 = new Class316(50);

	@OriginalMember(owner = "client!jn", name = "w", descriptor = "Lclient!wb;")
	public final Class314 aClass314_1 = new Class314(250);

	@OriginalMember(owner = "client!jn", name = "x", descriptor = "Lclient!qv;")
	private final Class246 aClass246_1 = new Class246();

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
	public final int anInt4579;

	@OriginalMember(owner = "client!jn", name = "k", descriptor = "Z")
	private boolean aBoolean279;

	@OriginalMember(owner = "client!jn", name = "A", descriptor = "Lclient!gb;")
	private final Class98 aClass98_4;

	@OriginalMember(owner = "client!jn", name = "j", descriptor = "Lclient!kda;")
	public final Class160 aClass160_51;

	@OriginalMember(owner = "client!jn", name = "i", descriptor = "Lclient!kda;")
	private final Class160 aClass160_50;

	@OriginalMember(owner = "client!jn", name = "u", descriptor = "I")
	public final int anInt4594;

	@OriginalMember(owner = "client!jn", name = "z", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray17;

	@OriginalMember(owner = "client!jn", name = "B", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray18;

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Lclient!bt;IZLclient!gb;Lclient!kda;Lclient!kda;)V")
	public Class153(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class98 arg3, @OriginalArg(4) Class160 arg4, @OriginalArg(5) Class160 arg5) {
		this.anInt4579 = arg1;
		this.aBoolean279 = arg2;
		this.aClass98_4 = arg3;
		this.aClass160_51 = arg5;
		this.aClass160_50 = arg4;
		if (this.aClass160_50 == null) {
			this.anInt4594 = 0;
		} else {
			@Pc(49) int local49 = this.aClass160_50.method4206() - 1;
			this.anInt4594 = this.aClass160_50.method4207(local49) + local49 * 256;
		}
		this.aStringArray17 = new String[] { null, null, Static536.aClass114_171.method3330(this.anInt4579), null, null };
		this.aStringArray18 = new String[] { null, null, null, null, Static76.aClass114_44.method3330(this.anInt4579) };
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIILclient!qa;IZLclient!qa;ZLclient!ra;BLclient!rs;I)Lclient!ha;")
	public Class12 method3994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class9 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) Class9 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class27 arg8, @OriginalArg(10) Class258 arg9, @OriginalArg(11) int arg10) {
		@Pc(14) Class12 local14 = this.method3998(arg1, arg9, arg6, arg10, arg2, arg0, arg4);
		if (local14 != null) {
			return local14;
		}
		@Pc(23) Class192 local23 = this.method4007(arg0);
		if (arg1 > 1 && local23.anIntArray409 != null) {
			@Pc(33) int local33 = -1;
			for (@Pc(35) int local35 = 0; local35 < 10; local35++) {
				if (arg1 >= local23.anIntArray408[local35] && local23.anIntArray408[local35] != 0) {
					local33 = local23.anIntArray409[local35];
				}
			}
			if (local33 != -1) {
				local23 = this.method4007(local33);
			}
		}
		@Pc(84) int[] local84 = local23.method5017(arg8, arg3, arg4, arg2, arg6, arg1, arg9, arg7, arg10);
		if (local84 == null) {
			return null;
		}
		@Pc(98) Class12 local98;
		if (arg5) {
			local98 = arg3.method7641(local84, 36, 36, 32);
		} else {
			local98 = arg6.method7641(local84, 36, 36, 32);
		}
		if (!arg5) {
			@Pc(118) Class246 local118 = new Class246();
			local118.anInt7054 = arg10;
			local118.anInt7062 = arg4;
			local118.anInt7063 = arg1;
			local118.anInt7059 = arg0;
			local118.anInt7055 = arg2;
			local118.aBoolean467 = arg9 != null;
			local118.anInt7057 = arg6.anInt9019;
			this.aClass314_1.method7508(local118, local98);
		}
		return local98;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)V")
	public void method3996() {
		@Pc(6) Class316 local6 = this.aClass316_29;
		synchronized (this.aClass316_29) {
			this.aClass316_29.method7803();
		}
		local6 = this.aClass316_30;
		synchronized (this.aClass316_30) {
			this.aClass316_30.method7803();
		}
		@Pc(36) Class314 local36 = this.aClass314_1;
		synchronized (this.aClass314_1) {
			this.aClass314_1.method7510();
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V")
	public void method3997() {
		@Pc(2) Class316 local2 = this.aClass316_29;
		synchronized (this.aClass316_29) {
			this.aClass316_29.method7794();
		}
		local2 = this.aClass316_30;
		synchronized (this.aClass316_30) {
			this.aClass316_30.method7794();
		}
		@Pc(36) Class314 local36 = this.aClass314_1;
		synchronized (this.aClass314_1) {
			this.aClass314_1.method7513();
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILclient!rs;Lclient!qa;IIIZI)Lclient!ha;")
	public Class12 method3998(@OriginalArg(0) int arg0, @OriginalArg(1) Class258 arg1, @OriginalArg(2) Class9 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		this.aClass246_1.anInt7057 = arg2.anInt9019;
		this.aClass246_1.anInt7062 = arg6;
		this.aClass246_1.anInt7054 = arg3;
		this.aClass246_1.anInt7059 = arg5;
		this.aClass246_1.aBoolean467 = arg1 != null;
		this.aClass246_1.anInt7055 = arg4;
		this.aClass246_1.anInt7063 = arg0;
		return (Class12) this.aClass314_1.method7504(this.aClass246_1);
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(Z)V")
	public void method3999() {
		@Pc(2) Class314 local2 = this.aClass314_1;
		synchronized (this.aClass314_1) {
			this.aClass314_1.method7513();
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZI)V")
	public void method4000(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean279 != arg0) {
			this.aBoolean279 = arg0;
			this.method3997();
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
	public void method4001() {
		@Pc(6) Class316 local6 = this.aClass316_30;
		synchronized (this.aClass316_30) {
			this.aClass316_30.method7794();
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IB)V")
	public void method4002() {
		@Pc(2) Class316 local2 = this.aClass316_29;
		synchronized (this.aClass316_29) {
			this.aClass316_29.method7791(5);
		}
		local2 = this.aClass316_30;
		synchronized (this.aClass316_30) {
			this.aClass316_30.method7791(5);
		}
		@Pc(38) Class314 local38 = this.aClass314_1;
		synchronized (this.aClass314_1) {
			this.aClass314_1.method7515();
		}
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(II)V")
	public void method4006(@OriginalArg(1) int arg0) {
		this.anInt4595 = arg0;
		@Pc(9) Class316 local9 = this.aClass316_30;
		synchronized (this.aClass316_30) {
			this.aClass316_30.method7794();
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BI)Lclient!mh;")
	public Class192 method4007(@OriginalArg(1) int arg0) {
		@Pc(6) Class316 local6 = this.aClass316_29;
		@Pc(16) Class192 local16;
		synchronized (this.aClass316_29) {
			local16 = (Class192) this.aClass316_29.method7799((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class160 local29 = this.aClass160_50;
		@Pc(42) byte[] local42;
		synchronized (this.aClass160_50) {
			local42 = this.aClass160_50.method4198(Static458.method6749(arg0), Static132.method2858(arg0));
		}
		local16 = new Class192();
		local16.aClass153_1 = this;
		local16.lb = arg0;
		local16.aStringArray25 = new String[] { null, null, Static536.aClass114_171.method3330(this.anInt4579), null, null };
		local16.aStringArray24 = new String[] { null, null, null, null, Static76.aClass114_44.method3330(this.anInt4579) };
		if (local42 != null) {
			local16.method5015(new Class1_Sub13(local42));
		}
		local16.method5008();
		if (local16.anInt5814 != -1) {
			local16.method5016(this.method4007(local16.anInt5796), this.method4007(local16.anInt5814));
		}
		if (local16.anInt5784 != -1) {
			local16.method5009(this.method4007(local16.anInt5787), this.method4007(local16.anInt5784));
		}
		if (!this.aBoolean279 && local16.aBoolean396) {
			local16.aString55 = Static333.aClass114_120.method3330(this.anInt4579);
			local16.anInt5770 = 0;
			local16.aStringArray24 = this.aStringArray18;
			local16.anIntArray410 = null;
			local16.aStringArray25 = this.aStringArray17;
			local16.aBoolean397 = false;
			if (local16.aClass174_19 != null) {
				@Pc(204) boolean local204 = false;
				for (@Pc(209) Class1 local209 = local16.aClass174_19.method4421(); local209 != null; local209 = local16.aClass174_19.method4429()) {
					@Pc(218) Class134 local218 = this.aClass98_4.method3006((int) local209.aLong244);
					if (local218.aBoolean261) {
						local209.method7983();
					} else {
						local204 = true;
					}
				}
				if (!local204) {
					local16.aClass174_19 = null;
				}
			}
		}
		@Pc(242) Class316 local242 = this.aClass316_29;
		synchronized (this.aClass316_29) {
			this.aClass316_29.method7792((long) arg0, local16);
			return local16;
		}
	}
}
