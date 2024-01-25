import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static474 {

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "[[B")
	public static final byte[][] aByteArrayArray16 = new byte[50][];

	@OriginalMember(owner = "client!qw", name = "f", descriptor = "[B")
	public static final byte[] aByteArray75 = new byte[520];

	@OriginalMember(owner = "client!qw", name = "k", descriptor = "Lclient!ek;")
	public static final Class94 aClass94_6 = new Class94();

	@OriginalMember(owner = "client!qw", name = "B", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_131 = new Class274(100, 6);

	@OriginalMember(owner = "client!qw", name = "C", descriptor = "Lclient!ek;")
	public static final Class94 aClass94_7 = new Class94();

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(BII)V")
	public static void method6798(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class2_Sub5_Sub10 local12 = Static594.method8175(arg1, 16);
		local12.method4393();
		local12.anInt5255 = arg0;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(ILclient!dm;)V")
	public static void method6802(@OriginalArg(1) Class78 arg0) {
		if (arg0.anInt1940 != Static603.anInt9991) {
			return;
		}
		if (Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aString4 == null) {
			arg0.anInt1983 = 0;
			arg0.anInt1962 = 0;
			return;
		}
		arg0.anInt2014 = 150;
		arg0.anInt1937 = (int) (Math.sin((double) Static325.anInt5888 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt2002 = 5;
		arg0.anInt1962 = Static182.anInt4021;
		arg0.anInt1983 = Static282.method4462(Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aString4);
		arg0.anInt2003 = Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt3253;
		arg0.anInt1973 = Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt3243;
		arg0.anInt1946 = 0;
		arg0.anInt1925 = Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt3281;
		@Pc(71) Class149 local71 = arg0.anInt2003 == -1 ? null : Static185.aClass303_1.method7201(arg0.anInt2003);
		if (local71 != null) {
			Static455.method6662(local71, arg0.anInt1925);
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lclient!wc;I)I")
	public static int method6804(@OriginalArg(0) Class2_Sub5_Sub20 arg0) {
		@Pc(7) String local7 = Static603.method8360(arg0);
		@Pc(9) int[] local9 = null;
		if (Static565.method7812(arg0.anInt10077)) {
			local9 = Static570.aClass267_2.method6597((int) arg0.aLong278).anIntArray506;
		} else if (arg0.anInt10075 != -1) {
			local9 = Static570.aClass267_2.method6597(arg0.anInt10075).anIntArray506;
		} else if (Static539.method7533(arg0.anInt10077)) {
			@Pc(88) Class2_Sub51 local88 = (Class2_Sub51) Static357.aClass222_23.method5468((long) arg0.aLong278);
			if (local88 != null) {
				@Pc(93) Class11_Sub1_Sub1_Sub2_Sub2 local93 = local88.aClass11_Sub1_Sub1_Sub2_Sub2_2;
				@Pc(96) Class236 local96 = local93.aClass236_1;
				if (local96.anIntArray462 != null) {
					local96 = local96.method5779(Static438.aClass198_1);
				}
				if (local96 != null) {
					local9 = local96.anIntArray464;
				}
			}
		} else if (Static542.method7600(arg0.anInt10077)) {
			@Pc(53) Class350 local53;
			if (arg0.anInt10077 == 1012) {
				local53 = Static619.aClass281_4.method6734((int) arg0.aLong278);
			} else {
				local53 = Static619.aClass281_4.method6734((int) (arg0.aLong278 >>> 32 & 0x7FFFFFFFL));
			}
			if (local53.anIntArray665 != null) {
				local53 = local53.method8080(Static438.aClass198_1);
			}
			if (local53 != null) {
				local9 = local53.anIntArray666;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static550.method7655(local9);
		}
		@Pc(137) int local137 = Static240.aClass114_19.method3008(Static185.aClass20Array5, local7);
		if (arg0.aBoolean743) {
			local137 += Static165.aClass20_6.method4579() + 4;
		}
		return local137;
	}
}
