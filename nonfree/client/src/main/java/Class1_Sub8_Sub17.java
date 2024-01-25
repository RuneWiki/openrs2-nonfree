import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class1_Sub8_Sub17 extends Class1_Sub8 {

	@OriginalMember(owner = "client!tl", name = "x", descriptor = "[I")
	private int[] anIntArray530;

	@OriginalMember(owner = "client!tl", name = "C", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray34;

	@OriginalMember(owner = "client!tl", name = "D", descriptor = "[[I")
	private int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!tl", name = "E", descriptor = "Lclient!lo;")
	public Class211 aClass211_2;

	@OriginalMember(owner = "client!tl", name = "G", descriptor = "[I")
	public int[] anIntArray531;

	@OriginalMember(owner = "client!tl", name = "y", descriptor = "Z")
	public boolean aBoolean660 = true;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!ac;I)Ljava/lang/String;")
	public String method7100(@OriginalArg(0) Class1_Sub3 arg0) {
		@Pc(15) StringBuffer local15 = new StringBuffer(80);
		if (this.anIntArray530 != null) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray530.length; local20++) {
				local15.append(this.aStringArray34[local20]);
				local15.append(this.aClass211_2.method4598(arg0.method7913(Static412.method5875(this.anIntArray530[local20]).anInt3213), this.method7108(local20), this.anIntArrayArray51[local20]));
			}
		}
		local15.append(this.aStringArray34[this.aStringArray34.length - 1]);
		return local15.toString();
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "([ILclient!ac;I)V")
	public void method7101(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class1_Sub3 arg1) {
		if (this.anIntArray530 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anIntArray530.length; local11++) {
			if (arg0.length <= local11) {
				return;
			}
			@Pc(19) int local19 = this.method7108(local11).anInt3217;
			if (local19 > 0) {
				arg1.method7962(local19, (long) arg0[local11]);
			}
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IILclient!ac;)V")
	private void method7102(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 1) {
			this.aStringArray34 = Static95.method1438(arg1.method7951(), '<');
			return;
		}
		@Pc(16) int local16;
		@Pc(26) int local26;
		if (arg0 == 2) {
			local16 = arg1.method7974();
			this.anIntArray531 = new int[local16];
			for (local26 = 0; local26 < local16; local26++) {
				this.anIntArray531[local26] = arg1.method7945();
			}
		} else if (arg0 == 3) {
			local16 = arg1.method7974();
			this.anIntArrayArray51 = new int[local16][];
			this.anIntArray530 = new int[local16];
			for (local26 = 0; local26 < local16; local26++) {
				@Pc(32) int local32 = arg1.method7945();
				@Pc(36) Class121 local36 = Static412.method5875(local32);
				if (local36 != null) {
					this.anIntArray530[local26] = local32;
					this.anIntArrayArray51[local26] = new int[local36.anInt3215];
					for (@Pc(52) int local52 = 0; local52 < local36.anInt3215; local52++) {
						this.anIntArrayArray51[local26][local52] = arg1.method7945();
					}
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean660 = false;
		}
	}

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "(I)V")
	public void method7103() {
		if (this.anIntArray531 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray531.length; local14++) {
				this.anIntArray531[local14] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(Lclient!ac;I)V")
	public void method7104(@OriginalArg(0) Class1_Sub3 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method7974();
			if (local9 == 0) {
				return;
			}
			this.method7102(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "(Z)I")
	public int method7105() {
		return this.anIntArray530 == null ? 0 : this.anIntArray530.length;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)I")
	public int method7106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray530 == null || arg0 < 0 || arg0 > this.anIntArray530.length) {
			return -1;
		} else if (this.anIntArrayArray51[arg0] == null || arg1 < 0 || this.anIntArrayArray51[arg0].length < arg1) {
			return -1;
		} else {
			return this.anIntArrayArray51[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)Lclient!go;")
	public Class121 method7108(@OriginalArg(1) int arg0) {
		return this.anIntArray530 == null || arg0 < 0 || this.anIntArray530.length < arg0 ? null : Static412.method5875(this.anIntArray530[arg0]);
	}

	@OriginalMember(owner = "client!tl", name = "g", descriptor = "(I)Ljava/lang/String;")
	public String method7109() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray34 == null) {
			return "";
		}
		local10.append(this.aStringArray34[0]);
		for (@Pc(24) int local24 = 1; local24 < this.aStringArray34.length; local24++) {
			local10.append("...");
			local10.append(this.aStringArray34[local24]);
		}
		return local10.toString();
	}
}
