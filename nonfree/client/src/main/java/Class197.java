import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kka")
public final class Class197 {

	@OriginalMember(owner = "client!kka", name = "F", descriptor = "I")
	public int anInt5270;

	@OriginalMember(owner = "client!kka", name = "f", descriptor = "Lclient!qj;")
	private final Class295 aClass295_27 = new Class295(64);

	@OriginalMember(owner = "client!kka", name = "x", descriptor = "Lclient!qj;")
	public final Class295 aClass295_28 = new Class295(50);

	@OriginalMember(owner = "client!kka", name = "A", descriptor = "Lclient!jba;")
	public final Class172 aClass172_1 = new Class172(250);

	@OriginalMember(owner = "client!kka", name = "B", descriptor = "Lclient!qaa;")
	private final Class289 aClass289_1 = new Class289();

	@OriginalMember(owner = "client!kka", name = "d", descriptor = "I")
	public final int anInt5255;

	@OriginalMember(owner = "client!kka", name = "h", descriptor = "Lclient!uq;")
	public final Class362 aClass362_64;

	@OriginalMember(owner = "client!kka", name = "u", descriptor = "Lclient!uq;")
	private final Class362 aClass362_65;

	@OriginalMember(owner = "client!kka", name = "r", descriptor = "Z")
	private boolean aBoolean346;

	@OriginalMember(owner = "client!kka", name = "E", descriptor = "Lclient!te;")
	private final Class335 aClass335_1;

	@OriginalMember(owner = "client!kka", name = "l", descriptor = "I")
	public final int anInt5259;

