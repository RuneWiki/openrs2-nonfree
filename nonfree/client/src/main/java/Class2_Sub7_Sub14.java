import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class2_Sub7_Sub14 extends Class2_Sub7 {

	@OriginalMember(owner = "client!pc", name = "A", descriptor = "[I")
	public int[] anIntArray404;

	@OriginalMember(owner = "client!pc", name = "B", descriptor = "[C")
	public char[] aCharArray4;

	@OriginalMember(owner = "client!pc", name = "D", descriptor = "[C")
	public char[] aCharArray5;

	@OriginalMember(owner = "client!pc", name = "E", descriptor = "Ljava/lang/String;")
	public String aString45;

	@OriginalMember(owner = "client!pc", name = "F", descriptor = "[I")
	public int[] anIntArray405;

	static {
		new Class62("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!vt;I)V")
	public void method4447(@OriginalArg(0) Class2_Sub24 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5732();
			if (local9 == 0) {
				return;
			}
			this.method4452(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BC)I")
	public int method4449(@OriginalArg(1) char arg0) {
		if (this.anIntArray405 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray405.length; local12++) {
			if (this.aCharArray5[local12] == arg0) {
				return this.anIntArray405[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!vt;B)V")
	private void method4452(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub24 arg1) {
		if (arg0 == 1) {
			this.aString45 = arg1.method5744();
			return;
		}
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(47) byte local47;
		if (arg0 == 2) {
			local24 = arg1.method5732();
			this.aCharArray4 = new char[local24];
			this.anIntArray404 = new int[local24];
			for (local34 = 0; local34 < local24; local34++) {
				this.anIntArray404[local34] = arg1.method5753();
				local47 = arg1.method5759();
				this.aCharArray4[local34] = local47 == 0 ? 0 : Static168.method2964(local47);
			}
		} else if (arg0 == 3) {
			local24 = arg1.method5732();
			this.aCharArray5 = new char[local24];
			this.anIntArray405 = new int[local24];
			for (local34 = 0; local34 < local24; local34++) {
				this.anIntArray405[local34] = arg1.method5753();
				local47 = arg1.method5759();
				this.aCharArray5[local34] = local47 == 0 ? 0 : Static168.method2964(local47);
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(BC)I")
	public int method4453(@OriginalArg(1) char arg0) {
		if (this.anIntArray404 == null) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray404.length; local18++) {
			if (arg0 == this.aCharArray4[local18]) {
				return this.anIntArray404[local18];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "(B)V")
	public void method4454() {
		@Pc(6) int local6;
		if (this.anIntArray405 != null) {
			for (local6 = 0; local6 < this.anIntArray405.length; local6++) {
				this.anIntArray405[local6] |= 0x8000;
			}
		}
		if (this.anIntArray404 != null) {
			for (local6 = 0; local6 < this.anIntArray404.length; local6++) {
				this.anIntArray404[local6] |= 0x8000;
			}
		}
	}
}
