import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bca")
public final class Class1_Sub3_Sub3 extends Class1_Sub3 {

	@OriginalMember(owner = "client!bca", name = "w", descriptor = "[[I")
	private int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!bca", name = "y", descriptor = "Lclient!wq;")
	public Class362 aClass362_1;

	@OriginalMember(owner = "client!bca", name = "D", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray2;

	@OriginalMember(owner = "client!bca", name = "H", descriptor = "[I")
	private int[] anIntArray28;

	@OriginalMember(owner = "client!bca", name = "P", descriptor = "[I")
	public int[] anIntArray29;

	@OriginalMember(owner = "client!bca", name = "L", descriptor = "Z")
	public boolean aBoolean79 = true;

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)I")
	public int method805() {
		return this.anIntArray28 == null ? 0 : this.anIntArray28.length;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(BI)Lclient!lg;")
	public Class201 method806(@OriginalArg(1) int arg0) {
		return this.anIntArray28 == null || arg0 < 0 || this.anIntArray28.length < arg0 ? null : Static442.method6338(this.anIntArray28[arg0]);
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(III)I")
	public int method807(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray28 == null || arg0 < 0 || this.anIntArray28.length < arg0) {
			return -1;
		} else if (this.anIntArrayArray4[arg0] == null || arg1 < 0 || this.anIntArrayArray4[arg0].length < arg1) {
			return -1;
		} else {
			return this.anIntArrayArray4[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "([IILclient!io;)V")
	public void method809(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class1_Sub20 arg1) {
		if (this.anIntArray28 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray28.length; local17++) {
			if (local17 >= arg0.length) {
				return;
			}
			@Pc(25) int local25 = this.method806(local17).anInt5471;
			if (local25 > 0) {
				arg1.method4428(local25, (long) arg0[local17]);
			}
		}
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(Z)V")
	public void method810() {
		if (this.anIntArray29 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray29.length; local10++) {
				this.anIntArray29[local10] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(ILclient!io;)V")
	public void method811(@OriginalArg(1) Class1_Sub20 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4393();
			if (local5 == 0) {
				return;
			}
			this.method814(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(ZILclient!io;)V")
	private void method814(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub20 arg1) {
		if (arg0 == 1) {
			this.aStringArray2 = Static46.method1116('<', arg1.method4388());
			return;
		}
		@Pc(34) int local34;
		@Pc(40) int local40;
		if (arg0 == 2) {
			local34 = arg1.method4393();
			this.anIntArray29 = new int[local34];
			for (local40 = 0; local40 < local34; local40++) {
				this.anIntArray29[local40] = arg1.method4426();
			}
		} else if (arg0 == 3) {
			local34 = arg1.method4393();
			this.anIntArrayArray4 = new int[local34][];
			this.anIntArray28 = new int[local34];
			for (local40 = 0; local40 < local34; local40++) {
				@Pc(77) int local77 = arg1.method4426();
				@Pc(81) Class201 local81 = Static442.method6338(local77);
				if (local81 != null) {
					this.anIntArray28[local40] = local77;
					this.anIntArrayArray4[local40] = new int[local81.anInt5473];
					for (@Pc(97) int local97 = 0; local97 < local81.anInt5473; local97++) {
						this.anIntArrayArray4[local40][local97] = arg1.method4426();
					}
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean79 = false;
		}
	}

	@OriginalMember(owner = "client!bca", name = "b", descriptor = "(Z)Ljava/lang/String;")
	public String method816() {
		@Pc(15) StringBuffer local15 = new StringBuffer(80);
		if (this.aStringArray2 == null) {
			return "";
		}
		local15.append(this.aStringArray2[0]);
		for (@Pc(29) int local29 = 1; local29 < this.aStringArray2.length; local29++) {
			local15.append("...");
			local15.append(this.aStringArray2[local29]);
		}
		return local15.toString();
	}

	@OriginalMember(owner = "client!bca", name = "b", descriptor = "(ILclient!io;)Ljava/lang/String;")
	public String method818(@OriginalArg(1) Class1_Sub20 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray28 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray28.length; local15++) {
				local10.append(this.aStringArray2[local15]);
				local10.append(this.aClass362_1.method7871(this.anIntArrayArray4[local15], arg0.method4415(Static442.method6338(this.anIntArray28[local15]).anInt5474), this.method806(local15)));
			}
		}
		local10.append(this.aStringArray2[this.aStringArray2.length - 1]);
		return local10.toString();
	}
}
