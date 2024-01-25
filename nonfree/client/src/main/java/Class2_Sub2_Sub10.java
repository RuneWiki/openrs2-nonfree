import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ica")
public final class Class2_Sub2_Sub10 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ica", name = "J", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!ica", name = "u", descriptor = "[[I")
	private int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!ica", name = "v", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray18;

	@OriginalMember(owner = "client!ica", name = "x", descriptor = "[I")
	private int[] anIntArray254;

	@OriginalMember(owner = "client!ica", name = "C", descriptor = "[I")
	public int[] anIntArray255;

	@OriginalMember(owner = "client!ica", name = "E", descriptor = "Lclient!vh;")
	public Class362 aClass362_1;

	@OriginalMember(owner = "client!ica", name = "G", descriptor = "Z")
	public boolean aBoolean263 = true;

	static {
		for (@Pc(4) int local4 = 0; local4 < 100; local4++) {
			aRectangleArray1[local4] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "([IILclient!vj;)V")
	public void method3149(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (this.anIntArray254 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray254.length; local15++) {
			if (local15 >= arg0.length) {
				return;
			}
			@Pc(23) int local23 = this.method3151(local15).anInt5479;
			if (local23 > 0) {
				arg1.method8553((long) arg0[local15], local23);
			}
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(ILclient!vj;)V")
	public void method3150(@OriginalArg(1) Class2_Sub22 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8547();
			if (local5 == 0) {
				return;
			}
			this.method3154(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(BI)Lclient!mha;")
	public Class222 method3151(@OriginalArg(1) int arg0) {
		return this.anIntArray254 == null || arg0 < 0 || this.anIntArray254.length < arg0 ? null : Static480.method8646(this.anIntArray254[arg0]);
	}

	@OriginalMember(owner = "client!ica", name = "g", descriptor = "(I)I")
	public int method3152() {
		return this.anIntArray254 == null ? 0 : this.anIntArray254.length;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IBI)I")
	public int method3153(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray254 == null || arg1 < 0 || arg1 > this.anIntArray254.length) {
			return -1;
		} else if (this.anIntArrayArray18[arg1] == null || arg0 < 0 || this.anIntArrayArray18[arg1].length < arg0) {
			return -1;
		} else {
			return this.anIntArrayArray18[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(ILclient!vj;I)V")
	private void method3154(@OriginalArg(1) Class2_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray18 = Static17.method249(arg0.method8549(), '<');
			return;
		}
		@Pc(28) int local28;
		@Pc(38) int local38;
		if (arg1 == 2) {
			local28 = arg0.method8547();
			this.anIntArray255 = new int[local28];
			for (local38 = 0; local38 < local28; local38++) {
				this.anIntArray255[local38] = arg0.method8546();
			}
		} else if (arg1 == 3) {
			local28 = arg0.method8547();
			this.anIntArray254 = new int[local28];
			this.anIntArrayArray18 = new int[local28][];
			for (local38 = 0; local38 < local28; local38++) {
				@Pc(44) int local44 = arg0.method8546();
				@Pc(48) Class222 local48 = Static480.method8646(local44);
				if (local48 != null) {
					this.anIntArray254[local38] = local44;
					this.anIntArrayArray18[local38] = new int[local48.anInt5483];
					for (@Pc(64) int local64 = 0; local64 < local48.anInt5483; local64++) {
						this.anIntArrayArray18[local38][local64] = arg0.method8546();
					}
				}
			}
			return;
		} else if (arg1 == 4) {
			this.aBoolean263 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!ica", name = "h", descriptor = "(I)V")
	public void method3155() {
		if (this.anIntArray255 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anIntArray255.length; local6++) {
				this.anIntArray255[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(BLclient!vj;)Ljava/lang/String;")
	public String method3156(@OriginalArg(1) Class2_Sub22 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray254 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray254.length; local15++) {
				local10.append(this.aStringArray18[local15]);
				local10.append(this.aClass362_1.method8113(arg0.method8512(Static480.method8646(this.anIntArray254[local15]).anInt5477), this.anIntArrayArray18[local15], this.method3151(local15)));
			}
		}
		local10.append(this.aStringArray18[this.aStringArray18.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!ica", name = "i", descriptor = "(I)Ljava/lang/String;")
	public String method3157() {
		@Pc(16) StringBuffer local16 = new StringBuffer(80);
		if (this.aStringArray18 == null) {
			return "";
		}
		local16.append(this.aStringArray18[0]);
		for (@Pc(30) int local30 = 1; local30 < this.aStringArray18.length; local30++) {
			local16.append("...");
			local16.append(this.aStringArray18[local30]);
		}
		return local16.toString();
	}
}
