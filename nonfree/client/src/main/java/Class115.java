import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class115 {

	@OriginalMember(owner = "client!hf", name = "B", descriptor = "I")
	public int anInt3324;

	@OriginalMember(owner = "client!hf", name = "o", descriptor = "Lclient!qc;")
	private final Class231 aClass231_34 = new Class231(64);

	@OriginalMember(owner = "client!hf", name = "v", descriptor = "Lclient!qc;")
	public final Class231 aClass231_35 = new Class231(50);

	@OriginalMember(owner = "client!hf", name = "w", descriptor = "Lclient!gm;")
	public final Class102 aClass102_1 = new Class102(250);

	@OriginalMember(owner = "client!hf", name = "x", descriptor = "Lclient!me;")
	private final Class186 aClass186_1 = new Class186();

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "Lclient!dda;")
	private final Class53 aClass53_59;

	@OriginalMember(owner = "client!hf", name = "z", descriptor = "Lclient!rg;")
	private final Class247 aClass247_2;

	@OriginalMember(owner = "client!hf", name = "t", descriptor = "Z")
	private boolean aBoolean262;

	@OriginalMember(owner = "client!hf", name = "s", descriptor = "I")
	public final int anInt3322;

	@OriginalMember(owner = "client!hf", name = "j", descriptor = "Lclient!dda;")
	public final Class53 aClass53_60;

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
	public final int anInt3310;

	@OriginalMember(owner = "client!hf", name = "A", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray18;

	@OriginalMember(owner = "client!hf", name = "y", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray17;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!oda;IZLclient!rg;Lclient!dda;Lclient!dda;)V")
	public Class115(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class247 arg3, @OriginalArg(4) Class53 arg4, @OriginalArg(5) Class53 arg5) {
		this.aClass53_59 = arg4;
		this.aClass247_2 = arg3;
		this.aBoolean262 = arg2;
		this.anInt3322 = arg1;
		this.aClass53_60 = arg5;
		if (this.aClass53_59 == null) {
			this.anInt3310 = 0;
		} else {
			@Pc(54) int local54 = this.aClass53_59.method1607() - 1;
			this.anInt3310 = this.aClass53_59.method1592(local54) + local54 * 256;
		}
		this.aStringArray18 = new String[] { null, null, Static36.aClass202_22.method5139(this.anInt3322), null, null };
		this.aStringArray17 = new String[] { null, null, null, null, Static238.aClass202_136.method5139(this.anInt3322) };
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
	public void method2969() {
		@Pc(6) Class231 local6 = this.aClass231_35;
		synchronized (this.aClass231_35) {
			this.aClass231_35.method6240();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IB)Lclient!vk;")
	public Class300 method2970(@OriginalArg(0) int arg0) {
		@Pc(8) Class231 local8 = this.aClass231_34;
		@Pc(18) Class300 local18;
		synchronized (this.aClass231_34) {
			local18 = (Class300) this.aClass231_34.method6228((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class53 local31 = this.aClass53_59;
		@Pc(44) byte[] local44;
		synchronized (this.aClass53_59) {
			local44 = this.aClass53_59.method1616(Static426.method6573(arg0), Static40.method7059(arg0));
		}
		local18 = new Class300();
		local18.aClass115_2 = this;
		local18.anInt8905 = arg0;
		local18.aStringArray43 = new String[] { null, null, Static36.aClass202_22.method5139(this.anInt3322), null, null };
		local18.lb = new String[] { null, null, null, null, Static238.aClass202_136.method5139(this.anInt3322) };
		if (local44 != null) {
			local18.method7488(new Class2_Sub29(local44));
		}
		local18.method7478();
		if (local18.anInt8920 != -1) {
			local18.method7475(this.method2970(local18.anInt8951), this.method2970(local18.anInt8920));
		}
		if (local18.anInt8921 != -1) {
			local18.method7477(this.method2970(local18.anInt8921), this.method2970(local18.anInt8935));
		}
		if (!this.aBoolean262 && local18.aBoolean644) {
			local18.aString197 = Static532.aClass202_264.method5139(this.anInt3322);
			local18.anIntArray682 = null;
			local18.aBoolean643 = false;
			local18.lb = this.aStringArray17;
			local18.aStringArray43 = this.aStringArray18;
			local18.anInt8936 = 0;
			if (local18.aClass127_44 != null) {
				@Pc(205) boolean local205 = false;
				for (@Pc(210) Class2 local210 = local18.aClass127_44.method3203(); local210 != null; local210 = local18.aClass127_44.method3212()) {
					@Pc(220) Class73 local220 = this.aClass247_2.method6470((int) local210.aLong241);
					if (local220.aBoolean158) {
						local210.method7802();
					} else {
						local205 = true;
					}
				}
				if (!local205) {
					local18.aClass127_44 = null;
				}
			}
		}
		@Pc(245) Class231 local245 = this.aClass231_34;
		synchronized (this.aClass231_34) {
			this.aClass231_34.method6232(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
	public void method2971() {
		@Pc(10) Class231 local10 = this.aClass231_34;
		synchronized (this.aClass231_34) {
			this.aClass231_34.method6227();
		}
		local10 = this.aClass231_35;
		synchronized (this.aClass231_35) {
			this.aClass231_35.method6227();
		}
		@Pc(40) Class102 local40 = this.aClass102_1;
		synchronized (this.aClass102_1) {
			this.aClass102_1.method2741();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!qa;ILclient!jk;ILclient!ra;ZIILclient!qa;IIZ)Lclient!ha;")
	public Class35 method2972(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class146 arg2, @OriginalArg(4) Class47 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class39 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10) {
		@Pc(16) Class35 local16 = this.method2977(arg0, arg6, arg8, arg1, arg9, arg5, arg2);
		if (local16 != null) {
			return local16;
		}
		@Pc(25) Class300 local25 = this.method2970(arg6);
		if (arg8 > 1 && local25.anIntArray681 != null) {
			@Pc(33) int local33 = -1;
			for (@Pc(35) int local35 = 0; local35 < 10; local35++) {
				if (arg8 >= local25.anIntArray680[local35] && local25.anIntArray680[local35] != 0) {
					local33 = local25.anIntArray681[local35];
				}
			}
			if (local33 != -1) {
				local25 = this.method2970(local33);
			}
		}
		@Pc(82) int[] local82 = local25.method7470(arg8, arg9, arg2, arg7, arg4, arg5, arg3, arg0, arg1);
		if (local82 == null) {
			return null;
		}
		@Pc(100) Class35 local100;
		if (arg10) {
			local100 = arg7.method6049(local82, 36, 36, 32);
		} else {
			local100 = arg0.method6049(local82, 36, 36, 32);
		}
		if (!arg10) {
			@Pc(116) Class186 local116 = new Class186();
			local116.aBoolean403 = arg2 != null;
			local116.anInt5427 = arg0.anInt7092;
			local116.anInt5425 = arg5;
			local116.anInt5423 = arg9;
			local116.anInt5424 = arg1;
			local116.anInt5422 = arg8;
			local116.anInt5421 = arg6;
			this.aClass102_1.method2740(local100, local116);
		}
		return local100;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZ)V")
	public void method2973(@OriginalArg(0) int arg0) {
		this.anInt3324 = arg0;
		@Pc(9) Class231 local9 = this.aClass231_35;
		synchronized (this.aClass231_35) {
			this.aClass231_35.method6240();
		}
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)V")
	public void method2974() {
		@Pc(9) Class102 local9 = this.aClass102_1;
		synchronized (this.aClass102_1) {
			this.aClass102_1.method2739();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZZ)V")
	public void method2975(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean262 != arg0) {
			this.aBoolean262 = arg0;
			this.method2979();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZI)V")
	public void method2976() {
		@Pc(6) Class231 local6 = this.aClass231_34;
		synchronized (this.aClass231_34) {
			this.aClass231_34.method6231(5);
		}
		local6 = this.aClass231_35;
		synchronized (this.aClass231_35) {
			this.aClass231_35.method6231(5);
		}
		@Pc(52) Class102 local52 = this.aClass102_1;
		synchronized (this.aClass102_1) {
			this.aClass102_1.method2738();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!qa;IIIIIILclient!jk;)Lclient!ha;")
	public Class35 method2977(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class146 arg6) {
		this.aClass186_1.anInt5423 = arg4;
		this.aClass186_1.anInt5425 = arg5;
		this.aClass186_1.anInt5424 = arg3;
		this.aClass186_1.anInt5427 = arg0.anInt7092;
		this.aClass186_1.aBoolean403 = arg6 != null;
		this.aClass186_1.anInt5421 = arg1;
		this.aClass186_1.anInt5422 = arg2;
		return (Class35) this.aClass102_1.method2744(this.aClass186_1);
	}

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "(I)V")
	public void method2979() {
		@Pc(2) Class231 local2 = this.aClass231_34;
		synchronized (this.aClass231_34) {
			this.aClass231_34.method6240();
		}
		local2 = this.aClass231_35;
		synchronized (this.aClass231_35) {
			this.aClass231_35.method6240();
		}
		@Pc(40) Class102 local40 = this.aClass102_1;
		synchronized (this.aClass102_1) {
			this.aClass102_1.method2739();
		}
	}
}
