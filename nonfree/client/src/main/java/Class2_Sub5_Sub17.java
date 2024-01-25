import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class2_Sub5_Sub17 extends Class2_Sub5 {

	@OriginalMember(owner = "client!ut", name = "s", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray38;

	@OriginalMember(owner = "client!ut", name = "A", descriptor = "Lclient!rv;")
	public Class219 aClass219_2;

	@OriginalMember(owner = "client!ut", name = "B", descriptor = "[[I")
	private int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!ut", name = "D", descriptor = "[I")
	public int[] anIntArray569;

	@OriginalMember(owner = "client!ut", name = "G", descriptor = "[I")
	private int[] anIntArray570;

	@OriginalMember(owner = "client!ut", name = "y", descriptor = "Z")
	public boolean aBoolean488 = true;

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(B[ILclient!sv;)V")
	public void method5266(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (this.anIntArray570 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anIntArray570.length && local11 < arg0.length; local11++) {
			@Pc(19) int local19 = this.method5268(local11).anInt1348;
			if (local19 > 0) {
				arg1.method3550((long) arg0[local11], local19);
			}
		}
	}

	@OriginalMember(owner = "client!ut", name = "f", descriptor = "(I)Ljava/lang/String;")
	public String method5267() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray38 == null) {
			return "";
		}
		local10.append(this.aStringArray38[0]);
		for (@Pc(29) int local29 = 1; local29 < this.aStringArray38.length; local29++) {
			local10.append("...");
			local10.append(this.aStringArray38[local29]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IB)Lclient!de;")
	public Class50 method5268(@OriginalArg(0) int arg0) {
		return this.anIntArray570 == null || arg0 < 0 || arg0 > this.anIntArray570.length ? null : Static92.method1466(this.anIntArray570[arg0]);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IBI)I")
	public int method5269(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray570 == null || arg0 < 0 || this.anIntArray570.length < arg0) {
			return -1;
		} else if (this.anIntArrayArray56[arg0] == null || arg1 < 0 || this.anIntArrayArray56[arg0].length < arg1) {
			return -1;
		} else {
			return this.anIntArrayArray56[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILclient!sv;I)V")
	private void method5272(@OriginalArg(1) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray38 = Static203.method2715('<', arg0.method3582());
			return;
		}
		@Pc(34) int local34;
		@Pc(44) int local44;
		if (arg1 == 2) {
			local34 = arg0.method3580();
			this.anIntArray569 = new int[local34];
			for (local44 = 0; local44 < local34; local44++) {
				this.anIntArray569[local44] = arg0.method3555();
			}
		} else if (arg1 == 3) {
			local34 = arg0.method3580();
			this.anIntArrayArray56 = new int[local34][];
			this.anIntArray570 = new int[local34];
			for (local44 = 0; local44 < local34; local44++) {
				@Pc(50) int local50 = arg0.method3555();
				@Pc(56) Class50 local56 = Static92.method1466(local50);
				if (local56 != null) {
					this.anIntArray570[local44] = local50;
					this.anIntArrayArray56[local44] = new int[local56.anInt1349];
					for (@Pc(72) int local72 = 0; local72 < local56.anInt1349; local72++) {
						this.anIntArrayArray56[local44][local72] = arg0.method3555();
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean488 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!ut", name = "g", descriptor = "(I)V")
	public void method5273() {
		if (this.anIntArray569 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray569.length; local14++) {
				this.anIntArray569[local14] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!sv;B)V")
	public void method5274(@OriginalArg(0) Class2_Sub13 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method3580();
			if (local13 == 0) {
				return;
			}
			this.method5272(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!sv;I)Ljava/lang/String;")
	public String method5275(@OriginalArg(0) Class2_Sub13 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray570 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray570.length; local15++) {
				local10.append(this.aStringArray38[local15]);
				local10.append(this.aClass219_2.method4731(this.anIntArrayArray56[local15], this.method5268(local15), arg0.method3591(Static92.method1466(this.anIntArray570[local15]).anInt1347)));
			}
		}
		local10.append(this.aStringArray38[this.aStringArray38.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!ut", name = "d", descriptor = "(B)I")
	public int method5276() {
		return this.anIntArray570 == null ? 0 : this.anIntArray570.length;
	}
}
