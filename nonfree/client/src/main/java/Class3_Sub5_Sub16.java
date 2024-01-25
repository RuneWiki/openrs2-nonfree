import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class3_Sub5_Sub16 extends Class3_Sub5 {

	@OriginalMember(owner = "client!rg", name = "x", descriptor = "[I")
	private int[] anIntArray434;

	@OriginalMember(owner = "client!rg", name = "y", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray57;

	@OriginalMember(owner = "client!rg", name = "A", descriptor = "[[I")
	private int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!rg", name = "C", descriptor = "[I")
	public int[] anIntArray435;

	@OriginalMember(owner = "client!rg", name = "G", descriptor = "Lclient!pm;")
	public Class284 aClass284_2;

	@OriginalMember(owner = "client!rg", name = "u", descriptor = "Z")
	public boolean aBoolean574 = true;

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "(B)I")
	public int method6744() {
		return this.anIntArray434 == null ? 0 : this.anIntArray434.length;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IILclient!dt;)V")
	private void method6745(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 1) {
			this.aStringArray57 = Static120.method1814(arg1.method7922(), '<');
			return;
		}
		@Pc(30) int local30;
		@Pc(40) int local40;
		if (arg0 == 2) {
			local30 = arg1.method7954();
			this.anIntArray435 = new int[local30];
			for (local40 = 0; local40 < local30; local40++) {
				this.anIntArray435[local40] = arg1.method7951();
			}
		} else if (arg0 == 3) {
			local30 = arg1.method7954();
			this.anIntArray434 = new int[local30];
			this.anIntArrayArray50 = new int[local30][];
			for (local40 = 0; local40 < local30; local40++) {
				@Pc(46) int local46 = arg1.method7951();
				@Pc(50) Class93 local50 = Static202.method3047(local46);
				if (local50 != null) {
					this.anIntArray434[local40] = local46;
					this.anIntArrayArray50[local40] = new int[local50.anInt2273];
					for (@Pc(66) int local66 = 0; local66 < local50.anInt2273; local66++) {
						this.anIntArrayArray50[local40][local66] = arg1.method7951();
					}
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean574 = false;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILclient!dt;)Ljava/lang/String;")
	public String method6746(@OriginalArg(1) Class3_Sub4 arg0) {
		@Pc(16) StringBuffer local16 = new StringBuffer(80);
		if (this.anIntArray434 != null) {
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray434.length; local21++) {
				local16.append(this.aStringArray57[local21]);
				local16.append(this.aClass284_2.method6225(this.anIntArrayArray50[local21], this.method6754(local21), arg0.method7897(Static202.method3047(this.anIntArray434[local21]).anInt2269)));
			}
		}
		local16.append(this.aStringArray57[this.aStringArray57.length - 1]);
		return local16.toString();
	}

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "(B)V")
	public void method6747() {
		if (this.anIntArray435 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray435.length; local10++) {
				this.anIntArray435[local10] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!dt;I)V")
	public void method6748(@OriginalArg(0) Class3_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method7954();
			if (local5 == 0) {
				return;
			}
			this.method6745(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "([IILclient!dt;)V")
	public void method6749(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (this.anIntArray434 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray434.length; local17++) {
			if (local17 >= arg0.length) {
				return;
			}
			@Pc(25) int local25 = this.method6754(local17).anInt2272;
			if (local25 > 0) {
				arg1.method7953((long) arg0[local17], local25);
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)Ljava/lang/String;")
	public String method6751() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray57 == null) {
			return "";
		}
		local10.append(this.aStringArray57[0]);
		for (@Pc(30) int local30 = 1; local30 < this.aStringArray57.length; local30++) {
			local10.append("...");
			local10.append(this.aStringArray57[local30]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)I")
	public int method6753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray434 == null || arg1 < 0 || arg1 > this.anIntArray434.length) {
			return -1;
		} else if (this.anIntArrayArray50[arg1] == null || arg0 < 0 || this.anIntArrayArray50[arg1].length < arg0) {
			return -1;
		} else {
			return this.anIntArrayArray50[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)Lclient!ed;")
	public Class93 method6754(@OriginalArg(0) int arg0) {
		return this.anIntArray434 == null || arg0 < 0 || arg0 > this.anIntArray434.length ? null : Static202.method3047(this.anIntArray434[arg0]);
	}
}
