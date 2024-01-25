import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class4_Sub5_Sub16 extends Class4_Sub5 {

	@OriginalMember(owner = "client!ph", name = "y", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray36;

	@OriginalMember(owner = "client!ph", name = "z", descriptor = "[I")
	private int[] anIntArray497;

	@OriginalMember(owner = "client!ph", name = "F", descriptor = "Lclient!qca;")
	public Class298 aClass298_2;

	@OriginalMember(owner = "client!ph", name = "G", descriptor = "[[I")
	private int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!ph", name = "K", descriptor = "[I")
	public int[] anIntArray498;

	@OriginalMember(owner = "client!ph", name = "M", descriptor = "Z")
	public boolean aBoolean581 = true;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)I")
	public int method6414() {
		return this.anIntArray497 == null ? 0 : this.anIntArray497.length;
	}

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)Ljava/lang/String;")
	public String method6415() {
		@Pc(15) StringBuffer local15 = new StringBuffer(80);
		if (this.aStringArray36 == null) {
			return "";
		}
		local15.append(this.aStringArray36[0]);
		for (@Pc(29) int local29 = 1; local29 < this.aStringArray36.length; local29++) {
			local15.append("...");
			local15.append(this.aStringArray36[local29]);
		}
		return local15.toString();
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZLclient!es;)Ljava/lang/String;")
	public String method6418(@OriginalArg(1) Class4_Sub11 arg0) {
		@Pc(18) StringBuffer local18 = new StringBuffer(80);
		if (this.anIntArray497 != null) {
			for (@Pc(23) int local23 = 0; local23 < this.anIntArray497.length; local23++) {
				local18.append(this.aStringArray36[local23]);
				local18.append(this.aClass298_2.method6587(arg0.method8888(Static460.method6427(this.anIntArray497[local23]).anInt884), this.anIntArrayArray44[local23], this.method6420(local23)));
			}
		}
		local18.append(this.aStringArray36[this.aStringArray36.length - 1]);
		return local18.toString();
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)Lclient!bja;")
	public Class27 method6420(@OriginalArg(1) int arg0) {
		return this.anIntArray497 == null || arg0 < 0 || arg0 > this.anIntArray497.length ? null : Static460.method6427(this.anIntArray497[arg0]);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!es;II)V")
	private void method6422(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray36 = Static189.method2958('<', arg0.method8853());
			return;
		}
		@Pc(21) int local21;
		@Pc(27) int local27;
		if (arg1 == 2) {
			local21 = arg0.method8865();
			this.anIntArray498 = new int[local21];
			for (local27 = 0; local27 < local21; local27++) {
				this.anIntArray498[local27] = arg0.method8859();
			}
			return;
		}
		if (arg1 == 3) {
			local21 = arg0.method8865();
			this.anIntArray497 = new int[local21];
			this.anIntArrayArray44 = new int[local21][];
			for (local27 = 0; local27 < local21; local27++) {
				@Pc(68) int local68 = arg0.method8859();
				@Pc(72) Class27 local72 = Static460.method6427(local68);
				if (local72 != null) {
					this.anIntArray497[local27] = local68;
					this.anIntArrayArray44[local27] = new int[local72.anInt880];
					for (@Pc(88) int local88 = 0; local88 < local72.anInt880; local88++) {
						this.anIntArrayArray44[local27][local88] = arg0.method8859();
					}
				}
			}
			return;
		}
		if (arg1 == 4) {
			this.aBoolean581 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!ph", name = "h", descriptor = "(I)V")
	public void method6423() {
		if (this.anIntArray498 != null) {
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray498.length; local13++) {
				this.anIntArray498[local13] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "([ILclient!es;I)V")
	public void method6424(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (this.anIntArray497 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anIntArray497.length; local11++) {
			if (arg0.length <= local11) {
				return;
			}
			@Pc(28) int local28 = this.method6420(local11).anInt882;
			if (local28 > 0) {
				arg1.method8879(local28, (long) arg0[local11]);
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(III)I")
	public int method6425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray497 == null || arg0 < 0 || this.anIntArray497.length < arg0) {
			return -1;
		} else if (this.anIntArrayArray44[arg0] == null || arg1 < 0 || this.anIntArrayArray44[arg0].length < arg1) {
			return -1;
		} else {
			return this.anIntArrayArray44[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLclient!es;)V")
	public void method6428(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method8865();
			if (local15 == 0) {
				return;
			}
			this.method6422(arg0, local15);
		}
	}
}
