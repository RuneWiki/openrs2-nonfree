import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class2_Sub2_Sub1 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ab", name = "w", descriptor = "[C")
	public char[] aCharArray1;

	@OriginalMember(owner = "client!ab", name = "x", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!ab", name = "y", descriptor = "[I")
	public int[] anIntArray4;

	@OriginalMember(owner = "client!ab", name = "B", descriptor = "[I")
	public int[] anIntArray5;

	@OriginalMember(owner = "client!ab", name = "F", descriptor = "Ljava/lang/String;")
	public String aString1;

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)V")
	public void method55() {
		@Pc(6) int local6;
		if (this.anIntArray4 != null) {
			for (local6 = 0; local6 < this.anIntArray4.length; local6++) {
				this.anIntArray4[local6] |= 0x8000;
			}
		}
		if (this.anIntArray5 != null) {
			for (local6 = 0; local6 < this.anIntArray5.length; local6++) {
				this.anIntArray5[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZC)I")
	public int method56(@OriginalArg(1) char arg0) {
		if (this.anIntArray4 == null) {
			return -1;
		}
		for (@Pc(24) int local24 = 0; local24 < this.anIntArray4.length; local24++) {
			if (this.aCharArray2[local24] == arg0) {
				return this.anIntArray4[local24];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BC)I")
	public int method57(@OriginalArg(1) char arg0) {
		if (this.anIntArray5 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray5.length; local20++) {
			if (this.aCharArray1[local20] == arg0) {
				return this.anIntArray5[local20];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!gk;B)V")
	public void method58(@OriginalArg(0) Class2_Sub7 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method4464();
			if (local7 == 0) {
				return;
			}
			this.method59(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!gk;II)V")
	private void method59(@OriginalArg(0) Class2_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString1 = arg0.method4494();
			return;
		}
		@Pc(27) int local27;
		@Pc(37) int local37;
		@Pc(50) byte local50;
		if (arg1 == 2) {
			local27 = arg0.method4464();
			this.anIntArray5 = new int[local27];
			this.aCharArray1 = new char[local27];
			for (local37 = 0; local37 < local27; local37++) {
				this.anIntArray5[local37] = arg0.method4518();
				local50 = arg0.method4477();
				this.aCharArray1[local37] = local50 == 0 ? 0 : Static581.method7528(local50);
			}
		} else if (arg1 == 3) {
			local27 = arg0.method4464();
			this.aCharArray2 = new char[local27];
			this.anIntArray4 = new int[local27];
			for (local37 = 0; local37 < local27; local37++) {
				this.anIntArray4[local37] = arg0.method4518();
				local50 = arg0.method4477();
				this.aCharArray2[local37] = local50 == 0 ? 0 : Static581.method7528(local50);
			}
		}
	}
}
