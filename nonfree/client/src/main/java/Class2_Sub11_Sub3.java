import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class2_Sub11_Sub3 extends Class2_Sub11 {

	@OriginalMember(owner = "client!fo", name = "E", descriptor = "[[I")
	private int[][] anIntArrayArray64;

	@OriginalMember(owner = "client!fo", name = "F", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13;

	@OriginalMember(owner = "client!fo", name = "O", descriptor = "[I")
	private int[] anIntArray208;

	@OriginalMember(owner = "client!fo", name = "T", descriptor = "[I")
	public int[] anIntArray209;

	@OriginalMember(owner = "client!fo", name = "L", descriptor = "Z")
	public boolean aBoolean179 = true;

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(Lclient!dg;I)Ljava/lang/String;")
	public String method2126(@OriginalArg(0) Class2_Sub10 arg0) {
		@Pc(15) StringBuffer local15 = new StringBuffer(80);
		if (this.anIntArray208 != null) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray208.length; local20++) {
				local15.append(this.aStringArray13[local20]);
				local15.append(Static230.method4019(this.anIntArray208[local20], this.anIntArrayArray64[local20], arg0.method4419(Static225.anIntArray342[this.anIntArray208[local20]])));
			}
		}
		local15.append(this.aStringArray13[this.aStringArray13.length - 1]);
		return local15.toString();
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IBLclient!dg;)V")
	private void method2127(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub10 arg1) {
		if (arg0 == 1) {
			this.aStringArray13 = Static336.method5829(arg1.method4409(), '<');
			return;
		}
		@Pc(28) int local28;
		@Pc(38) int local38;
		if (arg0 == 2) {
			local28 = arg1.method4421();
			this.anIntArray209 = new int[local28];
			for (local38 = 0; local38 < local28; local38++) {
				this.anIntArray209[local38] = arg1.method4464();
			}
		} else if (arg0 == 3) {
			local28 = arg1.method4421();
			this.anIntArray208 = new int[local28];
			this.anIntArrayArray64 = new int[local28][];
			for (local38 = 0; local38 < local28; local38++) {
				@Pc(44) int local44 = arg1.method4464();
				this.anIntArray208[local38] = local44;
				this.anIntArrayArray64[local38] = new int[Static287.anIntArray422[local44]];
				for (@Pc(59) int local59 = 0; local59 < Static287.anIntArray422[local44]; local59++) {
					this.anIntArrayArray64[local38][local59] = arg1.method4464();
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean179 = false;
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILclient!dg;[I)V")
	public void method2128(@OriginalArg(1) Class2_Sub10 arg0, @OriginalArg(2) int[] arg1) {
		if (this.anIntArray208 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray208.length; local17++) {
			if (local17 >= arg1.length) {
				return;
			}
			@Pc(26) int local26 = Static54.anIntArray98[this.method2132(local17)];
			if (local26 > 0) {
				arg0.method4455(local26, (long) arg1[local17]);
			}
		}
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(Z)I")
	public int method2129() {
		return this.anIntArray208 == null ? 0 : this.anIntArray208.length;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IB)I")
	public int method2132(@OriginalArg(0) int arg0) {
		return this.anIntArray208 == null || arg0 < 0 || this.anIntArray208.length < arg0 ? -1 : this.anIntArray208[arg0];
	}

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "(I)V")
	public void method2133() {
		if (this.anIntArray209 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray209.length; local10++) {
				this.anIntArray209[local10] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "(I)Ljava/lang/String;")
	public String method2134() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray13 == null) {
			return "";
		}
		local10.append(this.aStringArray13[0]);
		for (@Pc(24) int local24 = 1; local24 < this.aStringArray13.length; local24++) {
			local10.append("...");
			local10.append(this.aStringArray13[local24]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!dg;B)V")
	public void method2135(@OriginalArg(0) Class2_Sub10 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4421();
			if (local5 == 0) {
				return;
			}
			this.method2127(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IZI)I")
	public int method2137(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray208 == null || arg0 < 0 || arg0 > this.anIntArray208.length) {
			return -1;
		} else if (this.anIntArrayArray64[arg0] == null || arg1 < 0 || this.anIntArrayArray64[arg0].length < arg1) {
			return -1;
		} else {
			return this.anIntArrayArray64[arg0][arg1];
		}
	}
}
