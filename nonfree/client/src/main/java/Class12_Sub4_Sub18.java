import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class12_Sub4_Sub18 extends Class12_Sub4 {

	@OriginalMember(owner = "client!wq", name = "A", descriptor = "[C")
	public char[] aCharArray7;

	@OriginalMember(owner = "client!wq", name = "C", descriptor = "[C")
	public char[] aCharArray8;

	@OriginalMember(owner = "client!wq", name = "F", descriptor = "Ljava/lang/String;")
	public String aString107;

	@OriginalMember(owner = "client!wq", name = "G", descriptor = "[I")
	public int[] anIntArray695;

	@OriginalMember(owner = "client!wq", name = "M", descriptor = "[I")
	public int[] anIntArray696;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)V")
	public void method7960() {
		if (this.anIntArray695 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray695.length; local10++) {
				this.anIntArray695[local10] |= 0x8000;
			}
		}
		if (this.anIntArray696 != null) {
			for (@Pc(45) int local45 = 0; local45 < this.anIntArray696.length; local45++) {
				this.anIntArray696[local45] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IBLclient!daa;)V")
	private void method7961(@OriginalArg(0) int arg0, @OriginalArg(2) Class12_Sub8 arg1) {
		if (arg0 == 1) {
			this.aString107 = arg1.method5206();
			return;
		}
		@Pc(17) int local17;
		@Pc(27) int local27;
		@Pc(40) byte local40;
		if (arg0 == 2) {
			local17 = arg1.method5216();
			this.anIntArray696 = new int[local17];
			this.aCharArray8 = new char[local17];
			for (local27 = 0; local27 < local17; local27++) {
				this.anIntArray696[local27] = arg1.method5199();
				local40 = arg1.method5173();
				this.aCharArray8[local27] = local40 == 0 ? 0 : Static485.method7249(local40);
			}
		} else if (arg0 == 3) {
			local17 = arg1.method5216();
			this.aCharArray7 = new char[local17];
			this.anIntArray695 = new int[local17];
			for (local27 = 0; local27 < local17; local27++) {
				this.anIntArray695[local27] = arg1.method5199();
				local40 = arg1.method5173();
				this.aCharArray7[local27] = local40 == 0 ? 0 : Static485.method7249(local40);
			}
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(CI)I")
	public int method7962(@OriginalArg(0) char arg0) {
		if (this.anIntArray695 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray695.length; local20++) {
			if (this.aCharArray7[local20] == arg0) {
				return this.anIntArray695[local20];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILclient!daa;)V")
	public void method7963(@OriginalArg(1) Class12_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5216();
			if (local5 == 0) {
				return;
			}
			this.method7961(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IC)I")
	public int method7965(@OriginalArg(1) char arg0) {
		if (this.anIntArray696 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray696.length; local12++) {
			if (this.aCharArray8[local12] == arg0) {
				return this.anIntArray696[local12];
			}
		}
		return -1;
	}
}
