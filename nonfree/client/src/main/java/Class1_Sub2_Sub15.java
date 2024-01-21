import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class1_Sub2_Sub15 extends Class1_Sub2 {

	@OriginalMember(owner = "client!sb", name = "A", descriptor = "[S")
	private short[] aShortArray38;

	@OriginalMember(owner = "client!sb", name = "G", descriptor = "[S")
	private short[] aShortArray39;

	@OriginalMember(owner = "client!sb", name = "K", descriptor = "[S")
	private short[] aShortArray40;

	@OriginalMember(owner = "client!sb", name = "N", descriptor = "[I")
	private int[] anIntArray352;

	@OriginalMember(owner = "client!sb", name = "Z", descriptor = "[S")
	private short[] aShortArray41;

	@OriginalMember(owner = "client!sb", name = "I", descriptor = "Z")
	public boolean aBoolean144 = false;

	@OriginalMember(owner = "client!sb", name = "C", descriptor = "[I")
	private final int[] anIntArray351 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!sb", name = "H", descriptor = "I")
	public int anInt3329 = -1;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILclient!ka;)V")
	public void method2542(@OriginalArg(1) Class1_Sub8 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method336();
			if (local10 == 0) {
				return;
			}
			this.method2547(arg0, local10);
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)Z")
	public boolean method2543() {
		if (this.anIntArray352 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray352.length; local19++) {
			if (!Static42.aClass82_20.method2944(0, this.anIntArray352[local19])) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(Z)Z")
	public boolean method2545() {
		@Pc(3) boolean local3 = true;
		for (@Pc(5) int local5 = 0; local5 < 5; local5++) {
			if (this.anIntArray351[local5] != -1 && !Static42.aClass82_20.method2944(0, this.anIntArray351[local5])) {
				local3 = false;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)Lclient!td;")
	public Class1_Sub2_Sub1_Sub6 method2546() {
		@Pc(8) Class1_Sub2_Sub1_Sub6[] local8 = new Class1_Sub2_Sub1_Sub6[5];
		@Pc(10) int local10 = 0;
		for (@Pc(19) int local19 = 0; local19 < 5; local19++) {
			if (this.anIntArray351[local19] != -1) {
				local8[local10++] = Static159.method2767(Static42.aClass82_20, this.anIntArray351[local19]);
			}
		}
		@Pc(50) Class1_Sub2_Sub1_Sub6 local50 = new Class1_Sub2_Sub1_Sub6(local8, local10);
		@Pc(55) int local55;
		if (this.aShortArray41 != null) {
			for (local55 = 0; local55 < this.aShortArray41.length; local55++) {
				local50.method2752(this.aShortArray41[local55], this.aShortArray40[local55]);
			}
		}
		if (this.aShortArray39 != null) {
			for (local55 = 0; local55 < this.aShortArray39.length; local55++) {
				local50.method2756(this.aShortArray39[local55], this.aShortArray38[local55]);
			}
		}
		return local50;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!ka;BI)V")
	private void method2547(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3329 = arg0.method336();
			return;
		}
		@Pc(15) int local15;
		@Pc(21) int local21;
		if (arg1 == 2) {
			local15 = arg0.method336();
			this.anIntArray352 = new int[local15];
			for (local21 = 0; local21 < local15; local21++) {
				this.anIntArray352[local21] = arg0.method359();
			}
		} else if (arg1 == 3) {
			this.aBoolean144 = true;
		} else if (arg1 == 40) {
			local15 = arg0.method336();
			this.aShortArray40 = new short[local15];
			this.aShortArray41 = new short[local15];
			for (local21 = 0; local21 < local15; local21++) {
				this.aShortArray41[local21] = (short) arg0.method359();
				this.aShortArray40[local21] = (short) arg0.method359();
			}
		} else if (arg1 == 41) {
			local15 = arg0.method336();
			this.aShortArray38 = new short[local15];
			this.aShortArray39 = new short[local15];
			for (local21 = 0; local21 < local15; local21++) {
				this.aShortArray39[local21] = (short) arg0.method359();
				this.aShortArray38[local21] = (short) arg0.method359();
			}
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray351[arg1 - 60] = arg0.method359();
		}
	}

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "(I)Lclient!td;")
	public Class1_Sub2_Sub1_Sub6 method2549() {
		if (this.anIntArray352 == null) {
			return null;
		}
		@Pc(15) Class1_Sub2_Sub1_Sub6[] local15 = new Class1_Sub2_Sub1_Sub6[this.anIntArray352.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray352.length; local17++) {
			local15[local17] = Static159.method2767(Static42.aClass82_20, this.anIntArray352[local17]);
		}
		@Pc(59) Class1_Sub2_Sub1_Sub6 local59;
		if (local15.length == 1) {
			local59 = local15[0];
		} else {
			local59 = new Class1_Sub2_Sub1_Sub6(local15, local15.length);
		}
		@Pc(70) int local70;
		if (this.aShortArray41 != null) {
			for (local70 = 0; local70 < this.aShortArray41.length; local70++) {
				local59.method2752(this.aShortArray41[local70], this.aShortArray40[local70]);
			}
		}
		if (this.aShortArray39 != null) {
			for (local70 = 0; local70 < this.aShortArray39.length; local70++) {
				local59.method2756(this.aShortArray39[local70], this.aShortArray38[local70]);
			}
		}
		return local59;
	}
}
