import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tfa")
public final class Class4_Sub7_Sub16 extends Class4_Sub7 {

	@OriginalMember(owner = "client!tfa", name = "t", descriptor = "[[I")
	private int[][] anIntArrayArray73;

	@OriginalMember(owner = "client!tfa", name = "v", descriptor = "Lclient!ww;")
	public Class363 aClass363_2;

	@OriginalMember(owner = "client!tfa", name = "C", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray37;

	@OriginalMember(owner = "client!tfa", name = "E", descriptor = "[I")
	public int[] anIntArray667;

	@OriginalMember(owner = "client!tfa", name = "J", descriptor = "[I")
	private int[] anIntArray668;

	@OriginalMember(owner = "client!tfa", name = "G", descriptor = "Z")
	public boolean aBoolean606 = true;

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lclient!eh;I)V")
	public void method7160(@OriginalArg(0) Class4_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6015();
			if (local5 == 0) {
				return;
			}
			this.method7164(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(II)Lclient!lj;")
	public Class210 method7161(@OriginalArg(1) int arg0) {
		return this.anIntArray668 == null || arg0 < 0 || arg0 > this.anIntArray668.length ? null : Static471.method6559(this.anIntArray668[arg0]);
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(B[ILclient!eh;)V")
	public void method7162(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (this.anIntArray668 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray668.length; local15++) {
			if (arg0.length <= local15) {
				return;
			}
			@Pc(23) int local23 = this.method7161(local15).anInt5499;
			if (local23 > 0) {
				arg1.method5972((long) arg0[local15], local23);
			}
		}
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)Ljava/lang/String;")
	public String method7163() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray37 == null) {
			return "";
		}
		local10.append(this.aStringArray37[0]);
		for (@Pc(29) int local29 = 1; local29 < this.aStringArray37.length; local29++) {
			local10.append("...");
			local10.append(this.aStringArray37[local29]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IILclient!eh;)V")
	private void method7164(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 1) {
			this.aStringArray37 = Static246.method4172(arg1.method6010(), '<');
			return;
		}
		@Pc(25) int local25;
		@Pc(31) int local31;
		if (arg0 == 2) {
			local25 = arg1.method6015();
			this.anIntArray667 = new int[local25];
			for (local31 = 0; local31 < local25; local31++) {
				this.anIntArray667[local31] = arg1.method5982();
			}
		} else if (arg0 == 3) {
			local25 = arg1.method6015();
			this.anIntArrayArray73 = new int[local25][];
			this.anIntArray668 = new int[local25];
			for (local31 = 0; local31 < local25; local31++) {
				@Pc(75) int local75 = arg1.method5982();
				@Pc(79) Class210 local79 = Static471.method6559(local75);
				if (local79 != null) {
					this.anIntArray668[local31] = local75;
					this.anIntArrayArray73[local31] = new int[local79.anInt5501];
					for (@Pc(95) int local95 = 0; local95 < local79.anInt5501; local95++) {
						this.anIntArrayArray73[local31][local95] = arg1.method5982();
					}
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean606 = false;
		}
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IZI)I")
	public int method7165(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray668 == null || arg1 < 0 || arg1 > this.anIntArray668.length) {
			return -1;
		} else if (this.anIntArrayArray73[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray73[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray73[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!tfa", name = "c", descriptor = "(I)I")
	public int method7166() {
		return this.anIntArray668 == null ? 0 : this.anIntArray668.length;
	}

	@OriginalMember(owner = "client!tfa", name = "f", descriptor = "(I)V")
	public void method7168() {
		if (this.anIntArray667 != null) {
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray667.length; local12++) {
				this.anIntArray667[local12] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(BLclient!eh;)Ljava/lang/String;")
	public String method7169(@OriginalArg(1) Class4_Sub9 arg0) {
		@Pc(18) StringBuffer local18 = new StringBuffer(80);
		if (this.anIntArray668 != null) {
			for (@Pc(23) int local23 = 0; local23 < this.anIntArray668.length; local23++) {
				local18.append(this.aStringArray37[local23]);
				local18.append(this.aClass363_2.method8037(this.method7161(local23), arg0.method6019(Static471.method6559(this.anIntArray668[local23]).anInt5498), this.anIntArrayArray73[local23]));
			}
		}
		local18.append(this.aStringArray37[this.aStringArray37.length - 1]);
		return local18.toString();
	}
}
