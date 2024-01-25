import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iaa")
public final class Class2_Sub1_Sub8 extends Class2_Sub1 {

	@OriginalMember(owner = "client!iaa", name = "K", descriptor = "[I")
	private int[] anIntArray223;

	@OriginalMember(owner = "client!iaa", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!iaa", name = "N", descriptor = "[I")
	public int[] anIntArray224;

	@OriginalMember(owner = "client!iaa", name = "Q", descriptor = "Lclient!jp;")
	public Class186 aClass186_1;

	@OriginalMember(owner = "client!iaa", name = "R", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray25;

	@OriginalMember(owner = "client!iaa", name = "I", descriptor = "Z")
	public boolean aBoolean370 = true;

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Z)I")
	public int method4325() {
		return this.anIntArray223 == null ? 0 : this.anIntArray223.length;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I)Ljava/lang/String;")
	public String method4326() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray25 == null) {
			return "";
		}
		local10.append(this.aStringArray25[0]);
		for (@Pc(24) int local24 = 1; local24 < this.aStringArray25.length; local24++) {
			local10.append("...");
			local10.append(this.aStringArray25[local24]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "([IBLclient!ol;)V")
	public void method4327(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (this.anIntArray223 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anIntArray223.length; local11++) {
			if (local11 >= arg0.length) {
				return;
			}
			@Pc(25) int local25 = this.method4328(local11).anInt4596;
			if (local25 > 0) {
				arg1.method5182(local25, (long) arg0[local11]);
			}
		}
	}

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "(II)Lclient!hk;")
	public Class146 method4328(@OriginalArg(0) int arg0) {
		return this.anIntArray223 == null || arg0 < 0 || this.anIntArray223.length < arg0 ? null : Static105.method1885(this.anIntArray223[arg0]);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(BLclient!ol;)V")
	public void method4329(@OriginalArg(1) Class2_Sub8 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method5203();
			if (local17 == 0) {
				return;
			}
			this.method4335(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(III)I")
	public int method4330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray223 == null || arg0 < 0 || arg0 > this.anIntArray223.length) {
			return -1;
		} else if (this.anIntArrayArray15[arg0] == null || arg1 < 0 || this.anIntArrayArray15[arg0].length < arg1) {
			return -1;
		} else {
			return this.anIntArrayArray15[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "(BLclient!ol;)Ljava/lang/String;")
	public String method4332(@OriginalArg(1) Class2_Sub8 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray223 != null) {
			for (@Pc(22) int local22 = 0; local22 < this.anIntArray223.length; local22++) {
				local10.append(this.aStringArray25[local22]);
				local10.append(this.aClass186_1.method4868(this.method4328(local22), this.anIntArrayArray15[local22], arg0.method5202(Static105.method1885(this.anIntArray223[local22]).anInt4602)));
			}
		}
		local10.append(this.aStringArray25[this.aStringArray25.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(B)V")
	public void method4333() {
		if (this.anIntArray224 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray224.length; local14++) {
				this.anIntArray224[local14] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Lclient!ol;II)V")
	private void method4335(@OriginalArg(0) Class2_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aStringArray25 = Static184.method3569('<', arg0.method5178());
			return;
		}
		@Pc(21) int local21;
		@Pc(27) int local27;
		if (arg1 == 2) {
			local21 = arg0.method5203();
			this.anIntArray224 = new int[local21];
			for (local27 = 0; local27 < local21; local27++) {
				this.anIntArray224[local27] = arg0.method5211();
			}
			return;
		}
		if (arg1 == 3) {
			local21 = arg0.method5203();
			this.anIntArray223 = new int[local21];
			this.anIntArrayArray15 = new int[local21][];
			for (local27 = 0; local27 < local21; local27++) {
				@Pc(70) int local70 = arg0.method5211();
				@Pc(74) Class146 local74 = Static105.method1885(local70);
				if (local74 != null) {
					this.anIntArray223[local27] = local70;
					this.anIntArrayArray15[local27] = new int[local74.anInt4604];
					for (@Pc(90) int local90 = 0; local90 < local74.anInt4604; local90++) {
						this.anIntArrayArray15[local27][local90] = arg0.method5211();
					}
				}
			}
			return;
		}
		if (arg1 == 4) {
			this.aBoolean370 = false;
			return;
		}
	}
}
