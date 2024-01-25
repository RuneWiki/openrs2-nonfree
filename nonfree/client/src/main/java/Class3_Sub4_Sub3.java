import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bga")
public final class Class3_Sub4_Sub3 extends Class3_Sub4 {

	@OriginalMember(owner = "client!bga", name = "w", descriptor = "Ljava/lang/String;")
	public String aString7;

	@OriginalMember(owner = "client!bga", name = "x", descriptor = "[C")
	public char[] aCharArray1;

	@OriginalMember(owner = "client!bga", name = "B", descriptor = "[I")
	public int[] anIntArray64;

	@OriginalMember(owner = "client!bga", name = "D", descriptor = "[I")
	public int[] anIntArray65;

	@OriginalMember(owner = "client!bga", name = "F", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(B)V")
	public void method1089() {
		if (this.anIntArray65 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.anIntArray65.length; local4++) {
				this.anIntArray65[local4] |= 0x8000;
			}
		}
		if (this.anIntArray64 != null) {
			for (@Pc(42) int local42 = 0; local42 < this.anIntArray64.length; local42++) {
				this.anIntArray64[local42] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(IILclient!fd;)V")
	private void method1090(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub7 arg1) {
		if (arg0 == 1) {
			this.aString7 = arg1.method6536();
			return;
		}
		@Pc(34) int local34;
		@Pc(44) int local44;
		@Pc(56) byte local56;
		if (arg0 == 2) {
			local34 = arg1.method6538();
			this.anIntArray64 = new int[local34];
			this.aCharArray1 = new char[local34];
			for (local44 = 0; local44 < local34; local44++) {
				this.anIntArray64[local44] = arg1.method6535();
				local56 = arg1.method6529();
				this.aCharArray1[local44] = local56 == 0 ? 0 : Static142.method2866(local56);
			}
		} else if (arg0 == 3) {
			local34 = arg1.method6538();
			this.anIntArray65 = new int[local34];
			this.aCharArray2 = new char[local34];
			for (local44 = 0; local44 < local34; local44++) {
				this.anIntArray65[local44] = arg1.method6535();
				local56 = arg1.method6529();
				this.aCharArray2[local44] = local56 == 0 ? 0 : Static142.method2866(local56);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(BC)I")
	public int method1095(@OriginalArg(1) char arg0) {
		if (this.anIntArray64 == null) {
			return -1;
		}
		for (@Pc(10) int local10 = 0; local10 < this.anIntArray64.length; local10++) {
			if (arg0 == this.aCharArray1[local10]) {
				return this.anIntArray64[local10];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(CB)I")
	public int method1096(@OriginalArg(0) char arg0) {
		if (this.anIntArray65 == null) {
			return -1;
		}
		for (@Pc(10) int local10 = 0; local10 < this.anIntArray65.length; local10++) {
			if (arg0 == this.aCharArray2[local10]) {
				return this.anIntArray65[local10];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(Lclient!fd;I)V")
	public void method1099(@OriginalArg(0) Class3_Sub7 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6538();
			if (local5 == 0) {
				return;
			}
			this.method1090(local5, arg0);
		}
	}
}
