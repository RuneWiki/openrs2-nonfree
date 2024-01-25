import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bda")
public final class Class5_Sub1_Sub2 extends Class5_Sub1 {

	@OriginalMember(owner = "client!bda", name = "K", descriptor = "[I")
	public int[] anIntArray39;

	@OriginalMember(owner = "client!bda", name = "I", descriptor = "Ljava/lang/String;")
	public String aString7;

	@OriginalMember(owner = "client!bda", name = "B", descriptor = "[C")
	public char[] aCharArray1;

	@OriginalMember(owner = "client!bda", name = "v", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!bda", name = "D", descriptor = "[I")
	public int[] anIntArray42;

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(CB)I")
	public int method531(@OriginalArg(0) char arg0) {
		if (this.anIntArray39 == null) {
			return -1;
		}
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray39.length; local21++) {
			if (this.aCharArray2[local21] == arg0) {
				return this.anIntArray39[local21];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!bda", name = "c", descriptor = "(I)V")
	public void method532() {
		@Pc(6) int local6;
		if (this.anIntArray39 != null) {
			for (local6 = 0; local6 < this.anIntArray39.length; local6++) {
				this.anIntArray39[local6] |= 0x8000;
			}
		}
		if (this.anIntArray42 != null) {
			for (local6 = 0; local6 < this.anIntArray42.length; local6++) {
				this.anIntArray42[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILclient!wq;Z)V")
	private void method533(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub36 arg1) {
		if (arg0 == 1) {
			this.aString7 = arg1.method7281();
			return;
		}
		@Pc(38) int local38;
		@Pc(48) int local48;
		@Pc(63) byte local63;
		if (arg0 == 2) {
			local38 = arg1.method7291();
			this.anIntArray42 = new int[local38];
			this.aCharArray1 = new char[local38];
			for (local48 = 0; local48 < local38; local48++) {
				this.anIntArray42[local48] = arg1.method7333();
				local63 = arg1.method7318();
				this.aCharArray1[local48] = local63 == 0 ? 0 : Static92.method8227(local63);
			}
		} else if (arg0 == 3) {
			local38 = arg1.method7291();
			this.anIntArray39 = new int[local38];
			this.aCharArray2 = new char[local38];
			for (local48 = 0; local48 < local38; local48++) {
				this.anIntArray39[local48] = arg1.method7333();
				local63 = arg1.method7318();
				this.aCharArray2[local48] = local63 == 0 ? 0 : Static92.method8227(local63);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(CB)I")
	public int method535(@OriginalArg(0) char arg0) {
		if (this.anIntArray42 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray42.length; local20++) {
			if (this.aCharArray1[local20] == arg0) {
				return this.anIntArray42[local20];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILclient!wq;)V")
	public void method536(@OriginalArg(1) Class5_Sub36 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method7291();
			if (local5 == 0) {
				return;
			}
			this.method533(local5, arg0);
		}
	}
}
