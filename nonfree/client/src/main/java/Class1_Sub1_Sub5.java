import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class1_Sub1_Sub5 extends Class1_Sub1 {

	@OriginalMember(owner = "client!c", name = "K", descriptor = "[I")
	public int[] anIntArray81;

	@OriginalMember(owner = "client!c", name = "N", descriptor = "Lclient!kh;")
	public Class60 aClass60_166;

	@OriginalMember(owner = "client!c", name = "P", descriptor = "[I")
	public int[] anIntArray82;

	@OriginalMember(owner = "client!c", name = "T", descriptor = "[I")
	public int[] anIntArray83;

	@OriginalMember(owner = "client!c", name = "U", descriptor = "[I")
	public int[] anIntArray84;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!nc;IB)V")
	private void method360(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aClass60_166 = arg0.method935();
			return;
		}
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(47) int local47;
		if (arg1 == 2) {
			local24 = arg0.method895();
			this.anIntArray82 = new int[local24];
			this.anIntArray81 = new int[local24];
			for (local34 = 0; local34 < local24; local34++) {
				this.anIntArray82[local34] = arg0.method946();
				local47 = arg0.method895();
				if (local47 == 0) {
					this.anIntArray81[local34] = -1;
				} else {
					this.anIntArray81[local34] = local47;
				}
			}
		} else if (arg1 == 3) {
			local24 = arg0.method895();
			this.anIntArray84 = new int[local24];
			this.anIntArray83 = new int[local24];
			for (local34 = 0; local34 < local24; local34++) {
				this.anIntArray83[local34] = arg0.method946();
				local47 = arg0.method895();
				if (local47 == 0) {
					this.anIntArray84[local34] = -1;
				} else {
					this.anIntArray84[local34] = local47;
				}
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZI)I")
	public int method361(@OriginalArg(1) int arg0) {
		if (this.anIntArray83 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray83.length; local20++) {
			if (this.anIntArray84[local20] == arg0) {
				return this.anIntArray83[local20];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!nc;)V")
	public void method363(@OriginalArg(1) Class1_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method895();
			if (local5 == 0) {
				return;
			}
			this.method360(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!c", name = "f", descriptor = "(B)V")
	public void method365() {
		@Pc(14) int local14;
		if (this.anIntArray83 != null) {
			for (local14 = 0; local14 < this.anIntArray83.length; local14++) {
				this.anIntArray83[local14] |= 0x8000;
			}
		}
		if (this.anIntArray82 != null) {
			for (local14 = 0; local14 < this.anIntArray82.length; local14++) {
				this.anIntArray82[local14] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)I")
	public int method366(@OriginalArg(1) int arg0) {
		if (this.anIntArray82 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray82.length; local12++) {
			if (this.anIntArray81[local12] == arg0) {
				return this.anIntArray82[local12];
			}
		}
		return -1;
	}
}
