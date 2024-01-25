import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!qt", name = "i", descriptor = "F")
	public static float aFloat207;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method6383(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			for (@Pc(29) long local29 = arg0; local29 != 0L; local29 /= 37L) {
				local27++;
			}
			@Pc(48) StringBuffer local48 = new StringBuffer(local27);
			while (arg0 != 0L) {
				@Pc(52) long local52 = arg0;
				arg0 /= 37L;
				local48.append(Static386.aCharArray9[(int) (local52 - arg0 * 37L)]);
			}
			return local48.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(II[BLjava/io/File;)V")
	public static void method6384(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) File arg2) throws IOException {
		@Pc(14) DataInputStream local14 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg2)));
		try {
			local14.readFully(arg1, 0, arg0);
		} catch (@Pc(21) EOFException local21) {
		}
		local14.close();
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)V")
	public static void method6385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class262 local7 = Static399.aClass262ArrayArrayArray2[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class262 local28 = Static399.aClass262ArrayArrayArray2[local9][arg0][arg1] = Static399.aClass262ArrayArrayArray2[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte98--;
				for (@Pc(40) Class187 local40 = local28.aClass187_3; local40 != null; local40 = local40.aClass187_1) {
					@Pc(44) Class1_Sub1 local44 = local40.aClass1_Sub1_1;
					if (local44.aShort127 == arg0 && local44.aShort128 == arg1) {
						local44.aByte90--;
					}
				}
			}
		}
		if (Static399.aClass262ArrayArrayArray2[0][arg0][arg1] == null) {
			Static399.aClass262ArrayArrayArray2[0][arg0][arg1] = new Class262(0, arg0, arg1);
			Static399.aClass262ArrayArrayArray2[0][arg0][arg1].aByte96 = 1;
		}
		Static399.aClass262ArrayArrayArray2[0][arg0][arg1].aClass262_1 = local7;
		Static399.aClass262ArrayArrayArray2[3][arg0][arg1] = null;
	}
}
