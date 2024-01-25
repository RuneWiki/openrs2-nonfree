import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!baa")
public final class Class8_Sub5_Sub2 extends Class8_Sub5 {

	@OriginalMember(owner = "client!baa", name = "v", descriptor = "Ljava/lang/String;")
	public String aString9;

	@OriginalMember(owner = "client!baa", name = "w", descriptor = "[C")
	public char[] aCharArray1;

	@OriginalMember(owner = "client!baa", name = "x", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!baa", name = "A", descriptor = "[I")
	public int[] anIntArray38;

	@OriginalMember(owner = "client!baa", name = "F", descriptor = "[I")
	public int[] anIntArray39;

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(BC)I")
	public int method1109(@OriginalArg(1) char arg0) {
		if (this.anIntArray38 == null) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray38.length; local18++) {
			if (this.aCharArray2[local18] == arg0) {
				return this.anIntArray38[local18];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(ILclient!ig;B)V")
	private void method1111(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8 arg1) {
		if (arg0 == 1) {
			this.aString9 = arg1.method8570();
			return;
		}
		@Pc(15) int local15;
		@Pc(25) int local25;
		@Pc(38) byte local38;
		if (arg0 == 2) {
			local15 = arg1.method8525();
			this.anIntArray39 = new int[local15];
			this.aCharArray1 = new char[local15];
			for (local25 = 0; local25 < local15; local25++) {
				this.anIntArray39[local25] = arg1.method8578();
				local38 = arg1.method8550();
				this.aCharArray1[local25] = local38 == 0 ? 0 : Static303.method4962(local38);
			}
		} else if (arg0 == 3) {
			local15 = arg1.method8525();
			this.aCharArray2 = new char[local15];
			this.anIntArray38 = new int[local15];
			for (local25 = 0; local25 < local15; local25++) {
				this.anIntArray38[local25] = arg1.method8578();
				local38 = arg1.method8550();
				this.aCharArray2[local25] = local38 == 0 ? 0 : Static303.method4962(local38);
			}
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(Lclient!ig;I)V")
	public void method1112(@OriginalArg(0) Class8_Sub8 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8525();
			if (local13 == 0) {
				return;
			}
			this.method1111(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(CI)I")
	public int method1113(@OriginalArg(0) char arg0) {
		if (this.anIntArray39 == null) {
			return -1;
		}
		for (@Pc(10) int local10 = 0; local10 < this.anIntArray39.length; local10++) {
			if (this.aCharArray1[local10] == arg0) {
				return this.anIntArray39[local10];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)V")
	public void method1114() {
		@Pc(10) int local10;
		if (this.anIntArray38 != null) {
			for (local10 = 0; local10 < this.anIntArray38.length; local10++) {
				this.anIntArray38[local10] |= 0x8000;
			}
		}
		if (this.anIntArray39 != null) {
			for (local10 = 0; local10 < this.anIntArray39.length; local10++) {
				this.anIntArray39[local10] |= 0x8000;
			}
		}
	}
}
