import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static664 {

	@OriginalMember(owner = "client!wk", name = "O", descriptor = "[Lclient!fw;")
	public static final Class113[] aClass113Array1 = new Class113[6];

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!ha;ILclient!gga;)V")
	public static void method9702(@OriginalArg(0) Class101 arg0, @OriginalArg(2) Class124 arg1) {
		@Pc(10) Class67[] local10 = Static676.method1697(arg1, Static430.anInt7883);
		Static533.aClass71Array36 = new Class71[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static533.aClass71Array36[local16] = arg0.method8063(local10[local16], true);
		}
		local10 = Static676.method1697(arg1, Static131.anInt2514);
		Static668.aClass71Array47 = new Class71[local10.length];
		for (@Pc(47) int local47 = 0; local47 < local10.length; local47++) {
			Static668.aClass71Array47[local47] = arg0.method8063(local10[local47], true);
		}
		local10 = Static676.method1697(arg1, Static264.anInt5018);
		Static386.aClass71Array32 = new Class71[local10.length];
		for (@Pc(74) int local74 = 0; local74 < local10.length; local74++) {
			Static386.aClass71Array32[local74] = arg0.method8063(local10[local74], true);
		}
		local10 = Static676.method1697(arg1, Static225.anInt4595);
		Static665.aClass71Array46 = new Class71[local10.length];
		for (@Pc(105) int local105 = 0; local105 < local10.length; local105++) {
			Static665.aClass71Array46[local105] = arg0.method8063(local10[local105], true);
		}
		local10 = Static676.method1697(arg1, Static436.anInt7944);
		Static277.aClass71Array48 = new Class71[local10.length];
		for (@Pc(136) int local136 = 0; local136 < local10.length; local136++) {
			Static277.aClass71Array48[local136] = arg0.method8063(local10[local136], true);
		}
		local10 = Static676.method1697(arg1, Static296.anInt5398);
		Static200.aClass71Array21 = new Class71[local10.length];
		for (@Pc(167) int local167 = 0; local167 < local10.length; local167++) {
			Static200.aClass71Array21[local167] = arg0.method8063(local10[local167], true);
		}
		local10 = Static676.method1697(arg1, Static286.anInt5255);
		Static249.aClass71Array24 = new Class71[local10.length];
		for (@Pc(198) int local198 = 0; local198 < local10.length; local198++) {
			Static249.aClass71Array24[local198] = arg0.method8063(local10[local198], true);
		}
		local10 = Static676.method1697(arg1, Static382.anInt10556);
		Static385.aClass71Array31 = new Class71[local10.length];
		for (@Pc(225) int local225 = 0; local225 < local10.length; local225++) {
			Static385.aClass71Array31[local225] = arg0.method8063(local10[local225], true);
		}
		local10 = Static676.method1697(arg1, Static645.anInt10073);
		Static638.aClass71Array44 = new Class71[local10.length];
		for (@Pc(257) int local257 = 0; local257 < local10.length; local257++) {
			Static638.aClass71Array44[local257] = arg0.method8063(local10[local257], true);
		}
		local10 = Static676.method1697(arg1, Static12.anInt184);
		Static14.aClass71Array35 = new Class71[local10.length];
		for (@Pc(288) int local288 = 0; local288 < local10.length; local288++) {
			Static14.aClass71Array35[local288] = arg0.method8063(local10[local288], true);
		}
		local10 = Static676.method1697(arg1, Static423.anInt7781);
		Class15_Sub3_Sub4_Sub2.lb = new Class71[local10.length];
		for (@Pc(315) int local315 = 0; local315 < local10.length; local315++) {
			Class15_Sub3_Sub4_Sub2.lb[local315] = arg0.method8063(local10[local315], true);
		}
		local10 = Static676.method1697(arg1, Static20.anInt357);
		Static622.aClass71Array42 = new Class71[local10.length];
		for (@Pc(346) int local346 = 0; local346 < local10.length; local346++) {
			Static622.aClass71Array42[local346] = arg0.method8063(local10[local346], true);
		}
		Static58.aClass71_3 = arg0.method8063(Static676.method1693(arg1, Static488.anInt8754, 0), true);
		Static310.aClass71_10 = arg0.method8063(Static676.method1693(arg1, Static233.anInt4655, 0), true);
		local10 = Static676.method1697(arg1, Static91.anInt1669);
		Static591.aClass71Array40 = new Class71[local10.length];
		for (@Pc(393) int local393 = 0; local393 < local10.length; local393++) {
			Static591.aClass71Array40[local393] = arg0.method8063(local10[local393], true);
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(BLclient!kja;)I")
	public static int method9704(@OriginalArg(1) Class2_Sub8_Sub2 arg0) {
		@Pc(17) int local17 = arg0.method5233(2);
		@Pc(21) int local21;
		if (local17 == 0) {
			local21 = 0;
		} else if (local17 == 1) {
			local21 = arg0.method5233(5);
		} else if (local17 == 2) {
			local21 = arg0.method5233(8);
		} else {
			local21 = arg0.method5233(11);
		}
		return local21;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method9705(@OriginalArg(0) String arg0) {
		return Static254.method4440(arg0);
	}
}
