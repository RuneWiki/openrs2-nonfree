import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aw")
public final class Class6_Sub5_Sub2 extends Class6_Sub5 {

	@OriginalMember(owner = "client!aw", name = "y", descriptor = "Ljava/lang/String;")
	public String aString4;

	@OriginalMember(owner = "client!aw", name = "z", descriptor = "[I")
	public int[] anIntArray29;

	@OriginalMember(owner = "client!aw", name = "D", descriptor = "[I")
	public int[] anIntArray30;

	@OriginalMember(owner = "client!aw", name = "F", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!aw", name = "G", descriptor = "[C")
	public char[] aCharArray3;

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(ILclient!ji;B)V")
	private void method729(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 1) {
			this.aString4 = arg1.method8221();
			return;
		}
		@Pc(27) int local27;
		@Pc(37) int local37;
		@Pc(50) byte local50;
		if (arg0 == 2) {
			local27 = arg1.method8246();
			this.aCharArray2 = new char[local27];
			this.anIntArray30 = new int[local27];
			for (local37 = 0; local37 < local27; local37++) {
				this.anIntArray30[local37] = arg1.method8220();
				local50 = arg1.method8208();
				this.aCharArray2[local37] = local50 == 0 ? 0 : Static111.method2501(local50);
			}
			return;
		}
		if (arg0 != 3) {
			return;
		}
		local27 = arg1.method8246();
		this.anIntArray29 = new int[local27];
		this.aCharArray3 = new char[local27];
		for (local37 = 0; local37 < local27; local37++) {
			this.anIntArray29[local37] = arg1.method8220();
			local50 = arg1.method8208();
			this.aCharArray3[local37] = local50 == 0 ? 0 : Static111.method2501(local50);
		}
		return;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IC)I")
	public int method730(@OriginalArg(1) char arg0) {
		if (this.anIntArray30 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray30.length; local12++) {
			if (arg0 == this.aCharArray2[local12]) {
				return this.anIntArray30[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(CB)I")
	public int method731(@OriginalArg(0) char arg0) {
		if (this.anIntArray29 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray29.length; local12++) {
			if (arg0 == this.aCharArray3[local12]) {
				return this.anIntArray29[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(I)V")
	public void method733() {
		@Pc(15) int local15;
		if (this.anIntArray29 != null) {
			for (local15 = 0; local15 < this.anIntArray29.length; local15++) {
				this.anIntArray29[local15] |= 0x8000;
			}
		}
		if (this.anIntArray30 != null) {
			for (local15 = 0; local15 < this.anIntArray30.length; local15++) {
				this.anIntArray30[local15] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lclient!ji;Z)V")
	public void method734(@OriginalArg(0) Class6_Sub8 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method8246();
			if (local10 == 0) {
				return;
			}
			this.method729(local10, arg0);
		}
	}
}
