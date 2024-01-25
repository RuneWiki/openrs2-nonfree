import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class7_Sub4_Sub15 extends Class7_Sub4 {

	@OriginalMember(owner = "client!ti", name = "p", descriptor = "[C")
	public char[] aCharArray9;

	@OriginalMember(owner = "client!ti", name = "r", descriptor = "[I")
	public int[] anIntArray557;

	@OriginalMember(owner = "client!ti", name = "t", descriptor = "[I")
	public int[] anIntArray558;

	@OriginalMember(owner = "client!ti", name = "w", descriptor = "Ljava/lang/String;")
	public String aString62;

	@OriginalMember(owner = "client!ti", name = "z", descriptor = "[C")
	public char[] aCharArray10;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILclient!gk;I)V")
	private void method4943(@OriginalArg(1) Class7_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString62 = arg0.method3986();
			return;
		}
		@Pc(26) int local26;
		@Pc(36) int local36;
		@Pc(49) byte local49;
		if (arg1 == 2) {
			local26 = arg0.method3981();
			this.aCharArray10 = new char[local26];
			this.anIntArray558 = new int[local26];
			for (local36 = 0; local36 < local26; local36++) {
				this.anIntArray558[local36] = arg0.method3943();
				local49 = arg0.method3930();
				this.aCharArray10[local36] = local49 == 0 ? 0 : Static395.method5018(local49);
			}
			return;
		}
		if (arg1 != 3) {
			return;
		}
		local26 = arg0.method3981();
		this.anIntArray557 = new int[local26];
		this.aCharArray9 = new char[local26];
		for (local36 = 0; local36 < local26; local36++) {
			this.anIntArray557[local36] = arg0.method3943();
			local49 = arg0.method3930();
			this.aCharArray9[local36] = local49 == 0 ? 0 : Static395.method5018(local49);
		}
		return;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IC)I")
	public int method4945(@OriginalArg(1) char arg0) {
		if (this.anIntArray557 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray557.length; local12++) {
			if (this.aCharArray9[local12] == arg0) {
				return this.anIntArray557[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "(I)V")
	public void method4946() {
		@Pc(10) int local10;
		if (this.anIntArray557 != null) {
			for (local10 = 0; local10 < this.anIntArray557.length; local10++) {
				this.anIntArray557[local10] |= 0x8000;
			}
		}
		if (this.anIntArray558 != null) {
			for (local10 = 0; local10 < this.anIntArray558.length; local10++) {
				this.anIntArray558[local10] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(BC)I")
	public int method4947(@OriginalArg(1) char arg0) {
		if (this.anIntArray558 == null) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray558.length; local18++) {
			if (this.aCharArray10[local18] == arg0) {
				return this.anIntArray558[local18];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILclient!gk;)V")
	public void method4949(@OriginalArg(1) Class7_Sub14 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3981();
			if (local9 == 0) {
				return;
			}
			this.method4943(arg0, local9);
		}
	}
}
