import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
	public static int anInt6416;

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "F")
	public static float aFloat135 = 1.0F;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
	public static void method5711() {
		@Pc(7) client local7 = Static200.aClient1;
		synchronized (Static200.aClient1) {
			if (Static442.aFrame3 == null) {
				@Pc(26) Container local26;
				if (Static380.aFrame2 != null) {
					local26 = Static380.aFrame2;
				} else if (Static124.anApplet1 == null) {
					local26 = Static95.anApplet_Sub1_1;
				} else {
					local26 = Static124.anApplet1;
				}
				Static512.anInt8242 = local26.getSize().width;
				Static203.anInt3986 = local26.getSize().height;
				@Pc(48) Insets local48;
				if (Static380.aFrame2 == local26) {
					local48 = Static380.aFrame2.getInsets();
					Static512.anInt8242 -= local48.left + local48.right;
					Static203.anInt3986 -= local48.top + local48.bottom;
				}
				if (Static673.method9353() == 1) {
					Static222.anInt4196 = Static602.anInt9666;
					Static312.anInt5191 = Static33.anInt10742;
					Static282.anInt4895 = (Static512.anInt8242 - Static33.anInt10742) / 2;
					Static270.anInt4747 = 0;
				} else {
					Static34.method901();
				}
				if (Static202.aClass147_5 != Static487.aClass147_8) {
					@Pc(98) boolean local98;
					if (Static312.anInt5191 < 1024 && Static222.anInt4196 < 768) {
						local98 = true;
					} else {
						local98 = false;
					}
				}
				Static126.aCanvas6.setSize(Static312.anInt5191, Static222.anInt4196);
				if (Static674.aClass13_22 != null) {
					if (Static82.aBoolean134) {
						Static651.method9018(Static126.aCanvas6);
					} else {
						Static674.aClass13_22.method8445(Static126.aCanvas6, Static312.anInt5191, Static222.anInt4196);
					}
				}
				if (local26 == Static380.aFrame2) {
					local48 = Static380.aFrame2.getInsets();
					Static126.aCanvas6.setLocation(local48.left + Static282.anInt4895, Static270.anInt4747 + local48.top);
				} else {
					Static126.aCanvas6.setLocation(Static282.anInt4895, Static270.anInt4747);
				}
				if (Static110.anInt2265 != -1) {
					Static198.method9275(true);
				}
				Static633.method8836();
			}
		}
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(III)V")
	public static void method5712(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class3_Sub11_Sub4 local13 = Static583.method8201(5, (long) arg0);
		local13.method2195();
		local13.anInt2394 = arg1;
	}
}
