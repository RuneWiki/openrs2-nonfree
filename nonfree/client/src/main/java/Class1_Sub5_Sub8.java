import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class1_Sub5_Sub8 extends Class1_Sub5 {

	@OriginalMember(owner = "client!jm", name = "A", descriptor = "[I")
	public int[] anIntArray205;

	@OriginalMember(owner = "client!jm", name = "B", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!jm", name = "K", descriptor = "[C")
	public char[] aCharArray3;

	@OriginalMember(owner = "client!jm", name = "L", descriptor = "[I")
	public int[] anIntArray207;

	@OriginalMember(owner = "client!jm", name = "R", descriptor = "Ljava/lang/String;")
	public String aString90;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IC)I")
	public int method2323(@OriginalArg(1) char arg0) {
		if (this.anIntArray205 == null) {
			return -1;
		}
		for (@Pc(13) int local13 = 0; local13 < this.anIntArray205.length; local13++) {
			if (arg0 == this.aCharArray3[local13]) {
				return this.anIntArray205[local13];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(CI)I")
	public int method2324(@OriginalArg(0) char arg0) {
		if (this.anIntArray207 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray207.length; local12++) {
			if (this.aCharArray2[local12] == arg0) {
				return this.anIntArray207[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(BLclient!fh;I)V")
	private void method2325(@OriginalArg(1) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString90 = arg0.method1827();
			return;
		}
		@Pc(33) int local33;
		@Pc(43) int local43;
		@Pc(57) byte local57;
		if (arg1 == 2) {
			local33 = arg0.method1853();
			this.aCharArray3 = new char[local33];
			this.anIntArray205 = new int[local33];
			for (local43 = 0; local43 < local33; local43++) {
				this.anIntArray205[local43] = arg0.method1879();
				local57 = arg0.method1829();
				this.aCharArray3[local43] = local57 == 0 ? 0 : Static142.method2500(local57);
			}
		} else if (arg1 == 3) {
			local33 = arg0.method1853();
			this.anIntArray207 = new int[local33];
			this.aCharArray2 = new char[local33];
			for (local43 = 0; local43 < local33; local43++) {
				this.anIntArray207[local43] = arg0.method1879();
				local57 = arg0.method1829();
				this.aCharArray2[local43] = local57 == 0 ? 0 : Static142.method2500(local57);
			}
		} else if (arg1 == 4) {
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!fh;I)V")
	public void method2327(@OriginalArg(0) Class1_Sub13 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1853();
			if (local5 == 0) {
				return;
			}
			this.method2325(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(B)V")
	public void method2328() {
		@Pc(12) int local12;
		if (this.anIntArray207 != null) {
			for (local12 = 0; local12 < this.anIntArray207.length; local12++) {
				this.anIntArray207[local12] |= 0x8000;
			}
		}
		if (this.anIntArray205 != null) {
			for (local12 = 0; local12 < this.anIntArray205.length; local12++) {
				this.anIntArray205[local12] |= 0x8000;
			}
		}
	}
}
