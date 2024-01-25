import jaggl.OpenGL;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!os", name = "b", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_106 = new Class90(96, 6);

	@OriginalMember(owner = "client!os", name = "a", descriptor = "([Lclient!sk;BLclient!ad;)Lclient!ig;")
	public static Class148 method5954(@OriginalArg(0) Class304[] arg0, @OriginalArg(2) Class7_Sub1_Sub1 arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			if (arg0[local12] == null || arg0[local12].aLong255 <= 0L) {
				return null;
			}
		}
		@Pc(40) long local40 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(42) int local42 = 0; local42 < arg0.length; local42++) {
			OpenGL.glAttachObjectARB(local40, arg0[local42].aLong255);
		}
		OpenGL.glLinkProgramARB(local40);
		OpenGL.glGetObjectParameterivARB(local40, 35714, Static363.anIntArray390, 0);
		if (Static363.anIntArray390[0] == 0) {
			if (Static363.anIntArray390[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local40, 35716, Static363.anIntArray390, 1);
			if (Static363.anIntArray390[1] > 1) {
				@Pc(100) byte[] local100 = new byte[Static363.anIntArray390[1]];
				OpenGL.glGetInfoLogARB(local40, Static363.anIntArray390[1], Static363.anIntArray390, 0, local100, 0);
				System.out.println(new String(local100));
			}
			if (Static363.anIntArray390[0] == 0) {
				for (@Pc(121) int local121 = 0; local121 < arg0.length; local121++) {
					OpenGL.glDetachObjectARB(local40, arg0[local121].aLong255);
				}
				OpenGL.glDeleteObjectARB(local40);
				return null;
			}
		}
		return new Class148(arg1, local40, arg0);
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(I)V")
	public static void method5956() {
		@Pc(10) int local10 = Static455.aClass4_Sub35_Sub1_1.method7623(Static453.anInt8614);
		if (local10 == 0) {
			Static159.aByteArrayArrayArray3 = null;
			Static19.method825(0);
		} else if (local10 == 1) {
			Static593.method8262((byte) 0);
			Static19.method825(512);
			if (Static266.aByteArrayArrayArray10 != null) {
				Static508.method7318();
			}
		} else {
			Static593.method8262((byte) (Static70.anInt1864 - 4 & 0xFF));
			Static19.method825(2);
		}
		Static485.anInt9202 = Static352.anInt6764;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!wv;ILjava/awt/Frame;)V")
	public static void method5958(@OriginalArg(0) Class366 arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(11) Class316 local11 = arg0.method8271(arg1);
			while (local11.anInt9478 == 0) {
				Static214.method3478(10L);
			}
			if (local11.anInt9478 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static214.method3478(100L);
		}
	}

	@OriginalMember(owner = "client!os", name = "c", descriptor = "(I)[Lclient!kq;")
	public static Class184[] method5960() {
		return new Class184[] { Static462.aClass184_12, Static257.aClass184_8, Static360.aClass184_10, Static317.aClass184_9, Static418.aClass184_11, Static201.aClass184_6, Static470.aClass184_13, Static198.aClass184_5, Static542.aClass184_14, Static132.aClass184_3 };
	}
}
