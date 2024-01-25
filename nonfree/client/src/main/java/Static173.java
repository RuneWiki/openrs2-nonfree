import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!jn", name = "r", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas2;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BI[I[II)V")
	public static void method2676(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg0) {
			return;
		}
		@Pc(14) int local14 = (arg3 + arg0) / 2;
		@Pc(16) int local16 = arg3;
		@Pc(20) int local20 = arg2[local14];
		arg2[local14] = arg2[arg0];
		arg2[arg0] = local20;
		@Pc(34) int local34 = arg1[local14];
		arg1[local14] = arg1[arg0];
		arg1[arg0] = local34;
		for (@Pc(46) int local46 = arg3; local46 < arg0; local46++) {
			if (arg2[local46] < (local46 & 0x1) + local20) {
				@Pc(61) int local61 = arg2[local46];
				arg2[local46] = arg2[local16];
				arg2[local16] = local61;
				@Pc(75) int local75 = arg1[local46];
				arg1[local46] = arg1[local16];
				arg1[local16++] = local75;
			}
		}
		arg2[arg0] = arg2[local16];
		arg2[local16] = local20;
		arg1[arg0] = arg1[local16];
		arg1[local16] = local34;
		method2676(local16 - 1, arg1, arg2, arg3);
		method2676(arg0, arg1, arg2, local16 + 1);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
	public static void method2678() {
		for (@Pc(15) Class3_Sub7_Sub13 local15 = (Class3_Sub7_Sub13) Static93.aClass138_10.method3051(); local15 != null; local15 = (Class3_Sub7_Sub13) Static93.aClass138_10.method3050()) {
			@Pc(20) Class28_Sub1_Sub4 local20 = local15.aClass28_Sub1_Sub4_1;
			if (local20.aBoolean413) {
				local15.method5700();
				local20.method4734();
			} else if (Static76.anInt1617 >= local20.anInt5308) {
				local20.method4735(Static38.anInt702);
				if (local20.aBoolean413) {
					local15.method5700();
				} else {
					Static202.method3149(local20, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IZILclient!vp;)Lclient!hd;")
	public static Class3_Sub7_Sub7 method2679(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class240 arg2) {
		@Pc(10) int local10 = arg2.anInt6252 | arg0 << 8;
		@Pc(19) Class3_Sub7_Sub7 local19 = (Class3_Sub7_Sub7) Static295.aClass21_4.method261((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(31) byte[] local31 = Static104.aClass20_28.method224(Static104.aClass20_28.method248(local10));
		if (local31 == null) {
			local10 = arg2.anInt6252 | arg1 + 65536 << 8;
			local19 = (Class3_Sub7_Sub7) Static295.aClass21_4.method261((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local31 = Static104.aClass20_28.method224(Static104.aClass20_28.method248(local10));
			if (local31 == null) {
				local10 = arg2.anInt6252 | 0xFFFF00;
				local19 = (Class3_Sub7_Sub7) Static295.aClass21_4.method261((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local31 = Static104.aClass20_28.method224(Static104.aClass20_28.method248(local10));
				if (local31 == null) {
					return null;
				} else if (local31.length <= 1) {
					return null;
				} else {
					local19 = Static280.method4389(local31);
					local19.aClass240_55 = arg2;
					Static295.aClass21_4.method259((long) local10 << 16, local19);
					return local19;
				}
			} else if (local31.length <= 1) {
				return null;
			} else {
				local19 = Static280.method4389(local31);
				local19.aClass240_55 = arg2;
				Static295.aClass21_4.method259((long) local10 << 16, local19);
				return local19;
			}
		} else if (local31.length <= 1) {
			return null;
		} else {
			local19 = Static280.method4389(local31);
			local19.aClass240_55 = arg2;
			Static295.aClass21_4.method259((long) local10 << 16, local19);
			return local19;
		}
	}
}
