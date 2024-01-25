import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZII)Lclient!dfa;")
	public static Class28_Sub3 method120(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class371[] local7 = Class3_Sub9_Sub23.aClass371Array1;
		synchronized (Class3_Sub9_Sub23.aClass371Array1) {
			@Pc(40) Class28_Sub3 local40;
			if (Class3_Sub9_Sub23.aClass371Array1.length <= arg1 || Class3_Sub9_Sub23.aClass371Array1[arg1].method8912()) {
				local40 = new Class28_Sub3();
				local40.aClass28_Sub8Array1 = new Class28_Sub8[arg1];
				for (@Pc(62) int local62 = 0; local62 < arg1; local62++) {
					local40.aClass28_Sub8Array1[local62] = new Class28_Sub8();
				}
			} else {
				local40 = (Class28_Sub3) Class3_Sub9_Sub23.aClass371Array1[arg1].method8918();
				local40.method9276();
				@Pc(47) int local47 = Static619.anIntArray944[arg1]--;
			}
			local40.aBoolean145 = arg0;
			return local40;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIZZLclient!aj;I)V")
	public static void method121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(5) Class15 arg2) {
		Static499.anInt8156 = 0;
		Static18.anInt450 = 1;
		Static403.aClass15_107 = arg2;
		Static512.aBoolean627 = false;
		Static586.anInt9458 = 2;
		Static453.anInt7540 = arg0;
		Static553.anInt9041 = arg1;
		Static257.aClass3_Sub1_Sub3_2 = null;
	}
}
