import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class1_Sub1_Sub13 extends Class1_Sub1 {

	@OriginalMember(owner = "client!nq", name = "t", descriptor = "[C")
	public char[] aCharArray33;

	@OriginalMember(owner = "client!nq", name = "u", descriptor = "[I")
	public int[] anIntArray598;

	@OriginalMember(owner = "client!nq", name = "x", descriptor = "[C")
	public char[] aCharArray34;

	@OriginalMember(owner = "client!nq", name = "y", descriptor = "Ljava/lang/String;")
	public String aString56;

	@OriginalMember(owner = "client!nq", name = "z", descriptor = "[I")
	public int[] anIntArray599;

	static {
		new Class306(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
	}

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)V")
	public void method5058() {
		@Pc(10) int local10;
		if (this.anIntArray599 != null) {
			for (local10 = 0; local10 < this.anIntArray599.length; local10++) {
				this.anIntArray599[local10] |= 0x8000;
			}
		}
		if (this.anIntArray598 != null) {
			for (local10 = 0; local10 < this.anIntArray598.length; local10++) {
				this.anIntArray598[local10] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!ge;I)V")
	public void method5059(@OriginalArg(0) Class1_Sub6 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3922();
			if (local5 == 0) {
				return;
			}
			this.method5063(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IC)I")
	public int method5060(@OriginalArg(1) char arg0) {
		if (this.anIntArray599 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray599.length; local12++) {
			if (this.aCharArray34[local12] == arg0) {
				return this.anIntArray599[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(CB)I")
	public int method5061(@OriginalArg(0) char arg0) {
		if (this.anIntArray598 == null) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray598.length; local18++) {
			if (this.aCharArray33[local18] == arg0) {
				return this.anIntArray598[local18];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(BLclient!ge;I)V")
	private void method5063(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString56 = arg0.method3954();
			return;
		}
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(47) byte local47;
		if (arg1 == 2) {
			local24 = arg0.method3922();
			this.anIntArray598 = new int[local24];
			this.aCharArray33 = new char[local24];
			for (local34 = 0; local34 < local24; local34++) {
				this.anIntArray598[local34] = arg0.method3967();
				local47 = arg0.method3928();
				this.aCharArray33[local34] = local47 == 0 ? 0 : Static147.method2361(local47);
			}
		} else if (arg1 == 3) {
			local24 = arg0.method3922();
			this.anIntArray599 = new int[local24];
			this.aCharArray34 = new char[local24];
			for (local34 = 0; local34 < local24; local34++) {
				this.anIntArray599[local34] = arg0.method3967();
				local47 = arg0.method3928();
				this.aCharArray34[local34] = local47 == 0 ? 0 : Static147.method2361(local47);
			}
		}
	}
}
