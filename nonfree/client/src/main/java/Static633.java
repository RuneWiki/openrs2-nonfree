import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static633 {

	@OriginalMember(owner = "client!vg", name = "D", descriptor = "Z")
	public static boolean aBoolean766;

	@OriginalMember(owner = "client!vg", name = "L", descriptor = "Lclient!tja;")
	public static final Class336 aClass336_19 = new Class336(0, 16);

	@OriginalMember(owner = "client!vg", name = "O", descriptor = "Lclient!hv;")
	public static final Class146 aClass146_39 = new Class146(6, 1);

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZIIIII)V")
	public static void method8835(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static7.anInt93 <= arg0 - arg1 && arg1 + arg0 <= Static115.anInt2377 && Static374.anInt5986 <= arg2 - arg1 && Static84.anInt1667 >= arg1 + arg2) {
			Static14.method194(arg1, arg4, arg2, arg3, arg0, arg5);
		} else {
			Static117.method2219(arg2, arg5, arg1, arg4, arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(Z)V")
	public static void method8836() {
		if (Static442.aFrame3 != null) {
			return;
		}
		@Pc(10) int local10 = Static282.anInt4895;
		@Pc(12) int local12 = Static270.anInt4747;
		@Pc(24) int local24 = Static512.anInt8242 - Static312.anInt5191 - local10;
		@Pc(32) int local32 = Static203.anInt3986 - local12 - Static222.anInt4196;
		if (local10 <= 0 && local24 <= 0 && local12 <= 0 && local32 <= 0) {
			return;
		}
		try {
			@Pc(52) Container local52;
			if (Static380.aFrame2 != null) {
				local52 = Static380.aFrame2;
			} else if (Static124.anApplet1 == null) {
				local52 = Static95.anApplet_Sub1_1;
			} else {
				local52 = Static124.anApplet1;
			}
			@Pc(62) int local62 = 0;
			@Pc(64) int local64 = 0;
			if (Static380.aFrame2 == local52) {
				@Pc(70) Insets local70 = Static380.aFrame2.getInsets();
				local64 = local70.top;
				local62 = local70.left;
			}
			@Pc(79) Graphics local79 = local52.getGraphics();
			local79.setColor(Color.black);
			if (local10 > 0) {
				local79.fillRect(local62, local64, local10, Static203.anInt3986);
			}
			if (local12 > 0) {
				local79.fillRect(local62, local64, Static512.anInt8242, local12);
			}
			if (local24 > 0) {
				local79.fillRect(Static512.anInt8242 + local62 - local24, local64, local24, Static203.anInt3986);
			}
			if (local32 > 0) {
				local79.fillRect(local62, local64 + Static203.anInt3986 - local32, Static512.anInt8242, local32);
				return;
			}
		} catch (@Pc(128) Exception local128) {
			return;
		}
	}
}
