import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class19 {

	@OriginalMember(owner = "client!bd", name = "D", descriptor = "I")
	public int anInt588;

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "Lclient!kh;")
	private final Class134 aClass134_2 = new Class134(64);

	@OriginalMember(owner = "client!bd", name = "r", descriptor = "Lclient!kh;")
	public final Class134 aClass134_3 = new Class134(50);

	@OriginalMember(owner = "client!bd", name = "z", descriptor = "Lclient!jj;")
	public final Class122 aClass122_1 = new Class122(250);

	@OriginalMember(owner = "client!bd", name = "A", descriptor = "Lclient!pv;")
	private final Class198 aClass198_1 = new Class198();

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "Lclient!ul;")
	private final Class246 aClass246_21;

	@OriginalMember(owner = "client!bd", name = "k", descriptor = "Lclient!ul;")
	public final Class246 aClass246_22;

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "Z")
	private boolean aBoolean25;

	@OriginalMember(owner = "client!bd", name = "B", descriptor = "Lclient!cc;")
	private final Class35 aClass35_1;

	@OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
	public final int anInt581;

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
	public final int anInt579;

	@OriginalMember(owner = "client!bd", name = "E", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray8;

	@OriginalMember(owner = "client!bd", name = "C", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray7;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!ee;IZLclient!cc;Lclient!ul;Lclient!ul;)V")
	public Class19(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class35 arg3, @OriginalArg(4) Class246 arg4, @OriginalArg(5) Class246 arg5) {
		this.aClass246_21 = arg4;
		this.aClass246_22 = arg5;
		this.aBoolean25 = arg2;
		this.aClass35_1 = arg3;
		this.anInt581 = arg1;
		if (this.aClass246_21 == null) {
			this.anInt579 = 0;
		} else {
			@Pc(54) int local54 = this.aClass246_21.method5502() - 1;
			this.anInt579 = local54 * 256 + this.aClass246_21.method5492(local54);
		}
		this.aStringArray8 = new String[] { null, null, Static175.aClass7_80.method331(this.anInt581), null, null };
		this.aStringArray7 = new String[] { null, null, null, null, Static363.aClass7_88.method331(this.anInt581) };
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
	public void method552() {
		@Pc(6) Class122 local6 = this.aClass122_1;
		synchronized (this.aClass122_1) {
			this.aClass122_1.method2910();
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)V")
	public void method553() {
		@Pc(2) Class134 local2 = this.aClass134_2;
		synchronized (this.aClass134_2) {
			this.aClass134_2.method3270(5);
		}
		local2 = this.aClass134_3;
		synchronized (this.aClass134_3) {
			this.aClass134_3.method3270(5);
		}
		@Pc(44) Class122 local44 = this.aClass122_1;
		synchronized (this.aClass122_1) {
			this.aClass122_1.method2906();
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BZ)V")
	public void method554(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean25) {
			this.aBoolean25 = arg0;
			this.method563();
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
	public void method555() {
		@Pc(6) Class134 local6 = this.aClass134_3;
		synchronized (this.aClass134_3) {
			this.aClass134_3.method3272();
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!ya;IILclient!ya;Lclient!ed;IIZZLclient!la;II)Lclient!l;")
	public Class143 method556(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class39 arg3, @OriginalArg(4) Class60 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) Class71 arg9, @OriginalArg(11) int arg10) {
		@Pc(14) Class143 local14 = this.method561(arg1, arg4, arg2, arg6, arg10, arg5, arg3);
		if (local14 != null) {
			return local14;
		}
		@Pc(23) Class152 local23 = this.method560(arg5);
		if (arg1 > 1 && local23.anIntArray342 != null) {
			@Pc(33) int local33 = -1;
			for (@Pc(35) int local35 = 0; local35 < 10; local35++) {
				if (local23.anIntArray341[local35] <= arg1 && local23.anIntArray341[local35] != 0) {
					local33 = local23.anIntArray342[local35];
				}
			}
			if (local33 != -1) {
				local23 = this.method560(local33);
			}
		}
		@Pc(87) int[] local87 = local23.method3501(arg0, arg9, arg2, arg6, arg4, arg3, arg8, arg10, arg1);
		if (local87 == null) {
			return null;
		}
		@Pc(106) Class143 local106;
		if (arg7) {
			local106 = arg0.method4554(local87, 36, 36, 32);
		} else {
			local106 = arg3.method4554(local87, 36, 36, 32);
		}
		if (!arg7) {
			@Pc(121) Class198 local121 = new Class198();
			local121.anInt5446 = arg3.anInt5452;
			local121.anInt5441 = arg2;
			local121.aBoolean388 = arg4 != null;
			local121.anInt5442 = arg10;
			local121.anInt5440 = arg1;
			local121.anInt5436 = arg5;
			local121.anInt5437 = arg6;
			this.aClass122_1.method2909(local121, local106);
		}
		return local106;
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
	public void method557() {
		@Pc(2) Class134 local2 = this.aClass134_2;
		synchronized (this.aClass134_2) {
			this.aClass134_2.method3267();
		}
		local2 = this.aClass134_3;
		synchronized (this.aClass134_3) {
			this.aClass134_3.method3267();
		}
		@Pc(36) Class122 local36 = this.aClass122_1;
		synchronized (this.aClass122_1) {
			this.aClass122_1.method2903();
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BI)Lclient!lo;")
	public Class152 method560(@OriginalArg(1) int arg0) {
		@Pc(6) Class134 local6 = this.aClass134_2;
		@Pc(16) Class152 local16;
		synchronized (this.aClass134_2) {
			local16 = (Class152) this.aClass134_2.method3266((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class246 local29 = this.aClass246_21;
		@Pc(44) byte[] local44;
		synchronized (this.aClass246_21) {
			local44 = this.aClass246_21.method5477(Static383.method5181(arg0), Static123.method2218(arg0));
		}
		local16 = new Class152();
		local16.aClass19_2 = this;
		local16.anInt4159 = arg0;
		local16.aStringArray27 = new String[] { null, null, Static175.aClass7_80.method331(this.anInt581), null, null };
		local16.aStringArray28 = new String[] { null, null, null, null, Static363.aClass7_88.method331(this.anInt581) };
		if (local44 != null) {
			local16.method3498(new Class1_Sub5(local44));
		}
		local16.method3495();
		if (local16.anInt4202 != -1) {
			local16.method3485(this.method560(local16.anInt4202), this.method560(local16.anInt4148));
		}
		if (local16.anInt4188 != -1) {
			local16.method3491(this.method560(local16.anInt4172), this.method560(local16.anInt4188));
		}
		if (!this.aBoolean25 && local16.aBoolean294) {
			local16.aString34 = Static406.aClass7_146.method331(this.anInt581);
			local16.aBoolean296 = false;
			local16.anInt4204 = 0;
			local16.aStringArray27 = this.aStringArray8;
			local16.anIntArray340 = null;
			local16.aStringArray28 = this.aStringArray7;
			if (local16.aClass96_27 != null) {
				@Pc(216) boolean local216 = false;
				for (@Pc(221) Class1 local221 = local16.aClass96_27.method2342(); local221 != null; local221 = local16.aClass96_27.method2339()) {
					@Pc(230) Class184 local230 = this.aClass35_1.method867((int) local221.aLong222);
					if (local230.aBoolean342) {
						local221.method6020();
					} else {
						local216 = true;
					}
				}
				if (!local216) {
					local16.aClass96_27 = null;
				}
			}
		}
		@Pc(254) Class134 local254 = this.aClass134_2;
		synchronized (this.aClass134_2) {
			this.aClass134_2.method3263((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!ed;IIIIILclient!ya;)Lclient!l;")
	public Class143 method561(@OriginalArg(0) int arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class39 arg6) {
		this.aClass198_1.aBoolean388 = arg1 != null;
		this.aClass198_1.anInt5446 = arg6.anInt5452;
		this.aClass198_1.anInt5440 = arg0;
		this.aClass198_1.anInt5437 = arg3;
		this.aClass198_1.anInt5441 = arg2;
		this.aClass198_1.anInt5436 = arg5;
		this.aClass198_1.anInt5442 = arg4;
		return (Class143) this.aClass122_1.method2905(this.aClass198_1);
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(II)V")
	public void method562(@OriginalArg(0) int arg0) {
		this.anInt588 = arg0;
		@Pc(13) Class134 local13 = this.aClass134_3;
		synchronized (this.aClass134_3) {
			this.aClass134_3.method3272();
		}
	}

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)V")
	public void method563() {
		@Pc(12) Class134 local12 = this.aClass134_2;
		synchronized (this.aClass134_2) {
			this.aClass134_2.method3272();
		}
		local12 = this.aClass134_3;
		synchronized (this.aClass134_3) {
			this.aClass134_3.method3272();
		}
		@Pc(42) Class122 local42 = this.aClass122_1;
		synchronized (this.aClass122_1) {
			this.aClass122_1.method2910();
		}
	}
}
