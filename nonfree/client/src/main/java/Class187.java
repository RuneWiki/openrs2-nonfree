import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class187 {

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "[I")
	private int[] anIntArray427;

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "[I")
	private int[] anIntArray428;

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "[I")
	private int[] anIntArray429;

	@OriginalMember(owner = "client!sn", name = "h", descriptor = "[I")
	private int[] anIntArray430;

	@OriginalMember(owner = "client!sn", name = "i", descriptor = "Ljava/lang/String;")
	private String aString327;

	@OriginalMember(owner = "client!sn", name = "k", descriptor = "[I")
	private int[] anIntArray431;

	@OriginalMember(owner = "client!sn", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!sn", name = "m", descriptor = "[I")
	private int[] anIntArray432;

	@OriginalMember(owner = "client!sn", name = "n", descriptor = "[I")
	private int[] anIntArray433;

	@OriginalMember(owner = "client!sn", name = "q", descriptor = "[[I")
	private int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!sn", name = "r", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray42;

	@OriginalMember(owner = "client!sn", name = "t", descriptor = "[[I")
	private int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!sn", name = "u", descriptor = "Ljava/lang/String;")
	private String aString329;

	@OriginalMember(owner = "client!sn", name = "w", descriptor = "[I")
	private int[] anIntArray434;

	@OriginalMember(owner = "client!sn", name = "y", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray43;

	@OriginalMember(owner = "client!sn", name = "A", descriptor = "Lclient!cs;")
	private Class42 aClass42_50;

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
	public int anInt5633 = -1;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
	public void method4984() {
		if (this.aString329 == null) {
			this.aString329 = this.aString327;
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IILclient!bk;)V")
	private void method4985(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub1 arg1) {
		if (arg0 == 1) {
			this.aString327 = arg1.method1855();
		} else if (arg0 == 2) {
			this.aString329 = arg1.method1855();
		} else {
			@Pc(30) int local30;
			@Pc(37) int local37;
			if (arg0 == 3) {
				local30 = arg1.method1832();
				this.anIntArrayArray46 = new int[local30][3];
				for (local37 = 0; local37 < local30; local37++) {
					this.anIntArrayArray46[local37][0] = arg1.method1845();
					this.anIntArrayArray46[local37][1] = arg1.method1826();
					this.anIntArrayArray46[local37][2] = arg1.method1826();
				}
			} else if (arg0 == 4) {
				local30 = arg1.method1832();
				this.anIntArrayArray44 = new int[local30][3];
				for (local37 = 0; local37 < local30; local37++) {
					this.anIntArrayArray44[local37][0] = arg1.method1845();
					this.anIntArrayArray44[local37][1] = arg1.method1826();
					this.anIntArrayArray44[local37][2] = arg1.method1826();
				}
			} else if (arg0 == 5) {
				arg1.method1845();
			} else if (arg0 == 6) {
				arg1.method1832();
			} else if (arg0 == 7) {
				arg1.method1832();
				return;
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method1832();
					return;
				}
				if (arg0 != 10) {
					if (arg0 == 12) {
						arg1.method1826();
						return;
					}
					if (arg0 != 13) {
						if (arg0 != 14) {
							if (arg0 == 15) {
								arg1.method1845();
							} else if (arg0 == 17) {
								this.anInt5633 = arg1.method1845();
								return;
							} else if (arg0 == 18) {
								local30 = arg1.method1832();
								this.anIntArray427 = new int[local30];
								this.anIntArray431 = new int[local30];
								this.anIntArray433 = new int[local30];
								this.aStringArray42 = new String[local30];
								for (local37 = 0; local37 < local30; local37++) {
									this.anIntArray427[local37] = arg1.method1826();
									this.anIntArray433[local37] = arg1.method1826();
									this.anIntArray431[local37] = arg1.method1826();
									this.aStringArray42[local37] = arg1.method1840();
								}
								return;
							} else if (arg0 == 19) {
								local30 = arg1.method1832();
								this.aStringArray43 = new String[local30];
								this.anIntArray429 = new int[local30];
								this.anIntArray434 = new int[local30];
								this.anIntArray428 = new int[local30];
								for (local37 = 0; local37 < local30; local37++) {
									this.anIntArray434[local37] = arg1.method1826();
									this.anIntArray428[local37] = arg1.method1826();
									this.anIntArray429[local37] = arg1.method1826();
									this.aStringArray43[local37] = arg1.method1840();
								}
								return;
							} else if (arg0 == 249) {
								local30 = arg1.method1832();
								if (this.aClass42_50 == null) {
									local37 = Static266.method4535(local30);
									this.aClass42_50 = new Class42(local37);
								}
								for (local37 = 0; local37 < local30; local37++) {
									@Pc(349) boolean local349 = arg1.method1832() == 1;
									@Pc(353) int local353 = arg1.method1843();
									@Pc(364) Class5 local364;
									if (local349) {
										local364 = new Class5_Sub30(arg1.method1840());
									} else {
										local364 = new Class5_Sub37(arg1.method1826());
									}
									this.aClass42_50.method1050((long) local353, local364);
								}
								return;
							}
							return;
						}
						local30 = arg1.method1832();
						this.anIntArrayArray45 = new int[local30][2];
						for (local37 = 0; local37 < local30; local37++) {
							this.anIntArrayArray45[local37][0] = arg1.method1832();
							this.anIntArrayArray45[local37][1] = arg1.method1832();
						}
						return;
					}
					local30 = arg1.method1832();
					this.anIntArray430 = new int[local30];
					for (local37 = 0; local37 < local30; local37++) {
						this.anIntArray430[local37] = arg1.method1845();
					}
					return;
				}
				local30 = arg1.method1832();
				this.anIntArray432 = new int[local30];
				for (local37 = 0; local37 < local30; local37++) {
					this.anIntArray432[local37] = arg1.method1826();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILclient!bk;)V")
	public void method4986(@OriginalArg(1) Class5_Sub1 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1832();
			if (local5 == 0) {
				return;
			}
			this.method4985(local5, arg0);
		}
	}
}
