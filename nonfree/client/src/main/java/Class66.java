import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class66 {

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!gm", name = "h", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!gm", name = "j", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!gm", name = "o", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!gm", name = "q", descriptor = "[I")
	private int[] anIntArray142;

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "[I")
	private int[] anIntArray141 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!gm", name = "n", descriptor = "Z")
	public boolean aBoolean138 = false;

	@OriginalMember(owner = "client!gm", name = "m", descriptor = "I")
	public int anInt1768 = -1;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)Z")
	public boolean method1369() {
		if (this.anIntArray142 == null) {
			return true;
		}
		@Pc(22) boolean local22 = true;
		for (@Pc(24) int local24 = 0; local24 < this.anIntArray142.length; local24++) {
			if (!Static5.aClass138_2.method3362(0, this.anIntArray142[local24])) {
				local22 = false;
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)Z")
	public boolean method1370() {
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
			if (this.anIntArray141[local14] != -1 && !Static5.aClass138_2.method3362(0, this.anIntArray141[local14])) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Z)Lclient!tk;")
	public Class22_Sub7 method1371() {
		if (this.anIntArray142 == null) {
			return null;
		}
		@Pc(15) Class22_Sub7[] local15 = new Class22_Sub7[this.anIntArray142.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray142.length; local17++) {
			local15[local17] = Static275.method4085(Static5.aClass138_2, this.anIntArray142[local17]);
		}
		@Pc(50) Class22_Sub7 local50;
		if (local15.length == 1) {
			local50 = local15[0];
		} else {
			local50 = new Class22_Sub7(local15, local15.length);
		}
		@Pc(63) int local63;
		if (this.aShortArray20 != null) {
			for (local63 = 0; local63 < this.aShortArray20.length; local63++) {
				local50.method4080(this.aShortArray20[local63], this.aShortArray19[local63]);
			}
		}
		if (this.aShortArray16 != null) {
			for (local63 = 0; local63 < this.aShortArray16.length; local63++) {
				local50.method4078(this.aShortArray16[local63], this.aShortArray18[local63]);
			}
		}
		return local50;
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(Z)Lclient!tk;")
	public Class22_Sub7 method1372() {
		@Pc(15) Class22_Sub7[] local15 = new Class22_Sub7[5];
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < 5; local19++) {
			if (this.anIntArray141[local19] != -1) {
				local15[local17++] = Static275.method4085(Static5.aClass138_2, this.anIntArray141[local19]);
			}
		}
		@Pc(51) Class22_Sub7 local51 = new Class22_Sub7(local15, local17);
		@Pc(56) int local56;
		if (this.aShortArray20 != null) {
			for (local56 = 0; local56 < this.aShortArray20.length; local56++) {
				local51.method4080(this.aShortArray20[local56], this.aShortArray19[local56]);
			}
		}
		if (this.aShortArray16 != null) {
			for (local56 = 0; local56 < this.aShortArray16.length; local56++) {
				local51.method4078(this.aShortArray16[local56], this.aShortArray18[local56]);
			}
		}
		return local51;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!sb;I)V")
	public void method1373(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2595();
			if (local5 == 0) {
				return;
			}
			this.method1375(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!sb;II)V")
	private void method1375(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1768 = arg0.method2595();
			return;
		}
		@Pc(26) int local26;
		@Pc(32) int local32;
		if (arg1 == 2) {
			local26 = arg0.method2595();
			this.anIntArray142 = new int[local26];
			for (local32 = 0; local32 < local26; local32++) {
				this.anIntArray142[local32] = arg0.method2593();
			}
		} else if (arg1 == 3) {
			this.aBoolean138 = true;
		} else if (arg1 == 40) {
			local26 = arg0.method2595();
			this.aShortArray19 = new short[local26];
			this.aShortArray20 = new short[local26];
			for (local32 = 0; local32 < local26; local32++) {
				this.aShortArray20[local32] = (short) arg0.method2593();
				this.aShortArray19[local32] = (short) arg0.method2593();
			}
		} else if (arg1 == 41) {
			local26 = arg0.method2595();
			this.aShortArray18 = new short[local26];
			this.aShortArray16 = new short[local26];
			for (local32 = 0; local32 < local26; local32++) {
				this.aShortArray16[local32] = (short) arg0.method2593();
				this.aShortArray18[local32] = (short) arg0.method2593();
			}
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray141[arg1 - 60] = arg0.method2593();
		}
	}
}
