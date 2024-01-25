import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!li", name = "a", descriptor = "I")
	public static int anInt6789;

	@OriginalMember(owner = "client!li", name = "d", descriptor = "Lclient!vd;")
	public static Class249 aClass249_4;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!l;ZILclient!gt;Ljava/awt/Canvas;)Lclient!za;")
	public static Class200 method5367(@OriginalArg(0) Interface8 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class93 arg2, @OriginalArg(4) Canvas arg3) {
		return new w(arg1, arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!um;II)Lclient!ap;")
	public static Class14 method5370(@OriginalArg(0) Class243 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method5459(arg1);
		return local13 == null ? null : new Class14(local13);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILclient!eg;II)Lclient!tr;")
	public static Class5_Sub2_Sub17 method5372(@OriginalArg(0) int arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = arg1.anInt1640 | arg2 << 8;
		@Pc(19) Class5_Sub2_Sub17 local19 = (Class5_Sub2_Sub17) Static347.aClass261_3.method5897((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(35) byte[] local35 = Static29.aClass243_24.method5459(Static29.aClass243_24.method5477(local10));
		if (local35 == null) {
			local10 = arg0 + 65536 << 8 | arg1.anInt1640;
			local19 = (Class5_Sub2_Sub17) Static347.aClass261_3.method5897((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local35 = Static29.aClass243_24.method5459(Static29.aClass243_24.method5477(local10));
			if (local35 == null) {
				local10 = arg1.anInt1640 | 0xFFFF00;
				local19 = (Class5_Sub2_Sub17) Static347.aClass261_3.method5897((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local35 = Static29.aClass243_24.method5459(Static29.aClass243_24.method5477(local10));
				if (local35 == null) {
					return null;
				} else if (local35.length <= 1) {
					return null;
				} else {
					local19 = Static142.method2032(local35);
					local19.aClass60_9 = arg1;
					Static347.aClass261_3.method5900((long) local10 << 16, local19);
					return local19;
				}
			} else if (local35.length <= 1) {
				return null;
			} else {
				local19 = Static142.method2032(local35);
				local19.aClass60_9 = arg1;
				Static347.aClass261_3.method5900((long) local10 << 16, local19);
				return local19;
			}
		} else if (local35.length <= 1) {
			return null;
		} else {
			local19 = Static142.method2032(local35);
			local19.aClass60_9 = arg1;
			Static347.aClass261_3.method5900((long) local10 << 16, local19);
			return local19;
		}
	}
}
