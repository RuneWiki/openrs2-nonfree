import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class4_Sub6_Sub2 extends Class4_Sub6 {

	@OriginalMember(owner = "client!ck", name = "C", descriptor = "Ljava/lang/String;")
	public String aString25;

	@OriginalMember(owner = "client!ck", name = "F", descriptor = "[I")
	public int[] anIntArray72;

	@OriginalMember(owner = "client!ck", name = "K", descriptor = "[C")
	public char[] aCharArray1;

	@OriginalMember(owner = "client!ck", name = "M", descriptor = "[I")
	public int[] anIntArray73;

	@OriginalMember(owner = "client!ck", name = "O", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!ek;I)V")
	public void method1506(@OriginalArg(0) Class4_Sub13 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method7004();
			if (local5 == 0) {
				return;
			}
			this.method1508(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(CI)I")
	public int method1507(@OriginalArg(0) char arg0) {
		if (this.anIntArray72 == null) {
			return -1;
		}
		for (@Pc(10) int local10 = 0; local10 < this.anIntArray72.length; local10++) {
			if (this.aCharArray1[local10] == arg0) {
				return this.anIntArray72[local10];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IILclient!ek;)V")
	private void method1508(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub13 arg1) {
		if (arg0 == 1) {
			this.aString25 = arg1.method7016();
			return;
		}
		@Pc(25) int local25;
		@Pc(35) int local35;
		@Pc(48) byte local48;
		if (arg0 == 2) {
			local25 = arg1.method7004();
			this.anIntArray73 = new int[local25];
			this.aCharArray2 = new char[local25];
			for (local35 = 0; local35 < local25; local35++) {
				this.anIntArray73[local35] = arg1.method7054();
				local48 = arg1.method7011();
				this.aCharArray2[local35] = local48 == 0 ? 0 : Static320.method5004(local48);
			}
		} else if (arg0 == 3) {
			local25 = arg1.method7004();
			this.anIntArray72 = new int[local25];
			this.aCharArray1 = new char[local25];
			for (local35 = 0; local35 < local25; local35++) {
				this.anIntArray72[local35] = arg1.method7054();
				local48 = arg1.method7011();
				this.aCharArray1[local35] = local48 == 0 ? 0 : Static320.method5004(local48);
			}
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
	public void method1509() {
		@Pc(6) int local6;
		if (this.anIntArray72 != null) {
			for (local6 = 0; local6 < this.anIntArray72.length; local6++) {
				this.anIntArray72[local6] |= 0x8000;
			}
		}
		if (this.anIntArray73 != null) {
			for (local6 = 0; local6 < this.anIntArray73.length; local6++) {
				this.anIntArray73[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(CZ)I")
	public int method1511(@OriginalArg(0) char arg0) {
		if (this.anIntArray73 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray73.length; local12++) {
			if (this.aCharArray2[local12] == arg0) {
				return this.anIntArray73[local12];
			}
		}
		return -1;
	}
}
