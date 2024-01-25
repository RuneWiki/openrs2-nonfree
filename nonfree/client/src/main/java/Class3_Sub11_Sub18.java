import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class3_Sub11_Sub18 extends Class3_Sub11 {

	@OriginalMember(owner = "client!tr", name = "z", descriptor = "Lclient!dl;")
	public Class77 aClass77_2;

	@OriginalMember(owner = "client!tr", name = "B", descriptor = "[I")
	private int[] anIntArray818;

	@OriginalMember(owner = "client!tr", name = "J", descriptor = "[I")
	public int[] anIntArray819;

	@OriginalMember(owner = "client!tr", name = "K", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray29;

	@OriginalMember(owner = "client!tr", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!tr", name = "D", descriptor = "Z")
	public boolean aBoolean728 = true;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V")
	public void method8270() {
		if (this.anIntArray819 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray819.length; local15++) {
				this.anIntArray819[local15] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "(B)I")
	public int method8271() {
		return this.anIntArray818 == null ? 0 : this.anIntArray818.length;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!jp;II)V")
	private void method8272(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray29 = Static644.method8957(arg0.method8613(), '<');
			return;
		}
		@Pc(15) int local15;
		@Pc(21) int local21;
		if (arg1 == 2) {
			local15 = arg0.method8632();
			this.anIntArray819 = new int[local15];
			for (local21 = 0; local21 < local15; local21++) {
				this.anIntArray819[local21] = arg0.method8593();
			}
		} else if (arg1 == 3) {
			local15 = arg0.method8632();
			this.anIntArray818 = new int[local15];
			this.anIntArrayArray54 = new int[local15][];
			for (local21 = 0; local21 < local15; local21++) {
				@Pc(59) int local59 = arg0.method8593();
				@Pc(63) Class228 local63 = Static310.method4736(local59);
				if (local63 != null) {
					this.anIntArray818[local21] = local59;
					this.anIntArrayArray54[local21] = new int[local63.anInt6087];
					for (@Pc(79) int local79 = 0; local79 < local63.anInt6087; local79++) {
						this.anIntArrayArray54[local21][local79] = arg0.method8593();
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean728 = false;
		}
	}

	@OriginalMember(owner = "client!tr", name = "e", descriptor = "(I)Ljava/lang/String;")
	public String method8273() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray29 == null) {
			return "";
		}
		local10.append(this.aStringArray29[0]);
		for (@Pc(24) int local24 = 1; local24 < this.aStringArray29.length; local24++) {
			local10.append("...");
			local10.append(this.aStringArray29[local24]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!jp;I)Ljava/lang/String;")
	public String method8274(@OriginalArg(0) Class3_Sub25 arg0) {
		@Pc(18) StringBuffer local18 = new StringBuffer(80);
		if (this.anIntArray818 != null) {
			for (@Pc(23) int local23 = 0; local23 < this.anIntArray818.length; local23++) {
				local18.append(this.aStringArray29[local23]);
				local18.append(this.aClass77_2.method2078(this.anIntArrayArray54[local23], this.method8278(local23), arg0.method8606(Static310.method4736(this.anIntArray818[local23]).anInt6094)));
			}
		}
		local18.append(this.aStringArray29[this.aStringArray29.length - 1]);
		return local18.toString();
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(III)I")
	public int method8275(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray818 == null || arg1 < 0 || arg1 > this.anIntArray818.length) {
			return -1;
		} else if (this.anIntArrayArray54[arg1] == null || arg0 < 0 || this.anIntArrayArray54[arg1].length < arg0) {
			return -1;
		} else {
			return this.anIntArrayArray54[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!jp;[II)V")
	public void method8276(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int[] arg1) {
		if (this.anIntArray818 == null) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray818.length; local18++) {
			if (local18 >= arg1.length) {
				return;
			}
			@Pc(26) int local26 = this.method8278(local18).anInt6088;
			if (local26 > 0) {
				arg0.method8625(local26, (long) arg1[local18]);
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(Lclient!jp;I)V")
	public void method8277(@OriginalArg(0) Class3_Sub25 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method8632();
			if (local12 == 0) {
				return;
			}
			this.method8272(arg0, local12);
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)Lclient!mt;")
	public Class228 method8278(@OriginalArg(1) int arg0) {
		return this.anIntArray818 == null || arg0 < 0 || arg0 > this.anIntArray818.length ? null : Static310.method4736(this.anIntArray818[arg0]);
	}
}
