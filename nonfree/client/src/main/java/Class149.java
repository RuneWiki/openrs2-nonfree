import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class149 {

	@OriginalMember(owner = "client!lk", name = "D", descriptor = "I")
	public int anInt4329;

	@OriginalMember(owner = "client!lk", name = "t", descriptor = "Lclient!jp;")
	private final Class129 aClass129_36 = new Class129(64);

	@OriginalMember(owner = "client!lk", name = "x", descriptor = "Lclient!jp;")
	public final Class129 aClass129_37 = new Class129(50);

	@OriginalMember(owner = "client!lk", name = "y", descriptor = "Lclient!ko;")
	public final Class140 aClass140_1 = new Class140(250);

	@OriginalMember(owner = "client!lk", name = "z", descriptor = "Lclient!ee;")
	private final Class64 aClass64_1 = new Class64();

	@OriginalMember(owner = "client!lk", name = "l", descriptor = "Z")
	private boolean aBoolean361;

	@OriginalMember(owner = "client!lk", name = "A", descriptor = "Lclient!ct;")
	private final Class43 aClass43_2;

	@OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
	public final int anInt4319;

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "Lclient!pc;")
	public final Class188 aClass188_60;

	@OriginalMember(owner = "client!lk", name = "m", descriptor = "Lclient!pc;")
	private final Class188 aClass188_61;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
	public final int anInt4314;

	@OriginalMember(owner = "client!lk", name = "B", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray19;

	@OriginalMember(owner = "client!lk", name = "C", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray20;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lclient!rb;IZLclient!ct;Lclient!pc;Lclient!pc;)V")
	public Class149(@OriginalArg(0) Class209 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class43 arg3, @OriginalArg(4) Class188 arg4, @OriginalArg(5) Class188 arg5) {
		this.aBoolean361 = arg2;
		this.aClass43_2 = arg3;
		this.anInt4319 = arg1;
		this.aClass188_60 = arg5;
		this.aClass188_61 = arg4;
		if (this.aClass188_61 == null) {
			this.anInt4314 = 0;
		} else {
			@Pc(49) int local49 = this.aClass188_61.method4299() - 1;
			this.anInt4314 = local49 * 256 + this.aClass188_61.method4285(local49);
		}
		this.aStringArray19 = new String[] { null, null, Static238.aClass256_86.method5720(this.anInt4319), null, null };
		this.aStringArray20 = new String[] { null, null, null, null, Static185.aClass256_64.method5720(this.anInt4319) };
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
	public void method3482() {
		@Pc(14) Class140 local14 = this.aClass140_1;
		synchronized (this.aClass140_1) {
			this.aClass140_1.method3273();
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)Lclient!bs;")
	public Class30 method3483(@OriginalArg(1) int arg0) {
		@Pc(13) Class129 local13 = this.aClass129_36;
		@Pc(23) Class30 local23;
		synchronized (this.aClass129_36) {
			local23 = (Class30) this.aClass129_36.method3023((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(44) byte[] local44 = this.aClass188_61.method4283(Static13.method219(arg0), Static134.method1924(arg0));
		local23 = new Class30();
		local23.aClass149_1 = this;
		local23.anInt1028 = arg0;
		local23.aStringArray2 = new String[] { null, null, Static238.aClass256_86.method5720(this.anInt4319), null, null };
		local23.aStringArray3 = new String[] { null, null, null, null, Static185.aClass256_64.method5720(this.anInt4319) };
		if (local44 != null) {
			local23.method741(new Class2_Sub20(local44));
		}
		local23.method733();
		if (local23.anInt1001 != -1) {
			local23.method739(this.method3483(local23.anInt1050), this.method3483(local23.anInt1001));
		}
		if (local23.anInt1021 != -1) {
			local23.method743(this.method3483(local23.anInt1021), this.method3483(local23.anInt1059));
		}
		if (!this.aBoolean361 && local23.aBoolean91) {
			local23.aString5 = Static264.aClass256_94.method5720(this.anInt4319);
			local23.aStringArray3 = this.aStringArray20;
			local23.anInt1016 = 0;
			local23.aStringArray2 = this.aStringArray19;
			local23.aBoolean90 = false;
			local23.anIntArray47 = null;
			if (local23.aClass240_3 != null) {
				@Pc(192) boolean local192 = false;
				for (@Pc(197) Class2 local197 = local23.aClass240_3.method5438(); local197 != null; local197 = local23.aClass240_3.method5436()) {
					@Pc(207) Class47 local207 = this.aClass43_2.method1210((int) local197.aLong227);
					if (local207.aBoolean154) {
						local197.method6072();
					} else {
						local192 = true;
					}
				}
				if (!local192) {
					local23.aClass240_3 = null;
				}
			}
		}
		@Pc(232) Class129 local232 = this.aClass129_36;
		synchronized (this.aClass129_36) {
			this.aClass129_36.method3029(local23, (long) arg0);
			return local23;
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IB)V")
	public void method3484(@OriginalArg(0) int arg0) {
		this.anInt4329 = arg0;
		@Pc(9) Class129 local9 = this.aClass129_37;
		synchronized (this.aClass129_37) {
			this.aClass129_37.method3025();
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!qa;IIBIIILclient!ag;)Lclient!f;")
	public Class76 method3485(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class7 arg6) {
		this.aClass64_1.anInt2019 = arg0.anInt2873;
		this.aClass64_1.anInt2015 = arg3;
		this.aClass64_1.anInt2021 = arg1;
		this.aClass64_1.anInt2018 = arg5;
		this.aClass64_1.anInt2014 = arg4;
		this.aClass64_1.anInt2017 = arg2;
		this.aClass64_1.aBoolean177 = arg6 != null;
		return (Class76) this.aClass140_1.method3272(this.aClass64_1);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V")
	public void method3486() {
		@Pc(2) Class129 local2 = this.aClass129_37;
		synchronized (this.aClass129_37) {
			this.aClass129_37.method3025();
		}
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(II)V")
	public void method3488() {
		@Pc(6) Class129 local6 = this.aClass129_36;
		synchronized (this.aClass129_36) {
			this.aClass129_36.method3028(5);
		}
		local6 = this.aClass129_37;
		synchronized (this.aClass129_37) {
			this.aClass129_37.method3028(5);
		}
		@Pc(40) Class140 local40 = this.aClass140_1;
		synchronized (this.aClass140_1) {
			this.aClass140_1.method3265();
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(BZ)V")
	public void method3491(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean361 != arg0) {
			this.aBoolean361 = arg0;
			this.method3494();
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZLclient!qa;IIZILclient!ag;Lclient!qa;ILclient!oa;ZI)Lclient!f;")
	public Class76 method3492(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class7 arg6, @OriginalArg(7) Class26 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class56 arg9, @OriginalArg(11) int arg10) {
		@Pc(16) Class76 local16 = this.method3485(arg1, arg8, arg2, arg3, arg10, arg5, arg6);
		if (local16 != null) {
			return local16;
		}
		@Pc(31) Class30 local31 = this.method3483(arg5);
		if (arg8 > 1 && local31.anIntArray48 != null) {
			@Pc(41) int local41 = -1;
			for (@Pc(43) int local43 = 0; local43 < 10; local43++) {
				if (arg8 >= local31.anIntArray46[local43] && local31.anIntArray46[local43] != 0) {
					local41 = local31.anIntArray48[local43];
				}
			}
			if (local41 != -1) {
				local31 = this.method3483(local41);
			}
		}
		@Pc(90) int[] local90 = local31.method746(arg10, arg8, arg2, arg3, arg1, arg0, arg9, arg7, arg6);
		if (local90 == null) {
			return null;
		}
		@Pc(104) Class76 local104;
		if (arg4) {
			local104 = arg7.method2257(local90, 36, 36, 32);
		} else {
			local104 = arg1.method2257(local90, 36, 36, 32);
		}
		if (!arg4) {
			@Pc(120) Class64 local120 = new Class64();
			local120.anInt2021 = arg8;
			local120.anInt2018 = arg5;
			local120.anInt2014 = arg10;
			local120.aBoolean177 = arg6 != null;
			local120.anInt2015 = arg3;
			local120.anInt2017 = arg2;
			local120.anInt2019 = arg1.anInt2873;
			this.aClass140_1.method3270(local120, local104);
		}
		return local104;
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)V")
	public void method3493() {
		@Pc(6) Class129 local6 = this.aClass129_36;
		synchronized (this.aClass129_36) {
			this.aClass129_36.method3026();
		}
		local6 = this.aClass129_37;
		synchronized (this.aClass129_37) {
			this.aClass129_37.method3026();
		}
		@Pc(50) Class140 local50 = this.aClass140_1;
		synchronized (this.aClass140_1) {
			this.aClass140_1.method3268();
		}
	}

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)V")
	public void method3494() {
		@Pc(2) Class129 local2 = this.aClass129_36;
		synchronized (this.aClass129_36) {
			this.aClass129_36.method3025();
		}
		local2 = this.aClass129_37;
		synchronized (this.aClass129_37) {
			this.aClass129_37.method3025();
		}
		@Pc(36) Class140 local36 = this.aClass140_1;
		synchronized (this.aClass140_1) {
			this.aClass140_1.method3273();
		}
	}
}
