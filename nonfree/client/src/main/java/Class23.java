import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class23 {

	@OriginalMember(owner = "client!bb", name = "F", descriptor = "I")
	public int anInt789;

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "Lclient!me;")
	private final Class211 aClass211_11 = new Class211(64);

	@OriginalMember(owner = "client!bb", name = "z", descriptor = "Lclient!me;")
	public final Class211 aClass211_12 = new Class211(50);

	@OriginalMember(owner = "client!bb", name = "A", descriptor = "Lclient!gea;")
	public final Class117 aClass117_1 = new Class117(250);

	@OriginalMember(owner = "client!bb", name = "B", descriptor = "Lclient!efa;")
	private final Class81 aClass81_1 = new Class81();

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "Z")
	private boolean aBoolean61;

	@OriginalMember(owner = "client!bb", name = "y", descriptor = "Lclient!pe;")
	private final Class254 aClass254_13;

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
	public final int anInt778;

	@OriginalMember(owner = "client!bb", name = "E", descriptor = "Lclient!at;")
	private final Class17 aClass17_1;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "Lclient!pe;")
	public final Class254 aClass254_11;

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
	public final int anInt777;

	@OriginalMember(owner = "client!bb", name = "D", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray5;

	@OriginalMember(owner = "client!bb", name = "C", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray4;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!vd;IZLclient!at;Lclient!pe;Lclient!pe;)V")
	public Class23(@OriginalArg(0) Class335 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class17 arg3, @OriginalArg(4) Class254 arg4, @OriginalArg(5) Class254 arg5) {
		this.aBoolean61 = arg2;
		this.aClass254_13 = arg4;
		this.anInt778 = arg1;
		this.aClass17_1 = arg3;
		this.aClass254_11 = arg5;
		if (this.aClass254_13 == null) {
			this.anInt777 = 0;
		} else {
			@Pc(49) int local49 = this.aClass254_13.method6421() - 1;
			this.anInt777 = this.aClass254_13.method6396(local49) + local49 * 256;
		}
		this.aStringArray5 = new String[] { null, null, Static139.aClass101_6.method2841(this.anInt778), null, null };
		this.aStringArray4 = new String[] { null, null, null, null, Static139.aClass101_7.method2841(this.anInt778) };
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
	public void method896() {
		@Pc(2) Class211 local2 = this.aClass211_11;
		synchronized (this.aClass211_11) {
			this.aClass211_11.method5537();
		}
		local2 = this.aClass211_12;
		synchronized (this.aClass211_12) {
			this.aClass211_12.method5537();
		}
		@Pc(44) Class117 local44 = this.aClass117_1;
		synchronized (this.aClass117_1) {
			this.aClass117_1.method3021();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZI)V")
	public void method897() {
		@Pc(2) Class211 local2 = this.aClass211_11;
		synchronized (this.aClass211_11) {
			this.aClass211_11.method5538(5);
		}
		local2 = this.aClass211_12;
		synchronized (this.aClass211_12) {
			this.aClass211_12.method5538(5);
		}
		@Pc(44) Class117 local44 = this.aClass117_1;
		synchronized (this.aClass117_1) {
			this.aClass117_1.method3011();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
	public void method898() {
		@Pc(6) Class117 local6 = this.aClass117_1;
		synchronized (this.aClass117_1) {
			this.aClass117_1.method3017();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)Lclient!au;")
	public Class18 method901(@OriginalArg(1) int arg0) {
		@Pc(6) Class211 local6 = this.aClass211_11;
		@Pc(16) Class18 local16;
		synchronized (this.aClass211_11) {
			local16 = (Class18) this.aClass211_11.method5534((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class254 local29 = this.aClass254_13;
		@Pc(42) byte[] local42;
		synchronized (this.aClass254_13) {
			local42 = this.aClass254_13.method6401(Static355.method4579(arg0), Static380.method6133(arg0));
		}
		local16 = new Class18();
		local16.anInt668 = arg0;
		local16.aClass23_1 = this;
		local16.aStringArray3 = new String[] { null, null, Static139.aClass101_6.method2841(this.anInt778), null, null };
		local16.aStringArray2 = new String[] { null, null, null, null, Static139.aClass101_7.method2841(this.anInt778) };
		if (local42 != null) {
			local16.method777(new Class3_Sub7(local42));
		}
		local16.method773();
		if (local16.anInt676 != -1) {
			local16.method772(this.method901(local16.anInt676), this.method901(local16.anInt624));
		}
		if (local16.anInt657 != -1) {
			local16.method776(this.method901(local16.anInt651), this.method901(local16.anInt657));
		}
		if (!this.aBoolean61 && local16.aBoolean56) {
			local16.aString6 = Static139.aClass101_4.method2841(this.anInt778);
			local16.aStringArray2 = this.aStringArray4;
			local16.anIntArray18 = null;
			local16.anInt627 = 0;
			local16.aBoolean57 = false;
			local16.aStringArray3 = this.aStringArray5;
			if (local16.aClass25_4 != null) {
				@Pc(199) boolean local199 = false;
				for (@Pc(204) Class3 local204 = local16.aClass25_4.method949(); local204 != null; local204 = local16.aClass25_4.method947()) {
					@Pc(213) Class240 local213 = this.aClass17_1.method758((int) local204.aLong262);
					if (local213.aBoolean618) {
						local204.method8412();
					} else {
						local199 = true;
					}
				}
				if (!local199) {
					local16.aClass25_4 = null;
				}
			}
		}
		@Pc(237) Class211 local237 = this.aClass211_11;
		synchronized (this.aClass211_11) {
			this.aClass211_11.method5529((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZILclient!ta;IIIIILclient!oa;Lclient!to;ZLclient!oa;)Lclient!xa;")
	public Class37 method902(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class111 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class15 arg7, @OriginalArg(9) Class314 arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) Class15 arg10) {
		@Pc(14) Class37 local14 = this.method905(arg10, arg5, arg3, arg4, arg1, arg6, arg8);
		if (local14 != null) {
			return local14;
		}
		@Pc(41) Class18 local41 = this.method901(arg6);
		if (arg4 > 1 && local41.anIntArray17 != null) {
			@Pc(49) int local49 = -1;
			for (@Pc(51) int local51 = 0; local51 < 10; local51++) {
				if (local41.anIntArray20[local51] <= arg4 && local41.anIntArray20[local51] != 0) {
					local49 = local41.anIntArray17[local51];
				}
			}
			if (local49 != -1) {
				local41 = this.method901(local49);
			}
		}
		@Pc(97) int[] local97 = local41.method768(arg3, arg7, arg5, arg1, arg9, arg2, arg4, arg8, arg10);
		if (local97 == null) {
			return null;
		}
		@Pc(111) Class37 local111;
		if (arg0) {
			local111 = arg7.method5324(local97, 36, 36, 32);
		} else {
			local111 = arg10.method5324(local97, 36, 36, 32);
		}
		if (!arg0) {
			@Pc(126) Class81 local126 = new Class81();
			local126.anInt2636 = arg10.anInt6343;
			local126.anInt2630 = arg4;
			local126.anInt2632 = arg5;
			local126.aBoolean205 = arg8 != null;
			local126.anInt2631 = arg3;
			local126.anInt2634 = arg1;
			local126.anInt2635 = arg6;
			this.aClass117_1.method3014(local126, local111);
		}
		return local111;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(II)V")
	public void method903(@OriginalArg(1) int arg0) {
		this.anInt789 = arg0;
		@Pc(9) Class211 local9 = this.aClass211_12;
		synchronized (this.aClass211_12) {
			this.aClass211_12.method5535();
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)V")
	public void method904() {
		@Pc(8) Class211 local8 = this.aClass211_12;
		synchronized (this.aClass211_12) {
			this.aClass211_12.method5535();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!oa;IIIIILclient!to;I)Lclient!xa;")
	public Class37 method905(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class314 arg6) {
		this.aClass81_1.anInt2631 = arg2;
		this.aClass81_1.anInt2634 = arg4;
		this.aClass81_1.anInt2636 = arg0.anInt6343;
		this.aClass81_1.anInt2635 = arg5;
		this.aClass81_1.aBoolean205 = arg6 != null;
		this.aClass81_1.anInt2632 = arg1;
		this.aClass81_1.anInt2630 = arg3;
		return (Class37) this.aClass117_1.method3020(this.aClass81_1);
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(ZI)V")
	public void method908(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean61) {
			this.aBoolean61 = arg0;
			this.method909();
		}
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)V")
	public void method909() {
		@Pc(2) Class211 local2 = this.aClass211_11;
		synchronized (this.aClass211_11) {
			this.aClass211_11.method5535();
		}
		local2 = this.aClass211_12;
		synchronized (this.aClass211_12) {
			this.aClass211_12.method5535();
		}
		@Pc(44) Class117 local44 = this.aClass117_1;
		synchronized (this.aClass117_1) {
			this.aClass117_1.method3017();
		}
	}
}
