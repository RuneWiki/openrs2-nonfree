import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pia")
public final class Class23_Sub2_Sub1_Sub5 extends Class23_Sub2_Sub1 {

	@OriginalMember(owner = "client!pia", name = "ab", descriptor = "Lclient!f;")
	private Class23_Sub5 aClass23_Sub5_6;

	@OriginalMember(owner = "client!pia", name = "M", descriptor = "I")
	private int anInt7883 = 0;

	@OriginalMember(owner = "client!pia", name = "Y", descriptor = "I")
	private int anInt7893 = 0;

	@OriginalMember(owner = "client!pia", name = "X", descriptor = "Z")
	private boolean aBoolean598 = true;

	@OriginalMember(owner = "client!pia", name = "bb", descriptor = "Z")
	public boolean aBoolean599 = false;

	@OriginalMember(owner = "client!pia", name = "db", descriptor = "I")
	private final int anInt7896 = -1;

	@OriginalMember(owner = "client!pia", name = "cb", descriptor = "I")
	private int anInt7895 = 0;

	@OriginalMember(owner = "client!pia", name = "gb", descriptor = "I")
	private int anInt7898 = 0;

	@OriginalMember(owner = "client!pia", name = "ib", descriptor = "I")
	private int anInt7900 = 0;

	@OriginalMember(owner = "client!pia", name = "L", descriptor = "I")
	public final int anInt7882;

	@OriginalMember(owner = "client!pia", name = "hb", descriptor = "I")
	private final int anInt7899;

	@OriginalMember(owner = "client!pia", name = "N", descriptor = "Lclient!c;")
	private Class48 aClass48_2;

	@OriginalMember(owner = "client!pia", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class23_Sub2_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt7882 = arg1 + arg2;
		this.anInt7899 = arg0;
		this.anInt7895 = arg12;
		@Pc(53) Class34 local53 = Static196.aClass315_2.method7420(this.anInt7899);
		@Pc(56) int local56 = local53.anInt1217;
		if (local56 == -1) {
			this.aBoolean599 = true;
		} else {
			this.aClass48_2 = Static483.aClass373_2.method8323(local56);
			this.aBoolean599 = false;
		}
		if (arg2 == this.anInt7882) {
			Static4.method49(this, this.aClass48_2, this.anInt7898);
		}
	}

