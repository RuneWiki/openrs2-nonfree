import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class220 {

	@OriginalMember(owner = "client!wj", name = "A", descriptor = "I")
	public int anInt6934;

	@OriginalMember(owner = "client!wj", name = "q", descriptor = "Lclient!bt;")
	private final Class21 aClass21_177 = new Class21(64);

	@OriginalMember(owner = "client!wj", name = "v", descriptor = "Lclient!bt;")
	public final Class21 aClass21_178 = new Class21(50);

	@OriginalMember(owner = "client!wj", name = "w", descriptor = "Lclient!p;")
	public final Class160 aClass160_1 = new Class160(250);

	@OriginalMember(owner = "client!wj", name = "x", descriptor = "Lclient!pq;")
	private final Class165 aClass165_1 = new Class165();

	@OriginalMember(owner = "client!wj", name = "l", descriptor = "I")
	public final int anInt6930;

	@OriginalMember(owner = "client!wj", name = "m", descriptor = "Z")
	private boolean aBoolean507;

	@OriginalMember(owner = "client!wj", name = "n", descriptor = "Lclient!ct;")
	private final Class30 aClass30_106;

	@OriginalMember(owner = "client!wj", name = "j", descriptor = "Lclient!ct;")
	public final Class30 aClass30_105;

	@OriginalMember(owner = "client!wj", name = "t", descriptor = "I")
	public int anInt6933;

	@OriginalMember(owner = "client!wj", name = "z", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray45;

	@OriginalMember(owner = "client!wj", name = "y", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray44;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lclient!hj;IZLclient!ct;Lclient!ct;)V")
	public Class220(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class30 arg3, @OriginalArg(4) Class30 arg4) {
		this.anInt6930 = arg1;
		this.aBoolean507 = arg2;
		this.aClass30_106 = arg3;
		this.aClass30_105 = arg4;
		if (this.aClass30_106 != null) {
			@Pc(46) int local46 = this.aClass30_106.method1158() - 1;
			this.anInt6933 = this.aClass30_106.method1180(local46) + local46 * 256;
		}
		this.aStringArray45 = new String[] { null, null, Static165.aClass106_119.method2927(this.anInt6930), null, null };
		this.aStringArray44 = new String[] { null, null, null, null, Static69.aClass106_55.method2927(this.anInt6930) };
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!fp;IIZLclient!df;Lclient!tq;ILclient!fp;ZIIZ)Lclient!ae;")
	public Class4 method5971(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class33 arg4, @OriginalArg(5) Class200 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class63 arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		@Pc(16) Class4 local16 = this.method5978(arg6, arg0, arg10, arg5, arg9, arg2, arg1);
		if (local16 != null) {
			return local16;
		}
		@Pc(25) Class22 local25 = this.method5972(arg9);
		if (arg6 > 1 && local25.anIntArray56 != null) {
			@Pc(33) int local33 = -1;
			for (@Pc(35) int local35 = 0; local35 < 10; local35++) {
				if (local25.anIntArray57[local35] <= arg6 && local25.anIntArray57[local35] != 0) {
					local33 = local25.anIntArray56[local35];
				}
			}
			if (local33 != -1) {
				local25 = this.method5972(local33);
			}
		}
		@Pc(81) int[] local81 = local25.method889(arg6, arg1, arg7, arg5, arg10, arg4, arg2, arg3, arg0);
		if (local81 == null) {
			return null;
		}
		@Pc(95) Class4 local95;
		if (arg8) {
			local95 = arg7.method4587(local81, 36, 36, 32);
		} else {
			local95 = arg0.method4587(local81, 36, 36, 32);
		}
		if (!arg8) {
			@Pc(111) Class165 local111 = new Class165();
			local111.anInt5082 = arg0.anInt5007;
			local111.aBoolean379 = arg5 != null;
			local111.anInt5084 = arg9;
			local111.anInt5080 = arg6;
			local111.anInt5077 = arg1;
			local111.anInt5074 = arg2;
			local111.anInt5083 = arg10;
			this.aClass160_1.method4348(local95, local111);
		}
		return local95;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(BI)Lclient!ca;")
	public Class22 method5972(@OriginalArg(1) int arg0) {
		@Pc(8) Class21 local8 = this.aClass21_177;
		@Pc(18) Class22 local18;
		synchronized (this.aClass21_177) {
			local18 = (Class22) this.aClass21_177.method854((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(39) byte[] local39 = this.aClass30_106.method1161(Static349.method5769(arg0), Static336.method5657(arg0));
		local18 = new Class22();
		local18.aClass220_1 = this;
		local18.anInt904 = arg0;
		local18.aStringArray3 = new String[] { null, null, Static165.aClass106_119.method2927(this.anInt6930), null, null };
		local18.aStringArray4 = new String[] { null, null, null, null, Static69.aClass106_55.method2927(this.anInt6930) };
		if (local39 != null) {
			local18.method886(new Class1_Sub7(local39));
		}
		local18.method894();
		if (local18.anInt891 != -1) {
			local18.method896(this.method5972(local18.anInt891), this.method5972(local18.anInt902));
		}
		if (local18.anInt863 != -1) {
			local18.method884(this.method5972(local18.anInt863), this.method5972(local18.anInt885));
		}
		if (!this.aBoolean507 && local18.aBoolean60) {
			local18.aString2 = Static154.aClass106_112.method2927(this.anInt6930);
			local18.anInt890 = 0;
			local18.aBoolean59 = false;
			local18.aStringArray3 = this.aStringArray45;
			local18.anIntArray58 = null;
			local18.aStringArray4 = this.aStringArray44;
			if (local18.aClass38_3 != null) {
				@Pc(192) boolean local192 = false;
				for (@Pc(197) Class1 local197 = local18.aClass38_3.method1474(); local197 != null; local197 = local18.aClass38_3.method1470()) {
					@Pc(205) Class1_Sub4_Sub6 local205 = Static296.method5175((int) local197.aLong217);
					if (local205.aBoolean103) {
						local197.method6045();
					} else {
						local192 = true;
					}
				}
				if (!local192) {
					local18.aClass38_3 = null;
				}
			}
		}
		@Pc(230) Class21 local230 = this.aClass21_177;
		synchronized (this.aClass21_177) {
			this.aClass21_177.method843(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)V")
	public void method5973() {
		@Pc(2) Class21 local2 = this.aClass21_177;
		synchronized (this.aClass21_177) {
			this.aClass21_177.method844(5);
		}
		local2 = this.aClass21_178;
		synchronized (this.aClass21_178) {
			this.aClass21_178.method844(5);
		}
		@Pc(43) Class160 local43 = this.aClass160_1;
		synchronized (this.aClass160_1) {
			this.aClass160_1.method4351();
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZB)V")
	public void method5975(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean507) {
			this.aBoolean507 = arg0;
			this.method5977();
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
	public void method5976() {
		@Pc(11) Class160 local11 = this.aClass160_1;
		synchronized (this.aClass160_1) {
			this.aClass160_1.method4349();
		}
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V")
	public void method5977() {
		@Pc(8) Class21 local8 = this.aClass21_177;
		synchronized (this.aClass21_177) {
			this.aClass21_177.method857();
		}
		local8 = this.aClass21_178;
		synchronized (this.aClass21_178) {
			this.aClass21_178.method857();
		}
		@Pc(44) Class160 local44 = this.aClass160_1;
		synchronized (this.aClass160_1) {
			this.aClass160_1.method4349();
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IILclient!fp;ILclient!tq;III)Lclient!ae;")
	public Class4 method5978(@OriginalArg(1) int arg0, @OriginalArg(2) Class63 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class200 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aClass165_1.anInt5080 = arg0;
		this.aClass165_1.anInt5077 = arg6;
		this.aClass165_1.anInt5074 = arg5;
		this.aClass165_1.anInt5084 = arg4;
		this.aClass165_1.anInt5083 = arg2;
		this.aClass165_1.aBoolean379 = arg3 != null;
		this.aClass165_1.anInt5082 = arg1.anInt5007;
		return (Class4) this.aClass160_1.method4361(this.aClass165_1);
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)V")
	public void method5979() {
		@Pc(2) Class21 local2 = this.aClass21_178;
		synchronized (this.aClass21_178) {
			this.aClass21_178.method857();
		}
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(BI)V")
	public void method5980(@OriginalArg(1) int arg0) {
		this.anInt6934 = arg0;
		@Pc(9) Class21 local9 = this.aClass21_178;
		synchronized (this.aClass21_178) {
			this.aClass21_178.method857();
		}
	}

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "(B)V")
	public void method5982() {
		@Pc(2) Class21 local2 = this.aClass21_177;
		synchronized (this.aClass21_177) {
			this.aClass21_177.method851();
		}
		local2 = this.aClass21_178;
		synchronized (this.aClass21_178) {
			this.aClass21_178.method851();
		}
		@Pc(44) Class160 local44 = this.aClass160_1;
		synchronized (this.aClass160_1) {
			this.aClass160_1.method4353();
		}
	}
}
