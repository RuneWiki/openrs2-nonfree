import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class14_Sub2_Sub8 extends Class14_Sub2 {

	@OriginalMember(owner = "client!de", name = "A", descriptor = "[[I")
	private int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!de", name = "M", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13;

	@OriginalMember(owner = "client!de", name = "E", descriptor = "[I")
	private int[] anIntArray91;

	@OriginalMember(owner = "client!de", name = "L", descriptor = "Lclient!bn;")
	public Class46 aClass46_1;

	@OriginalMember(owner = "client!de", name = "F", descriptor = "[I")
	public int[] anIntArray92;

	@OriginalMember(owner = "client!de", name = "D", descriptor = "Z")
	public boolean aBoolean127 = true;

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(II)Lclient!vq;")
	public Class382 method1670(@OriginalArg(0) int arg0) {
		return this.anIntArray91 == null || arg0 < 0 || arg0 > this.anIntArray91.length ? null : Static244.method4068(this.anIntArray91[arg0]);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public String method1671() {
		@Pc(16) StringBuffer local16 = new StringBuffer(80);
		if (this.aStringArray13 == null) {
			return "";
		}
		local16.append(this.aStringArray13[0]);
		for (@Pc(31) int local31 = 1; local31 < this.aStringArray13.length; local31++) {
			local16.append("...");
			local16.append(this.aStringArray13[local31]);
		}
		return local16.toString();
	}

	@OriginalMember(owner = "client!de", name = "h", descriptor = "(I)V")
	public void method1672() {
		if (this.anIntArray92 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.anIntArray92.length; local16++) {
				this.anIntArray92[local16] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "([IZLclient!jc;)V")
	public void method1673(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class14_Sub21 arg1) {
		if (this.anIntArray91 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray91.length; local19++) {
			if (arg0.length <= local19) {
				return;
			}
			@Pc(26) int local26 = this.method1670(local19).anInt10735;
			if (local26 > 0) {
				arg1.method7725((long) arg0[local19], local26);
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!jc;B)V")
	public void method1675(@OriginalArg(0) Class14_Sub21 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method7695(105);
			if (local3 == 0) {
				return;
			}
			this.method1680(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!de", name = "i", descriptor = "(I)I")
	public int method1676() {
		return this.anIntArray91 == null ? 0 : this.anIntArray91.length;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(III)I")
	public int method1678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray91 == null || arg0 < 0 || arg0 > this.anIntArray91.length) {
			return -1;
		} else if (this.anIntArrayArray12[arg0] == null || arg1 < 0 || this.anIntArrayArray12[arg0].length < arg1) {
			return -1;
		} else {
			return this.anIntArrayArray12[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!jc;I)Ljava/lang/String;")
	public String method1679(@OriginalArg(0) Class14_Sub21 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray91 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray91.length; local15++) {
				local10.append(this.aStringArray13[local15]);
				local10.append(this.aClass46_1.method895(this.method1670(local15), this.anIntArrayArray12[local15], arg0.method7744(Static244.method4068(this.anIntArray91[local15]).anInt10734)));
			}
		}
		local10.append(this.aStringArray13[this.aStringArray13.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!jc;I)V")
	private void method1680(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 == 1) {
			this.aStringArray13 = Static407.method2868(arg1.method7703(0), '<');
			return;
		}
		@Pc(29) int local29;
		@Pc(39) int local39;
		if (arg0 == 2) {
			local29 = arg1.method7695(110);
			this.anIntArray92 = new int[local29];
			for (local39 = 0; local39 < local29; local39++) {
				this.anIntArray92[local39] = arg1.method7717(-1978450544);
			}
		} else if (arg0 == 3) {
			local29 = arg1.method7695(112);
			this.anIntArray91 = new int[local29];
			this.anIntArrayArray12 = new int[local29][];
			for (local39 = 0; local39 < local29; local39++) {
				@Pc(44) int local44 = arg1.method7717(-1978450544);
				@Pc(50) Class382 local50 = Static244.method4068(local44);
				if (local50 != null) {
					this.anIntArray91[local39] = local44;
					this.anIntArrayArray12[local39] = new int[local50.anInt10733];
					for (@Pc(66) int local66 = 0; local66 < local50.anInt10733; local66++) {
						this.anIntArrayArray12[local39][local66] = arg1.method7717(-1978450544);
					}
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean127 = false;
		}
	}
}
