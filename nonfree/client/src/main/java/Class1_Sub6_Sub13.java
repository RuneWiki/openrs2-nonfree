import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class1_Sub6_Sub13 extends Class1_Sub6 {

	@OriginalMember(owner = "client!pm", name = "M", descriptor = "[Lclient!sc;")
	public static final Class208[] aClass208Array1 = new Class208[5];

	@OriginalMember(owner = "client!pm", name = "s", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray67;

	@OriginalMember(owner = "client!pm", name = "t", descriptor = "[I")
	private int[] anIntArray575;

	@OriginalMember(owner = "client!pm", name = "D", descriptor = "[I")
	public int[] anIntArray576;

	@OriginalMember(owner = "client!pm", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!pm", name = "C", descriptor = "Z")
	public boolean aBoolean458 = true;

	static {
		for (@Pc(10) int local10 = 0; local10 < aClass208Array1.length; local10++) {
			aClass208Array1[local10] = new Class208();
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!re;II)V")
	private void method4174(@OriginalArg(0) Class1_Sub33 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aStringArray67 = Static88.method1335(arg0.method5128(), '<');
			return;
		}
		@Pc(27) int local27;
		@Pc(33) int local33;
		if (arg1 == 2) {
			local27 = arg0.method5174();
			this.anIntArray576 = new int[local27];
			for (local33 = 0; local33 < local27; local33++) {
				this.anIntArray576[local33] = arg0.method5177();
			}
		} else if (arg1 == 3) {
			local27 = arg0.method5174();
			this.anIntArrayArray52 = new int[local27][];
			this.anIntArray575 = new int[local27];
			for (local33 = 0; local33 < local27; local33++) {
				@Pc(83) int local83 = arg0.method5177();
				this.anIntArray575[local33] = local83;
				this.anIntArrayArray52[local33] = new int[Static232.anIntArray121[local83]];
				for (@Pc(98) int local98 = 0; local98 < Static232.anIntArray121[local83]; local98++) {
					this.anIntArrayArray52[local33][local98] = arg0.method5177();
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean458 = false;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!re;I)V")
	public void method4175(@OriginalArg(0) Class1_Sub33 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5174();
			if (local5 == 0) {
				return;
			}
			this.method4174(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "(I)V")
	public void method4177() {
		if (this.anIntArray576 != null) {
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray576.length; local12++) {
				this.anIntArray576[local12] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)I")
	public int method4179(@OriginalArg(0) int arg0) {
		return this.anIntArray575 == null || arg0 < 0 || this.anIntArray575.length < arg0 ? -1 : this.anIntArray575[arg0];
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BLclient!re;)Ljava/lang/String;")
	public String method4181(@OriginalArg(1) Class1_Sub33 arg0) {
		@Pc(16) StringBuffer local16 = new StringBuffer(80);
		if (this.anIntArray575 != null) {
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray575.length; local21++) {
				local16.append(this.aStringArray67[local21]);
				local16.append(Static329.method3257(this.anIntArray575[local21], this.anIntArrayArray52[local21], arg0.method5171(Static48.anIntArray133[this.anIntArray575[local21]])));
			}
		}
		local16.append(this.aStringArray67[this.aStringArray67.length - 1]);
		return local16.toString();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public String method4183() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray67 == null) {
			return "";
		}
		local10.append(this.aStringArray67[0]);
		for (@Pc(29) int local29 = 1; local29 < this.aStringArray67.length; local29++) {
			local10.append("...");
			local10.append(this.aStringArray67[local29]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "(I)I")
	public int method4184() {
		return this.anIntArray575 == null ? 0 : this.anIntArray575.length;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!re;I[I)V")
	public void method4185(@OriginalArg(0) Class1_Sub33 arg0, @OriginalArg(2) int[] arg1) {
		if (this.anIntArray575 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray575.length; local19++) {
			if (local19 >= arg1.length) {
				return;
			}
			@Pc(28) int local28 = Static241.anIntArray508[this.method4179(local19)];
			if (local28 > 0) {
				arg0.method5145(local28, (long) arg1[local19]);
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIB)I")
	public int method4188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray575 == null || arg1 < 0 || this.anIntArray575.length < arg1) {
			return -1;
		} else if (this.anIntArrayArray52[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray52[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray52[arg1][arg0];
		}
	}
}
