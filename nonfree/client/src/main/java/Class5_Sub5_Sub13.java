import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mia")
public final class Class5_Sub5_Sub13 extends Class5_Sub5 {

	@OriginalMember(owner = "client!mia", name = "A", descriptor = "[I")
	public int[] anIntArray326;

	@OriginalMember(owner = "client!mia", name = "E", descriptor = "Lclient!cu;")
	public Class66 aClass66_1;

	@OriginalMember(owner = "client!mia", name = "G", descriptor = "[[I")
	private int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!mia", name = "H", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray42;

	@OriginalMember(owner = "client!mia", name = "I", descriptor = "[I")
	private int[] anIntArray327;

	@OriginalMember(owner = "client!mia", name = "v", descriptor = "Z")
	public boolean aBoolean422 = true;

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(Lclient!ofa;B)Ljava/lang/String;")
	public String method5163(@OriginalArg(0) Class5_Sub22 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray327 != null) {
			for (@Pc(23) int local23 = 0; local23 < this.anIntArray327.length; local23++) {
				local10.append(this.aStringArray42[local23]);
				local10.append(this.aClass66_1.method1369(this.anIntArrayArray43[local23], this.method5172(local23), arg0.method5945(Static596.method8559(this.anIntArray327[local23]).anInt5437)));
			}
		}
		local10.append(this.aStringArray42[this.aStringArray42.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!mia", name = "f", descriptor = "(B)I")
	public int method5165() {
		return this.anIntArray327 == null ? 0 : this.anIntArray327.length;
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "([IBLclient!ofa;)V")
	public void method5166(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class5_Sub22 arg1) {
		if (this.anIntArray327 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray327.length; local19++) {
			if (arg0.length <= local19) {
				return;
			}
			@Pc(27) int local27 = this.method5172(local19).anInt5436;
			if (local27 > 0) {
				arg1.method5914((long) arg0[local19], local27);
			}
		}
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(III)I")
	public int method5168(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray327 == null || arg1 < 0 || this.anIntArray327.length < arg1) {
			return -1;
		} else if (this.anIntArrayArray43[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray43[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray43[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(IZLclient!ofa;)V")
	private void method5171(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub22 arg1) {
		if (arg0 == 1) {
			this.aStringArray42 = Static481.method7093(arg1.method5937(), '<');
			return;
		}
		@Pc(23) int local23;
		@Pc(29) int local29;
		if (arg0 == 2) {
			local23 = arg1.method5966();
			this.anIntArray326 = new int[local23];
			for (local29 = 0; local29 < local23; local29++) {
				this.anIntArray326[local29] = arg1.method5968();
			}
			return;
		}
		if (arg0 == 3) {
			local23 = arg1.method5966();
			this.anIntArrayArray43 = new int[local23][];
			this.anIntArray327 = new int[local23];
			for (local29 = 0; local29 < local23; local29++) {
				@Pc(72) int local72 = arg1.method5968();
				@Pc(76) Class216 local76 = Static596.method8559(local72);
				if (local76 != null) {
					this.anIntArray327[local29] = local72;
					this.anIntArrayArray43[local29] = new int[local76.anInt5440];
					for (@Pc(92) int local92 = 0; local92 < local76.anInt5440; local92++) {
						this.anIntArrayArray43[local29][local92] = arg1.method5968();
					}
				}
			}
			return;
		}
		if (arg0 == 4) {
			this.aBoolean422 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(BI)Lclient!ln;")
	public Class216 method5172(@OriginalArg(1) int arg0) {
		return this.anIntArray327 == null || arg0 < 0 || arg0 > this.anIntArray327.length ? null : Static596.method8559(this.anIntArray327[arg0]);
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(BLclient!ofa;)V")
	public void method5173(@OriginalArg(1) Class5_Sub22 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5966();
			if (local5 == 0) {
				return;
			}
			this.method5171(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!mia", name = "b", descriptor = "(Z)Ljava/lang/String;")
	public String method5174() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray42 == null) {
			return "";
		}
		local10.append(this.aStringArray42[0]);
		for (@Pc(32) int local32 = 1; local32 < this.aStringArray42.length; local32++) {
			local10.append("...");
			local10.append(this.aStringArray42[local32]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!mia", name = "b", descriptor = "(I)V")
	public void method5175() {
		if (this.anIntArray326 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray326.length; local14++) {
				this.anIntArray326[local14] |= 0x8000;
			}
		}
	}
}
