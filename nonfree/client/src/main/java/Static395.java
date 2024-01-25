import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/io/File;I[BI)V")
	public static void method6123(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(14) DataInputStream local14 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
		try {
			local14.readFully(arg1, 0, arg2);
		} catch (@Pc(21) EOFException local21) {
		}
		local14.close();
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIILclient!og;Lclient!og;)V")
	public static void method6124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class14_Sub1_Sub3 arg3, @OriginalArg(4) Class14_Sub1_Sub3 arg4) {
		@Pc(4) Class156 local4 = Static503.method3567(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass14_Sub1_Sub3_1 = arg3;
		local4.aClass14_Sub1_Sub3_2 = arg4;
		@Pc(19) int local19 = Static299.aClass40Array1 == Static327.aClass40Array2 ? 1 : 0;
		if (!arg3.method7998()) {
			arg3.aClass14_Sub1_22 = Static469.aClass14_Sub1Array5[local19];
			Static469.aClass14_Sub1Array5[local19] = arg3;
		} else if (arg3.method7987()) {
			arg3.aClass14_Sub1_22 = Static151.aClass14_Sub1Array1[local19];
			Static151.aClass14_Sub1Array1[local19] = arg3;
		} else {
			arg3.aClass14_Sub1_22 = Static250.aClass14_Sub1Array2[local19];
			Static250.aClass14_Sub1Array2[local19] = arg3;
			Static367.aBoolean541 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method7998()) {
			if (arg4.method7987()) {
				arg4.aClass14_Sub1_22 = Static151.aClass14_Sub1Array1[local19];
				Static151.aClass14_Sub1Array1[local19] = arg4;
				return;
			}
			arg4.aClass14_Sub1_22 = Static250.aClass14_Sub1Array2[local19];
			Static250.aClass14_Sub1Array2[local19] = arg4;
			Static367.aBoolean541 = true;
			return;
		}
		arg4.aClass14_Sub1_22 = Static469.aClass14_Sub1Array5[local19];
		Static469.aClass14_Sub1Array5[local19] = arg4;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIILclient!bk;)V")
	public static void method6125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class35 arg4) {
		@Pc(7) Class5_Sub35 local7 = null;
		for (@Pc(12) Class5_Sub35 local12 = (Class5_Sub35) Static498.aClass306_55.method7313(); local12 != null; local12 = (Class5_Sub35) Static498.aClass306_55.method7301()) {
			if (local12.anInt6492 == arg0 && local12.anInt6495 == arg1 && arg3 == local12.anInt6497 && arg2 == local12.anInt6493) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class5_Sub35();
			local7.anInt6495 = arg1;
			local7.anInt6493 = arg2;
			local7.anInt6492 = arg0;
			local7.anInt6497 = arg3;
			Static498.aClass306_55.method7303(local7);
		}
		local7.aClass35_2 = arg4;
		local7.aBoolean539 = true;
		local7.aBoolean540 = false;
	}
}
