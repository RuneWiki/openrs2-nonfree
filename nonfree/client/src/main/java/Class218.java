import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class218 {

	@OriginalMember(owner = "client!mf", name = "z", descriptor = "I")
	public int anInt6097;

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "Lclient!tb;")
	private final Class313 aClass313_34 = new Class313(64);

	@OriginalMember(owner = "client!mf", name = "t", descriptor = "Lclient!tb;")
	public final Class313 aClass313_35 = new Class313(50);

	@OriginalMember(owner = "client!mf", name = "v", descriptor = "Lclient!aaa;")
	public final Class3 aClass3_1 = new Class3(250);

	@OriginalMember(owner = "client!mf", name = "w", descriptor = "Lclient!pi;")
	private final Class256 aClass256_1 = new Class256();

	@OriginalMember(owner = "client!mf", name = "s", descriptor = "Lclient!pl;")
	private final Class259 aClass259_106;

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "Lclient!pl;")
	public final Class259 aClass259_105;

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
	public final int anInt6088;

	@OriginalMember(owner = "client!mf", name = "q", descriptor = "Z")
	private boolean aBoolean485;

	@OriginalMember(owner = "client!mf", name = "x", descriptor = "Lclient!dp;")
	private final Class82 aClass82_2;

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
	public final int anInt6086;

	@OriginalMember(owner = "client!mf", name = "A", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray104;

	@OriginalMember(owner = "client!mf", name = "y", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray103;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!rf;IZLclient!dp;Lclient!pl;Lclient!pl;)V")
	public Class218(@OriginalArg(0) Class284 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class82 arg3, @OriginalArg(4) Class259 arg4, @OriginalArg(5) Class259 arg5) {
		this.aClass259_106 = arg4;
		this.aClass259_105 = arg5;
		this.anInt6088 = arg1;
		this.aBoolean485 = arg2;
		this.aClass82_2 = arg3;
		if (this.aClass259_106 == null) {
			this.anInt6086 = 0;
		} else {
			@Pc(49) int local49 = this.aClass259_106.method5962() - 1;
			this.anInt6086 = this.aClass259_106.method5969(local49) + local49 * 256;
		}
		this.aStringArray104 = new String[] { null, null, Static290.aClass198_9.method4365(this.anInt6088), null, null };
		this.aStringArray103 = new String[] { null, null, null, null, Static290.aClass198_10.method4365(this.anInt6088) };
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZLclient!r;ILclient!kn;ZILclient!r;ILclient!la;II)Lclient!f;")
	public Class39 method5055(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class194 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class100 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class29 arg9, @OriginalArg(10) int arg10) {
		@Pc(16) Class39 local16 = this.method5060(arg8, arg6, arg4, arg7, arg10, arg3, arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(25) Class339 local25 = this.method5067(arg6);
		if (arg10 > 1 && local25.anIntArray649 != null) {
			@Pc(35) int local35 = -1;
			for (@Pc(37) int local37 = 0; local37 < 10; local37++) {
				if (local25.anIntArray647[local37] <= arg10 && local25.anIntArray647[local37] != 0) {
					local35 = local25.anIntArray649[local37];
				}
			}
			if (local35 != -1) {
				local25 = this.method5067(local35);
			}
		}
		@Pc(86) int[] local86 = local25.method7479(arg9, arg10, arg1, arg4, arg2, arg8, arg7, arg0, arg3);
		if (local86 == null) {
			return null;
		}
		@Pc(100) Class39 local100;
		if (arg5) {
			local100 = arg2.method6226(local86, 36, 36, 32);
		} else {
			local100 = arg7.method6226(local86, 36, 36, 32);
		}
		if (!arg5) {
			@Pc(121) Class256 local121 = new Class256();
			local121.anInt7097 = arg7.anInt7465;
			local121.anInt7095 = arg3;
			local121.aBoolean552 = arg4 != null;
			local121.anInt7098 = arg8;
			local121.anInt7100 = arg6;
			local121.anInt7099 = arg10;
			local121.anInt7094 = arg0;
			this.aClass3_1.method19(local100, local121);
		}
		return local100;
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
	public void method5058() {
		@Pc(10) Class3 local10 = this.aClass3_1;
		synchronized (this.aClass3_1) {
			this.aClass3_1.method25();
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)V")
	public void method5059() {
		@Pc(6) Class313 local6 = this.aClass313_34;
		synchronized (this.aClass313_34) {
			this.aClass313_34.method6982(5);
		}
		local6 = this.aClass313_35;
		synchronized (this.aClass313_35) {
			this.aClass313_35.method6982(5);
		}
		@Pc(38) Class3 local38 = this.aClass3_1;
		synchronized (this.aClass3_1) {
			this.aClass3_1.method23();
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IILclient!kn;Lclient!r;IIII)Lclient!f;")
	public Class39 method5060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class194 arg2, @OriginalArg(3) Class100 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		this.aClass256_1.anInt7098 = arg0;
		this.aClass256_1.anInt7100 = arg1;
		this.aClass256_1.anInt7097 = arg3.anInt7465;
		this.aClass256_1.aBoolean552 = arg2 != null;
		this.aClass256_1.anInt7099 = arg4;
		this.aClass256_1.anInt7095 = arg5;
		this.aClass256_1.anInt7094 = arg6;
		return (Class39) this.aClass3_1.method16(this.aClass256_1);
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)V")
	public void method5061() {
		@Pc(2) Class313 local2 = this.aClass313_34;
		synchronized (this.aClass313_34) {
			this.aClass313_34.method6977();
		}
		local2 = this.aClass313_35;
		synchronized (this.aClass313_35) {
			this.aClass313_35.method6977();
		}
		@Pc(50) Class3 local50 = this.aClass3_1;
		synchronized (this.aClass3_1) {
			this.aClass3_1.method25();
		}
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)V")
	public void method5062() {
		@Pc(6) Class313 local6 = this.aClass313_35;
		synchronized (this.aClass313_35) {
			this.aClass313_35.method6977();
		}
	}

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)V")
	public void method5063() {
		@Pc(6) Class313 local6 = this.aClass313_34;
		synchronized (this.aClass313_34) {
			this.aClass313_34.method6983();
		}
		local6 = this.aClass313_35;
		synchronized (this.aClass313_35) {
			this.aClass313_35.method6983();
		}
		@Pc(36) Class3 local36 = this.aClass3_1;
		synchronized (this.aClass3_1) {
			this.aClass3_1.method17();
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZI)V")
	public void method5064(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean485) {
			this.aBoolean485 = arg0;
			this.method5061();
		}
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(II)V")
	public void method5066(@OriginalArg(1) int arg0) {
		this.anInt6097 = arg0;
		@Pc(15) Class313 local15 = this.aClass313_35;
		synchronized (this.aClass313_35) {
			this.aClass313_35.method6977();
		}
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "(II)Lclient!uv;")
	public Class339 method5067(@OriginalArg(1) int arg0) {
		@Pc(13) Class313 local13 = this.aClass313_34;
		@Pc(23) Class339 local23;
		synchronized (this.aClass313_34) {
			local23 = (Class339) this.aClass313_34.method6989((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(36) Class259 local36 = this.aClass259_106;
		@Pc(51) byte[] local51;
		synchronized (this.aClass259_106) {
			local51 = this.aClass259_106.method5985(Static385.method5668(arg0), Static497.method6947(arg0));
		}
		local23 = new Class339();
		local23.anInt8963 = arg0;
		local23.aClass218_2 = this;
		local23.aStringArray169 = new String[] { null, null, Static290.aClass198_9.method4365(this.anInt6088), null, null };
		local23.aStringArray170 = new String[] { null, null, null, null, Static290.aClass198_10.method4365(this.anInt6088) };
		if (local51 != null) {
			local23.method7466(new Class2_Sub15(local51));
		}
		local23.method7482();
		if (local23.anInt8947 != -1) {
			local23.method7485(this.method5067(local23.anInt8947), this.method5067(local23.anInt8998));
		}
		if (local23.anInt8946 != -1) {
			local23.method7476(this.method5067(local23.anInt8967), this.method5067(local23.anInt8946));
		}
		if (!this.aBoolean485 && local23.aBoolean688) {
			local23.aString97 = Static290.aClass198_7.method4365(this.anInt6088);
			local23.aStringArray169 = this.aStringArray104;
			local23.aStringArray170 = this.aStringArray103;
			local23.anInt8996 = 0;
			local23.anIntArray648 = null;
			local23.aBoolean689 = false;
			if (local23.aClass162_41 != null) {
				@Pc(207) boolean local207 = false;
				for (@Pc(212) Class2 local212 = local23.aClass162_41.method3527(); local212 != null; local212 = local23.aClass162_41.method3523()) {
					@Pc(222) Class352 local222 = this.aClass82_2.method1498((int) local212.aLong268);
					if (local222.aBoolean714) {
						local212.method7966();
					} else {
						local207 = true;
					}
				}
				if (!local207) {
					local23.aClass162_41 = null;
				}
			}
		}
		@Pc(247) Class313 local247 = this.aClass313_34;
		synchronized (this.aClass313_34) {
			this.aClass313_34.method6980((long) arg0, local23);
			return local23;
		}
	}
}
