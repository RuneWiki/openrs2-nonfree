import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class170 {

	@OriginalMember(owner = "client!mo", name = "D", descriptor = "I")
	public int anInt4272;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "Lclient!rp;")
	private final Class220 aClass220_36 = new Class220(64);

	@OriginalMember(owner = "client!mo", name = "x", descriptor = "Lclient!rp;")
	public final Class220 aClass220_37 = new Class220(50);

	@OriginalMember(owner = "client!mo", name = "y", descriptor = "Lclient!df;")
	public final Class49 aClass49_1 = new Class49(250);

	@OriginalMember(owner = "client!mo", name = "z", descriptor = "Lclient!rq;")
	private final Class221 aClass221_1 = new Class221();

	@OriginalMember(owner = "client!mo", name = "l", descriptor = "Lclient!lt;")
	public final Class158 aClass158_60;

	@OriginalMember(owner = "client!mo", name = "m", descriptor = "Z")
	private boolean aBoolean276;

	@OriginalMember(owner = "client!mo", name = "B", descriptor = "Lclient!wb;")
	private final Class258 aClass258_1;

	@OriginalMember(owner = "client!mo", name = "u", descriptor = "I")
	public final int anInt4270;

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "Lclient!lt;")
	private final Class158 aClass158_59;

	@OriginalMember(owner = "client!mo", name = "k", descriptor = "I")
	public final int anInt4263;

	@OriginalMember(owner = "client!mo", name = "C", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray30;

	@OriginalMember(owner = "client!mo", name = "A", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray29;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lclient!cm;IZLclient!wb;Lclient!lt;Lclient!lt;)V")
	public Class170(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class258 arg3, @OriginalArg(4) Class158 arg4, @OriginalArg(5) Class158 arg5) {
		this.aClass158_60 = arg5;
		this.aBoolean276 = arg2;
		this.aClass258_1 = arg3;
		this.anInt4270 = arg1;
		this.aClass158_59 = arg4;
		if (this.aClass158_59 == null) {
			this.anInt4263 = 0;
		} else {
			@Pc(49) int local49 = this.aClass158_59.method3695() - 1;
			this.anInt4263 = local49 * 256 + this.aClass158_59.method3683(local49);
		}
		this.aStringArray30 = new String[] { null, null, Static350.aClass231_98.method5138(this.anInt4270), null, null };
		this.aStringArray29 = new String[] { null, null, null, null, Static137.aClass231_39.method5138(this.anInt4270) };
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)V")
	public void method3859() {
		@Pc(2) Class220 local2 = this.aClass220_36;
		synchronized (this.aClass220_36) {
			this.aClass220_36.method4998(5);
		}
		local2 = this.aClass220_37;
		synchronized (this.aClass220_37) {
			this.aClass220_37.method4998(5);
		}
		@Pc(46) Class49 local46 = this.aClass49_1;
		synchronized (this.aClass49_1) {
			this.aClass49_1.method1381();
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V")
	public void method3860() {
		@Pc(2) Class220 local2 = this.aClass220_37;
		synchronized (this.aClass220_37) {
			this.aClass220_37.method4999();
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)V")
	public void method3861() {
		@Pc(2) Class220 local2 = this.aClass220_36;
		synchronized (this.aClass220_36) {
			this.aClass220_36.method4987();
		}
		local2 = this.aClass220_37;
		synchronized (this.aClass220_37) {
			this.aClass220_37.method4987();
		}
		@Pc(43) Class49 local43 = this.aClass49_1;
		synchronized (this.aClass49_1) {
			this.aClass49_1.method1387();
		}
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(I)V")
	public void method3862() {
		@Pc(2) Class220 local2 = this.aClass220_36;
		synchronized (this.aClass220_36) {
			this.aClass220_36.method4999();
		}
		local2 = this.aClass220_37;
		synchronized (this.aClass220_37) {
			this.aClass220_37.method4999();
		}
		@Pc(42) Class49 local42 = this.aClass49_1;
		synchronized (this.aClass49_1) {
			this.aClass49_1.method1376();
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIBLclient!qq;IILclient!eu;I)Lclient!ig;")
	public Class12 method3863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class28 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class73 arg5, @OriginalArg(7) int arg6) {
		this.aClass221_1.anInt5975 = arg6;
		this.aClass221_1.anInt5977 = arg1;
		this.aClass221_1.anInt5983 = arg2.anInt3899;
		this.aClass221_1.anInt5982 = arg3;
		this.aClass221_1.anInt5981 = arg4;
		this.aClass221_1.anInt5976 = arg0;
		this.aClass221_1.aBoolean391 = arg5 != null;
		return (Class12) this.aClass49_1.method1378(this.aClass221_1);
	}

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "(I)V")
	public void method3864() {
		@Pc(6) Class49 local6 = this.aClass49_1;
		synchronized (this.aClass49_1) {
			this.aClass49_1.method1376();
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(BI)Lclient!bq;")
	public Class32 method3865(@OriginalArg(1) int arg0) {
		@Pc(8) Class220 local8 = this.aClass220_36;
		@Pc(18) Class32 local18;
		synchronized (this.aClass220_36) {
			local18 = (Class32) this.aClass220_36.method4990((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(39) byte[] local39 = this.aClass158_59.method3672(Static94.method1635(arg0), Static423.method5707(arg0));
		local18 = new Class32();
		local18.anInt866 = arg0;
		local18.aClass170_1 = this;
		local18.aStringArray2 = new String[] { null, null, Static350.aClass231_98.method5138(this.anInt4270), null, null };
		local18.aStringArray3 = new String[] { null, null, null, null, Static137.aClass231_39.method5138(this.anInt4270) };
		if (local39 != null) {
			local18.method766(new Class6_Sub15(local39));
		}
		local18.method774();
		if (local18.anInt836 != -1) {
			local18.method768(this.method3865(local18.anInt836), this.method3865(local18.anInt838));
		}
		if (local18.anInt830 != -1) {
			local18.method776(this.method3865(local18.anInt873), this.method3865(local18.anInt830));
		}
		if (!this.aBoolean276 && local18.aBoolean72) {
			local18.aString8 = Static317.aClass231_101.method5138(this.anInt4270);
			local18.aStringArray3 = this.aStringArray29;
			local18.aStringArray2 = this.aStringArray30;
			local18.aBoolean71 = false;
			local18.anInt821 = 0;
			local18.anIntArray48 = null;
			if (local18.aClass137_7 != null) {
				@Pc(192) boolean local192 = false;
				for (@Pc(197) Class6 local197 = local18.aClass137_7.method3181(); local197 != null; local197 = local18.aClass137_7.method3182()) {
					@Pc(207) Class255 local207 = this.aClass258_1.method5882((int) local197.aLong217);
					if (local207.aBoolean487) {
						local197.method5977();
					} else {
						local192 = true;
					}
				}
				if (!local192) {
					local18.aClass137_7 = null;
				}
			}
		}
		@Pc(232) Class220 local232 = this.aClass220_36;
		synchronized (this.aClass220_36) {
			this.aClass220_36.method4996(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(II)V")
	public void method3866(@OriginalArg(1) int arg0) {
		this.anInt4272 = arg0;
		@Pc(12) Class220 local12 = this.aClass220_37;
		synchronized (this.aClass220_37) {
			this.aClass220_37.method4999();
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZB)V")
	public void method3867(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean276) {
			this.aBoolean276 = arg0;
			this.method3862();
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!eu;IIILclient!wn;IZBIZLclient!qq;Lclient!qq;)Lclient!ig;")
	public Class12 method3869(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class92 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) Class28 arg9, @OriginalArg(11) Class28 arg10) {
		@Pc(21) Class12 local21 = this.method3863(arg7, arg3, arg9, arg5, arg2, arg0, arg1);
		if (local21 != null) {
			return local21;
		}
		@Pc(30) Class32 local30 = this.method3865(arg2);
		if (arg5 > 1 && local30.anIntArray49 != null) {
			@Pc(38) int local38 = -1;
			for (@Pc(40) int local40 = 0; local40 < 10; local40++) {
				if (arg5 >= local30.anIntArray47[local40] && local30.anIntArray47[local40] != 0) {
					local38 = local30.anIntArray49[local40];
				}
			}
			if (local38 != -1) {
				local30 = this.method3865(local38);
			}
		}
		@Pc(85) int[] local85 = local30.method765(arg10, arg9, arg4, arg8, arg5, arg1, arg7, arg0, arg3);
		if (local85 == null) {
			return null;
		}
		@Pc(99) Class12 local99;
		if (arg6) {
			local99 = arg10.method3512(local85, 36, 36, 32);
		} else {
			local99 = arg9.method3512(local85, 36, 36, 32);
		}
		if (!arg6) {
			@Pc(115) Class221 local115 = new Class221();
			local115.aBoolean391 = arg0 != null;
			local115.anInt5976 = arg7;
			local115.anInt5982 = arg5;
			local115.anInt5983 = arg9.anInt3899;
			local115.anInt5981 = arg2;
			local115.anInt5975 = arg1;
			local115.anInt5977 = arg3;
			this.aClass49_1.method1384(local115, local99);
		}
		return local99;
	}
}
