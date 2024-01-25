import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class105 {

	@OriginalMember(owner = "client!en", name = "P", descriptor = "[Lclient!f;")
	private static final Class111[] aClass111Array1 = new Class111[32];

	@OriginalMember(owner = "client!en", name = "C", descriptor = "I")
	public int anInt2995;

	@OriginalMember(owner = "client!en", name = "t", descriptor = "Lclient!tq;")
	private final Class340 aClass340_17 = new Class340(64);

	@OriginalMember(owner = "client!en", name = "y", descriptor = "Lclient!tq;")
	public final Class340 aClass340_18 = new Class340(50);

	@OriginalMember(owner = "client!en", name = "z", descriptor = "Lclient!dia;")
	public final Class84 aClass84_1 = new Class84(250);

	@OriginalMember(owner = "client!en", name = "B", descriptor = "Lclient!vp;")
	private final Class376 aClass376_1 = new Class376();

	@OriginalMember(owner = "client!en", name = "j", descriptor = "I")
	public final int anInt2984;

	@OriginalMember(owner = "client!en", name = "H", descriptor = "Lclient!wc;")
	private final Class381 aClass381_1;

	@OriginalMember(owner = "client!en", name = "u", descriptor = "Z")
	private boolean aBoolean254;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "Lclient!wm;")
	public final Class390 aClass390_32;

	@OriginalMember(owner = "client!en", name = "s", descriptor = "Lclient!wm;")
	private final Class390 aClass390_33;

	@OriginalMember(owner = "client!en", name = "b", descriptor = "I")
	public final int anInt2978;

	@OriginalMember(owner = "client!en", name = "E", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray19;

	@OriginalMember(owner = "client!en", name = "G", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray20;

	static {
		@Pc(85) Class111[] local85 = Static101.method1979();
		for (@Pc(87) int local87 = 0; local87 < local85.length; local87++) {
			aClass111Array1[local85[local87].anInt3148] = local85[local87];
		}
	}

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lclient!ega;IZLclient!wc;Lclient!wm;Lclient!wm;)V")
	public Class105(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class381 arg3, @OriginalArg(4) Class390 arg4, @OriginalArg(5) Class390 arg5) {
		this.anInt2984 = arg1;
		this.aClass381_1 = arg3;
		this.aBoolean254 = arg2;
		this.aClass390_32 = arg5;
		this.aClass390_33 = arg4;
		if (this.aClass390_33 == null) {
			this.anInt2978 = 0;
		} else {
			@Pc(54) int local54 = this.aClass390_33.method8918() - 1;
			this.anInt2978 = this.aClass390_33.method8913(local54) + local54 * 256;
		}
		this.aStringArray19 = new String[] { null, null, Static64.aClass52_8.method907(this.anInt2984), null, null };
		this.aStringArray20 = new String[] { null, null, null, null, Static64.aClass52_9.method907(this.anInt2984) };
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V")
	public void method2645() {
		@Pc(2) Class340 local2 = this.aClass340_18;
		synchronized (this.aClass340_18) {
			this.aClass340_18.method7987();
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)V")
	public void method2646() {
		@Pc(2) Class340 local2 = this.aClass340_17;
		synchronized (this.aClass340_17) {
			this.aClass340_17.method8000();
		}
		local2 = this.aClass340_18;
		synchronized (this.aClass340_18) {
			this.aClass340_18.method8000();
		}
		@Pc(36) Class84 local36 = this.aClass84_1;
		synchronized (this.aClass84_1) {
			this.aClass84_1.method2097();
		}
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V")
	public void method2647() {
		@Pc(11) Class84 local11 = this.aClass84_1;
		synchronized (this.aClass84_1) {
			this.aClass84_1.method2094();
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZI)V")
	public void method2648(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean254) {
			this.aBoolean254 = arg0;
			this.method2656();
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(II)V")
	public void method2651(@OriginalArg(0) int arg0) {
		this.anInt2995 = arg0;
		@Pc(9) Class340 local9 = this.aClass340_18;
		synchronized (this.aClass340_18) {
			this.aClass340_18.method7987();
		}
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(II)V")
	public void method2654() {
		@Pc(2) Class340 local2 = this.aClass340_17;
		synchronized (this.aClass340_17) {
			this.aClass340_17.method7996(5);
		}
		@Pc(30) Class340 local30 = this.aClass340_18;
		synchronized (this.aClass340_18) {
			this.aClass340_18.method7996(5);
		}
		@Pc(46) Class84 local46 = this.aClass84_1;
		synchronized (this.aClass84_1) {
			this.aClass84_1.method2096();
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!lga;Lclient!ha;ZILclient!ha;IILclient!da;IZIZ)Lclient!pu;")
	public Class50 method2655(@OriginalArg(0) Class213 arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class65 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class73 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		@Pc(21) Class50 local21 = this.method2658(arg5, arg8, arg6, arg4, arg10, arg3, arg0);
		if (local21 != null) {
			return local21;
		}
		@Pc(30) Class238 local30 = this.method2659(arg8);
		if (arg10 > 1 && local30.anIntArray388 != null) {
			@Pc(40) int local40 = -1;
			for (@Pc(42) int local42 = 0; local42 < 10; local42++) {
				if (local30.anIntArray389[local42] <= arg10 && local30.anIntArray389[local42] != 0) {
					local40 = local30.anIntArray388[local42];
				}
			}
			if (local40 != -1) {
				local30 = this.method2659(local40);
			}
		}
		@Pc(90) int[] local90 = local30.method5690(arg6, arg5, arg1, arg2, arg10, arg4, arg7, arg3, arg0);
		if (local90 == null) {
			return null;
		}
		@Pc(105) Class50 local105;
		if (arg9) {
			local105 = arg1.method6952(32, 36, local90, 36);
		} else {
			local105 = arg4.method6952(32, 36, local90, 36);
		}
		if (!arg9) {
			@Pc(122) Class376 local122 = new Class376();
			local122.anInt10409 = arg4.anInt8116;
			local122.anInt10408 = arg3;
			local122.anInt10415 = arg8;
			local122.anInt10410 = arg5;
			local122.anInt10407 = arg10;
			local122.anInt10412 = arg6;
			local122.aBoolean888 = arg0 != null;
			this.aClass84_1.method2083(local105, local122);
		}
		return local105;
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(I)V")
	public void method2656() {
		@Pc(6) Class340 local6 = this.aClass340_17;
		synchronized (this.aClass340_17) {
			this.aClass340_17.method7987();
		}
		local6 = this.aClass340_18;
		synchronized (this.aClass340_18) {
			this.aClass340_18.method7987();
		}
		@Pc(42) Class84 local42 = this.aClass84_1;
		synchronized (this.aClass84_1) {
			this.aClass84_1.method2094();
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIILclient!ha;IILclient!lga;)Lclient!pu;")
	public Class50 method2658(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class65 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class213 arg6) {
		this.aClass376_1.aBoolean888 = arg6 != null;
		this.aClass376_1.anInt10407 = arg4;
		this.aClass376_1.anInt10409 = arg3.anInt8116;
		this.aClass376_1.anInt10415 = arg1;
		this.aClass376_1.anInt10412 = arg2;
		this.aClass376_1.anInt10410 = arg0;
		this.aClass376_1.anInt10408 = arg5;
		return (Class50) this.aClass84_1.method2087(this.aClass376_1);
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(II)Lclient!mv;")
	public Class238 method2659(@OriginalArg(0) int arg0) {
		@Pc(6) Class340 local6 = this.aClass340_17;
		@Pc(22) Class238 local22;
		synchronized (this.aClass340_17) {
			local22 = (Class238) this.aClass340_17.method7999((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class390 local35 = this.aClass390_33;
		@Pc(48) byte[] local48;
		synchronized (this.aClass390_33) {
			local48 = this.aClass390_33.method8914(Static368.method5559(arg0), Static635.method8553(arg0));
		}
		local22 = new Class238();
		local22.aClass105_2 = this;
		local22.anInt6888 = arg0;
		local22.aStringArray40 = new String[] { null, null, Static64.aClass52_8.method907(this.anInt2984), null, null };
		local22.aStringArray41 = new String[] { null, null, null, null, Static64.aClass52_9.method907(this.anInt2984) };
		if (local48 != null) {
			local22.method5702(new Class5_Sub41(local48));
		}
		local22.method5706();
		if (local22.anInt6852 != -1) {
			local22.method5697(this.method2659(local22.anInt6852), this.method2659(local22.anInt6855));
		}
		if (local22.anInt6840 != -1) {
			local22.method5692(this.method2659(local22.anInt6840), this.method2659(local22.anInt6843));
		}
		if (local22.anInt6871 != -1) {
			local22.method5698(this.method2659(local22.anInt6871), this.method2659(local22.anInt6857));
		}
		if (!this.aBoolean254 && local22.aBoolean599) {
			local22.aString57 = Static64.aClass52_5.method907(this.anInt2984);
			local22.aBoolean600 = false;
			local22.aStringArray41 = this.aStringArray20;
			local22.anIntArray390 = null;
			local22.aStringArray40 = this.aStringArray19;
			local22.anInt6851 = 0;
			if (local22.aClass300_31 != null) {
				@Pc(223) boolean local223 = false;
				for (@Pc(228) Class5 local228 = local22.aClass300_31.method7182(); local228 != null; local228 = local22.aClass300_31.method7192()) {
					@Pc(237) Class233 local237 = this.aClass381_1.method8728((int) local228.aLong307);
					if (local237.aBoolean596) {
						local228.method9052();
					} else {
						local223 = true;
					}
				}
				if (!local223) {
					local22.aClass300_31 = null;
				}
			}
		}
		@Pc(265) Class340 local265 = this.aClass340_17;
		synchronized (this.aClass340_17) {
			this.aClass340_17.method7986((long) arg0, local22);
			return local22;
		}
	}
}
