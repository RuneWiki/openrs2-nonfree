import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IZI)Lclient!ev;")
	public static Class94 method1136(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class94 local7 = new Class94();
		local7.anInt2626 = -1;
		local7.anInt2613 = arg0 + 1 + 5;
		local7.anInt2627 = arg1 + 5 + 1;
		local7.anInt2619 = -1;
		local7.anIntArrayArray20 = new int[local7.anInt2613][local7.anInt2627];
		local7.method2209();
		return local7;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(B[Lclient!wv;I)V")
	public static void method1137(@OriginalArg(1) Class365[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class365 local13 = arg0[local7];
			if (local13 != null) {
				if (local13.anInt9595 == 0) {
					if (local13.aClass365Array2 != null) {
						method1137(local13.aClass365Array2, arg1);
					}
					@Pc(37) Class1_Sub16 local37 = (Class1_Sub16) Static68.aClass356_4.method7796((long) local13.anInt9646);
					if (local37 != null) {
						Static463.method6579(local37.anInt2681, arg1);
					}
				}
				@Pc(58) Class1_Sub2 local58;
				if (arg1 == 0 && local13.anObjectArray33 != null) {
					local58 = new Class1_Sub2();
					local58.anObjectArray1 = local13.anObjectArray33;
					local58.aClass365_1 = local13;
					Static145.method2353(local58);
				}
				if (arg1 == 1 && local13.anObjectArray11 != null) {
					if (local13.anInt9603 >= 0) {
						@Pc(81) Class365 local81 = Static374.method5437(local13.anInt9646);
						if (local81 == null || local81.aClass365Array2 == null || local13.anInt9603 >= local81.aClass365Array2.length || local81.aClass365Array2[local13.anInt9603] != local13) {
							continue;
						}
					}
					local58 = new Class1_Sub2();
					local58.aClass365_1 = local13;
					local58.anObjectArray1 = local13.anObjectArray11;
					Static145.method2353(local58);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Ljava/awt/Component;I)Lclient!sc;")
	public static Class31 method1139(@OriginalArg(0) Component arg0) {
		return new Class31_Sub1(arg0);
	}
}
