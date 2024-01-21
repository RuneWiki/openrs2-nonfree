import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class1_Sub2_Sub9 extends Class1_Sub2 {

	@OriginalMember(owner = "client!fa", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!fa", name = "O", descriptor = "[I")
	private int[] anIntArray112;

	@OriginalMember(owner = "client!fa", name = "bb", descriptor = "[I")
	public int[] anIntArray113;

	@OriginalMember(owner = "client!fa", name = "ib", descriptor = "[Lclient!dj;")
	private Class24[] aClass24Array8;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)I")
	public int method1032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray112 == null || arg0 < 0 || this.anIntArray112.length < arg0) {
			return -1;
		} else if (this.anIntArrayArray9[arg0] == null || arg1 < 0 || this.anIntArrayArray9[arg0].length < arg1) {
			return -1;
		} else {
			return this.anIntArrayArray9[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IILclient!fj;)V")
	private void method1034(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 1) {
			this.aClass24Array8 = arg1.method2761().method744(60);
			return;
		}
		@Pc(23) int local23;
		@Pc(33) int local33;
		if (arg0 == 2) {
			local23 = arg1.method2771();
			this.anIntArray113 = new int[local23];
			for (local33 = 0; local33 < local23; local33++) {
				this.anIntArray113[local33] = arg1.method2765();
			}
		} else if (arg0 == 3) {
			local23 = arg1.method2771();
			this.anIntArrayArray9 = new int[local23][];
			this.anIntArray112 = new int[local23];
			for (local33 = 0; local33 < local23; local33++) {
				@Pc(38) int local38 = arg1.method2765();
				this.anIntArray112[local33] = local38;
				this.anIntArrayArray9[local33] = new int[Static46.anIntArray98[local38]];
				for (@Pc(53) int local53 = 0; local53 < Static46.anIntArray98[local38]; local53++) {
					this.anIntArrayArray9[local33][local53] = arg1.method2765();
				}
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "(II)I")
	public int method1036(@OriginalArg(1) int arg0) {
		return this.anIntArray112 == null || arg0 < 0 || arg0 > this.anIntArray112.length ? -1 : this.anIntArray112[arg0];
	}

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "(I)I")
	public int method1037() {
		return this.anIntArray112 == null ? 0 : this.anIntArray112.length;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!fj;B)V")
	public void method1038(@OriginalArg(0) Class1_Sub7 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method2771();
			if (local7 == 0) {
				return;
			}
			this.method1034(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(Lclient!fj;B)Lclient!dj;")
	public Class24 method1039(@OriginalArg(0) Class1_Sub7 arg0) {
		@Pc(17) Class24 local17 = Static122.method2071(80);
		if (this.anIntArray112 != null) {
			for (@Pc(22) int local22 = 0; local22 < this.anIntArray112.length; local22++) {
				local17.method778(this.aClass24Array8[local22]);
				local17.method778(Static54.method2990(this.anIntArray112[local22], arg0.method2746(Static130.anIntArray237[this.anIntArray112[local22]]), this.anIntArrayArray9[local22]));
			}
		}
		local17.method778(this.aClass24Array8[this.aClass24Array8.length - 1]);
		return local17.method752();
	}

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "(I)Lclient!dj;")
	public Class24 method1040() {
		@Pc(15) Class24 local15 = Static122.method2071(80);
		local15.method778(this.aClass24Array8[0]);
		for (@Pc(25) int local25 = 1; local25 < this.aClass24Array8.length; local25++) {
			local15.method778(Static63.aClass24_455);
			local15.method778(this.aClass24Array8[local25]);
		}
		return local15.method752();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!fj;[II)V")
	public void method1041(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int[] arg1) {
		if (this.anIntArray112 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray112.length; local17++) {
			if (local17 >= arg1.length) {
				return;
			}
			@Pc(25) int local25 = Static201.anIntArray398[this.method1036(local17)];
			if (local25 > 0) {
				arg0.method2767(local25, (long) arg1[local17]);
			}
		}
	}
}
