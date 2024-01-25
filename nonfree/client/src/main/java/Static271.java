import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!jba", name = "T", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger4 = new BigInteger("91656ea42ff687c97c2d48a39a16c2fae5f76fc2d32c88d9c402243478e7cf6e8d12b77f8010c29deee5b770727c7e16e39ae0367145bede97ca6bbbbc60b2b1", 16);

	@OriginalMember(owner = "client!jba", name = "nb", descriptor = "[[F")
	public static final float[][] aFloatArrayArray9 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!jba", name = "Ab", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_79 = new Class216(57, 4);

	@OriginalMember(owner = "client!jba", name = "j", descriptor = "(I)V")
	public static void method3929() {
		if (Static407.aFrame5 != null) {
			return;
		}
		@Pc(15) int local15 = Static661.anInt9530;
		@Pc(17) int local17 = Static435.anInt6854;
		@Pc(24) int local24 = Static553.anInt8551 - Static632.anInt9867 - local15;
		@Pc(31) int local31 = Static599.anInt9215 - local17 - Static357.anInt5421;
		if (local15 <= 0 && local24 <= 0 && local17 <= 0 && local31 <= 0) {
			return;
		}
		try {
			@Pc(51) Container local51;
			if (Static280.aFrame10 != null) {
				local51 = Static280.aFrame10;
			} else if (Static649.anApplet2 == null) {
				local51 = Static333.anApplet_Sub1_1;
			} else {
				local51 = Static649.anApplet2;
			}
			@Pc(61) int local61 = 0;
			@Pc(63) int local63 = 0;
			if (local51 == Static280.aFrame10) {
				@Pc(69) Insets local69 = Static280.aFrame10.getInsets();
				local63 = local69.top;
				local61 = local69.left;
			}
			@Pc(78) Graphics local78 = local51.getGraphics();
			local78.setColor(Color.black);
			if (local15 > 0) {
				local78.fillRect(local61, local63, local15, Static599.anInt9215);
			}
			if (local17 > 0) {
				local78.fillRect(local61, local63, Static553.anInt8551, local17);
			}
			if (local24 > 0) {
				local78.fillRect(local61 + Static553.anInt8551 - local24, local63, local24, Static599.anInt9215);
			}
			if (local31 > 0) {
				local78.fillRect(local61, local63 + Static599.anInt9215 - local31, Static553.anInt8551, local31);
				return;
			}
		} catch (@Pc(127) Exception local127) {
			return;
		}
	}

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "(II)Lclient!cf;")
	public static Class22_Sub1 method3931(@OriginalArg(0) int arg0) {
		return Static502.aBoolean618 && arg0 >= Static288.anInt4570 && Static362.anInt5464 >= arg0 ? Static659.aClass22_Sub1Array2[arg0 - Static288.anInt4570] : null;
	}
}
