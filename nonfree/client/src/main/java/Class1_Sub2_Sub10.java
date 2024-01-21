import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class1_Sub2_Sub10 extends Class1_Sub2 {

	@OriginalMember(owner = "client!hf", name = "M", descriptor = "Lclient!dj;")
	public Class24 aClass24_557;

	@OriginalMember(owner = "client!hf", name = "P", descriptor = "[I")
	public int[] anIntArray155;

	@OriginalMember(owner = "client!hf", name = "U", descriptor = "[I")
	public int[] anIntArray156;

	@OriginalMember(owner = "client!hf", name = "W", descriptor = "[I")
	public int[] anIntArray157;

	@OriginalMember(owner = "client!hf", name = "Y", descriptor = "[I")
	public int[] anIntArray158;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!fj;B)V")
	public void method1414(@OriginalArg(0) Class1_Sub7 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method2771();
			if (local3 == 0) {
				return;
			}
			this.method1418(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IB)I")
	public int method1416(@OriginalArg(0) int arg0) {
		if (this.anIntArray156 == null) {
			return -1;
		}
		for (@Pc(10) int local10 = 0; local10 < this.anIntArray156.length; local10++) {
			if (arg0 == this.anIntArray158[local10]) {
				return this.anIntArray156[local10];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZI)I")
	public int method1417(@OriginalArg(1) int arg0) {
		if (this.anIntArray157 == null) {
			return -1;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray157.length; local15++) {
			if (arg0 == this.anIntArray155[local15]) {
				return this.anIntArray157[local15];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!fj;I)V")
	private void method1418(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub7 arg1) {
		if (arg0 == 1) {
			this.aClass24_557 = arg1.method2761();
			return;
		}
		@Pc(22) int local22;
		@Pc(32) int local32;
		@Pc(44) int local44;
		if (arg0 == 2) {
			local22 = arg1.method2771();
			this.anIntArray157 = new int[local22];
			this.anIntArray155 = new int[local22];
			for (local32 = 0; local32 < local22; local32++) {
				this.anIntArray157[local32] = arg1.method2765();
				local44 = arg1.method2771();
				if (local44 == 0) {
					this.anIntArray155[local32] = -1;
				} else {
					this.anIntArray155[local32] = local44;
				}
			}
		} else if (arg0 == 3) {
			local22 = arg1.method2771();
			this.anIntArray156 = new int[local22];
			this.anIntArray158 = new int[local22];
			for (local32 = 0; local32 < local22; local32++) {
				this.anIntArray156[local32] = arg1.method2765();
				local44 = arg1.method2771();
				if (local44 == 0) {
					this.anIntArray158[local32] = -1;
				} else {
					this.anIntArray158[local32] = local44;
				}
			}
		}
	}
}
