import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class6_Sub5_Sub38 extends Class6_Sub5 {

	@OriginalMember(owner = "client!wm", name = "lb", descriptor = "Lclient!uq;")
	public static final Class247 lb = new Class247();

	@OriginalMember(owner = "client!wm", name = "N", descriptor = "[[I")
	private int[][] anIntArrayArray61;

	@OriginalMember(owner = "client!wm", name = "O", descriptor = "I")
	private int anInt7956;

	@OriginalMember(owner = "client!wm", name = "Q", descriptor = "I")
	private int anInt7958;

	@OriginalMember(owner = "client!wm", name = "V", descriptor = "I")
	private int anInt7963;

	@OriginalMember(owner = "client!wm", name = "Y", descriptor = "[I")
	private int[] anIntArray548;

	@OriginalMember(owner = "client!wm", name = "cb", descriptor = "[[I")
	private int[][] anIntArrayArray62;

	@OriginalMember(owner = "client!wm", name = "T", descriptor = "I")
	private int anInt7961 = 1024;

	@OriginalMember(owner = "client!wm", name = "X", descriptor = "I")
	private int anInt7965 = 1024;

	@OriginalMember(owner = "client!wm", name = "U", descriptor = "I")
	private int anInt7962 = 8;

	@OriginalMember(owner = "client!wm", name = "R", descriptor = "I")
	private int anInt7959 = 4;

	@OriginalMember(owner = "client!wm", name = "fb", descriptor = "I")
	private int anInt7970 = 0;

	@OriginalMember(owner = "client!wm", name = "eb", descriptor = "I")
	private int anInt7969 = 409;

	@OriginalMember(owner = "client!wm", name = "W", descriptor = "I")
	private int anInt7964 = 81;

	@OriginalMember(owner = "client!wm", name = "kb", descriptor = "I")
	private int anInt7973 = 204;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "()V")
	public Class6_Sub5_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V")
	@Override
	public void method6533() {
		this.method6518();
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(Z)V")
	private void method6518() {
		@Pc(17) Random local17 = new Random((long) this.anInt7962);
		this.anInt7958 = this.anInt7964 / 2;
		this.anInt7956 = 4096 / this.anInt7959;
		this.anInt7963 = 4096 / this.anInt7962;
		@Pc(40) int local40 = this.anInt7956 / 2;
		this.anIntArrayArray62 = new int[this.anInt7962][this.anInt7959];
		@Pc(52) int local52 = this.anInt7963 / 2;
		this.anIntArrayArray61 = new int[this.anInt7962][this.anInt7959 + 1];
		this.anIntArray548 = new int[this.anInt7962 + 1];
		this.anIntArray548[0] = 0;
		for (@Pc(75) int local75 = 0; local75 < this.anInt7962; local75++) {
			@Pc(85) int local85;
			@Pc(97) int local97;
			if (local75 > 0) {
				local85 = this.anInt7963;
				local97 = (Static267.method4083(local17, 4096) - 2048) * this.anInt7973 >> 12;
				@Pc(105) int local105 = local85 + (local97 * local52 >> 12);
				this.anIntArray548[local75] = local105 + this.anIntArray548[local75 - 1];
			}
			this.anIntArrayArray61[local75][0] = 0;
			for (local85 = 0; local85 < this.anInt7959; local85++) {
				if (local85 > 0) {
					local97 = this.anInt7956;
					@Pc(145) int local145 = (Static267.method4083(local17, 4096) - 2048) * this.anInt7969 >> 12;
					local97 += local145 * local40 >> 12;
					this.anIntArrayArray61[local75][local85] = local97 + this.anIntArrayArray61[local75][local85 - 1];
				}
				this.anIntArrayArray62[local75][local85] = this.anInt7961 > 0 ? 4096 - Static267.method4083(local17, this.anInt7961) : 4096;
			}
			this.anIntArrayArray61[local75][this.anInt7959] = 4096;
		}
		this.anIntArray548[this.anInt7962] = 4096;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IBLclient!ae;)V")
	@Override
	public void method6540(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 0) {
			this.anInt7959 = arg1.method6433();
		} else if (arg0 == 1) {
			this.anInt7962 = arg1.method6433();
		} else if (arg0 == 2) {
			this.anInt7969 = arg1.method6485();
		} else if (arg0 == 3) {
			this.anInt7973 = arg1.method6485();
		} else if (arg0 == 4) {
			this.anInt7965 = arg1.method6485();
		} else if (arg0 == 5) {
			this.anInt7970 = arg1.method6485();
		} else if (arg0 == 6) {
			this.anInt7964 = arg1.method6485();
		} else if (arg0 == 7) {
			this.anInt7961 = arg1.method6485();
		}
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6537(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass61_41.method1611(arg0);
		if (super.aClass61_41.aBoolean142) {
			@Pc(17) int local17 = 0;
			@Pc(24) int local24;
			for (local24 = Static247.anIntArray318[arg0] + this.anInt7970; local24 < 0; local24 += 4096) {
			}
			while (local24 > 4096) {
				local24 -= 4096;
			}
			while (local17 < this.anInt7962 && this.anIntArray548[local17] <= local24) {
				local17++;
			}
			@Pc(61) int local61 = local17 - 1;
			@Pc(72) boolean local72 = (local17 & 0x1) == 0;
			@Pc(77) int local77 = this.anIntArray548[local17];
			@Pc(84) int local84 = this.anIntArray548[local17 - 1];
			if (local24 > local84 + this.anInt7958 && local77 - this.anInt7958 > local24) {
				for (@Pc(111) int local111 = 0; local111 < Static240.anInt4386; local111++) {
					@Pc(115) int local115 = 0;
					@Pc(124) int local124 = local72 ? this.anInt7965 : -this.anInt7965;
					@Pc(136) int local136;
					for (local136 = Static80.anIntArray117[local111] + (local124 * this.anInt7956 >> 12); local136 < 0; local136 += 4096) {
					}
					while (local136 > 4096) {
						local136 -= 4096;
					}
					while (this.anInt7959 > local115 && local136 >= this.anIntArrayArray61[local61][local115]) {
						local115++;
					}
					@Pc(174) int local174 = local115 - 1;
					@Pc(181) int local181 = this.anIntArrayArray61[local61][local174];
					@Pc(188) int local188 = this.anIntArrayArray61[local61][local115];
					if (local181 + this.anInt7958 < local136 && local188 - this.anInt7958 > local136) {
						local11[local111] = this.anIntArrayArray62[local61][local174];
					} else {
						local11[local111] = 0;
					}
				}
			} else {
				Static459.method6344(local11, 0, Static240.anInt4386, 0);
			}
		}
		return local11;
	}
}
