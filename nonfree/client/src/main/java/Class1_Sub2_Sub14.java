import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class1_Sub2_Sub14 extends Class1_Sub2 {

	@OriginalMember(owner = "client!pm", name = "v", descriptor = "[I")
	private int[] anIntArray433;

	@OriginalMember(owner = "client!pm", name = "w", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray43;

	@OriginalMember(owner = "client!pm", name = "z", descriptor = "[[I")
	private int[][] anIntArrayArray155;

	@OriginalMember(owner = "client!pm", name = "A", descriptor = "Lclient!us;")
	public Class245 aClass245_2;

	@OriginalMember(owner = "client!pm", name = "J", descriptor = "[I")
	public int[] anIntArray434;

	@OriginalMember(owner = "client!pm", name = "L", descriptor = "Z")
	public boolean aBoolean364 = true;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!lh;B[I)V")
	public void method4408(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int[] arg1) {
		if (this.anIntArray433 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; this.anIntArray433.length > local11 && arg1.length > local11; local11++) {
			@Pc(19) int local19 = this.method4418(local11).anInt6760;
			if (local19 > 0) {
				arg0.method4136((long) arg1[local11], local19);
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
	public void method4410() {
		if (this.anIntArray434 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray434.length; local10++) {
				this.anIntArray434[local10] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILclient!lh;)Ljava/lang/String;")
	public String method4411(@OriginalArg(1) Class1_Sub1 arg0) {
		@Pc(16) StringBuffer local16 = new StringBuffer(80);
		if (this.anIntArray433 != null) {
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray433.length; local21++) {
				local16.append(this.aStringArray43[local21]);
				local16.append(this.aClass245_2.method5568(arg0.method4122(Static323.method4560(this.anIntArray433[local21]).anInt6763), this.method4418(local21), this.anIntArrayArray155[local21]));
			}
		}
		local16.append(this.aStringArray43[this.aStringArray43.length - 1]);
		return local16.toString();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IBLclient!lh;)V")
	private void method4412(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1 arg1) {
		if (arg0 == 1) {
			this.aStringArray43 = Static326.method4592(arg1.method4137(), '<');
			return;
		}
		@Pc(32) int local32;
		@Pc(42) int local42;
		if (arg0 == 2) {
			local32 = arg1.method4130();
			this.anIntArray434 = new int[local32];
			for (local42 = 0; local42 < local32; local42++) {
				this.anIntArray434[local42] = arg1.method4093();
			}
		} else if (arg0 == 3) {
			local32 = arg1.method4130();
			this.anIntArrayArray155 = new int[local32][];
			this.anIntArray433 = new int[local32];
			for (local42 = 0; local42 < local32; local42++) {
				@Pc(48) int local48 = arg1.method4093();
				@Pc(52) Class225 local52 = Static323.method4560(local48);
				if (local52 != null) {
					this.anIntArray433[local42] = local48;
					this.anIntArrayArray155[local42] = new int[local52.anInt6759];
					for (@Pc(68) int local68 = 0; local68 < local52.anInt6759; local68++) {
						this.anIntArrayArray155[local42][local68] = arg1.method4093();
					}
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean364 = false;
		}
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(ILclient!lh;)V")
	public void method4413(@OriginalArg(1) Class1_Sub1 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4130();
			if (local9 == 0) {
				return;
			}
			this.method4412(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!pm", name = "h", descriptor = "(I)Ljava/lang/String;")
	public String method4415() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray43 == null) {
			return "";
		}
		local10.append(this.aStringArray43[0]);
		for (@Pc(30) int local30 = 1; local30 < this.aStringArray43.length; local30++) {
			local10.append("...");
			local10.append(this.aStringArray43[local30]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(B)I")
	public int method4417() {
		return this.anIntArray433 == null ? 0 : this.anIntArray433.length;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IB)Lclient!tk;")
	public Class225 method4418(@OriginalArg(0) int arg0) {
		return this.anIntArray433 == null || arg0 < 0 || this.anIntArray433.length < arg0 ? null : Static323.method4560(this.anIntArray433[arg0]);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)I")
	public int method4419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray433 == null || arg1 < 0 || arg1 > this.anIntArray433.length) {
			return -1;
		} else if (this.anIntArrayArray155[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray155[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray155[arg1][arg0];
		}
	}
}
