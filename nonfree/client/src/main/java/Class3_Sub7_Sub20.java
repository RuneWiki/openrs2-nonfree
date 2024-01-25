import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class3_Sub7_Sub20 extends Class3_Sub7 {

	@OriginalMember(owner = "client!ud", name = "C", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray42;

	@OriginalMember(owner = "client!ud", name = "r", descriptor = "[[I")
	private int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!ud", name = "B", descriptor = "[I")
	private int[] anIntArray718;

	@OriginalMember(owner = "client!ud", name = "G", descriptor = "Lclient!mea;")
	public Class246 aClass246_2;

	@OriginalMember(owner = "client!ud", name = "K", descriptor = "[I")
	public int[] anIntArray719;

	@OriginalMember(owner = "client!ud", name = "s", descriptor = "Z")
	public boolean aBoolean668 = true;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILclient!ika;I)V")
	private void method8492(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub2 arg1) {
		if (arg0 == 1) {
			this.aStringArray42 = Static104.method2099(arg1.method2014(), '<');
			return;
		}
		@Pc(13) int local13;
		@Pc(19) int local19;
		if (arg0 == 2) {
			local13 = arg1.method2048(255);
			this.anIntArray719 = new int[local13];
			for (local19 = 0; local19 < local13; local19++) {
				this.anIntArray719[local19] = arg1.method2028(-14795);
			}
		} else if (arg0 == 3) {
			local13 = arg1.method2048(255);
			this.anIntArrayArray57 = new int[local13][];
			this.anIntArray718 = new int[local13];
			for (local19 = 0; local19 < local13; local19++) {
				@Pc(89) int local89 = arg1.method2028(-14795);
				@Pc(93) Class123 local93 = Static722.method9541(local89);
				if (local93 != null) {
					this.anIntArray718[local19] = local89;
					this.anIntArrayArray57[local19] = new int[local93.anInt3235];
					for (@Pc(109) int local109 = 0; local109 < local93.anInt3235; local109++) {
						this.anIntArrayArray57[local19][local109] = arg1.method2028(-14795);
					}
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean668 = false;
		}
	}

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "(I)I")
	public int method8493() {
		return this.anIntArray718 == null ? 0 : this.anIntArray718.length;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IBI)I")
	public int method8494(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray718 == null || arg0 < 0 || this.anIntArray718.length < arg0) {
			return -1;
		} else if (this.anIntArrayArray57[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray57[arg0].length) {
			return -1;
		} else {
			return this.anIntArrayArray57[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLclient!ika;[I)V")
	public void method8495(@OriginalArg(1) Class3_Sub2 arg0, @OriginalArg(2) int[] arg1) {
		if (this.anIntArray718 == null) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray718.length; local20++) {
			if (local20 >= arg1.length) {
				return;
			}
			@Pc(28) int local28 = this.method8498(local20).anInt3234;
			if (local28 > 0) {
				arg0.method2071((long) arg1[local20], local28);
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLclient!ika;)V")
	public void method8496(@OriginalArg(1) Class3_Sub2 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method2048(255);
			if (local15 == 0) {
				return;
			}
			this.method8492(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)Lclient!fr;")
	public Class123 method8498(@OriginalArg(0) int arg0) {
		return this.anIntArray718 == null || arg0 < 0 || arg0 > this.anIntArray718.length ? null : Static722.method9541(this.anIntArray718[arg0]);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)Ljava/lang/String;")
	public String method8500() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray42 == null) {
			return "";
		}
		local10.append(this.aStringArray42[0]);
		for (@Pc(25) int local25 = 1; local25 < this.aStringArray42.length; local25++) {
			local10.append("...");
			local10.append(this.aStringArray42[local25]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "(I)V")
	public void method8501() {
		if (this.anIntArray719 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray719.length; local14++) {
				this.anIntArray719[local14] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!ika;Z)Ljava/lang/String;")
	public String method8503(@OriginalArg(0) Class3_Sub2 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray718 != null) {
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray718.length; local21++) {
				local10.append(this.aStringArray42[local21]);
				local10.append(this.aClass246_2.method5422(this.anIntArrayArray57[local21], this.method8498(local21), arg0.method2026(Static722.method9541(this.anIntArray718[local21]).anInt3238)));
			}
		}
		local10.append(this.aStringArray42[this.aStringArray42.length - 1]);
		return local10.toString();
	}
}