	@OriginalMember(owner = "client!kka", name = "D", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray38;

	@OriginalMember(owner = "client!kka", name = "C", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray37;

	@OriginalMember(owner = "client!kka", name = "<init>", descriptor = "(Lclient!kw;IZLclient!te;Lclient!uq;Lclient!uq;)V")
	public Class197(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class335 arg3, @OriginalArg(4) Class362 arg4, @OriginalArg(5) Class362 arg5) {
		this.anInt5255 = arg1;
		this.aClass362_64 = arg5;
		this.aClass362_65 = arg4;
		this.aBoolean346 = arg2;
		this.aClass335_1 = arg3;
		if (this.aClass362_65 == null) {
			this.anInt5259 = 0;
		} else {
			@Pc(54) int local54 = this.aClass362_65.method8373() - 1;
			this.anInt5259 = local54 * 256 + this.aClass362_65.method8355(local54);
		}
		this.aStringArray38 = new String[] { null, null, Static114.aClass84_8.method1729(this.anInt5255), null, null };
		this.aStringArray37 = new String[] { null, null, null, null, Static114.aClass84_9.method1729(this.anInt5255) };
	}

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(Lclient!ha;ZIILclient!vp;Lclient!da;IIZLclient!ha;II)Lclient!hh;")
	public Class6 method4517(@OriginalArg(0) Class95 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class376 arg4, @OriginalArg(5) Class67 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) Class95 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(16) Class6 local16 = this.method4529(arg10, arg9, arg3, arg8, arg6, arg2, arg4);
		if (local16 != null) {
			return local16;
		}
		@Pc(27) Class15 local27 = this.method4518(arg6);
		if (arg9 > 1 && local27.anIntArray15 != null) {
			@Pc(35) int local35 = -1;
			for (@Pc(37) int local37 = 0; local37 < 10; local37++) {
				if (local27.anIntArray14[local37] <= arg9 && local27.anIntArray14[local37] != 0) {
					local35 = local27.anIntArray15[local37];
				}
			}
			if (local35 != -1) {
				local27 = this.method4518(local35);
			}
		}
		@Pc(83) int[] local83 = local27.method474(arg2, arg5, arg7, arg9, arg10, arg3, arg4, arg0, arg8);
		if (local83 == null) {
			return null;
		}
		@Pc(100) Class6 local100;
		if (arg1) {
			local100 = arg0.method7993(local83, 36, 32, 36);
		} else {
			local100 = arg8.method7993(local83, 36, 32, 36);
		}
		if (!arg1) {
			@Pc(117) Class289 local117 = new Class289();
			local117.anInt7598 = arg2;
			local117.anInt7599 = arg8.anInt9840;
			local117.anInt7597 = arg3;
			local117.anInt7595 = arg6;
			local117.anInt7594 = arg10;
			local117.anInt7593 = arg9;
			local117.aBoolean535 = arg4 != null;
			this.aClass172_1.method4001(local100, local117);
		}
		return local100;
	}

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(II)Lclient!ak;")
	public Class15 method4518(@OriginalArg(0) int arg0) {
		@Pc(8) Class295 local8 = this.aClass295_27;
		@Pc(23) Class15 local23;
		synchronized (this.aClass295_27) {
			local23 = (Class15) this.aClass295_27.method6470((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(36) Class362 local36 = this.aClass362_65;
		@Pc(51) byte[] local51;
		synchronized (this.aClass362_65) {
			local51 = this.aClass362_65.method8368(Static316.method4545(arg0), Static675.method9000(arg0));
		}
		local23 = new Class15();
		local23.lb = arg0;
		local23.aClass197_1 = this;
		local23.aStringArray5 = new String[] { null, null, Static114.aClass84_8.method1729(this.anInt5255), null, null };
		local23.aStringArray4 = new String[] { null, null, null, null, Static114.aClass84_9.method1729(this.anInt5255) };
		if (local51 != null) {
			local23.method460(new Class3_Sub4(local51));
		}
		local23.method475();
		if (local23.anInt436 != -1) {
			local23.method469(this.method4518(local23.anInt436), this.method4518(local23.anInt476));
		}
		if (local23.anInt446 != -1) {
			local23.method462(this.method4518(local23.anInt446), this.method4518(local23.anInt481));
		}
		if (local23.anInt440 != -1) {
			local23.method467(this.method4518(local23.anInt440), this.method4518(local23.anInt439));
		}
		if (!this.aBoolean346 && local23.aBoolean22) {
			local23.aString6 = Static114.aClass84_5.method1729(this.anInt5255);
			local23.anIntArray16 = null;
			local23.aStringArray4 = this.aStringArray37;
			local23.aBoolean21 = false;
			local23.anInt427 = 0;
			local23.aStringArray5 = this.aStringArray38;
			if (local23.aClass333_1 != null) {
				@Pc(224) boolean local224 = false;
				for (@Pc(229) Class3 local229 = local23.aClass333_1.method7490(); local229 != null; local229 = local23.aClass333_1.method7487()) {
					@Pc(239) Class281 local239 = this.aClass335_1.method7504((int) local229.aLong313);
					if (local239.aBoolean526) {
						local229.method9034();
					} else {
						local224 = true;
					}
				}
				if (!local224) {
					local23.aClass333_1 = null;
				}
			}
		}
		@Pc(264) Class295 local264 = this.aClass295_27;
		synchronized (this.aClass295_27) {
			this.aClass295_27.method6469((long) arg0, local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(ZZ)V")
	public void method4519(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean346 != arg0) {
			this.aBoolean346 = arg0;
			this.method4524();
		}
	}

	@OriginalMember(owner = "client!kka", name = "b", descriptor = "(II)V")
	public void method4520() {
		@Pc(2) Class295 local2 = this.aClass295_27;
		synchronized (this.aClass295_27) {
			this.aClass295_27.method6462(5);
		}
		local2 = this.aClass295_28;
		synchronized (this.aClass295_28) {
			this.aClass295_28.method6462(5);
		}
		@Pc(46) Class172 local46 = this.aClass172_1;
		synchronized (this.aClass172_1) {
			this.aClass172_1.method3999();
		}
	}

	@OriginalMember(owner = "client!kka", name = "c", descriptor = "(II)V")
	public void method4522(@OriginalArg(0) int arg0) {
		this.anInt5270 = arg0;
		@Pc(13) Class295 local13 = this.aClass295_28;
		synchronized (this.aClass295_28) {
			this.aClass295_28.method6464();
		}
	}

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(B)V")
	public void method4524() {
		@Pc(2) Class295 local2 = this.aClass295_27;
		synchronized (this.aClass295_27) {
			this.aClass295_27.method6464();
		}
		local2 = this.aClass295_28;
		synchronized (this.aClass295_28) {
			this.aClass295_28.method6464();
		}
		@Pc(44) Class172 local44 = this.aClass172_1;
		synchronized (this.aClass172_1) {
			this.aClass172_1.method4003();
		}
	}

	@OriginalMember(owner = "client!kka", name = "b", descriptor = "(I)V")
	public void method4525() {
		@Pc(2) Class295 local2 = this.aClass295_27;
		synchronized (this.aClass295_27) {
			this.aClass295_27.method6474();
		}
		local2 = this.aClass295_28;
		synchronized (this.aClass295_28) {
			this.aClass295_28.method6474();
		}
		@Pc(42) Class172 local42 = this.aClass172_1;
		synchronized (this.aClass172_1) {
			this.aClass172_1.method3997();
		}
	}

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(Z)V")
	public void method4526() {
		@Pc(6) Class295 local6 = this.aClass295_28;
		synchronized (this.aClass295_28) {
			this.aClass295_28.method6464();
		}
	}

	@OriginalMember(owner = "client!kka", name = "c", descriptor = "(I)V")
	public void method4528() {
		@Pc(6) Class172 local6 = this.aClass172_1;
		synchronized (this.aClass172_1) {
			this.aClass172_1.method4003();
		}
	}

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(IIIBLclient!ha;IILclient!vp;)Lclient!hh;")
	public Class6 method4529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class95 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class376 arg6) {
		this.aClass289_1.anInt7599 = arg3.anInt9840;
		this.aClass289_1.anInt7595 = arg4;
		this.aClass289_1.aBoolean535 = arg6 != null;
		this.aClass289_1.anInt7597 = arg2;
		this.aClass289_1.anInt7598 = arg5;
		this.aClass289_1.anInt7594 = arg0;
		this.aClass289_1.anInt7593 = arg1;
		return (Class6) this.aClass172_1.method4005(this.aClass289_1);
	}
}
