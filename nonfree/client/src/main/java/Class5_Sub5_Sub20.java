import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uv")
public final class Class5_Sub5_Sub20 extends Class5_Sub5 {

	@OriginalMember(owner = "client!uv", name = "t", descriptor = "[I")
	public int[] anIntArray554;

	@OriginalMember(owner = "client!uv", name = "w", descriptor = "Ljava/lang/String;")
	public String aString105;

	@OriginalMember(owner = "client!uv", name = "B", descriptor = "[C")
	public char[] aCharArray7;

	@OriginalMember(owner = "client!uv", name = "D", descriptor = "[I")
	public int[] anIntArray555;

	@OriginalMember(owner = "client!uv", name = "F", descriptor = "[C")
	public char[] aCharArray8;

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lclient!ofa;B)V")
	public void method8399(@OriginalArg(0) Class5_Sub22 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5966();
			if (local13 == 0) {
				return;
			}
			this.method8406(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)V")
	public void method8400() {
		@Pc(16) int local16;
		if (this.anIntArray554 != null) {
			for (local16 = 0; local16 < this.anIntArray554.length; local16++) {
				this.anIntArray554[local16] |= 0x8000;
			}
		}
		if (this.anIntArray555 != null) {
			for (local16 = 0; local16 < this.anIntArray555.length; local16++) {
				this.anIntArray555[local16] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(BC)I")
	public int method8403(@OriginalArg(1) char arg0) {
		if (this.anIntArray555 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray555.length; local12++) {
			if (arg0 == this.aCharArray7[local12]) {
				return this.anIntArray555[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(CB)I")
	public int method8404(@OriginalArg(0) char arg0) {
		if (this.anIntArray554 == null) {
			return -1;
		}
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray554.length; local19++) {
			if (this.aCharArray8[local19] == arg0) {
				return this.anIntArray554[local19];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILclient!ofa;I)V")
	private void method8406(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub22 arg1) {
		if (arg0 == 1) {
			this.aString105 = arg1.method5937();
			return;
		}
		@Pc(26) int local26;
		@Pc(36) int local36;
		@Pc(49) byte local49;
		if (arg0 == 2) {
			local26 = arg1.method5966();
			this.aCharArray7 = new char[local26];
			this.anIntArray555 = new int[local26];
			for (local36 = 0; local36 < local26; local36++) {
				this.anIntArray555[local36] = arg1.method5968();
				local49 = arg1.method5963();
				this.aCharArray7[local36] = local49 == 0 ? 0 : Static644.method9020(local49);
			}
		} else if (arg0 == 3) {
			local26 = arg1.method5966();
			this.aCharArray8 = new char[local26];
			this.anIntArray554 = new int[local26];
			for (local36 = 0; local36 < local26; local36++) {
				this.anIntArray554[local36] = arg1.method5968();
				local49 = arg1.method5963();
				this.aCharArray8[local36] = local49 == 0 ? 0 : Static644.method9020(local49);
			}
		}
	}
}
