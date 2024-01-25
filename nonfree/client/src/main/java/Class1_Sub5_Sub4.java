import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
public final class Class1_Sub5_Sub4 extends Class1_Sub5 {

	@OriginalMember(owner = "client!ep", name = "t", descriptor = "[I")
	public int[] anIntArray120;

	@OriginalMember(owner = "client!ep", name = "w", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!ep", name = "D", descriptor = "Ljava/lang/String;")
	public String aString19;

	@OriginalMember(owner = "client!ep", name = "H", descriptor = "[I")
	public int[] anIntArray121;

	@OriginalMember(owner = "client!ep", name = "M", descriptor = "[C")
	public char[] aCharArray3;

	static {
		new Class119("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(BC)I")
	public int method1503(@OriginalArg(1) char arg0) {
		if (this.anIntArray120 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray120.length; local17++) {
			if (arg0 == this.aCharArray3[local17]) {
				return this.anIntArray120[local17];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILclient!ug;I)V")
	private void method1508(@OriginalArg(1) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString19 = arg0.method5381();
			return;
		}
		@Pc(25) int local25;
		@Pc(35) int local35;
		@Pc(50) byte local50;
		if (arg1 == 2) {
			local25 = arg0.method5337();
			this.aCharArray3 = new char[local25];
			this.anIntArray120 = new int[local25];
			for (local35 = 0; local35 < local25; local35++) {
				this.anIntArray120[local35] = arg0.method5335();
				local50 = arg0.method5367();
				this.aCharArray3[local35] = local50 == 0 ? 0 : Static276.method3830(local50);
			}
			return;
		}
		if (arg1 != 3) {
			return;
		}
		local25 = arg0.method5337();
		this.aCharArray2 = new char[local25];
		this.anIntArray121 = new int[local25];
		for (local35 = 0; local35 < local25; local35++) {
			this.anIntArray121[local35] = arg0.method5335();
			local50 = arg0.method5367();
			this.aCharArray2[local35] = local50 == 0 ? 0 : Static276.method3830(local50);
		}
		return;
	}

	@OriginalMember(owner = "client!ep", name = "f", descriptor = "(I)V")
	public void method1509() {
		@Pc(6) int local6;
		if (this.anIntArray121 != null) {
			for (local6 = 0; local6 < this.anIntArray121.length; local6++) {
				this.anIntArray121[local6] |= 0x8000;
			}
		}
		if (this.anIntArray120 != null) {
			for (local6 = 0; local6 < this.anIntArray120.length; local6++) {
				this.anIntArray120[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(CI)I")
	public int method1511(@OriginalArg(0) char arg0) {
		if (this.anIntArray121 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray121.length; local12++) {
			if (this.aCharArray2[local12] == arg0) {
				return this.anIntArray121[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!ug;Z)V")
	public void method1512(@OriginalArg(0) Class1_Sub28 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5337();
			if (local5 == 0) {
				return;
			}
			this.method1508(arg0, local5);
		}
	}
}
