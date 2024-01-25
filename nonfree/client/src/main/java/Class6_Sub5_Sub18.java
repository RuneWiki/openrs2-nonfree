import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class6_Sub5_Sub18 extends Class6_Sub5 {

	@OriginalMember(owner = "client!vq", name = "v", descriptor = "Ljava/lang/String;")
	public String aString88;

	@OriginalMember(owner = "client!vq", name = "x", descriptor = "[C")
	public char[] aCharArray8;

	@OriginalMember(owner = "client!vq", name = "B", descriptor = "[C")
	public char[] aCharArray9;

	@OriginalMember(owner = "client!vq", name = "C", descriptor = "[I")
	public int[] anIntArray703;

	@OriginalMember(owner = "client!vq", name = "H", descriptor = "[I")
	public int[] anIntArray704;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(CI)I")
	public int method7741(@OriginalArg(0) char arg0) {
		if (this.anIntArray704 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray704.length; local12++) {
			if (this.aCharArray8[local12] == arg0) {
				return this.anIntArray704[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(CI)I")
	public int method7742(@OriginalArg(0) char arg0) {
		if (this.anIntArray703 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray703.length; local20++) {
			if (this.aCharArray9[local20] == arg0) {
				return this.anIntArray703[local20];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
	public void method7743() {
		@Pc(10) int local10;
		if (this.anIntArray703 != null) {
			for (local10 = 0; local10 < this.anIntArray703.length; local10++) {
				this.anIntArray703[local10] |= 0x8000;
			}
		}
		if (this.anIntArray704 != null) {
			for (local10 = 0; local10 < this.anIntArray704.length; local10++) {
				this.anIntArray704[local10] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(BLclient!jr;)V")
	public void method7744(@OriginalArg(1) Class6_Sub12 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6019();
			if (local9 == 0) {
				return;
			}
			this.method7745(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(BILclient!jr;)V")
	private void method7745(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub12 arg1) {
		if (arg0 == 1) {
			this.aString88 = arg1.method6040();
			return;
		}
		@Pc(34) int local34;
		@Pc(44) int local44;
		@Pc(57) byte local57;
		if (arg0 == 2) {
			local34 = arg1.method6019();
			this.aCharArray8 = new char[local34];
			this.anIntArray704 = new int[local34];
			for (local44 = 0; local44 < local34; local44++) {
				this.anIntArray704[local44] = arg1.method6044();
				local57 = arg1.method6049();
				this.aCharArray8[local44] = local57 == 0 ? 0 : Static58.method838(local57);
			}
		} else if (arg0 == 3) {
			local34 = arg1.method6019();
			this.aCharArray9 = new char[local34];
			this.anIntArray703 = new int[local34];
			for (local44 = 0; local44 < local34; local44++) {
				this.anIntArray703[local44] = arg1.method6044();
				local57 = arg1.method6049();
				this.aCharArray9[local44] = local57 == 0 ? 0 : Static58.method838(local57);
			}
		}
	}
}
