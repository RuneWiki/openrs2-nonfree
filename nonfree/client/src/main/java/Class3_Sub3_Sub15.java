import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class3_Sub3_Sub15 extends Class3_Sub3 {

	@OriginalMember(owner = "client!nk", name = "z", descriptor = "[C")
	public char[] aCharArray8;

	@OriginalMember(owner = "client!nk", name = "C", descriptor = "Ljava/lang/String;")
	public String aString51;

	@OriginalMember(owner = "client!nk", name = "E", descriptor = "[C")
	public char[] aCharArray9;

	@OriginalMember(owner = "client!nk", name = "G", descriptor = "[I")
	public int[] anIntArray389;

	@OriginalMember(owner = "client!nk", name = "K", descriptor = "[I")
	public int[] anIntArray390;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZC)I")
	public int method4023(@OriginalArg(1) char arg0) {
		if (this.anIntArray390 == null) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray390.length; local18++) {
			if (this.aCharArray9[local18] == arg0) {
				return this.anIntArray390[local18];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "(B)V")
	public void method4024() {
		@Pc(8) int local8;
		if (this.anIntArray390 != null) {
			for (local8 = 0; local8 < this.anIntArray390.length; local8++) {
				this.anIntArray390[local8] |= 0x8000;
			}
		}
		if (this.anIntArray389 != null) {
			for (local8 = 0; local8 < this.anIntArray389.length; local8++) {
				this.anIntArray389[local8] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!bt;I)V")
	public void method4025(@OriginalArg(0) Class3_Sub2 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method6053();
			if (local7 == 0) {
				return;
			}
			this.method4027(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(CB)I")
	public int method4026(@OriginalArg(0) char arg0) {
		if (this.anIntArray389 == null) {
			return -1;
		}
		for (@Pc(10) int local10 = 0; local10 < this.anIntArray389.length; local10++) {
			if (arg0 == this.aCharArray8[local10]) {
				return this.anIntArray389[local10];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IBLclient!bt;)V")
	private void method4027(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 1) {
			this.aString51 = arg1.method6027();
			return;
		}
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(46) byte local46;
		if (arg0 == 2) {
			local24 = arg1.method6053();
			this.anIntArray389 = new int[local24];
			this.aCharArray8 = new char[local24];
			for (local34 = 0; local34 < local24; local34++) {
				this.anIntArray389[local34] = arg1.method6004();
				local46 = arg1.method6011();
				this.aCharArray8[local34] = local46 == 0 ? 0 : Static26.method717(local46);
			}
		} else if (arg0 == 3) {
			local24 = arg1.method6053();
			this.aCharArray9 = new char[local24];
			this.anIntArray390 = new int[local24];
			for (local34 = 0; local34 < local24; local34++) {
				this.anIntArray390[local34] = arg1.method6004();
				local46 = arg1.method6011();
				this.aCharArray9[local34] = local46 == 0 ? 0 : Static26.method717(local46);
			}
		}
	}
}
