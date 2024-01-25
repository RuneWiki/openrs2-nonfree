import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class8_Sub5_Sub17 extends Class8_Sub5 {

	@OriginalMember(owner = "client!tk", name = "x", descriptor = "[I")
	private int[] anIntArray517;

	@OriginalMember(owner = "client!tk", name = "B", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray33;

	@OriginalMember(owner = "client!tk", name = "F", descriptor = "[I")
	public int[] anIntArray518;

	@OriginalMember(owner = "client!tk", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!tk", name = "J", descriptor = "Lclient!cc;")
	public Class49 aClass49_2;

	@OriginalMember(owner = "client!tk", name = "z", descriptor = "Z")
	public boolean aBoolean668 = true;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILclient!ig;)Ljava/lang/String;")
	public String method7704(@OriginalArg(1) Class8_Sub8 arg0) {
		@Pc(19) StringBuffer local19 = new StringBuffer(80);
		if (this.anIntArray517 != null) {
			for (@Pc(24) int local24 = 0; local24 < this.anIntArray517.length; local24++) {
				local19.append(this.aStringArray33[local24]);
				local19.append(this.aClass49_2.method1676(this.method7713(local24), this.anIntArrayArray56[local24], arg0.method8554(Static155.method3154(this.anIntArray517[local24]).anInt9109)));
			}
		}
		local19.append(this.aStringArray33[this.aStringArray33.length - 1]);
		return local19.toString();
	}

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "(I)Ljava/lang/String;")
	public String method7705() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray33 == null) {
			return "";
		}
		local10.append(this.aStringArray33[0]);
		for (@Pc(32) int local32 = 1; local32 < this.aStringArray33.length; local32++) {
			local10.append("...");
			local10.append(this.aStringArray33[local32]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!ig;I[I)V")
	public void method7706(@OriginalArg(0) Class8_Sub8 arg0, @OriginalArg(2) int[] arg1) {
		if (this.anIntArray517 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray517.length; local15++) {
			if (local15 >= arg1.length) {
				return;
			}
			@Pc(23) int local23 = this.method7713(local15).anInt9108;
			if (local23 > 0) {
				arg0.method8575(local23, (long) arg1[local15]);
			}
		}
	}

	@OriginalMember(owner = "client!tk", name = "g", descriptor = "(I)I")
	public int method7707() {
		return this.anIntArray517 == null ? 0 : this.anIntArray517.length;
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(B)V")
	public void method7708() {
		if (this.anIntArray518 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray518.length; local14++) {
				this.anIntArray518[local14] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!ig;B)V")
	public void method7709(@OriginalArg(0) Class8_Sub8 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method8525();
			if (local15 == 0) {
				return;
			}
			this.method7710(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IBLclient!ig;)V")
	private void method7710(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub8 arg1) {
		if (arg0 == 1) {
			this.aStringArray33 = Static403.method6410(arg1.method8570(), '<');
			return;
		}
		@Pc(16) int local16;
		@Pc(26) int local26;
		if (arg0 == 2) {
			local16 = arg1.method8525();
			this.anIntArray518 = new int[local16];
			for (local26 = 0; local26 < local16; local26++) {
				this.anIntArray518[local26] = arg1.method8578();
			}
		} else if (arg0 == 3) {
			local16 = arg1.method8525();
			this.anIntArrayArray56 = new int[local16][];
			this.anIntArray517 = new int[local16];
			for (local26 = 0; local26 < local16; local26++) {
				@Pc(32) int local32 = arg1.method8578();
				@Pc(36) Class316 local36 = Static155.method3154(local32);
				if (local36 != null) {
					this.anIntArray517[local26] = local32;
					this.anIntArrayArray56[local26] = new int[local36.anInt9105];
					for (@Pc(52) int local52 = 0; local52 < local36.anInt9105; local52++) {
						this.anIntArrayArray56[local26][local52] = arg1.method8578();
					}
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean668 = false;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)I")
	public int method7711(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray517 == null || arg0 < 0 || this.anIntArray517.length < arg0) {
			return -1;
		} else if (this.anIntArrayArray56[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray56[arg0].length) {
			return -1;
		} else {
			return this.anIntArrayArray56[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)Lclient!sq;")
	public Class316 method7713(@OriginalArg(0) int arg0) {
		return this.anIntArray517 == null || arg0 < 0 || this.anIntArray517.length < arg0 ? null : Static155.method3154(this.anIntArray517[arg0]);
	}
}
