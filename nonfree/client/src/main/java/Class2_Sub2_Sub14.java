import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class2_Sub2_Sub14 extends Class2_Sub2 {

	@OriginalMember(owner = "client!rn", name = "z", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray31;

	@OriginalMember(owner = "client!rn", name = "B", descriptor = "[[I")
	private int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!rn", name = "H", descriptor = "[I")
	private int[] anIntArray404;

	@OriginalMember(owner = "client!rn", name = "L", descriptor = "Lclient!te;")
	public Class228 aClass228_1;

	@OriginalMember(owner = "client!rn", name = "M", descriptor = "[I")
	public int[] anIntArray405;

	@OriginalMember(owner = "client!rn", name = "J", descriptor = "Z")
	public boolean aBoolean538 = true;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(B[ILclient!md;)V")
	public void method4839(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (this.anIntArray404 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray404.length; local19++) {
			if (arg0.length <= local19) {
				return;
			}
			@Pc(27) int local27 = this.method4846(local19).anInt5934;
			if (local27 > 0) {
				arg1.method3720((long) arg0[local19], local27);
			}
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!md;II)V")
	private void method4840(@OriginalArg(0) Class2_Sub20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray31 = Static40.method745(arg0.method3717(), '<');
			return;
		}
		@Pc(30) int local30;
		@Pc(40) int local40;
		if (arg1 == 2) {
			local30 = arg0.method3737();
			this.anIntArray405 = new int[local30];
			for (local40 = 0; local40 < local30; local40++) {
				this.anIntArray405[local40] = arg0.method3711();
			}
		} else if (arg1 == 3) {
			local30 = arg0.method3737();
			this.anIntArray404 = new int[local30];
			this.anIntArrayArray48 = new int[local30][];
			for (local40 = 0; local40 < local30; local40++) {
				@Pc(46) int local46 = arg0.method3711();
				@Pc(50) Class208 local50 = Static225.method3479(local46);
				if (local50 != null) {
					this.anIntArray404[local40] = local46;
					this.anIntArrayArray48[local40] = new int[local50.anInt5930];
					for (@Pc(66) int local66 = 0; local66 < local50.anInt5930; local66++) {
						this.anIntArrayArray48[local40][local66] = arg0.method3711();
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean538 = false;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(BII)I")
	public int method4842(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray404 == null || arg0 < 0 || arg0 > this.anIntArray404.length) {
			return -1;
		} else if (this.anIntArrayArray48[arg0] == null || arg1 < 0 || this.anIntArrayArray48[arg0].length < arg1) {
			return -1;
		} else {
			return this.anIntArrayArray48[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "(B)I")
	public int method4843() {
		return this.anIntArray404 == null ? 0 : this.anIntArray404.length;
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(Z)V")
	public void method4844() {
		if (this.anIntArray405 != null) {
			for (@Pc(17) int local17 = 0; local17 < this.anIntArray405.length; local17++) {
				this.anIntArray405[local17] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!md;Z)Ljava/lang/String;")
	public String method4845(@OriginalArg(0) Class2_Sub20 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray404 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray404.length; local15++) {
				local10.append(this.aStringArray31[local15]);
				local10.append(this.aClass228_1.method5259(this.anIntArrayArray48[local15], arg0.method3689(Static225.method3479(this.anIntArray404[local15]).anInt5931), this.method4846(local15)));
			}
		}
		local10.append(this.aStringArray31[this.aStringArray31.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)Lclient!ra;")
	public Class208 method4846(@OriginalArg(0) int arg0) {
		return this.anIntArray404 == null || arg0 < 0 || arg0 > this.anIntArray404.length ? null : Static225.method3479(this.anIntArray404[arg0]);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)Ljava/lang/String;")
	public String method4847() {
		@Pc(15) StringBuffer local15 = new StringBuffer(80);
		if (this.aStringArray31 == null) {
			return "";
		}
		local15.append(this.aStringArray31[0]);
		for (@Pc(29) int local29 = 1; local29 < this.aStringArray31.length; local29++) {
			local15.append("...");
			local15.append(this.aStringArray31[local29]);
		}
		return local15.toString();
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILclient!md;)V")
	public void method4849(@OriginalArg(1) Class2_Sub20 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method3737();
			if (local7 == 0) {
				return;
			}
			this.method4840(arg0, local7);
		}
	}
}
