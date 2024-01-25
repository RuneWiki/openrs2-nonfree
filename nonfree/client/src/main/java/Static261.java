import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!kv", name = "g", descriptor = "Lclient!fo;")
	public static final Class91 aClass91_14 = new Class91(3, 7);

	@OriginalMember(owner = "client!kv", name = "h", descriptor = "I")
	public static int anInt4671 = 0;

	@OriginalMember(owner = "client!kv", name = "m", descriptor = "I")
	public static int anInt4675 = 500;

	@OriginalMember(owner = "client!kv", name = "p", descriptor = "[I")
	public static int[] anIntArray438 = new int[2];

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IILclient!cd;)V")
	public static void method4057(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub2 arg1) {
		@Pc(12) int local12 = -1;
		@Pc(14) int local14 = 0;
		if (arg1.anInt5068 > Static115.anInt2326) {
			Static386.method5998(arg1);
		} else if (Static115.anInt2326 > arg1.anInt5033) {
			Static397.method6346(arg1, false);
			local14 = Static484.anInt8591;
			local12 = Static38.anInt735;
		} else {
			Static72.method1457(arg1);
		}
		if (arg1.anInt7660 < 128 || arg1.anInt7659 < 128 || arg1.anInt7660 >= (Static363.anInt1158 - 1) * 128 || Static511.anInt8889 * 128 - 128 <= arg1.anInt7659) {
			local12 = -1;
			arg1.anInt5060 = -1;
			arg1.anInt5051 = -1;
			arg1.anInt5097 = -1;
			arg1.anInt5068 = 0;
			arg1.anInt5033 = 0;
			local14 = 0;
			arg1.anInt7660 = arg1.anIntArray450[0] * 128 + arg1.method4394() * 64;
			arg1.anInt7659 = arg1.anIntArray449[0] * 128 + arg1.method4394() * 64;
			arg1.method4390();
		}
		if (Static266.aClass1_Sub1_Sub2_Sub1_1 == arg1 && (arg1.anInt7660 < 1536 || arg1.anInt7659 < 1536 || arg1.anInt7660 >= Static363.anInt1158 * 128 - 1536 || arg1.anInt7659 >= Static511.anInt8889 * 128 - 1536)) {
			arg1.anInt5097 = -1;
			arg1.anInt5051 = -1;
			arg1.anInt5068 = 0;
			arg1.anInt5060 = -1;
			local12 = -1;
			local14 = 0;
			arg1.anInt5033 = 0;
			arg1.anInt7660 = arg1.anIntArray450[0] * 128 + arg1.method4394() * 64;
			arg1.anInt7659 = arg1.anIntArray449[0] * 128 + arg1.method4394() * 64;
			arg1.method4390();
		}
		@Pc(209) int local209 = Static376.method5914(arg1);
		Static214.method3911(local14, local209, local12, arg1);
		Static111.method2162(arg1);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIB)Z")
	public static boolean method4058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!hca;I)V")
	public static void method4060(@OriginalArg(0) Class1_Sub1_Sub2_Sub1 arg0) {
		@Pc(11) Class2_Sub46 local11 = (Class2_Sub46) Static92.aClass127_16.method3205((long) arg0.anInt5076);
		if (local11 == null) {
			Static141.method7492(arg0.anIntArray449[0], arg0, 0, null, arg0.aByte90, arg0.anIntArray450[0], null);
		} else {
			local11.method7509();
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IZLjava/lang/String;Ljava/awt/Color;ILjava/awt/Color;Ljava/awt/Color;)V")
	public static void method4061(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Color arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Color arg4, @OriginalArg(6) Color arg5) {
		try {
			@Pc(2) Graphics local2 = Static517.aCanvas14.getGraphics();
			if (Static504.aFont1 == null) {
				Static504.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg0) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static461.anInt8348, Static223.anInt3996);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(140, 17, 17);
			}
			if (arg5 == null) {
				arg5 = new Color(255, 255, 255);
			}
			try {
				if (Static87.anImage1 == null) {
					Static87.anImage1 = Static517.aCanvas14.createImage(304, 34);
				}
				@Pc(59) Graphics local59 = Static87.anImage1.getGraphics();
				local59.setColor(arg4);
				local59.drawRect(0, 0, 303, 33);
				local59.setColor(arg2);
				local59.fillRect(2, 2, arg3 * 3, 30);
				local59.setColor(Color.black);
				local59.drawRect(1, 1, 301, 31);
				local59.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
				local59.setFont(Static504.aFont1);
				local59.setColor(arg5);
				local59.drawString(arg1, (304 - arg1.length() * 6) / 2, 22);
				local2.drawImage(Static87.anImage1, Static461.anInt8348 / 2 - 152, Static223.anInt3996 / 2 + -18, null);
			} catch (@Pc(137) Exception local137) {
				@Pc(143) int local143 = Static461.anInt8348 / 2 - 152;
				@Pc(149) int local149 = Static223.anInt3996 / 2 - 18;
				local2.setColor(arg4);
				local2.drawRect(0, 0, 303, 33);
				local2.setColor(arg2);
				local2.fillRect(local143 + 2, local149 - -2, arg3 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local143 + 1, local149 + 1, 301, 31);
				local2.fillRect(arg3 * 3 + local143 + 2, local149 + 2, 300 - arg3 * 3, 30);
				local2.setFont(Static504.aFont1);
				local2.setColor(arg5);
				local2.drawString(arg1, local143 + (304 - arg1.length() * 6) / 2, local149 + 22);
			}
			if (Static219.aString214 != null) {
				local2.setFont(Static504.aFont1);
				local2.setColor(arg5);
				local2.drawString(Static219.aString214, Static461.anInt8348 / 2 - Static219.aString214.length() * 6 / 2, Static223.anInt3996 / 2 + -26);
			}
		} catch (@Pc(255) Exception local255) {
			Static517.aCanvas14.repaint();
		}
	}
}
