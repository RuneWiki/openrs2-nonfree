import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!aia", name = "o", descriptor = "I")
	public static int anInt288;

	@OriginalMember(owner = "client!aia", name = "n", descriptor = "I")
	public static int anInt291;

	@OriginalMember(owner = "client!aia", name = "t", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_7 = new Class186(13, 1);

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(ZLclient!ej;)V")
	public static void method287(@OriginalArg(1) Class3_Sub4_Sub5 arg0) {
		if (Static555.aBoolean678) {
			return;
		}
		arg0.method9446();
		Static285.anInt5168--;
		if (!arg0.aBoolean228) {
			@Pc(27) long local27 = arg0.aLong104;
			@Pc(33) Class3_Sub4_Sub17 local33;
			for (local33 = (Class3_Sub4_Sub17) Static228.aClass136_39.method3503(local27); local33 != null && !local33.aString112.equals(arg0.aString50); local33 = (Class3_Sub4_Sub17) Static228.aClass136_39.method3510()) {
			}
			if (local33 != null && local33.method7230(arg0)) {
				Static507.method7251(local33);
				return;
			}
			return;
		}
		for (@Pc(73) Class3_Sub4_Sub17 local73 = (Class3_Sub4_Sub17) Static555.aClass283_12.method7031(); local73 != null; local73 = (Class3_Sub4_Sub17) Static555.aClass283_12.method7035()) {
			if (local73.aString112.equals(arg0.aString50)) {
				@Pc(85) boolean local85 = false;
				for (@Pc(91) Class3_Sub4_Sub5 local91 = (Class3_Sub4_Sub5) local73.aClass283_10.method7031(); local91 != null; local91 = (Class3_Sub4_Sub5) local73.aClass283_10.method7035()) {
					if (arg0 == local91) {
						local85 = true;
						if (local73.method7230(arg0)) {
							Static507.method7251(local73);
						}
						break;
					}
				}
				if (local85) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "([BLclient!lt;BI)Lclient!mn;")
	public static Class242 method289(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class67_Sub1_Sub2 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(16) int local16 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local16);
		OpenGL.glProgramRawARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static707.anIntArray618, 0);
		if (Static707.anIntArray618[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class242(arg1, 34336, local16);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
