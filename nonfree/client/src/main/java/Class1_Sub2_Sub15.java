import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class1_Sub2_Sub15 extends Class1_Sub2 {

	@OriginalMember(owner = "client!m", name = "N", descriptor = "[S")
	private short[] aShortArray31;

	@OriginalMember(owner = "client!m", name = "O", descriptor = "[S")
	private short[] aShortArray32;

	@OriginalMember(owner = "client!m", name = "U", descriptor = "[S")
	private short[] aShortArray33;

	@OriginalMember(owner = "client!m", name = "Y", descriptor = "[I")
	private int[] anIntArray208;

	@OriginalMember(owner = "client!m", name = "db", descriptor = "[S")
	private short[] aShortArray34;

	@OriginalMember(owner = "client!m", name = "R", descriptor = "Z")
	public boolean aBoolean120 = false;

	@OriginalMember(owner = "client!m", name = "K", descriptor = "[I")
	private final int[] anIntArray206 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!m", name = "W", descriptor = "I")
	public int anInt2626 = -1;

	@OriginalMember(owner = "client!m", name = "e", descriptor = "(I)Z")
	public boolean method2005() {
		@Pc(7) boolean local7 = true;
		for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
			if (this.anIntArray206[local14] != -1 && !Static186.aClass69_6.method2194(this.anIntArray206[local14], 0)) {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!fj;II)V")
	private void method2007(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2626 = arg0.method2771();
			return;
		}
		@Pc(44) int local44;
		@Pc(54) int local54;
		if (arg1 == 2) {
			local44 = arg0.method2771();
			this.anIntArray208 = new int[local44];
			for (local54 = 0; local54 < local44; local54++) {
				this.anIntArray208[local54] = arg0.method2765();
			}
		} else if (arg1 == 3) {
			this.aBoolean120 = true;
		} else if (arg1 == 40) {
			local44 = arg0.method2771();
			this.aShortArray34 = new short[local44];
			this.aShortArray31 = new short[local44];
			for (local54 = 0; local54 < local44; local54++) {
				this.aShortArray31[local54] = (short) arg0.method2765();
				this.aShortArray34[local54] = (short) arg0.method2765();
			}
		} else if (arg1 == 41) {
			local44 = arg0.method2771();
			this.aShortArray32 = new short[local44];
			this.aShortArray33 = new short[local44];
			for (local54 = 0; local54 < local44; local54++) {
				this.aShortArray33[local54] = (short) arg0.method2765();
				this.aShortArray32[local54] = (short) arg0.method2765();
			}
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray206[arg1 - 60] = arg0.method2765();
		}
	}

	@OriginalMember(owner = "client!m", name = "f", descriptor = "(I)Lclient!se;")
	public Class5_Sub6 method2009() {
		if (this.anIntArray208 == null) {
			return null;
		}
		@Pc(15) Class5_Sub6[] local15 = new Class5_Sub6[this.anIntArray208.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray208.length; local17++) {
			local15[local17] = Static171.method2955(Static186.aClass69_6, this.anIntArray208[local17]);
		}
		@Pc(46) Class5_Sub6 local46;
		if (local15.length == 1) {
			local46 = local15[0];
		} else {
			local46 = new Class5_Sub6(local15, local15.length);
		}
		@Pc(63) int local63;
		if (this.aShortArray31 != null) {
			for (local63 = 0; local63 < this.aShortArray31.length; local63++) {
				local46.method2936(this.aShortArray31[local63], this.aShortArray34[local63]);
			}
		}
		if (this.aShortArray33 != null) {
			for (local63 = 0; local63 < this.aShortArray33.length; local63++) {
				local46.method2934(this.aShortArray33[local63], this.aShortArray32[local63]);
			}
		}
		return local46;
	}

	@OriginalMember(owner = "client!m", name = "g", descriptor = "(I)Z")
	public boolean method2010() {
		if (this.anIntArray208 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray208.length; local19++) {
			if (!Static186.aClass69_6.method2194(this.anIntArray208[local19], 0)) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!m", name = "h", descriptor = "(I)Lclient!se;")
	public Class5_Sub6 method2011() {
		@Pc(14) Class5_Sub6[] local14 = new Class5_Sub6[5];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
			if (this.anIntArray206[local18] != -1) {
				local14[local16++] = Static171.method2955(Static186.aClass69_6, this.anIntArray206[local18]);
			}
		}
		@Pc(50) Class5_Sub6 local50 = new Class5_Sub6(local14, local16);
		@Pc(55) int local55;
		if (this.aShortArray31 != null) {
			for (local55 = 0; local55 < this.aShortArray31.length; local55++) {
				local50.method2936(this.aShortArray31[local55], this.aShortArray34[local55]);
			}
		}
		if (this.aShortArray33 != null) {
			for (local55 = 0; local55 < this.aShortArray33.length; local55++) {
				local50.method2934(this.aShortArray33[local55], this.aShortArray32[local55]);
			}
		}
		return local50;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BLclient!fj;)V")
	public void method2012(@OriginalArg(1) Class1_Sub7 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method2771();
			if (local15 == 0) {
				return;
			}
			this.method2007(arg0, local15);
		}
	}
}
