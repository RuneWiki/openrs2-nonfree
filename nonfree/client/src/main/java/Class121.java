import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public final class Class121 {

	@OriginalMember(owner = "client!is", name = "b", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!is", name = "a", descriptor = "[S")
	private short[] aShortArray52;

	@OriginalMember(owner = "client!is", name = "e", descriptor = "[S")
	private short[] aShortArray53;

	@OriginalMember(owner = "client!is", name = "m", descriptor = "[S")
	private short[] aShortArray54;

	@OriginalMember(owner = "client!is", name = "p", descriptor = "[S")
	private short[] aShortArray55;

	@OriginalMember(owner = "client!is", name = "t", descriptor = "[I")
	private int[] anIntArray280;

	@OriginalMember(owner = "client!is", name = "u", descriptor = "Lclient!rt;")
	public Class223 aClass223_2;

	@OriginalMember(owner = "client!is", name = "l", descriptor = "[I")
	private final int[] anIntArray279 = new int[] { -1, -1, -1, -1, -1 };

	static {
		for (@Pc(4) int local4 = 0; local4 < 100; local4++) {
			aRectangleArray2[local4] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ILclient!ha;)V")
	public void method2737(@OriginalArg(1) Class6_Sub15 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method3111();
			if (local12 == 0) {
				return;
			}
			this.method2746(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(I)Z")
	public boolean method2739() {
		if (this.anIntArray280 == null) {
			return true;
		}
		@Pc(17) boolean local17 = true;
		@Pc(21) Class158 local21 = this.aClass223_2.aClass158_76;
		synchronized (this.aClass223_2.aClass158_76) {
			for (@Pc(25) int local25 = 0; local25 < this.anIntArray280.length; local25++) {
				if (!this.aClass223_2.aClass158_76.method3678(this.anIntArray280[local25], 0)) {
					local17 = false;
				}
			}
			return local17;
		}
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(I)Lclient!wr;")
	public Class266 method2740() {
		@Pc(8) Class266[] local8 = new Class266[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class158 local14 = this.aClass223_2.aClass158_76;
		@Pc(18) int local18;
		synchronized (this.aClass223_2.aClass158_76) {
			local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray279[local18] != -1) {
					local8[local10++] = Static249.method3846(this.anIntArray279[local18], this.aClass223_2.aClass158_76);
				}
				local18++;
			}
		}
		for (@Pc(54) int local54 = 0; local54 < 5; local54++) {
			if (local8[local54] != null && local8[local54].anInt7237 < 13) {
				local8[local54].method5961();
			}
		}
		@Pc(82) Class266 local82 = new Class266(local8, local10);
		if (this.aShortArray53 != null) {
			for (local18 = 0; local18 < this.aShortArray53.length; local18++) {
				local82.method5960(this.aShortArray53[local18], this.aShortArray52[local18]);
			}
		}
		if (this.aShortArray54 != null) {
			for (local18 = 0; local18 < this.aShortArray54.length; local18++) {
				local82.method5963(this.aShortArray54[local18], this.aShortArray55[local18]);
			}
		}
		return local82;
	}

	@OriginalMember(owner = "client!is", name = "c", descriptor = "(I)Lclient!wr;")
	public Class266 method2742() {
		if (this.anIntArray280 == null) {
			return null;
		}
		@Pc(15) Class266[] local15 = new Class266[this.anIntArray280.length];
		@Pc(19) Class158 local19 = this.aClass223_2.aClass158_76;
		@Pc(23) int local23;
		synchronized (this.aClass223_2.aClass158_76) {
			local23 = 0;
			while (true) {
				if (this.anIntArray280.length <= local23) {
					break;
				}
				local15[local23] = Static249.method3846(this.anIntArray280[local23], this.aClass223_2.aClass158_76);
				local23++;
			}
		}
		for (@Pc(56) int local56 = 0; local56 < this.anIntArray280.length; local56++) {
			if (local15[local56].anInt7237 < 13) {
				local15[local56].method5961();
			}
		}
		@Pc(93) Class266 local93;
		if (local15.length == 1) {
			local93 = local15[0];
		} else {
			local93 = new Class266(local15, local15.length);
		}
		if (local93 == null) {
			return null;
		}
		if (this.aShortArray53 != null) {
			for (local23 = 0; local23 < this.aShortArray53.length; local23++) {
				local93.method5960(this.aShortArray53[local23], this.aShortArray52[local23]);
			}
		}
		if (this.aShortArray54 != null) {
			for (local23 = 0; local23 < this.aShortArray54.length; local23++) {
				local93.method5963(this.aShortArray54[local23], this.aShortArray55[local23]);
			}
		}
		return local93;
	}

	@OriginalMember(owner = "client!is", name = "f", descriptor = "(I)Z")
	public boolean method2745() {
		@Pc(7) boolean local7 = true;
		@Pc(18) Class158 local18 = this.aClass223_2.aClass158_76;
		synchronized (this.aClass223_2.aClass158_76) {
			for (@Pc(22) int local22 = 0; local22 < 5; local22++) {
				if (this.anIntArray279[local22] != -1 && !this.aClass223_2.aClass158_76.method3678(this.anIntArray279[local22], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ILclient!ha;B)V")
	private void method2746(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 == 1) {
			arg1.method3111();
			return;
		}
		@Pc(17) int local17;
		@Pc(23) int local23;
		if (arg0 == 2) {
			local17 = arg1.method3111();
			this.anIntArray280 = new int[local17];
			for (local23 = 0; local23 < local17; local23++) {
				this.anIntArray280[local23] = arg1.method3108();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local17 = arg1.method3111();
				this.aShortArray52 = new short[local17];
				this.aShortArray53 = new short[local17];
				for (local23 = 0; local23 < local17; local23++) {
					this.aShortArray53[local23] = (short) arg1.method3108();
					this.aShortArray52[local23] = (short) arg1.method3108();
				}
			} else if (arg0 == 41) {
				local17 = arg1.method3111();
				this.aShortArray55 = new short[local17];
				this.aShortArray54 = new short[local17];
				for (local23 = 0; local23 < local17; local23++) {
					this.aShortArray54[local23] = (short) arg1.method3108();
					this.aShortArray55[local23] = (short) arg1.method3108();
				}
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray279[arg0 - 60] = arg1.method3108();
			}
		}
	}
}
