import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class7_Sub4_Sub13 extends Class7_Sub4 {

	@OriginalMember(owner = "client!qf", name = "r", descriptor = "[I")
	public int[] anIntArray480;

	@OriginalMember(owner = "client!qf", name = "y", descriptor = "Lclient!qh;")
	public Class204 aClass204_2;

	@OriginalMember(owner = "client!qf", name = "C", descriptor = "[I")
	private int[] anIntArray481;

	@OriginalMember(owner = "client!qf", name = "H", descriptor = "[[I")
	private int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!qf", name = "M", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray43;

	@OriginalMember(owner = "client!qf", name = "u", descriptor = "Z")
	public boolean aBoolean358 = true;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILclient!gk;I)V")
	private void method4270(@OriginalArg(1) Class7_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray43 = Static295.method3893(arg0.method3986(), '<');
			return;
		}
		@Pc(35) int local35;
		@Pc(45) int local45;
		if (arg1 == 2) {
			local35 = arg0.method3981();
			this.anIntArray480 = new int[local35];
			for (local45 = 0; local45 < local35; local45++) {
				this.anIntArray480[local45] = arg0.method3943();
			}
		} else if (arg1 == 3) {
			local35 = arg0.method3981();
			this.anIntArray481 = new int[local35];
			this.anIntArrayArray47 = new int[local35][];
			for (local45 = 0; local45 < local35; local45++) {
				@Pc(51) int local51 = arg0.method3943();
				@Pc(55) Class83 local55 = Static189.method4307(local51);
				if (local55 != null) {
					this.anIntArray481[local45] = local51;
					this.anIntArrayArray47[local45] = new int[local55.anInt2396];
					for (@Pc(71) int local71 = 0; local71 < local55.anInt2396; local71++) {
						this.anIntArrayArray47[local45][local71] = arg0.method3943();
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean358 = false;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!gk;I)Ljava/lang/String;")
	public String method4273(@OriginalArg(0) Class7_Sub14 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray481 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray481.length; local15++) {
				local10.append(this.aStringArray43[local15]);
				local10.append(this.aClass204_2.method4291(arg0.method3944(Static189.method4307(this.anIntArray481[local15]).anInt2401), this.method4279(local15), this.anIntArrayArray47[local15]));
			}
		}
		local10.append(this.aStringArray43[this.aStringArray43.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "(B)Ljava/lang/String;")
	public String method4274() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray43 == null) {
			return "";
		}
		local10.append(this.aStringArray43[0]);
		for (@Pc(31) int local31 = 1; local31 < this.aStringArray43.length; local31++) {
			local10.append("...");
			local10.append(this.aStringArray43[local31]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "(I)I")
	public int method4275() {
		return this.anIntArray481 == null ? 0 : this.anIntArray481.length;
	}

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "(B)V")
	public void method4277() {
		if (this.anIntArray480 != null) {
			for (@Pc(17) int local17 = 0; local17 < this.anIntArray480.length; local17++) {
				this.anIntArray480[local17] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z[ILclient!gk;)V")
	public void method4278(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (this.anIntArray481 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray481.length; local15++) {
			if (arg0.length <= local15) {
				return;
			}
			@Pc(23) int local23 = this.method4279(local15).anInt2402;
			if (local23 > 0) {
				arg1.method3979(local23, (long) arg0[local15]);
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)Lclient!fp;")
	public Class83 method4279(@OriginalArg(0) int arg0) {
		return this.anIntArray481 == null || arg0 < 0 || this.anIntArray481.length < arg0 ? null : Static189.method4307(this.anIntArray481[arg0]);
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(Lclient!gk;I)V")
	public void method4281(@OriginalArg(0) Class7_Sub14 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3981();
			if (local5 == 0) {
				return;
			}
			this.method4270(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIB)I")
	public int method4282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray481 == null || arg1 < 0 || this.anIntArray481.length < arg1) {
			return -1;
		} else if (this.anIntArrayArray47[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray47[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray47[arg1][arg0];
		}
	}
}
