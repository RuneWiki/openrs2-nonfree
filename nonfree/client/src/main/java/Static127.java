import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!fba", name = "H", descriptor = "I")
	public static int anInt2533;

	@OriginalMember(owner = "client!fba", name = "I", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_88 = new Class235(10, -1);

	@OriginalMember(owner = "client!fba", name = "K", descriptor = "I")
	public static int anInt2535 = 0;

	@OriginalMember(owner = "client!fba", name = "g", descriptor = "(I)V")
	public static void method2011() {
		if (Static169.aBoolean229) {
			return;
		}
		Static169.aBoolean229 = true;
		Static305.aBoolean423 = true;
		if (Static348.aClass1_Sub30_Sub1_1.aBoolean383) {
			Static287.aFloat117 = (int) Static287.aFloat117 - 17 & 0xFFFFFFF0;
		} else {
			Static85.aFloat17 += (-Static85.aFloat17 - 12.0F) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IBILclient!pu;)Lclient!lm;")
	public static Class210 method2013(@OriginalArg(0) int arg0, @OriginalArg(3) Class270 arg1) {
		@Pc(14) byte[] local14 = arg1.method5704(arg0, 0);
		return local14 == null ? null : new Class210(local14);
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IILclient!pu;B)Lclient!oq;")
	public static Class1_Sub6_Sub11 method2014(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class270 arg2) {
		@Pc(14) Class1_Sub35 local14 = new Class1_Sub35(arg2.method5704(arg1, arg0));
		@Pc(47) Class1_Sub6_Sub11 local47 = new Class1_Sub6_Sub11(arg0, local14.method5760(), local14.method5760(), local14.method5804(), local14.method5804(), local14.method5750() == 1, local14.method5750(), local14.method5750());
		@Pc(51) int local51 = local14.method5750();
		for (@Pc(53) int local53 = 0; local53 < local51; local53++) {
			local47.aClass353_55.method7679(new Class1_Sub46(local14.method5750(), local14.method5771(), local14.method5771(), local14.method5771(), local14.method5771(), local14.method5771(), local14.method5771(), local14.method5771(), local14.method5771()));
		}
		local47.method5340();
		return local47;
	}
}