	@OriginalMember(owner = "client!pia", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass23_Sub5_6 != null) {
			this.aClass23_Sub5_6.method2579();
		}
	}

	@OriginalMember(owner = "client!pia", name = "b", descriptor = "(Lclient!ha;B)Lclient!dg;")
	@Override
	public Class77 method8595(@OriginalArg(0) Class16 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(I)V")
	public void method6621() {
		if (this.aClass23_Sub5_6 != null) {
			this.aClass23_Sub5_6.method2579();
		}
	}

	@OriginalMember(owner = "client!pia", name = "b", descriptor = "(BLclient!ha;)Lclient!hga;")
	@Override
	public Class23_Sub6 method8603(@OriginalArg(1) Class16 arg0) {
		@Pc(20) Class28 local20 = this.method6624(this.anInt7899, (this.anInt7895 == 0 ? 0 : 5) | 0x800, arg0);
		if (local20 == null) {
			return null;
		}
		if (this.anInt7895 != 0) {
			local20.a(this.anInt7895 * 2048);
		}
		@Pc(36) Class25 local36 = arg0.method8156();
		local36.method4303(super.anInt10108, super.anInt10114, super.anInt10109);
		this.method6622(arg0, local36, local20);
		@Pc(55) Class23_Sub6 local55 = Static564.method8406(1, false);
		if (Static148.aBoolean221) {
			local20.method6894(local36, local55.aClass23_Sub4Array1[0], Static209.anInt10104, 0);
		} else {
			local20.method6908(local36, local55.aClass23_Sub4Array1[0], 0);
		}
		if (this.aClass23_Sub5_6 != null) {
			@Pc(83) Class237 local83 = this.aClass23_Sub5_6.method2587();
			if (Static148.aBoolean221) {
				arg0.method8115(local83, Static209.anInt10104);
			} else {
				arg0.method8119(local83);
			}
		}
		this.aBoolean598 = local20.F();
		this.anInt7900 = local20.fa();
		this.anInt7883 = local20.ma();
		return local55;
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(ILclient!ha;Lclient!sk;Lclient!ka;)V")
	private void method6622(@OriginalArg(1) Class16 arg0, @OriginalArg(2) Class25 arg1, @OriginalArg(3) Class28 arg2) {
		arg2.method6888(arg1);
		@Pc(9) Class261[] local9 = arg2.method6912();
		@Pc(12) Class298[] local12 = arg2.method6911();
		if ((this.aClass23_Sub5_6 == null || this.aClass23_Sub5_6.aBoolean225) && (local9 != null || local12 != null)) {
			this.aClass23_Sub5_6 = Static150.method2583(Static621.anInt9665, true);
		}
		if (this.aClass23_Sub5_6 != null) {
			this.aClass23_Sub5_6.method2593(arg0, (long) Static621.anInt9665, local9, local12);
			this.aClass23_Sub5_6.method2591(super.aByte142, super.aShort123, super.aShort125, super.aShort124, super.aShort122);
		}
	}

	@OriginalMember(owner = "client!pia", name = "h", descriptor = "(I)I")
	@Override
	public int method8606(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.method8594();
		}
		return this.anInt7883;
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8590(@OriginalArg(1) Class16 arg0) {
		@Pc(11) Class28 local11 = this.method6624(this.anInt7899, 0, arg0);
		if (local11 != null) {
			@Pc(16) Class25 local16 = arg0.method8156();
			local16.method4303(super.anInt10108, super.anInt10114, super.anInt10109);
			this.method6622(arg0, local16, local11);
		}
	}

	@OriginalMember(owner = "client!pia", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method8608() {
		return false;
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(Lclient!ha;Lclient!cn;IIBZI)V")
	@Override
	public void method8596(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class23_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pia", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method8607() {
		return false;
	}

	@OriginalMember(owner = "client!pia", name = "d", descriptor = "(I)V")
	@Override
	public void method8592() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pia", name = "g", descriptor = "(I)I")
	@Override
	public int method8601() {
		return this.anInt7900;
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8600(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(IIILclient!ha;)Lclient!ka;")
	private Class28 method6624(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class16 arg2) {
		@Pc(8) Class34 local8 = Static196.aClass315_2.method7420(arg0);
		@Pc(13) Class104 local13 = Static239.aClass104Array1[super.aByte142];
		@Pc(26) Class104 local26 = super.aByte143 < 3 ? Static239.aClass104Array1[super.aByte143 + 1] : null;
		return this.aBoolean599 ? local8.method1227(super.anInt10114, local13, super.anInt10109, 0, local26, -1, -1, arg1, arg2, Static483.aClass373_2, super.anInt10108) : local8.method1227(super.anInt10114, local13, super.anInt10109, this.anInt7893, local26, this.anInt7898, this.anInt7896, arg1, arg2, Static483.aClass373_2, super.anInt10108);
	}

	@OriginalMember(owner = "client!pia", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method8594() {
		return this.aBoolean598;
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(BI)V")
	public void method6625(@OriginalArg(1) int arg0) {
		if (this.aBoolean599) {
			return;
		}
		this.anInt7893 += arg0;
		while (this.aClass48_2.anIntArray68[this.anInt7898] < this.anInt7893) {
			this.anInt7893 -= this.aClass48_2.anIntArray68[this.anInt7898];
			this.anInt7898++;
			if (this.aClass48_2.anIntArray72.length <= this.anInt7898) {
				this.aBoolean599 = true;
				break;
			}
		}
		if (!this.aBoolean599) {
			Static4.method49(this, this.aClass48_2, this.anInt7898);
		}
	}
}
