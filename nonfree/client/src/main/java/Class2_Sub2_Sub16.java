import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class2_Sub2_Sub16 extends Class2_Sub2 {

	@OriginalMember(owner = "client!tb", name = "E", descriptor = "[I")
	public static final int[] anIntArray416 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!tb", name = "I", descriptor = "Z")
	public static volatile boolean aBoolean412 = true;

	@OriginalMember(owner = "client!tb", name = "B", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_127 = new Class79(" more options", " weitere Optionen", " autres options", " mais opções");

	@OriginalMember(owner = "client!tb", name = "F", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray56;

	@OriginalMember(owner = "client!tb", name = "G", descriptor = "[I")
	private int[] anIntArray417;

	@OriginalMember(owner = "client!tb", name = "S", descriptor = "[[I")
	private int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!tb", name = "T", descriptor = "[I")
	public int[] anIntArray418;

	@OriginalMember(owner = "client!tb", name = "K", descriptor = "Z")
	public boolean aBoolean413 = true;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!bt;I)V", line = 3)
	private void method5595(@OriginalArg(1) Class2_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray56 = Static187.method3644('<', arg0.method4810());
			return;
		}
		@Pc(23) int local23;
		@Pc(29) int local29;
		if (arg1 == 2) {
			local23 = arg0.method4816();
			this.anIntArray418 = new int[local23];
			for (local29 = 0; local29 < local23; local29++) {
				this.anIntArray418[local29] = arg0.method4830();
			}
		} else if (arg1 == 3) {
			local23 = arg0.method4816();
			this.anIntArray417 = new int[local23];
			this.anIntArrayArray52 = new int[local23][];
			for (local29 = 0; local29 < local23; local29++) {
				@Pc(81) int local81 = arg0.method4830();
				this.anIntArray417[local29] = local81;
				this.anIntArrayArray52[local29] = new int[Class2_Sub3_Sub6.anIntArray86[local81]];
				for (@Pc(96) int local96 = 0; local96 < Class2_Sub3_Sub6.anIntArray86[local81]; local96++) {
					this.anIntArrayArray52[local29][local96] = arg0.method4830();
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean413 = false;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)I", line = 89)
	public int method5597(@OriginalArg(1) int arg0) {
		return this.anIntArray417 == null || arg0 < 0 || this.anIntArray417.length < arg0 ? -1 : this.anIntArray417[arg0];
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!bt;I[I)V", line = 104)
	public void method5598(@OriginalArg(0) Class2_Sub4 arg0, @OriginalArg(2) int[] arg1) {
		if (this.anIntArray417 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray417.length; local19++) {
			if (arg1.length <= local19) {
				return;
			}
			@Pc(28) int local28 = Class31.anIntArray234[this.method5597(local19)];
			if (local28 > 0) {
				arg0.method4808(local28, (long) arg1[local19]);
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLclient!bt;)V", line = 141)
	public void method5600(@OriginalArg(1) Class2_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4816();
			if (local5 == 0) {
				return;
			}
			this.method5595(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIB)I", line = 165)
	public int method5601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray417 == null || arg0 < 0 || this.anIntArray417.length < arg0) {
			return -1;
		} else if (this.anIntArrayArray52[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray52[arg0].length) {
			return -1;
		} else {
			return this.anIntArrayArray52[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "(B)Ljava/lang/String;", line = 187)
	public String method5602() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray56 == null) {
			return "";
		}
		local10.append(this.aStringArray56[0]);
		for (@Pc(29) int local29 = 1; local29 < this.aStringArray56.length; local29++) {
			local10.append("...");
			local10.append(this.aStringArray56[local29]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!bt;B)Ljava/lang/String;", line = 230)
	public String method5603(@OriginalArg(0) Class2_Sub4 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray417 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray417.length; local15++) {
				local10.append(this.aStringArray56[local15]);
				local10.append(Static318.method5771(this.anIntArrayArray52[local15], this.anIntArray417[local15], arg0.method4861(Class22.anIntArray33[this.anIntArray417[local15]])));
			}
		}
		local10.append(this.aStringArray56[this.aStringArray56.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "(B)I", line = 259)
	public int method5604() {
		return this.anIntArray417 == null ? 0 : this.anIntArray417.length;
	}

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "(B)V", line = 276)
	public void method5605() {
		if (this.anIntArray418 != null) {
			for (@Pc(11) int local11 = 0; local11 < this.anIntArray418.length; local11++) {
				this.anIntArray418[local11] |= 0x8000;
			}
		}
	}
}
