import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class4_Sub2_Sub18 extends Class4_Sub2 {

	@OriginalMember(owner = "client!uj", name = "w", descriptor = "Lclient!ei;")
	public Class66 aClass66_2;

	@OriginalMember(owner = "client!uj", name = "D", descriptor = "[I")
	public int[] anIntArray523;

	@OriginalMember(owner = "client!uj", name = "E", descriptor = "[I")
	private int[] anIntArray524;

	@OriginalMember(owner = "client!uj", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray58;

	@OriginalMember(owner = "client!uj", name = "J", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray43;

	@OriginalMember(owner = "client!uj", name = "s", descriptor = "Z")
	public boolean aBoolean488 = true;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(III)I")
	public int method5541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray524 == null || arg0 < 0 || arg0 > this.anIntArray524.length) {
			return -1;
		} else if (this.anIntArrayArray58[arg0] == null || arg1 < 0 || this.anIntArrayArray58[arg0].length < arg1) {
			return -1;
		} else {
			return this.anIntArrayArray58[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!fh;I)Ljava/lang/String;")
	public String method5542(@OriginalArg(0) Class4_Sub9 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray524 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray524.length; local15++) {
				local10.append(this.aStringArray43[local15]);
				local10.append(this.aClass66_2.method1410(this.anIntArrayArray58[local15], arg0.method5009(Static194.method5770(this.anIntArray524[local15]).anInt6538), this.method5543(local15)));
			}
		}
		local10.append(this.aStringArray43[this.aStringArray43.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)Lclient!ud;")
	public Class245 method5543(@OriginalArg(1) int arg0) {
		return this.anIntArray524 == null || arg0 < 0 || arg0 > this.anIntArray524.length ? null : Static194.method5770(this.anIntArray524[arg0]);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILclient!fh;I)V")
	private void method5544(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub9 arg1) {
		if (arg0 == 1) {
			this.aStringArray43 = Static15.method181(arg1.method5038(), '<');
			return;
		}
		@Pc(35) int local35;
		@Pc(45) int local45;
		if (arg0 == 2) {
			local35 = arg1.method5007();
			this.anIntArray523 = new int[local35];
			for (local45 = 0; local45 < local35; local45++) {
				this.anIntArray523[local45] = arg1.method5028();
			}
		} else if (arg0 == 3) {
			local35 = arg1.method5007();
			this.anIntArray524 = new int[local35];
			this.anIntArrayArray58 = new int[local35][];
			for (local45 = 0; local45 < local35; local45++) {
				@Pc(51) int local51 = arg1.method5028();
				@Pc(55) Class245 local55 = Static194.method5770(local51);
				if (local55 != null) {
					this.anIntArray524[local45] = local51;
					this.anIntArrayArray58[local45] = new int[local55.anInt6543];
					for (@Pc(71) int local71 = 0; local71 < local55.anInt6543; local71++) {
						this.anIntArrayArray58[local45][local71] = arg1.method5028();
					}
				}
			}
			return;
		} else if (arg0 == 4) {
			this.aBoolean488 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)Ljava/lang/String;")
	public String method5545() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray43 == null) {
			return "";
		}
		local10.append(this.aStringArray43[0]);
		for (@Pc(29) int local29 = 1; local29 < this.aStringArray43.length; local29++) {
			local10.append("...");
			local10.append(this.aStringArray43[local29]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!fh;Z)V")
	public void method5546(@OriginalArg(0) Class4_Sub9 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method5007();
			if (local10 == 0) {
				return;
			}
			this.method5544(local10, arg0);
		}
	}

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "(I)I")
	public int method5548() {
		return this.anIntArray524 == null ? 0 : this.anIntArray524.length;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)V")
	public void method5550() {
		if (this.anIntArray523 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray523.length; local14++) {
				this.anIntArray523[local14] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!fh;[II)V")
	public void method5553(@OriginalArg(0) Class4_Sub9 arg0, @OriginalArg(1) int[] arg1) {
		if (this.anIntArray524 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray524.length; local19++) {
			if (local19 >= arg1.length) {
				return;
			}
			@Pc(27) int local27 = this.method5543(local19).anInt6542;
			if (local27 > 0) {
				arg0.method5057(local27, (long) arg1[local19]);
			}
		}
	}
}
