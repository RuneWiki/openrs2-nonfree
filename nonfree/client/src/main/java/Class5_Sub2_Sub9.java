import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lea")
public final class Class5_Sub2_Sub9 extends Class5_Sub2 {

	@OriginalMember(owner = "client!lea", name = "v", descriptor = "[I")
	public int[] anIntArray343;

	@OriginalMember(owner = "client!lea", name = "x", descriptor = "Ljava/lang/String;")
	public String aString59;

	@OriginalMember(owner = "client!lea", name = "A", descriptor = "[C")
	public char[] aCharArray6;

	@OriginalMember(owner = "client!lea", name = "C", descriptor = "[I")
	public int[] anIntArray344;

	@OriginalMember(owner = "client!lea", name = "D", descriptor = "[C")
	public char[] aCharArray7;

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(ZC)I")
	public int method5122(@OriginalArg(1) char arg0) {
		if (this.anIntArray343 == null) {
			return -1;
		}
		for (@Pc(10) int local10 = 0; local10 < this.anIntArray343.length; local10++) {
			if (arg0 == this.aCharArray6[local10]) {
				return this.anIntArray343[local10];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(CB)I")
	public int method5124(@OriginalArg(0) char arg0) {
		if (this.anIntArray344 == null) {
			return -1;
		}
		for (@Pc(10) int local10 = 0; local10 < this.anIntArray344.length; local10++) {
			if (this.aCharArray7[local10] == arg0) {
				return this.anIntArray344[local10];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!rv;BI)V")
	private void method5125(@OriginalArg(0) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString59 = arg0.method3661();
			return;
		}
		@Pc(15) int local15;
		@Pc(25) int local25;
		@Pc(37) byte local37;
		if (arg1 == 2) {
			local15 = arg0.method3642();
			this.anIntArray343 = new int[local15];
			this.aCharArray6 = new char[local15];
			for (local25 = 0; local25 < local15; local25++) {
				this.anIntArray343[local25] = arg0.method3698();
				local37 = arg0.method3677();
				this.aCharArray6[local25] = local37 == 0 ? 0 : Static549.method7576(local37);
			}
		} else if (arg1 == 3) {
			local15 = arg0.method3642();
			this.anIntArray344 = new int[local15];
			this.aCharArray7 = new char[local15];
			for (local25 = 0; local25 < local15; local25++) {
				this.anIntArray344[local25] = arg0.method3698();
				local37 = arg0.method3677();
				this.aCharArray7[local25] = local37 == 0 ? 0 : Static549.method7576(local37);
			}
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!rv;I)V")
	public void method5126(@OriginalArg(0) Class5_Sub15 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method3642();
			if (local11 == 0) {
				return;
			}
			this.method5125(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!lea", name = "c", descriptor = "(I)V")
	public void method5128() {
		@Pc(8) int local8;
		if (this.anIntArray344 != null) {
			for (local8 = 0; local8 < this.anIntArray344.length; local8++) {
				this.anIntArray344[local8] |= 0x8000;
			}
		}
		if (this.anIntArray343 != null) {
			for (local8 = 0; local8 < this.anIntArray343.length; local8++) {
				this.anIntArray343[local8] |= 0x8000;
			}
		}
	}
}
