import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!hu", name = "v", descriptor = "[I")
	public static int[] anIntArray236;

	@OriginalMember(owner = "client!hu", name = "u", descriptor = "I")
	public static int anInt3819 = -1;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIII)I")
	public static int method3365(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return arg2;
		} else if (local7 == 2) {
			return 4095 - arg1;
		} else {
			return 4095 - arg2;
		}
	}

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "(I)I")
	public static int method3366() {
		@Pc(12) int local12 = Static382.aClass247_2.method5877();
		if (Static127.aClass247Array1.length - 1 > local12) {
			Static382.aClass247_2 = Static127.aClass247Array1[local12 + 1];
		}
		return 100;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(III)Z")
	public static boolean method3368(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static443.method6611(arg0, arg1) & Static416.method6121(arg0, arg1);
	}

	@OriginalMember(owner = "client!hu", name = "e", descriptor = "(I)Lclient!mfa;")
	public static Class5_Sub36 method3369() {
		@Pc(7) Class281 local7 = null;
		@Pc(18) Class5_Sub36 local18 = new Class5_Sub36(Static591.aClass174_7, 0);
		try {
			@Pc(24) Class297 local24 = Static150.aClass202_2.method4733("");
			while (local24.anInt8459 == 0) {
				Static127.method1985(1L);
			}
			if (local24.anInt8459 == 1) {
				local7 = (Class281) local24.anObject15;
				@Pc(51) byte[] local51 = new byte[(int) local7.method6898()];
				@Pc(66) int local66;
				for (@Pc(53) int local53 = 0; local53 < local51.length; local53 += local66) {
					local66 = local7.method6895(local51, local51.length - local53, local53);
					if (local66 == -1) {
						throw new IOException("EOF");
					}
				}
				local18 = new Class5_Sub36(new Class5_Sub15(local51), Static591.aClass174_7, 0);
			}
		} catch (@Pc(98) Exception local98) {
		}
		try {
			if (local7 != null) {
				local7.method6893();
			}
		} catch (@Pc(105) Exception local105) {
		}
		return local18;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILjava/io/File;I[B)V")
	public static void method3370(@OriginalArg(1) File arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(19) DataInputStream local19 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
		try {
			local19.readFully(arg2, 0, arg1);
		} catch (@Pc(26) EOFException local26) {
		}
		local19.close();
	}
}
