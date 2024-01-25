import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class57 {

	@OriginalMember(owner = "client!dj", name = "y", descriptor = "I")
	public int anInt1941;

	@OriginalMember(owner = "client!dj", name = "q", descriptor = "Lclient!fr;")
	private final Class91 aClass91_22 = new Class91(64);

	@OriginalMember(owner = "client!dj", name = "t", descriptor = "Lclient!fr;")
	public final Class91 aClass91_23 = new Class91(50);

	@OriginalMember(owner = "client!dj", name = "v", descriptor = "Lclient!sg;")
	public final Class229 aClass229_1 = new Class229(250);

	@OriginalMember(owner = "client!dj", name = "w", descriptor = "Lclient!lg;")
	private final Class154 aClass154_1 = new Class154();

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "Lclient!qs;")
	private final Class211 aClass211_24;

	@OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
	public final int anInt1932;

	@OriginalMember(owner = "client!dj", name = "x", descriptor = "Lclient!bn;")
	private final Class32 aClass32_2;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "Lclient!qs;")
	public final Class211 aClass211_23;

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "Z")
	private boolean aBoolean120;

	@OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
	public final int anInt1929;

	@OriginalMember(owner = "client!dj", name = "z", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray11;

	@OriginalMember(owner = "client!dj", name = "A", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray12;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lclient!wv;IZLclient!bn;Lclient!qs;Lclient!qs;)V")
	public Class57(@OriginalArg(0) Class272 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class32 arg3, @OriginalArg(4) Class211 arg4, @OriginalArg(5) Class211 arg5) {
		this.aClass211_24 = arg4;
		this.anInt1932 = arg1;
		this.aClass32_2 = arg3;
		this.aClass211_23 = arg5;
		this.aBoolean120 = arg2;
		if (this.aClass211_24 == null) {
			this.anInt1929 = 0;
		} else {
			@Pc(49) int local49 = this.aClass211_24.method4751() - 1;
			this.anInt1929 = this.aClass211_24.method4772(local49) + local49 * 256;
		}
		this.aStringArray11 = new String[] { null, null, Static184.aClass158_103.method3594(this.anInt1932), null, null };
		this.aStringArray12 = new String[] { null, null, null, null, Static125.aClass158_69.method3594(this.anInt1932) };
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
	public void method1405() {
		@Pc(2) Class229 local2 = this.aClass229_1;
		synchronized (this.aClass229_1) {
			this.aClass229_1.method5105();
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZIIILclient!za;ILclient!qp;BLclient!za;ILclient!la;Z)Lclient!o;")
	public Class137 method1406(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class106 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class210 arg6, @OriginalArg(8) Class106 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class20 arg9, @OriginalArg(11) boolean arg10) {
		@Pc(16) Class137 local16 = this.method1416(arg2, arg4, arg5, arg1, arg3, arg6, arg8);
		if (local16 != null) {
			return local16;
		}
		@Pc(27) Class168 local27 = this.method1414(arg1);
		if (arg8 > 1 && local27.anIntArray466 != null) {
			@Pc(35) int local35 = -1;
			for (@Pc(37) int local37 = 0; local37 < 10; local37++) {
				if (arg8 >= local27.anIntArray465[local37] && local27.anIntArray465[local37] != 0) {
					local35 = local27.anIntArray466[local37];
				}
			}
			if (local35 != -1) {
				local27 = this.method1414(local35);
			}
		}
		@Pc(84) int[] local84 = local27.method3733(arg10, arg9, arg3, arg4, arg8, arg6, arg5, arg7, arg2);
		if (local84 == null) {
			return null;
		}
		@Pc(104) Class137 local104;
		if (arg0) {
			local104 = arg7.method5969(local84, 36, 36, 32);
		} else {
			local104 = arg4.method5969(local84, 36, 36, 32);
		}
		if (!arg0) {
			@Pc(119) Class154 local119 = new Class154();
			local119.anInt4559 = arg4.anInt7745;
			local119.anInt4554 = arg8;
			local119.anInt4556 = arg5;
			local119.anInt4552 = arg3;
			local119.anInt4551 = arg1;
			local119.aBoolean290 = arg6 != null;
			local119.anInt4553 = arg2;
			this.aClass229_1.method5113(local119, local104);
		}
		return local104;
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V")
	public void method1409() {
		@Pc(2) Class91 local2 = this.aClass91_22;
		synchronized (this.aClass91_22) {
			this.aClass91_22.method1999();
		}
		local2 = this.aClass91_23;
		synchronized (this.aClass91_23) {
			this.aClass91_23.method1999();
		}
		@Pc(44) Class229 local44 = this.aClass229_1;
		synchronized (this.aClass229_1) {
			this.aClass229_1.method5105();
		}
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)V")
	public void method1410() {
		@Pc(6) Class91 local6 = this.aClass91_23;
		synchronized (this.aClass91_23) {
			this.aClass91_23.method1999();
		}
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)V")
	public void method1411() {
		@Pc(6) Class91 local6 = this.aClass91_22;
		synchronized (this.aClass91_22) {
			this.aClass91_22.method1993();
		}
		local6 = this.aClass91_23;
		synchronized (this.aClass91_23) {
			this.aClass91_23.method1993();
		}
		@Pc(36) Class229 local36 = this.aClass229_1;
		synchronized (this.aClass229_1) {
			this.aClass229_1.method5112();
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(BZ)V")
	public void method1412(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean120) {
			this.aBoolean120 = arg0;
			this.method1409();
		}
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(II)V")
	public void method1413(@OriginalArg(0) int arg0) {
		this.anInt1941 = arg0;
		@Pc(15) Class91 local15 = this.aClass91_23;
		synchronized (this.aClass91_23) {
			this.aClass91_23.method1999();
		}
	}

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "(II)Lclient!mh;")
	public Class168 method1414(@OriginalArg(0) int arg0) {
		@Pc(6) Class91 local6 = this.aClass91_22;
		@Pc(16) Class168 local16;
		synchronized (this.aClass91_22) {
			local16 = (Class168) this.aClass91_22.method1988((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class211 local29 = this.aClass211_24;
		@Pc(42) byte[] local42;
		synchronized (this.aClass211_24) {
			local42 = this.aClass211_24.method4758(Static57.method1076(arg0), Static257.method3814(arg0));
		}
		local16 = new Class168();
		local16.anInt4859 = arg0;
		local16.aClass57_2 = this;
		local16.aStringArray33 = new String[] { null, null, Static184.aClass158_103.method3594(this.anInt1932), null, null };
		local16.aStringArray32 = new String[] { null, null, null, null, Static125.aClass158_69.method3594(this.anInt1932) };
		if (local42 != null) {
			local16.method3723(new Class1_Sub3(local42));
		}
		local16.method3732();
		if (local16.anInt4878 != -1) {
			local16.method3734(this.method1414(local16.anInt4878), this.method1414(local16.anInt4874));
		}
		if (local16.lb != -1) {
			local16.method3720(this.method1414(local16.anInt4857), this.method1414(local16.lb));
		}
		if (!this.aBoolean120 && local16.aBoolean309) {
			local16.aString37 = Static83.aClass158_50.method3594(this.anInt1932);
			local16.aStringArray33 = this.aStringArray11;
			local16.aBoolean308 = false;
			local16.anInt4824 = 0;
			local16.anIntArray463 = null;
			local16.aStringArray32 = this.aStringArray12;
			if (local16.aClass38_20 != null) {
				@Pc(197) boolean local197 = false;
				for (@Pc(202) Class1 local202 = local16.aClass38_20.method767(); local202 != null; local202 = local16.aClass38_20.method773()) {
					@Pc(211) Class13 local211 = this.aClass32_2.method724((int) local202.aLong228);
					if (local211.aBoolean15) {
						local202.method6178();
					} else {
						local197 = true;
					}
				}
				if (!local197) {
					local16.aClass38_20 = null;
				}
			}
		}
		@Pc(235) Class91 local235 = this.aClass91_22;
		synchronized (this.aClass91_22) {
			this.aClass91_22.method1990(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "(II)V")
	public void method1415() {
		@Pc(2) Class91 local2 = this.aClass91_22;
		synchronized (this.aClass91_22) {
			this.aClass91_22.method1998(5);
		}
		local2 = this.aClass91_23;
		synchronized (this.aClass91_23) {
			this.aClass91_23.method1998(5);
		}
		@Pc(43) Class229 local43 = this.aClass229_1;
		synchronized (this.aClass229_1) {
			this.aClass229_1.method5114();
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILclient!za;IIIILclient!qp;I)Lclient!o;")
	public Class137 method1416(@OriginalArg(0) int arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class210 arg5, @OriginalArg(7) int arg6) {
		this.aClass154_1.anInt4556 = arg2;
		this.aClass154_1.anInt4551 = arg3;
		this.aClass154_1.anInt4552 = arg4;
		this.aClass154_1.anInt4554 = arg6;
		this.aClass154_1.aBoolean290 = arg5 != null;
		this.aClass154_1.anInt4559 = arg1.anInt7745;
		this.aClass154_1.anInt4553 = arg0;
		return (Class137) this.aClass229_1.method5111(this.aClass154_1);
	}
}
