import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class1_Sub2_Sub17 extends Class1_Sub2 {

	@OriginalMember(owner = "client!tb", name = "B", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray39;

	@OriginalMember(owner = "client!tb", name = "C", descriptor = "[I")
	public int[] anIntArray565;

	@OriginalMember(owner = "client!tb", name = "E", descriptor = "[I")
	private int[] anIntArray566;

	@OriginalMember(owner = "client!tb", name = "G", descriptor = "[[I")
	private int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!tb", name = "N", descriptor = "Lclient!m;")
	public Class156 aClass156_2;

	@OriginalMember(owner = "client!tb", name = "x", descriptor = "Z")
	public boolean aBoolean431 = true;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLclient!hp;)V")
	public void method5144(@OriginalArg(1) Class1_Sub5 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5366();
			if (local9 == 0) {
				return;
			}
			this.method5148(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "(I)I")
	public int method5145() {
		return this.anIntArray566 == null ? 0 : this.anIntArray566.length;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BI)Lclient!qu;")
	public Class204 method5146(@OriginalArg(1) int arg0) {
		return this.anIntArray566 == null || arg0 < 0 || arg0 > this.anIntArray566.length ? null : Static371.method5809(this.anIntArray566[arg0]);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
	public void method5147() {
		if (this.anIntArray565 != null) {
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray565.length; local12++) {
				this.anIntArray565[local12] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!hp;II)V")
	private void method5148(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray39 = Static402.method5419('<', arg0.method5401());
			return;
		}
		@Pc(23) int local23;
		@Pc(29) int local29;
		if (arg1 == 2) {
			local23 = arg0.method5366();
			this.anIntArray565 = new int[local23];
			for (local29 = 0; local29 < local23; local29++) {
				this.anIntArray565[local29] = arg0.method5362();
			}
			return;
		}
		if (arg1 == 3) {
			local23 = arg0.method5366();
			this.anIntArrayArray59 = new int[local23][];
			this.anIntArray566 = new int[local23];
			for (local29 = 0; local29 < local23; local29++) {
				@Pc(66) int local66 = arg0.method5362();
				@Pc(70) Class204 local70 = Static371.method5809(local66);
				if (local70 != null) {
					this.anIntArray566[local29] = local66;
					this.anIntArrayArray59[local29] = new int[local70.anInt5718];
					for (@Pc(86) int local86 = 0; local86 < local70.anInt5718; local86++) {
						this.anIntArrayArray59[local29][local86] = arg0.method5362();
					}
				}
			}
			return;
		}
		if (arg1 == 4) {
			this.aBoolean431 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(III)I")
	public int method5149(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray566 == null || arg1 < 0 || this.anIntArray566.length < arg1) {
			return -1;
		} else if (this.anIntArrayArray59[arg1] == null || arg0 < 0 || this.anIntArrayArray59[arg1].length < arg0) {
			return -1;
		} else {
			return this.anIntArrayArray59[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "(I)Ljava/lang/String;")
	public String method5151() {
		@Pc(8) StringBuffer local8 = new StringBuffer(80);
		if (this.aStringArray39 == null) {
			return "";
		}
		local8.append(this.aStringArray39[0]);
		for (@Pc(22) int local22 = 1; local22 < this.aStringArray39.length; local22++) {
			local8.append("...");
			local8.append(this.aStringArray39[local22]);
		}
		return local8.toString();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!hp;)Ljava/lang/String;")
	public String method5152(@OriginalArg(1) Class1_Sub5 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray566 != null) {
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray566.length; local21++) {
				local10.append(this.aStringArray39[local21]);
				local10.append(this.aClass156_2.method3581(this.method5146(local21), this.anIntArrayArray59[local21], arg0.method5415(Static371.method5809(this.anIntArray566[local21]).anInt5719)));
			}
		}
		local10.append(this.aStringArray39[this.aStringArray39.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z[ILclient!hp;)V")
	public void method5153(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (this.anIntArray566 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < this.anIntArray566.length; local13++) {
			if (local13 >= arg0.length) {
				return;
			}
			@Pc(20) int local20 = this.method5146(local13).anInt5720;
			if (local20 > 0) {
				arg1.method5397((long) arg0[local13], local20);
			}
		}
	}
}
