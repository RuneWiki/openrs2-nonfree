import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!kq", name = "w", descriptor = "Z")
	public static boolean aBoolean451;

	@OriginalMember(owner = "client!kq", name = "G", descriptor = "Lclient!cga;")
	public static final Class60 aClass60_108 = new Class60();

	@OriginalMember(owner = "client!kq", name = "l", descriptor = "Z")
	public static boolean aBoolean449 = false;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "([Ljava/lang/String;B[S)V")
	public static void method4778(@OriginalArg(0) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static567.method7865(arg1, 0, arg0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(BLclient!sj;)V")
	public static void method4782(@OriginalArg(0) byte arg0, @OriginalArg(1) Class4_Sub2_Sub1_Sub2 arg1) {
		if (arg1.anIntArray174 == null && arg1.anIntArray181 == null) {
			return;
		}
		@Pc(17) boolean local17 = true;
		for (@Pc(19) int local19 = 0; local19 < arg1.anIntArray174.length; local19++) {
			@Pc(25) int local25 = -1;
			if (arg1.anIntArray174 != null) {
				local25 = arg1.anIntArray174[local19];
			}
			if (local25 != -1) {
				local17 = false;
				@Pc(104) int local104;
				@Pc(97) int local97;
				@Pc(74) int local74;
				if ((local25 & 0xC0000000) == -1073741824) {
					local74 = local25 & 0xFFFFFFF;
					@Pc(151) int local151 = local74 >> 14;
					@Pc(155) int local155 = local74 & 0x3FFF;
					local104 = arg1.anInt10229 - (local151 - Static243.anInt3820) * 512 - 256;
					local97 = arg1.anInt10228 - (local155 - Static224.anInt11062) * 512 - 256;
				} else if ((local25 & 0x8000) == 0) {
					@Pc(113) Class2_Sub49 local113 = (Class2_Sub49) Static467.aClass218_37.method5095((long) local25, 0);
					if (local113 == null) {
						arg1.method2063(local19, -1);
						continue;
					}
					@Pc(128) Class4_Sub2_Sub1_Sub2_Sub2 local128 = local113.aClass4_Sub2_Sub1_Sub2_Sub2_3;
					local104 = arg1.anInt10229 - local128.anInt10229;
					local97 = arg1.anInt10228 - local128.anInt10228;
				} else {
					local74 = local25 & 0x7FFF;
					@Pc(78) Class4_Sub2_Sub1_Sub2_Sub1 local78 = Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[local74];
					if (local78 == null) {
						arg1.method2063(local19, -1);
						continue;
					}
					local97 = arg1.anInt10228 - local78.anInt10228;
					local104 = arg1.anInt10229 - local78.anInt10229;
				}
				if (local104 != 0 || local97 != 0) {
					arg1.method2063(local19, (int) (Math.atan2((double) local104, (double) local97) * 2607.5945876176133D) & 0x3FFF);
				}
			} else if (!arg1.method2063(local19, -1)) {
				local17 = false;
			}
		}
		if (arg0 < 36) {
			method4782((byte) -19, (Class4_Sub2_Sub1_Sub2) null);
		}
		if (local17) {
			arg1.anIntArray174 = null;
			arg1.anIntArray181 = null;
		}
	}
}
