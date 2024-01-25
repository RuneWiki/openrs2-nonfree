import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class2_Sub9_Sub11 extends Class2_Sub9 {

	@OriginalMember(owner = "client!jn", name = "P", descriptor = "[I")
	public int[] anIntArray279;

	@OriginalMember(owner = "client!jn", name = "Q", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!jn", name = "R", descriptor = "Ljava/lang/String;")
	public String aString35;

	@OriginalMember(owner = "client!jn", name = "S", descriptor = "[C")
	public char[] aCharArray3;

	@OriginalMember(owner = "client!jn", name = "ab", descriptor = "[I")
	public int[] anIntArray280;

	@OriginalMember(owner = "client!jn", name = "g", descriptor = "(I)V")
	public void method3212() {
		@Pc(14) int local14;
		if (this.anIntArray279 != null) {
			for (local14 = 0; local14 < this.anIntArray279.length; local14++) {
				this.anIntArray279[local14] |= 0x8000;
			}
		}
		if (this.anIntArray280 != null) {
			for (local14 = 0; local14 < this.anIntArray280.length; local14++) {
				this.anIntArray280[local14] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZC)I")
	public int method3213(@OriginalArg(1) char arg0) {
		if (this.anIntArray280 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray280.length; local17++) {
			if (arg0 == this.aCharArray2[local17]) {
				return this.anIntArray280[local17];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILclient!ef;Z)V")
	private void method3217(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub12 arg1) {
		if (arg0 == 1) {
			this.aString35 = arg1.method3113();
			return;
		}
		@Pc(27) int local27;
		@Pc(37) int local37;
		@Pc(50) byte local50;
		if (arg0 == 2) {
			local27 = arg1.method3124();
			this.aCharArray2 = new char[local27];
			this.anIntArray280 = new int[local27];
			for (local37 = 0; local37 < local27; local37++) {
				this.anIntArray280[local37] = arg1.method3104();
				local50 = arg1.method3122();
				this.aCharArray2[local37] = local50 == 0 ? 0 : Static294.method4922(local50);
			}
		} else if (arg0 == 3) {
			local27 = arg1.method3124();
			this.aCharArray3 = new char[local27];
			this.anIntArray279 = new int[local27];
			for (local37 = 0; local37 < local27; local37++) {
				this.anIntArray279[local37] = arg1.method3104();
				local50 = arg1.method3122();
				this.aCharArray3[local37] = local50 == 0 ? 0 : Static294.method4922(local50);
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(Lclient!ef;I)V")
	public void method3219(@OriginalArg(0) Class2_Sub12 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3124();
			if (local5 == 0) {
				return;
			}
			this.method3217(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BC)I")
	public int method3220(@OriginalArg(1) char arg0) {
		if (this.anIntArray279 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray279.length; local17++) {
			if (arg0 == this.aCharArray3[local17]) {
				return this.anIntArray279[local17];
			}
		}
		return -1;
	}
}
