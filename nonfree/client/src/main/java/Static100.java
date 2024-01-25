import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!dca", name = "f", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_17 = new Class171(61, 7);

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(Lclient!td;I)V")
	public static void method1639(@OriginalArg(0) Class3_Sub5_Sub18 arg0) {
		if (Static532.aBoolean580) {
			return;
		}
		arg0.method9034();
		Static166.anInt3037--;
		if (!arg0.aBoolean642) {
			@Pc(27) long local27 = arg0.aLong258;
			@Pc(33) Class3_Sub5_Sub13 local33;
			for (local33 = (Class3_Sub5_Sub13) Static141.aClass333_12.method7489(local27); local33 != null && !local33.aString79.equals(arg0.aString106); local33 = (Class3_Sub5_Sub13) Static141.aClass333_12.method7484()) {
			}
			if (local33 != null && local33.method5265(arg0)) {
				Static591.method7803(local33);
				return;
			}
			return;
		}
		for (@Pc(64) Class3_Sub5_Sub13 local64 = (Class3_Sub5_Sub13) Static287.aClass243_9.method5459(); local64 != null; local64 = (Class3_Sub5_Sub13) Static287.aClass243_9.method5453()) {
			if (local64.aString79.equals(arg0.aString106)) {
				@Pc(74) boolean local74 = false;
				for (@Pc(80) Class3_Sub5_Sub18 local80 = (Class3_Sub5_Sub18) local64.aClass243_10.method5459(); local80 != null; local80 = (Class3_Sub5_Sub18) local64.aClass243_10.method5453()) {
					if (local80 == arg0) {
						local74 = true;
						if (local64.method5265(arg0)) {
							Static591.method7803(local64);
						}
						break;
					}
				}
				if (local74) {
					return;
				}
			}
		}
	}
}
