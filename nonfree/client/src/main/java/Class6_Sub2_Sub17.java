import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qga")
public final class Class6_Sub2_Sub17 extends Class6_Sub2 {

	@OriginalMember(owner = "client!qga", name = "H", descriptor = "[I")
	public int[] anIntArray521;

	@OriginalMember(owner = "client!qga", name = "u", descriptor = "[I")
	public int[] anIntArray522;

	@OriginalMember(owner = "client!qga", name = "x", descriptor = "Ljava/lang/String;")
	public String aString93;

	@OriginalMember(owner = "client!qga", name = "A", descriptor = "[C")
	public char[] aCharArray12;

	@OriginalMember(owner = "client!qga", name = "G", descriptor = "[C")
	public char[] aCharArray13;

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(Z)V")
	public void method7243() {
		@Pc(16) int local16;
		if (this.anIntArray522 != null) {
			for (local16 = 0; local16 < this.anIntArray522.length; local16++) {
				this.anIntArray522[local16] |= 0x8000;
			}
		}
		if (this.anIntArray521 != null) {
			for (local16 = 0; local16 < this.anIntArray521.length; local16++) {
				this.anIntArray521[local16] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(ZC)I")
	public int method7245(@OriginalArg(1) char arg0) {
		if (this.anIntArray522 == null) {
			return -1;
		}
		for (@Pc(13) int local13 = 0; local13 < this.anIntArray522.length; local13++) {
			if (arg0 == this.aCharArray12[local13]) {
				return this.anIntArray522[local13];
			}
		}
		if (false) {
			this.method7247((Class6_Sub15) null, 9);
		}
		return -1;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(BLclient!jc;I)V")
	private void method7246(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString93 = arg0.method3046();
			return;
		}
		@Pc(34) int local34;
		@Pc(44) int local44;
		@Pc(59) byte local59;
		if (arg1 == 2) {
			local34 = arg0.method3030();
			this.aCharArray13 = new char[local34];
			this.anIntArray521 = new int[local34];
			for (local44 = 0; local44 < local34; local44++) {
				this.anIntArray521[local44] = arg0.method3018();
				local59 = arg0.method3027();
				this.aCharArray13[local44] = local59 == 0 ? 0 : Static383.method5912(local59);
			}
		} else if (arg1 == 3) {
			local34 = arg0.method3030();
			this.anIntArray522 = new int[local34];
			this.aCharArray12 = new char[local34];
			for (local44 = 0; local44 < local34; local44++) {
				this.anIntArray522[local44] = arg0.method3018();
				local59 = arg0.method3027();
				this.aCharArray12[local44] = local59 == 0 ? 0 : Static383.method5912(local59);
			}
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(Lclient!jc;I)V")
	public void method7247(@OriginalArg(0) Class6_Sub15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 4) {
			return;
		}
		while (true) {
			@Pc(14) int local14 = arg0.method3030();
			if (local14 == 0) {
				return;
			}
			this.method7246(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(IC)I")
	public int method7250(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		if (this.anIntArray521 == null) {
			return -1;
		}
		for (@Pc(13) int local13 = 0; local13 < this.anIntArray521.length; local13++) {
			if (arg1 == this.aCharArray13[local13]) {
				return this.anIntArray521[local13];
			}
		}
		if (arg0 < 0) {
			this.method7250(0, 'R');
		}
		return -1;
	}
}
