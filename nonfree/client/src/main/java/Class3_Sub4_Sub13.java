import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class3_Sub4_Sub13 extends Class3_Sub4 {

	@OriginalMember(owner = "client!rg", name = "u", descriptor = "[C")
	public char[] aCharArray5;

	@OriginalMember(owner = "client!rg", name = "w", descriptor = "Ljava/lang/String;")
	public String aString55;

	@OriginalMember(owner = "client!rg", name = "y", descriptor = "[C")
	public char[] aCharArray6;

	@OriginalMember(owner = "client!rg", name = "D", descriptor = "[I")
	public int[] anIntArray388;

	@OriginalMember(owner = "client!rg", name = "G", descriptor = "[I")
	public int[] anIntArray390;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(BC)I")
	public int method4603(@OriginalArg(1) char arg0) {
		if (this.anIntArray388 == null) {
			return -1;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray388.length; local15++) {
			if (this.aCharArray5[local15] == arg0) {
				return this.anIntArray388[local15];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILclient!cu;)V")
	public void method4604(@OriginalArg(1) Class3_Sub7 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method2582();
			if (local3 == 0) {
				return;
			}
			this.method4606(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILclient!cu;I)V")
	private void method4606(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 == 1) {
			this.aString55 = arg1.method2620();
			return;
		}
		@Pc(27) int local27;
		@Pc(37) int local37;
		@Pc(49) byte local49;
		if (arg0 == 2) {
			local27 = arg1.method2582();
			this.aCharArray5 = new char[local27];
			this.anIntArray388 = new int[local27];
			for (local37 = 0; local37 < local27; local37++) {
				this.anIntArray388[local37] = arg1.method2588();
				local49 = arg1.method2612();
				this.aCharArray5[local37] = local49 == 0 ? 0 : Static35.method718(local49);
			}
		} else if (arg0 == 3) {
			local27 = arg1.method2582();
			this.aCharArray6 = new char[local27];
			this.anIntArray390 = new int[local27];
			for (local37 = 0; local37 < local27; local37++) {
				this.anIntArray390[local37] = arg1.method2588();
				local49 = arg1.method2612();
				this.aCharArray6[local37] = local49 == 0 ? 0 : Static35.method718(local49);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IC)I")
	public int method4607(@OriginalArg(1) char arg0) {
		if (this.anIntArray390 == null) {
			return -1;
		}
		for (@Pc(10) int local10 = 0; local10 < this.anIntArray390.length; local10++) {
			if (this.aCharArray6[local10] == arg0) {
				return this.anIntArray390[local10];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "(B)V")
	public void method4608() {
		@Pc(8) int local8;
		if (this.anIntArray390 != null) {
			for (local8 = 0; local8 < this.anIntArray390.length; local8++) {
				this.anIntArray390[local8] |= 0x8000;
			}
		}
		if (this.anIntArray388 != null) {
			for (local8 = 0; local8 < this.anIntArray388.length; local8++) {
				this.anIntArray388[local8] |= 0x8000;
			}
		}
	}
}
