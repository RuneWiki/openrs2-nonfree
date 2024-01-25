import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class2_Sub5_Sub7 extends Class2_Sub5 {

	@OriginalMember(owner = "client!fo", name = "w", descriptor = "[I")
	public int[] anIntArray203;

	@OriginalMember(owner = "client!fo", name = "x", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!fo", name = "B", descriptor = "[C")
	public char[] aCharArray3;

	@OriginalMember(owner = "client!fo", name = "F", descriptor = "Ljava/lang/String;")
	public String aString33;

	@OriginalMember(owner = "client!fo", name = "J", descriptor = "[I")
	public int[] anIntArray204;

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "(I)V")
	public void method2025() {
		if (this.anIntArray203 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anIntArray203.length; local6++) {
				this.anIntArray203[local6] |= 0x8000;
			}
		}
		if (this.anIntArray204 != null) {
			for (@Pc(45) int local45 = 0; local45 < this.anIntArray204.length; local45++) {
				this.anIntArray204[local45] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(BILclient!si;)V")
	private void method2027(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub23 arg1) {
		if (arg0 == 1) {
			this.aString33 = arg1.method5494();
			return;
		}
		@Pc(27) int local27;
		@Pc(37) int local37;
		@Pc(50) byte local50;
		if (arg0 == 2) {
			local27 = arg1.method5495();
			this.aCharArray3 = new char[local27];
			this.anIntArray204 = new int[local27];
			for (local37 = 0; local37 < local27; local37++) {
				this.anIntArray204[local37] = arg1.method5500();
				local50 = arg1.method5484();
				this.aCharArray3[local37] = local50 == 0 ? 0 : Static283.method1319(local50);
			}
		} else if (arg0 == 3) {
			local27 = arg1.method5495();
			this.aCharArray2 = new char[local27];
			this.anIntArray203 = new int[local27];
			for (local37 = 0; local37 < local27; local37++) {
				this.anIntArray203[local37] = arg1.method5500();
				local50 = arg1.method5484();
				this.aCharArray2[local37] = local50 == 0 ? 0 : Static283.method1319(local50);
			}
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!si;I)V")
	public void method2028(@OriginalArg(0) Class2_Sub23 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method5495();
			if (local17 == 0) {
				return;
			}
			this.method2027(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IC)I")
	public int method2029(@OriginalArg(1) char arg0) {
		if (this.anIntArray203 == null) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray203.length; local18++) {
			if (this.aCharArray2[local18] == arg0) {
				return this.anIntArray203[local18];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(IC)I")
	public int method2030(@OriginalArg(1) char arg0) {
		if (this.anIntArray204 == null) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray204.length; local18++) {
			if (arg0 == this.aCharArray3[local18]) {
				return this.anIntArray204[local18];
			}
		}
		return -1;
	}
}
