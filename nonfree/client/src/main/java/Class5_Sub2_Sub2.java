import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aga")
public final class Class5_Sub2_Sub2 extends Class5_Sub2 {

	@OriginalMember(owner = "client!aga", name = "u", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray1;

	@OriginalMember(owner = "client!aga", name = "v", descriptor = "[I")
	private int[] anIntArray24;

	@OriginalMember(owner = "client!aga", name = "z", descriptor = "Lclient!em;")
	public Class100 aClass100_1;

	@OriginalMember(owner = "client!aga", name = "F", descriptor = "[[I")
	private int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!aga", name = "K", descriptor = "[I")
	public int[] anIntArray25;

	@OriginalMember(owner = "client!aga", name = "M", descriptor = "Z")
	public boolean aBoolean6 = true;

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lclient!rv;I[I)V")
	public void method191(@OriginalArg(0) Class5_Sub15 arg0, @OriginalArg(2) int[] arg1) {
		if (this.anIntArray24 == null) {
			return;
		}
		for (@Pc(24) int local24 = 0; local24 < this.anIntArray24.length; local24++) {
			if (arg1.length <= local24) {
				return;
			}
			@Pc(31) int local31 = this.method192(local24).anInt8534;
			if (local31 > 0) {
				arg0.method3669(local31, (long) arg1[local24]);
			}
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(II)Lclient!rh;")
	public Class307 method192(@OriginalArg(1) int arg0) {
		return this.anIntArray24 == null || arg0 < 0 || this.anIntArray24.length < arg0 ? null : Static613.method8236(this.anIntArray24[arg0]);
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lclient!rv;B)Ljava/lang/String;")
	public String method193(@OriginalArg(0) Class5_Sub15 arg0) {
		@Pc(8) StringBuffer local8 = new StringBuffer(80);
		if (this.anIntArray24 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray24.length; local18++) {
				local8.append(this.aStringArray1[local18]);
				local8.append(this.aClass100_1.method2050(this.anIntArrayArray4[local18], arg0.method3645(Static613.method8236(this.anIntArray24[local18]).anInt8539), this.method192(local18)));
			}
		}
		local8.append(this.aStringArray1[this.aStringArray1.length - 1]);
		return local8.toString();
	}

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "(Z)Ljava/lang/String;")
	public String method194() {
		@Pc(8) StringBuffer local8 = new StringBuffer(80);
		if (this.aStringArray1 == null) {
			return "";
		}
		local8.append(this.aStringArray1[0]);
		for (@Pc(22) int local22 = 1; local22 < this.aStringArray1.length; local22++) {
			local8.append("...");
			local8.append(this.aStringArray1[local22]);
		}
		return local8.toString();
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(IILclient!rv;)V")
	private void method195(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub15 arg1) {
		if (arg0 == 1) {
			this.aStringArray1 = Static466.method6897('<', arg1.method3661());
			return;
		}
		@Pc(40) int local40;
		@Pc(50) int local50;
		if (arg0 == 2) {
			local40 = arg1.method3642();
			this.anIntArray25 = new int[local40];
			for (local50 = 0; local50 < local40; local50++) {
				this.anIntArray25[local50] = arg1.method3698();
			}
		} else if (arg0 == 3) {
			local40 = arg1.method3642();
			this.anIntArray24 = new int[local40];
			this.anIntArrayArray4 = new int[local40][];
			for (local50 = 0; local50 < local40; local50++) {
				@Pc(55) int local55 = arg1.method3698();
				@Pc(59) Class307 local59 = Static613.method8236(local55);
				if (local59 != null) {
					this.anIntArray24[local50] = local55;
					this.anIntArrayArray4[local50] = new int[local59.anInt8536];
					for (@Pc(75) int local75 = 0; local75 < local59.anInt8536; local75++) {
						this.anIntArrayArray4[local50][local75] = arg1.method3698();
					}
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean6 = false;
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(B)I")
	public int method196() {
		return this.anIntArray24 == null ? 0 : this.anIntArray24.length;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(III)I")
	public int method198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray24 == null || arg1 < 0 || arg1 > this.anIntArray24.length) {
			return -1;
		} else if (this.anIntArrayArray4[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray4[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray4[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!aga", name = "c", descriptor = "(I)V")
	public void method200() {
		if (this.anIntArray25 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.anIntArray25.length; local4++) {
				this.anIntArray25[local4] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lclient!rv;I)V")
	public void method201(@OriginalArg(0) Class5_Sub15 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method3642();
			if (local12 == 0) {
				return;
			}
			this.method195(local12, arg0);
		}
	}
}
