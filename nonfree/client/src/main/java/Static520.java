import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static520 {

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(IIB)V")
	public static void method7443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class6_Sub5_Sub19 local8 = Static348.method5721(arg0, 13);
		local8.method5179();
		local8.anInt6198 = arg1;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!ni;)I")
	public static int method7445(@OriginalArg(1) Class223 arg0) {
		@Pc(10) int local10 = 0;
		if (arg0.method5951(Static1.anInt7049)) {
			local10++;
		}
		if (arg0.method5951(Static272.anInt5805)) {
			local10++;
		}
		if (arg0.method5951(Static125.anInt3109)) {
			local10++;
		}
		if (arg0.method5951(Static461.anInt8259)) {
			local10++;
		}
		if (arg0.method5951(Static441.anInt7979)) {
			local10++;
		}
		if (arg0.method5951(Static551.anInt9474)) {
			local10++;
		}
		if (arg0.method5951(Static168.anInt3760)) {
			local10++;
		}
		if (arg0.method5951(Static402.anInt7481)) {
			local10++;
		}
		if (arg0.method5951(Static77.anInt6024)) {
			local10++;
		}
		if (arg0.method5951(Static97.anInt2777)) {
			local10++;
		}
		if (arg0.method5951(Static430.anInt7862)) {
			local10++;
		}
		if (arg0.method5951(Static621.anInt10458)) {
			local10++;
		}
		if (arg0.method5951(Static140.anInt3331)) {
			local10++;
		}
		if (arg0.method5951(Static222.anInt5008)) {
			local10++;
		}
		if (arg0.method5951(Static466.anInt8306)) {
			local10++;
		}
		if (arg0.method5951(Static144.anInt10674)) {
			local10++;
		}
		return local10;
	}
}
