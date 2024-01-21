import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class3_Sub1_Sub9 extends Class3_Sub1 {

	@OriginalMember(owner = "client!od", name = "hb", descriptor = "[I")
	private int[] anIntArray237;

	@OriginalMember(owner = "client!od", name = "zb", descriptor = "[I")
	private final int[] anIntArray241 = new int[6];

	@OriginalMember(owner = "client!od", name = "yb", descriptor = "[I")
	private final int[] anIntArray240 = new int[6];

	@OriginalMember(owner = "client!od", name = "Nb", descriptor = "Z")
	public boolean aBoolean138 = false;

	@OriginalMember(owner = "client!od", name = "rb", descriptor = "[I")
	private final int[] anIntArray239 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!od", name = "Db", descriptor = "I")
	public int anInt1800 = -1;

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(B)Lclient!hc;")
	public Class3_Sub1_Sub1_Sub4 method1207() {
		@Pc(7) int local7 = 0;
		@Pc(10) Class3_Sub1_Sub1_Sub4[] local10 = new Class3_Sub1_Sub1_Sub4[5];
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			if (this.anIntArray239[local12] != -1) {
				local10[local7++] = Static41.method789(Static91.aClass64_59, this.anIntArray239[local12]);
			}
		}
		@Pc(43) Class3_Sub1_Sub1_Sub4 local43 = new Class3_Sub1_Sub1_Sub4(local10, local7);
		for (@Pc(45) int local45 = 0; local45 < 6 && this.anIntArray240[local45] != 0; local45++) {
			local43.method771(this.anIntArray240[local45], this.anIntArray241[local45]);
		}
		return local43;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(Z)Z")
	public boolean method1209() {
		@Pc(3) boolean local3 = true;
		for (@Pc(5) int local5 = 0; local5 < 5; local5++) {
			if (this.anIntArray239[local5] != -1 && !Static91.aClass64_59.method1633(this.anIntArray239[local5], 0)) {
				local3 = false;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(B)Lclient!hc;")
	public Class3_Sub1_Sub1_Sub4 method1211() {
		if (this.anIntArray237 == null) {
			return null;
		}
		@Pc(15) Class3_Sub1_Sub1_Sub4[] local15 = new Class3_Sub1_Sub1_Sub4[this.anIntArray237.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray237.length; local17++) {
			local15[local17] = Static41.method789(Static91.aClass64_59, this.anIntArray237[local17]);
		}
		@Pc(50) Class3_Sub1_Sub1_Sub4 local50;
		if (local15.length == 1) {
			local50 = local15[0];
		} else {
			local50 = new Class3_Sub1_Sub1_Sub4(local15, local15.length);
		}
		for (@Pc(58) int local58 = 0; local58 < 6 && this.anIntArray240[local58] != 0; local58++) {
			local50.method771(this.anIntArray240[local58], this.anIntArray241[local58]);
		}
		return local50;
	}

	@OriginalMember(owner = "client!od", name = "g", descriptor = "(I)Z")
	public boolean method1215() {
		if (this.anIntArray237 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray237.length; local20++) {
			if (!Static91.aClass64_59.method1633(this.anIntArray237[local20], 0)) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!gb;II)V")
	private void method1218(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt1800 = arg0.method446();
		} else if (arg1 == 2) {
			@Pc(88) int local88 = arg0.method446();
			this.anIntArray237 = new int[local88];
			for (@Pc(94) int local94 = 0; local94 < local88; local94++) {
				this.anIntArray237[local94] = arg0.method459();
			}
		} else if (arg1 == 3) {
			this.aBoolean138 = true;
		} else if (arg1 >= 40 && arg1 < 50) {
			this.anIntArray240[arg1 - 40] = arg0.method459();
		} else if (arg1 >= 50 && arg1 < 60) {
			this.anIntArray241[arg1 - 50] = arg0.method459();
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray239[arg1 - 60] = arg0.method459();
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BLclient!gb;)V")
	public void method1220(@OriginalArg(1) Class3_Sub4 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method446();
			if (local14 == 0) {
				return;
			}
			this.method1218(arg0, local14);
		}
	}
}
