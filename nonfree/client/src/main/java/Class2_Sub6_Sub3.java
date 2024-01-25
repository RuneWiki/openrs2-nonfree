import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class2_Sub6_Sub3 extends Class2_Sub6 {

	@OriginalMember(owner = "client!dt", name = "J", descriptor = "[I")
	public int[] anIntArray160;

	@OriginalMember(owner = "client!dt", name = "z", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!dt", name = "w", descriptor = "[C")
	public char[] aCharArray3;

	@OriginalMember(owner = "client!dt", name = "D", descriptor = "[I")
	public int[] anIntArray161;

	@OriginalMember(owner = "client!dt", name = "F", descriptor = "Ljava/lang/String;")
	public String aString19;

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZC)I")
	public int method1876(@OriginalArg(1) char arg0) {
		if (this.anIntArray160 == null) {
			return -1;
		}
		for (@Pc(13) int local13 = 0; local13 < this.anIntArray160.length; local13++) {
			if (this.aCharArray3[local13] == arg0) {
				return this.anIntArray160[local13];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lclient!et;Z)V")
	public void method1877(@OriginalArg(0) Class2_Sub20 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method8581(-17416);
			if (local10 == 0) {
				return;
			}
			this.method1881(local10, arg0);
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V")
	public void method1878() {
		@Pc(6) int local6;
		if (this.anIntArray161 != null) {
			for (local6 = 0; local6 < this.anIntArray161.length; local6++) {
				this.anIntArray161[local6] |= 0x8000;
			}
		}
		if (this.anIntArray160 != null) {
			for (local6 = 0; local6 < this.anIntArray160.length; local6++) {
				this.anIntArray160[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IILclient!et;)V")
	private void method1881(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 1) {
			this.aString19 = arg1.method8553();
			return;
		}
		@Pc(32) int local32;
		@Pc(42) int local42;
		@Pc(57) byte local57;
		if (arg0 == 2) {
			local32 = arg1.method8581(-17416);
			this.anIntArray160 = new int[local32];
			this.aCharArray3 = new char[local32];
			for (local42 = 0; local42 < local32; local42++) {
				this.anIntArray160[local42] = arg1.method8575();
				local57 = arg1.method8536();
				this.aCharArray3[local42] = local57 == 0 ? 0 : Static639.method8672(local57);
			}
		} else if (arg0 == 3) {
			local32 = arg1.method8581(-17416);
			this.aCharArray2 = new char[local32];
			this.anIntArray161 = new int[local32];
			for (local42 = 0; local42 < local32; local42++) {
				this.anIntArray161[local42] = arg1.method8575();
				local57 = arg1.method8536();
				this.aCharArray2[local42] = local57 == 0 ? 0 : Static639.method8672(local57);
			}
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(CZ)I")
	public int method1882(@OriginalArg(0) char arg0) {
		if (this.anIntArray161 == null) {
			return -1;
		}
		for (@Pc(13) int local13 = 0; local13 < this.anIntArray161.length; local13++) {
			if (this.aCharArray2[local13] == arg0) {
				return this.anIntArray161[local13];
			}
		}
		if (false) {
			this.aString19 = null;
		}
		return -1;
	}
}
