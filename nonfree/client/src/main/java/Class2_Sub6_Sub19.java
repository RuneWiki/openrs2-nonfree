import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class2_Sub6_Sub19 extends Class2_Sub6 {

	@OriginalMember(owner = "client!td", name = "A", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray41;

	@OriginalMember(owner = "client!td", name = "B", descriptor = "[[I")
	private int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!td", name = "C", descriptor = "[I")
	public int[] anIntArray633;

	@OriginalMember(owner = "client!td", name = "D", descriptor = "Lclient!aha;")
	public Class13 aClass13_2;

	@OriginalMember(owner = "client!td", name = "K", descriptor = "[I")
	private int[] anIntArray635;

	@OriginalMember(owner = "client!td", name = "y", descriptor = "Z")
	public boolean aBoolean677 = true;

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(Z)V")
	public void method8035() {
		if (this.anIntArray633 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray633.length; local15++) {
				this.anIntArray633[local15] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B[ILclient!cea;)V")
	public void method8036(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (this.anIntArray635 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray635.length; local19++) {
			if (arg0.length <= local19) {
				return;
			}
			@Pc(27) int local27 = this.method8038(local19).anInt7477;
			if (local27 > 0) {
				arg1.method8353(local27, (long) arg0[local19]);
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(II)Lclient!oaa;")
	public Class234 method8038(@OriginalArg(1) int arg0) {
		return this.anIntArray635 == null || arg0 < 0 || this.anIntArray635.length < arg0 ? null : Static143.method7501(this.anIntArray635[arg0]);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIZ)I")
	public int method8039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray635 == null || arg1 < 0 || this.anIntArray635.length < arg1) {
			return -1;
		} else if (this.anIntArrayArray56[arg1] == null || arg0 < 0 || this.anIntArrayArray56[arg1].length < arg0) {
			return -1;
		} else {
			return this.anIntArrayArray56[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!cea;I)V")
	private void method8040(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub11 arg1) {
		if (arg0 == 1) {
			this.aStringArray41 = Static62.method1946('<', arg1.method8373());
			return;
		}
		@Pc(17) int local17;
		@Pc(23) int local23;
		if (arg0 == 2) {
			local17 = arg1.method8383();
			this.anIntArray633 = new int[local17];
			for (local23 = 0; local23 < local17; local23++) {
				this.anIntArray633[local23] = arg1.method8326();
			}
		} else if (arg0 == 3) {
			local17 = arg1.method8383();
			this.anIntArrayArray56 = new int[local17][];
			this.anIntArray635 = new int[local17];
			for (local23 = 0; local23 < local17; local23++) {
				@Pc(69) int local69 = arg1.method8326();
				@Pc(75) Class234 local75 = Static143.method7501(local69);
				if (local75 != null) {
					this.anIntArray635[local23] = local69;
					this.anIntArrayArray56[local23] = new int[local75.anInt7476];
					for (@Pc(91) int local91 = 0; local91 < local75.anInt7476; local91++) {
						this.anIntArrayArray56[local23][local91] = arg1.method8326();
					}
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean677 = false;
		}
	}

	@OriginalMember(owner = "client!td", name = "f", descriptor = "(B)I")
	public int method8041() {
		return this.anIntArray635 == null ? 0 : this.anIntArray635.length;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!cea;B)Ljava/lang/String;")
	public String method8042(@OriginalArg(0) Class2_Sub11 arg0) {
		@Pc(17) StringBuffer local17 = new StringBuffer(80);
		if (this.anIntArray635 != null) {
			for (@Pc(22) int local22 = 0; local22 < this.anIntArray635.length; local22++) {
				local17.append(this.aStringArray41[local22]);
				local17.append(this.aClass13_2.method227(arg0.method8364(Static143.method7501(this.anIntArray635[local22]).anInt7475), this.anIntArrayArray56[local22], this.method8038(local22)));
			}
		}
		local17.append(this.aStringArray41[this.aStringArray41.length - 1]);
		return local17.toString();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!cea;I)V")
	public void method8044(@OriginalArg(0) Class2_Sub11 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method8383();
			if (local11 == 0) {
				return;
			}
			this.method8040(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)Ljava/lang/String;")
	public String method8045() {
		@Pc(16) StringBuffer local16 = new StringBuffer(80);
		if (this.aStringArray41 == null) {
			return "";
		}
		local16.append(this.aStringArray41[0]);
		for (@Pc(30) int local30 = 1; local30 < this.aStringArray41.length; local30++) {
			local16.append("...");
			local16.append(this.aStringArray41[local30]);
		}
		return local16.toString();
	}
}
