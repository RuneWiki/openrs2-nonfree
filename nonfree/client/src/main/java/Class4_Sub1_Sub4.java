import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class Class4_Sub1_Sub4 extends Class4_Sub1 {

	@OriginalMember(owner = "client!bp", name = "L", descriptor = "[I")
	public int[] anIntArray39;

	@OriginalMember(owner = "client!bp", name = "N", descriptor = "[I")
	private int[] anIntArray40;

	@OriginalMember(owner = "client!bp", name = "P", descriptor = "Lclient!fm;")
	public Class75 aClass75_1;

	@OriginalMember(owner = "client!bp", name = "Q", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray4;

	@OriginalMember(owner = "client!bp", name = "S", descriptor = "[[I")
	private int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!bp", name = "D", descriptor = "Z")
	public boolean aBoolean29 = true;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ILclient!wn;)Ljava/lang/String;")
	public String method468(@OriginalArg(1) Class4_Sub20 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray40 != null) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray40.length; local20++) {
				local10.append(this.aStringArray4[local20]);
				local10.append(this.aClass75_1.method2198(this.method476(local20), this.anIntArrayArray3[local20], arg0.method4584(Static90.method5070(this.anIntArray40[local20]).anInt7576)));
			}
		}
		local10.append(this.aStringArray4[this.aStringArray4.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lclient!wn;I[I)V")
	public void method469(@OriginalArg(0) Class4_Sub20 arg0, @OriginalArg(2) int[] arg1) {
		if (this.anIntArray40 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anIntArray40.length; local11++) {
			if (arg1.length <= local11) {
				return;
			}
			@Pc(19) int local19 = this.method476(local11).anInt7570;
			if (local19 > 0) {
				arg0.method4577((long) arg1[local11], local19);
			}
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(III)I")
	public int method470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray40 == null || arg1 < 0 || arg1 > this.anIntArray40.length) {
			return -1;
		} else if (this.anIntArrayArray3[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray3[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray3[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(ILclient!wn;)V")
	public void method471(@OriginalArg(1) Class4_Sub20 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method4614();
			if (local14 == 0) {
				return;
			}
			this.method477(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "(I)V")
	public void method473() {
		if (this.anIntArray39 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anIntArray39.length; local6++) {
				this.anIntArray39[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!bp", name = "e", descriptor = "(I)I")
	public int method474() {
		return this.anIntArray40 == null ? 0 : this.anIntArray40.length;
	}

	@OriginalMember(owner = "client!bp", name = "f", descriptor = "(I)Ljava/lang/String;")
	public String method475() {
		@Pc(16) StringBuffer local16 = new StringBuffer(80);
		if (this.aStringArray4 == null) {
			return "";
		}
		local16.append(this.aStringArray4[0]);
		for (@Pc(30) int local30 = 1; local30 < this.aStringArray4.length; local30++) {
			local16.append("...");
			local16.append(this.aStringArray4[local30]);
		}
		return local16.toString();
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)Lclient!vr;")
	public Class266 method476(@OriginalArg(0) int arg0) {
		return this.anIntArray40 == null || arg0 < 0 || this.anIntArray40.length < arg0 ? null : Static90.method5070(this.anIntArray40[arg0]);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IILclient!wn;)V")
	private void method477(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub20 arg1) {
		if (arg0 == 1) {
			this.aStringArray4 = Static399.method5642(arg1.method4624(), '<');
			return;
		}
		@Pc(30) int local30;
		@Pc(36) int local36;
		if (arg0 == 2) {
			local30 = arg1.method4614();
			this.anIntArray39 = new int[local30];
			for (local36 = 0; local36 < local30; local36++) {
				this.anIntArray39[local36] = arg1.method4560();
			}
		} else if (arg0 == 3) {
			local30 = arg1.method4614();
			this.anIntArrayArray3 = new int[local30][];
			this.anIntArray40 = new int[local30];
			for (local36 = 0; local36 < local30; local36++) {
				@Pc(86) int local86 = arg1.method4560();
				@Pc(90) Class266 local90 = Static90.method5070(local86);
				if (local90 != null) {
					this.anIntArray40[local36] = local86;
					this.anIntArrayArray3[local36] = new int[local90.anInt7572];
					for (@Pc(106) int local106 = 0; local106 < local90.anInt7572; local106++) {
						this.anIntArrayArray3[local36][local106] = arg1.method4560();
					}
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean29 = false;
		}
	}
}
