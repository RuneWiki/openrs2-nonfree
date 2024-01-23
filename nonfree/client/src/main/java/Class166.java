import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class166 {

	@OriginalMember(owner = "client!um", name = "a", descriptor = "[S")
	private short[] aShortArray88;

	@OriginalMember(owner = "client!um", name = "b", descriptor = "[S")
	private short[] aShortArray89;

	@OriginalMember(owner = "client!um", name = "c", descriptor = "[S")
	private short[] aShortArray90;

	@OriginalMember(owner = "client!um", name = "n", descriptor = "[I")
	private int[] anIntArray635;

	@OriginalMember(owner = "client!um", name = "s", descriptor = "[S")
	private short[] aShortArray91;

	@OriginalMember(owner = "client!um", name = "l", descriptor = "I")
	public int anInt5469 = -1;

	@OriginalMember(owner = "client!um", name = "q", descriptor = "Z")
	public boolean aBoolean418 = false;

	@OriginalMember(owner = "client!um", name = "i", descriptor = "[I")
	private int[] anIntArray634 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I)Z")
	public boolean method4186() {
		@Pc(7) boolean local7 = true;
		for (@Pc(16) int local16 = 0; local16 < 5; local16++) {
			if (this.anIntArray634[local16] != -1 && !Static202.aClass7_167.method235(0, this.anIntArray634[local16])) {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Z)Lclient!gd;")
	public Class6_Sub3 method4189() {
		@Pc(8) Class6_Sub3[] local8 = new Class6_Sub3[5];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			if (this.anIntArray634[local12] != -1) {
				local8[local10++] = Static85.method1434(Static202.aClass7_167, this.anIntArray634[local12]);
			}
		}
		@Pc(45) Class6_Sub3 local45 = new Class6_Sub3(local8, local10);
		@Pc(52) int local52;
		if (this.aShortArray89 != null) {
			for (local52 = 0; local52 < this.aShortArray89.length; local52++) {
				local45.method1424(this.aShortArray89[local52], this.aShortArray90[local52]);
			}
		}
		if (this.aShortArray91 != null) {
			for (local52 = 0; local52 < this.aShortArray91.length; local52++) {
				local45.method1421(this.aShortArray91[local52], this.aShortArray88[local52]);
			}
		}
		return local45;
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(Z)Lclient!gd;")
	public Class6_Sub3 method4190() {
		if (this.anIntArray635 == null) {
			return null;
		}
		@Pc(16) Class6_Sub3[] local16 = new Class6_Sub3[this.anIntArray635.length];
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray635.length; local18++) {
			local16[local18] = Static85.method1434(Static202.aClass7_167, this.anIntArray635[local18]);
		}
		@Pc(52) Class6_Sub3 local52;
		if (local16.length == 1) {
			local52 = local16[0];
		} else {
			local52 = new Class6_Sub3(local16, local16.length);
		}
		@Pc(64) int local64;
		if (this.aShortArray89 != null) {
			for (local64 = 0; local64 < this.aShortArray89.length; local64++) {
				local52.method1424(this.aShortArray89[local64], this.aShortArray90[local64]);
			}
		}
		if (this.aShortArray91 != null) {
			for (local64 = 0; local64 < this.aShortArray91.length; local64++) {
				local52.method1421(this.aShortArray91[local64], this.aShortArray88[local64]);
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!jj;I)V")
	public void method4191(@OriginalArg(0) Class1_Sub18 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3122();
			if (local5 == 0) {
				return;
			}
			this.method4195(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(Z)Z")
	public boolean method4194() {
		if (this.anIntArray635 == null) {
			return true;
		}
		@Pc(18) boolean local18 = true;
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray635.length; local20++) {
			if (!Static202.aClass7_167.method235(0, this.anIntArray635[local20])) {
				local18 = false;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(BILclient!jj;)V")
	private void method4195(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub18 arg1) {
		if (arg0 == 1) {
			this.anInt5469 = arg1.method3122();
			return;
		}
		@Pc(33) int local33;
		@Pc(43) int local43;
		if (arg0 == 2) {
			local33 = arg1.method3122();
			this.anIntArray635 = new int[local33];
			for (local43 = 0; local43 < local33; local43++) {
				this.anIntArray635[local43] = arg1.method3107();
			}
		} else if (arg0 == 3) {
			this.aBoolean418 = true;
		} else if (arg0 == 40) {
			local33 = arg1.method3122();
			this.aShortArray90 = new short[local33];
			this.aShortArray89 = new short[local33];
			for (local43 = 0; local43 < local33; local43++) {
				this.aShortArray89[local43] = (short) arg1.method3107();
				this.aShortArray90[local43] = (short) arg1.method3107();
			}
		} else if (arg0 == 41) {
			local33 = arg1.method3122();
			this.aShortArray88 = new short[local33];
			this.aShortArray91 = new short[local33];
			for (local43 = 0; local43 < local33; local43++) {
				this.aShortArray91[local43] = (short) arg1.method3107();
				this.aShortArray88[local43] = (short) arg1.method3107();
			}
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray634[arg0 - 60] = arg1.method3107();
		}
	}
}
