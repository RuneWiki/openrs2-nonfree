import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!eo", name = "e", descriptor = "Lclient!id;")
	public static final Class142 aClass142_5 = new Class142("", 16);

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(B)V")
	public static void method2284() {
		Static103.anInt992 = 0;
		for (@Pc(9) int local9 = 0; local9 < 2048; local9++) {
			Static294.aClass5_Sub3Array2[local9] = null;
			Static444.aByteArray110[local9] = 1;
			Static543.aClass205Array2[local9] = null;
		}
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)[Lclient!nn;")
	public static Class212[] method2292() {
		return new Class212[] { Static494.aClass212_16, Static517.aClass212_17, Static214.aClass212_9, Static540.aClass212_19, Static118.aClass212_7, Static86.aClass212_5, Static94.aClass212_6, Static155.aClass212_8, Static276.aClass212_14, Static230.aClass212_10, Static206.aClass212_12, Static325.aClass212_15, Static22.aClass212_1, Static67.aClass212_18, Static236.aClass212_11 };
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZLjava/io/File;I[B)V")
	public static void method2293(@OriginalArg(1) File arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(14) DataInputStream local14 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
		try {
			local14.readFully(arg2, 0, arg1);
		} catch (@Pc(26) EOFException local26) {
		}
		local14.close();
	}
}
