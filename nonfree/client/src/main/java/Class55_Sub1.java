import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class55_Sub1 extends Class55 implements Interface18 {

	@OriginalMember(owner = "client!cc", name = "C", descriptor = "[C")
	private static final char[] aCharArray1 = new char[64];

	static {
		for (@Pc(51) int local51 = 0; local51 < 26; local51++) {
			aCharArray1[local51] = (char) (local51 + 65);
		}
		for (@Pc(65) int local65 = 26; local65 < 52; local65++) {
			aCharArray1[local65] = (char) (local65 + 97 - 26);
		}
		for (@Pc(83) int local83 = 52; local83 < 62; local83++) {
			aCharArray1[local83] = (char) (local83 + 48 - 52);
		}
		aCharArray1[63] = '/';
		aCharArray1[62] = '+';
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!mba;IZ[[I)V")
	public Class55_Sub1(@OriginalArg(0) Class145_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static165.aClass295_6, Static243.aClass158_10, arg1 * arg1 * 6, arg2);
		super.aClass145_Sub1_Sub1_10.method9754(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method7821(arg1, arg1, local22 + 34069, arg3[local22]);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method7823(), arg1, arg1, 0, Static685.method9235(super.aClass295_13), super.aClass145_Sub1_Sub1_10.anInt6414, arg3[local22], 0);
			}
		}
	}
}
