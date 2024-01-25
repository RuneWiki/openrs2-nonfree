import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class11_Sub4_Sub16 extends Class11_Sub4 {

	@OriginalMember(owner = "client!rc", name = "A", descriptor = "[I")
	public int[] anIntArray409;

	@OriginalMember(owner = "client!rc", name = "C", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray44;

	@OriginalMember(owner = "client!rc", name = "G", descriptor = "[[I")
	private int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!rc", name = "H", descriptor = "[I")
	private int[] anIntArray411;

	@OriginalMember(owner = "client!rc", name = "M", descriptor = "Z")
	public boolean aBoolean353 = true;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)Ljava/lang/String;")
	public String method4593() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray44 == null) {
			return "";
		}
		local10.append(this.aStringArray44[0]);
		for (@Pc(24) int local24 = 1; local24 < this.aStringArray44.length; local24++) {
			local10.append("...");
			local10.append(this.aStringArray44[local24]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BLclient!kh;I)V")
	private void method4595(@OriginalArg(1) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray44 = Static313.method5273('<', arg0.method5184());
			return;
		}
		@Pc(27) int local27;
		@Pc(37) int local37;
		if (arg1 == 2) {
			local27 = arg0.method5185();
			this.anIntArray409 = new int[local27];
			for (local37 = 0; local37 < local27; local37++) {
				this.anIntArray409[local37] = arg0.method5187();
			}
		} else if (arg1 == 3) {
			local27 = arg0.method5185();
			this.anIntArrayArray59 = new int[local27][];
			this.anIntArray411 = new int[local27];
			for (local37 = 0; local37 < local27; local37++) {
				@Pc(45) int local45 = arg0.method5187();
				this.anIntArray411[local37] = local45;
				this.anIntArrayArray59[local37] = new int[Static84.anIntArray103[local45]];
				for (@Pc(60) int local60 = 0; local60 < Static84.anIntArray103[local45]; local60++) {
					this.anIntArrayArray59[local37][local60] = arg0.method5187();
				}
			}
			return;
		} else if (arg1 == 4) {
			this.aBoolean353 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!kh;)Ljava/lang/String;")
	public String method4596(@OriginalArg(1) Class11_Sub25 arg0) {
		@Pc(18) StringBuffer local18 = new StringBuffer(80);
		if (this.anIntArray411 != null) {
			for (@Pc(23) int local23 = 0; local23 < this.anIntArray411.length; local23++) {
				local18.append(this.aStringArray44[local23]);
				local18.append(Static57.method868(this.anIntArray411[local23], this.anIntArrayArray59[local23], arg0.method5166(Static214.anIntArray338[this.anIntArray411[local23]])));
			}
		}
		local18.append(this.aStringArray44[this.aStringArray44.length - 1]);
		return local18.toString();
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(ILclient!kh;)V")
	public void method4597(@OriginalArg(1) Class11_Sub25 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5185();
			if (local5 == 0) {
				return;
			}
			this.method4595(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)I")
	public int method4598(@OriginalArg(1) int arg0) {
		return this.anIntArray411 == null || arg0 < 0 || arg0 > this.anIntArray411.length ? -1 : this.anIntArray411[arg0];
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IBI)I")
	public int method4600(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray411 == null || arg0 < 0 || arg0 > this.anIntArray411.length) {
			return -1;
		} else if (this.anIntArrayArray59[arg0] == null || arg1 < 0 || this.anIntArrayArray59[arg0].length < arg1) {
			return -1;
		} else {
			return this.anIntArrayArray59[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)I")
	public int method4601() {
		return this.anIntArray411 == null ? 0 : this.anIntArray411.length;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!kh;[II)V")
	public void method4602(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(1) int[] arg1) {
		if (this.anIntArray411 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anIntArray411.length; local11++) {
			if (arg1.length <= local11) {
				return;
			}
			@Pc(22) int local22 = Static262.anIntArray406[this.method4598(local11)];
			if (local22 > 0) {
				arg0.method5213(local22, (long) arg1[local11]);
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)V")
	public void method4604() {
		if (this.anIntArray409 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anIntArray409.length; local6++) {
				this.anIntArray409[local6] |= 0x8000;
			}
		}
	}
}
