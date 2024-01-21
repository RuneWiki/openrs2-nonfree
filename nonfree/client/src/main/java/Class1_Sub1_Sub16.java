import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class1_Sub1_Sub16 extends Class1_Sub1 {

	@OriginalMember(owner = "client!vd", name = "K", descriptor = "[S")
	private short[] aShortArray43;

	@OriginalMember(owner = "client!vd", name = "P", descriptor = "I")
	private int anInt4145;

	@OriginalMember(owner = "client!vd", name = "W", descriptor = "[S")
	private short[] aShortArray44;

	@OriginalMember(owner = "client!vd", name = "Y", descriptor = "[S")
	private short[] aShortArray45;

	@OriginalMember(owner = "client!vd", name = "bb", descriptor = "I")
	public int anInt4152;

	@OriginalMember(owner = "client!vd", name = "gb", descriptor = "[S")
	private short[] aShortArray46;

	@OriginalMember(owner = "client!vd", name = "J", descriptor = "I")
	private int anInt4140 = 0;

	@OriginalMember(owner = "client!vd", name = "H", descriptor = "I")
	private int anInt4139 = 0;

	@OriginalMember(owner = "client!vd", name = "M", descriptor = "I")
	public int anInt4142 = -1;

	@OriginalMember(owner = "client!vd", name = "Z", descriptor = "I")
	private int anInt4150 = 128;

	@OriginalMember(owner = "client!vd", name = "Q", descriptor = "I")
	private int anInt4146 = 128;

	@OriginalMember(owner = "client!vd", name = "N", descriptor = "I")
	private int anInt4143 = 0;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!jg;I)V")
	private void method2918(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt4145 = arg1.method878();
		} else if (arg0 == 2) {
			this.anInt4142 = arg1.method878();
		} else if (arg0 == 4) {
			this.anInt4146 = arg1.method878();
		} else if (arg0 == 5) {
			this.anInt4150 = arg1.method878();
		} else if (arg0 == 6) {
			this.anInt4143 = arg1.method878();
		} else if (arg0 == 7) {
			this.anInt4139 = arg1.method861();
		} else if (arg0 == 8) {
			this.anInt4140 = arg1.method861();
		} else {
			@Pc(73) int local73;
			@Pc(83) int local83;
			if (arg0 == 40) {
				local73 = arg1.method861();
				this.aShortArray43 = new short[local73];
				this.aShortArray46 = new short[local73];
				for (local83 = 0; local83 < local73; local83++) {
					this.aShortArray43[local83] = (short) arg1.method878();
					this.aShortArray46[local83] = (short) arg1.method878();
				}
			} else if (arg0 == 41) {
				local73 = arg1.method861();
				this.aShortArray44 = new short[local73];
				this.aShortArray45 = new short[local73];
				for (local83 = 0; local83 < local73; local83++) {
					this.aShortArray44[local83] = (short) arg1.method878();
					this.aShortArray45[local83] = (short) arg1.method878();
				}
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)Lclient!w;")
	public Class1_Sub1_Sub1_Sub2 method2919(@OriginalArg(1) int arg0) {
		@Pc(9) Class1_Sub1_Sub1_Sub2 local9 = (Class1_Sub1_Sub1_Sub2) Static20.aClass79_2.method2657((long) this.anInt4152);
		if (local9 == null) {
			@Pc(21) Class1_Sub1_Sub1_Sub6 local21 = Static151.method2610(Static23.aClass30_11, this.anInt4145);
			if (local21 == null) {
				return null;
			}
			@Pc(30) int local30;
			if (this.aShortArray43 != null) {
				for (local30 = 0; local30 < this.aShortArray43.length; local30++) {
					local21.method2593(this.aShortArray43[local30], this.aShortArray46[local30]);
				}
			}
			if (this.aShortArray44 != null) {
				for (local30 = 0; local30 < this.aShortArray44.length; local30++) {
					local21.method2603(this.aShortArray44[local30], this.aShortArray45[local30]);
				}
			}
			local9 = local21.method2609(this.anInt4139 + 64, this.anInt4140 + 850, -30, -50, -30, true);
			Static20.aClass79_2.method2658((long) this.anInt4152, local9);
		}
		@Pc(116) Class1_Sub1_Sub1_Sub2 local116;
		if (this.anInt4142 == -1 || arg0 == -1) {
			local116 = local9.method1076(true);
		} else {
			local116 = Static157.method2652(this.anInt4142).method3106(local9, arg0);
		}
		if (this.anInt4146 != 128 || this.anInt4150 != 128) {
			local116.method1078(this.anInt4146, this.anInt4150, this.anInt4146);
		}
		if (this.anInt4143 != 0) {
			if (this.anInt4143 == 90) {
				local116.method1074();
			}
			if (this.anInt4143 == 180) {
				local116.method1074();
				local116.method1074();
			}
			if (this.anInt4143 == 270) {
				local116.method1074();
				local116.method1074();
				local116.method1074();
			}
		}
		return local116;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!jg;Z)V")
	public void method2921(@OriginalArg(0) Class1_Sub8 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method861();
			if (local11 == 0) {
				return;
			}
			this.method2918(local11, arg0);
		}
	}
}
