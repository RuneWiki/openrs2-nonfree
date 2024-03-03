import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class2_Sub2_Sub12 extends Class2_Sub2 {

	@OriginalMember(owner = "client!mn", name = "B", descriptor = "I")
	public static int anInt3814 = 0;

	@OriginalMember(owner = "client!mn", name = "I", descriptor = "I")
	public static int anInt3817 = 0;

	@OriginalMember(owner = "client!mn", name = "C", descriptor = "[I")
	public int[] anIntArray232;

	@OriginalMember(owner = "client!mn", name = "D", descriptor = "[C")
	public char[] aCharArray4;

	@OriginalMember(owner = "client!mn", name = "E", descriptor = "[I")
	public int[] anIntArray233;

	@OriginalMember(owner = "client!mn", name = "G", descriptor = "Ljava/lang/String;")
	public String aString37;

	@OriginalMember(owner = "client!mn", name = "M", descriptor = "[C")
	public char[] aCharArray5;

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "(B)V", line = 8)
	public void method3794() {
		@Pc(10) int local10;
		if (this.anIntArray232 != null) {
			for (local10 = 0; local10 < this.anIntArray232.length; local10++) {
				this.anIntArray232[local10] |= 0x8000;
			}
		}
		if (this.anIntArray233 != null) {
			for (local10 = 0; local10 < this.anIntArray233.length; local10++) {
				this.anIntArray233[local10] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(CZ)I", line = 46)
	public int method3795(@OriginalArg(0) char arg0) {
		if (this.anIntArray233 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray233.length; local20++) {
			if (this.aCharArray4[local20] == arg0) {
				return this.anIntArray233[local20];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(BILclient!bt;)V", line = 100)
	private void method3797(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub4 arg1) {
		if (arg0 == 1) {
			this.aString37 = arg1.method4810();
			return;
		}
		@Pc(16) int local16;
		@Pc(26) int local26;
		@Pc(39) byte local39;
		if (arg0 == 2) {
			local16 = arg1.method4816();
			this.anIntArray233 = new int[local16];
			this.aCharArray4 = new char[local16];
			for (local26 = 0; local26 < local16; local26++) {
				this.anIntArray233[local26] = arg1.method4830();
				local39 = arg1.method4826();
				this.aCharArray4[local26] = local39 == 0 ? 0 : Static74.method5699(local39);
			}
		} else if (arg0 == 3) {
			local16 = arg1.method4816();
			this.aCharArray5 = new char[local16];
			this.anIntArray232 = new int[local16];
			for (local26 = 0; local26 < local16; local26++) {
				this.anIntArray232[local26] = arg1.method4830();
				local39 = arg1.method4826();
				this.aCharArray5[local26] = local39 == 0 ? 0 : Static74.method5699(local39);
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!bt;B)V", line = 166)
	public void method3798(@OriginalArg(0) Class2_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4816();
			if (local5 == 0) {
				return;
			}
			this.method3797(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZC)I", line = 187)
	public int method3799(@OriginalArg(1) char arg0) {
		if (this.anIntArray232 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray232.length; local17++) {
			if (this.aCharArray5[local17] == arg0) {
				return this.anIntArray232[local17];
			}
		}
		return -1;
	}
}
