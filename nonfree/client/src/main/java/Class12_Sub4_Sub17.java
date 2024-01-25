import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class12_Sub4_Sub17 extends Class12_Sub4 {

	@OriginalMember(owner = "client!sf", name = "B", descriptor = "Lclient!gr;")
	public Class122 aClass122_2;

	@OriginalMember(owner = "client!sf", name = "E", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray56;

	@OriginalMember(owner = "client!sf", name = "H", descriptor = "[I")
	public int[] anIntArray611;

	@OriginalMember(owner = "client!sf", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray78;

	@OriginalMember(owner = "client!sf", name = "L", descriptor = "[I")
	private int[] anIntArray612;

	@OriginalMember(owner = "client!sf", name = "O", descriptor = "Z")
	public boolean aBoolean558 = true;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZLclient!daa;)Ljava/lang/String;")
	public String method6771(@OriginalArg(1) Class12_Sub8 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray612 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray612.length; local15++) {
				local10.append(this.aStringArray56[local15]);
				local10.append(this.aClass122_2.method3368(this.method6773(local15), this.anIntArrayArray78[local15], arg0.method5189(Static144.method4712(this.anIntArray612[local15]).anInt6501)));
			}
		}
		local10.append(this.aStringArray56[this.aStringArray56.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZI)Lclient!oca;")
	public Class225 method6773(@OriginalArg(1) int arg0) {
		return this.anIntArray612 == null || arg0 < 0 || arg0 > this.anIntArray612.length ? null : Static144.method4712(this.anIntArray612[arg0]);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLclient!daa;[I)V")
	public void method6774(@OriginalArg(1) Class12_Sub8 arg0, @OriginalArg(2) int[] arg1) {
		if (this.anIntArray612 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anIntArray612.length && local11 < arg1.length; local11++) {
			@Pc(19) int local19 = this.method6773(local11).anInt6503;
			if (local19 > 0) {
				arg0.method5192(local19, (long) arg1[local11]);
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILclient!daa;)V")
	private void method6775(@OriginalArg(0) int arg0, @OriginalArg(2) Class12_Sub8 arg1) {
		if (arg0 == 1) {
			this.aStringArray56 = Static434.method6610(arg1.method5206(), '<');
			return;
		}
		@Pc(23) int local23;
		@Pc(29) int local29;
		if (arg0 == 2) {
			local23 = arg1.method5216();
			this.anIntArray611 = new int[local23];
			for (local29 = 0; local29 < local23; local29++) {
				this.anIntArray611[local29] = arg1.method5199();
			}
		} else if (arg0 == 3) {
			local23 = arg1.method5216();
			this.anIntArray612 = new int[local23];
			this.anIntArrayArray78 = new int[local23][];
			for (local29 = 0; local29 < local23; local29++) {
				@Pc(77) int local77 = arg1.method5199();
				@Pc(81) Class225 local81 = Static144.method4712(local77);
				if (local81 != null) {
					this.anIntArray612[local29] = local77;
					this.anIntArrayArray78[local29] = new int[local81.anInt6502];
					for (@Pc(97) int local97 = 0; local97 < local81.anInt6502; local97++) {
						this.anIntArrayArray78[local29][local97] = arg1.method5199();
					}
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean558 = false;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZII)I")
	public int method6776(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray612 == null || arg1 < 0 || this.anIntArray612.length < arg1) {
			return -1;
		} else if (this.anIntArrayArray78[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray78[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray78[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(Z)V")
	public void method6777() {
		if (this.anIntArray611 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anIntArray611.length; local6++) {
				this.anIntArray611[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)Ljava/lang/String;")
	public String method6778() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray56 == null) {
			return "";
		}
		local10.append(this.aStringArray56[0]);
		for (@Pc(30) int local30 = 1; local30 < this.aStringArray56.length; local30++) {
			local10.append("...");
			local10.append(this.aStringArray56[local30]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)I")
	public int method6779() {
		return this.anIntArray612 == null ? 0 : this.anIntArray612.length;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLclient!daa;)V")
	public void method6781(@OriginalArg(1) Class12_Sub8 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5216();
			if (local9 == 0) {
				return;
			}
			this.method6775(local9, arg0);
		}
	}
}
