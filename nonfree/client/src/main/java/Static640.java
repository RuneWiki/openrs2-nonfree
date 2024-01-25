import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static640 {

	@OriginalMember(owner = "client!via", name = "e", descriptor = "I")
	public static int anInt10686 = 0;

	@OriginalMember(owner = "client!via", name = "e", descriptor = "(I)V")
	public static void method8765() {
		for (@Pc(15) Class3_Sub5_Sub21 local15 = (Class3_Sub5_Sub21) Static204.aClass302_20.method6603(); local15 != null; local15 = (Class3_Sub5_Sub21) Static204.aClass302_20.method6605()) {
			@Pc(20) Class34_Sub1_Sub1_Sub5 local20 = local15.aClass34_Sub1_Sub1_Sub5_1;
			if (local20.aBoolean633) {
				local15.method9034();
				local20.method7380();
			} else if (Static122.anInt2190 >= local20.anInt9041) {
				local20.method7382(Static281.anInt4774);
				if (local20.aBoolean633) {
					local15.method9034();
				} else {
					Static92.method1530(local20, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(I[BLjava/io/File;I)V")
	public static void method8766(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(14) DataInputStream local14 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
		try {
			local14.readFully(arg0, 0, arg2);
		} catch (@Pc(21) EOFException local21) {
		}
		local14.close();
	}
}
