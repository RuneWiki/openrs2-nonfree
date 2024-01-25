import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class102 {

	@OriginalMember(owner = "client!hq", name = "D", descriptor = "I")
	public int anInt2692;

	@OriginalMember(owner = "client!hq", name = "j", descriptor = "Lclient!tl;")
	private final Class227 aClass227_20 = new Class227(64);

	@OriginalMember(owner = "client!hq", name = "w", descriptor = "Lclient!tl;")
	public final Class227 aClass227_21 = new Class227(50);

	@OriginalMember(owner = "client!hq", name = "x", descriptor = "Lclient!ee;")
	public final Class64 aClass64_1 = new Class64(250);

	@OriginalMember(owner = "client!hq", name = "z", descriptor = "Lclient!oh;")
	private final Class174 aClass174_1 = new Class174();

	@OriginalMember(owner = "client!hq", name = "i", descriptor = "Lclient!ui;")
	public final Class230 aClass230_39;

	@OriginalMember(owner = "client!hq", name = "A", descriptor = "Lclient!cs;")
	private final Class47 aClass47_3;

	@OriginalMember(owner = "client!hq", name = "p", descriptor = "Lclient!ui;")
	private final Class230 aClass230_40;

	@OriginalMember(owner = "client!hq", name = "v", descriptor = "Z")
	private boolean aBoolean229;

	@OriginalMember(owner = "client!hq", name = "o", descriptor = "I")
	public final int anInt2688;

	@OriginalMember(owner = "client!hq", name = "m", descriptor = "I")
	public final int anInt2686;

	@OriginalMember(owner = "client!hq", name = "B", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray40;

	@OriginalMember(owner = "client!hq", name = "C", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray41;

	static {
		new Class169("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
	}

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!gp;IZLclient!cs;Lclient!ui;Lclient!ui;)V")
	public Class102(@OriginalArg(0) Class94 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class47 arg3, @OriginalArg(4) Class230 arg4, @OriginalArg(5) Class230 arg5) {
		this.aClass230_39 = arg5;
		this.aClass47_3 = arg3;
		this.aClass230_40 = arg4;
		this.aBoolean229 = arg2;
		this.anInt2688 = arg1;
		if (this.aClass230_40 == null) {
			this.anInt2686 = 0;
		} else {
			@Pc(54) int local54 = this.aClass230_40.method4969() - 1;
			this.anInt2686 = this.aClass230_40.method4956(local54) + local54 * 256;
		}
		this.aStringArray40 = new String[] { null, null, Static166.aClass169_188.method3680(this.anInt2688), null, null };
		this.aStringArray41 = new String[] { null, null, null, null, Static388.aClass169_340.method3680(this.anInt2688) };
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(BI)V")
	public void method2171() {
		@Pc(6) Class227 local6 = this.aClass227_20;
		synchronized (this.aClass227_20) {
			this.aClass227_20.method4859(5);
		}
		local6 = this.aClass227_21;
		synchronized (this.aClass227_21) {
			this.aClass227_21.method4859(5);
		}
		@Pc(44) Class64 local44 = this.aClass64_1;
		synchronized (this.aClass64_1) {
			this.aClass64_1.method1201();
		}
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(BI)Lclient!gd;")
	public Class88 method2172(@OriginalArg(1) int arg0) {
		@Pc(8) Class227 local8 = this.aClass227_20;
		@Pc(18) Class88 local18;
		synchronized (this.aClass227_20) {
			local18 = (Class88) this.aClass227_20.method4863((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(39) byte[] local39 = this.aClass230_40.method4985(Static171.method2526(arg0), Static358.method4952(arg0));
		local18 = new Class88();
		local18.aClass102_1 = this;
		local18.anInt2016 = arg0;
		local18.aStringArray29 = new String[] { null, null, Static166.aClass169_188.method3680(this.anInt2688), null, null };
		local18.aStringArray28 = new String[] { null, null, null, null, Static388.aClass169_340.method3680(this.anInt2688) };
		if (local39 != null) {
			local18.method1664(new Class1_Sub33(local39));
		}
		local18.method1659();
		if (local18.anInt2022 != -1) {
			local18.method1671(this.method2172(local18.anInt2022), this.method2172(local18.anInt2008));
		}
		if (local18.anInt2030 != -1) {
			local18.method1663(this.method2172(local18.anInt2030), this.method2172(local18.anInt2040));
		}
		if (!this.aBoolean229 && local18.aBoolean168) {
			local18.aString17 = Static271.aClass169_254.method3680(this.anInt2688);
			local18.aStringArray29 = this.aStringArray40;
			local18.anInt2041 = 0;
			local18.lb = false;
			local18.aStringArray28 = this.aStringArray41;
			local18.anIntArray261 = null;
			if (local18.aClass77_14 != null) {
				@Pc(195) boolean local195 = false;
				for (@Pc(200) Class1 local200 = local18.aClass77_14.method1359(); local200 != null; local200 = local18.aClass77_14.method1360()) {
					@Pc(210) Class24 local210 = this.aClass47_3.method888((int) local200.aLong207);
					if (local210.aBoolean37) {
						local200.method5577();
					} else {
						local195 = true;
					}
				}
				if (!local195) {
					local18.aClass77_14 = null;
				}
			}
		}
		@Pc(235) Class227 local235 = this.aClass227_20;
		synchronized (this.aClass227_20) {
			this.aClass227_20.method4865(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!tq;IIIIIILclient!cu;)Lclient!dp;")
	public Class51 method2173(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class49 arg6) {
		this.aClass174_1.anInt4394 = arg0.anInt6163;
		this.aClass174_1.anInt4392 = arg5;
		this.aClass174_1.anInt4384 = arg3;
		this.aClass174_1.aBoolean434 = arg6 != null;
		this.aClass174_1.anInt4390 = arg4;
		this.aClass174_1.anInt4391 = arg1;
		this.aClass174_1.anInt4388 = arg2;
		return (Class51) this.aClass64_1.method1205(this.aClass174_1);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Z)V")
	public void method2175() {
		@Pc(2) Class227 local2 = this.aClass227_20;
		synchronized (this.aClass227_20) {
			this.aClass227_20.method4871();
		}
		local2 = this.aClass227_21;
		synchronized (this.aClass227_21) {
			this.aClass227_21.method4871();
		}
		@Pc(42) Class64 local42 = this.aClass64_1;
		synchronized (this.aClass64_1) {
			this.aClass64_1.method1202();
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V")
	public void method2176() {
		@Pc(2) Class227 local2 = this.aClass227_21;
		synchronized (this.aClass227_21) {
			this.aClass227_21.method4871();
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZB)V")
	public void method2177(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean229) {
			this.aBoolean229 = arg0;
			this.method2175();
		}
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(Z)V")
	public void method2178() {
		@Pc(6) Class227 local6 = this.aClass227_20;
		synchronized (this.aClass227_20) {
			this.aClass227_20.method4858();
		}
		local6 = this.aClass227_21;
		synchronized (this.aClass227_21) {
			this.aClass227_21.method4858();
		}
		@Pc(36) Class64 local36 = this.aClass64_1;
		synchronized (this.aClass64_1) {
			this.aClass64_1.method1196();
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IZIIIILclient!tq;Lclient!tr;ZILclient!tq;Lclient!cu;)Lclient!dp;")
	public Class51 method2179(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class164 arg6, @OriginalArg(7) Class137 arg7, @OriginalArg(8) boolean arg8, @OriginalArg(10) Class164 arg9, @OriginalArg(11) Class49 arg10) {
		@Pc(16) Class51 local16 = this.method2173(arg6, arg3, arg5, arg2, arg0, arg4, arg10);
		if (local16 != null) {
			return local16;
		}
		@Pc(25) Class88 local25 = this.method2172(arg0);
		if (arg5 > 1 && local25.anIntArray259 != null) {
			@Pc(35) int local35 = -1;
			for (@Pc(37) int local37 = 0; local37 < 10; local37++) {
				if (arg5 >= local25.anIntArray258[local37] && local25.anIntArray258[local37] != 0) {
					local35 = local25.anIntArray259[local37];
				}
			}
			if (local35 != -1) {
				local25 = this.method2172(local35);
			}
		}
		@Pc(96) int[] local96 = local25.method1655(arg10, arg4, arg9, arg2, arg3, arg8, arg5, arg6, arg7);
		if (local96 == null) {
			return null;
		}
		@Pc(110) Class51 local110;
		if (arg1) {
			local110 = arg9.method5349(local96, 36, 36, 32);
		} else {
			local110 = arg6.method5349(local96, 36, 36, 32);
		}
		if (!arg1) {
			@Pc(126) Class174 local126 = new Class174();
			local126.anInt4391 = arg3;
			local126.anInt4394 = arg6.anInt6163;
			local126.anInt4384 = arg2;
			local126.anInt4388 = arg5;
			local126.anInt4390 = arg0;
			local126.anInt4392 = arg4;
			local126.aBoolean434 = arg10 != null;
			this.aClass64_1.method1204(local126, local110);
		}
		return local110;
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)V")
	public void method2180() {
		@Pc(2) Class64 local2 = this.aClass64_1;
		synchronized (this.aClass64_1) {
			this.aClass64_1.method1202();
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)V")
	public void method2183(@OriginalArg(0) int arg0) {
		this.anInt2692 = arg0;
		@Pc(13) Class227 local13 = this.aClass227_21;
		synchronized (this.aClass227_21) {
			this.aClass227_21.method4871();
		}
	}
}
