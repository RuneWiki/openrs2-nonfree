import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ak", name = "A", descriptor = "I")
	private int anInt436 = 0;

	@OriginalMember(owner = "client!ak", name = "K", descriptor = "I")
	private int anInt443 = 4096;

	@OriginalMember(owner = "client!ak", name = "z", descriptor = "I")
	private int anInt435 = 2000;

	@OriginalMember(owner = "client!ak", name = "E", descriptor = "I")
	private int anInt439 = 0;

	@OriginalMember(owner = "client!ak", name = "N", descriptor = "I")
	private int anInt445 = 16;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V")
	@Override
	public void method7831() {
		Static263.method3803();
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BILclient!ac;)V")
	@Override
	public void method7835(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt439 = arg1.method7974();
		} else if (arg0 == 1) {
			this.anInt435 = arg1.method7945();
		} else if (arg0 == 2) {
			this.anInt445 = arg1.method7974();
		} else if (arg0 == 3) {
			this.anInt436 = arg1.method7945();
		} else if (arg0 == 4) {
			this.anInt443 = arg1.method7945();
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7826(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass152_41.method3216(arg0);
		if (super.aClass152_41.aBoolean282) {
			@Pc(20) int local20 = this.anInt443 >> 1;
			@Pc(25) int[][] local25 = super.aClass152_41.method3215();
			@Pc(32) Random local32 = new Random((long) this.anInt439);
			for (@Pc(34) int local34 = 0; local34 < this.anInt435; local34++) {
				@Pc(54) int local54 = this.anInt443 > 0 ? this.anInt436 + Static46.method765(this.anInt443, local32) - local20 : this.anInt436;
				@Pc(60) int local60 = local54 >> 4 & 0xFF;
				@Pc(65) int local65 = Static46.method765(Static501.anInt8748, local32);
				@Pc(72) int local72 = Static46.method765(Static8.anInt5990, local32);
				@Pc(83) int local83 = (Static133.anIntArray110[local60] * this.anInt445 >> 12) + local65;
				@Pc(94) int local94 = (this.anInt445 * Static482.anIntArray516[local60] >> 12) + local72;
				@Pc(99) int local99 = local94 - local72;
				@Pc(104) int local104 = local83 - local65;
				if (local104 != 0 || local99 != 0) {
					if (local104 < 0) {
						local104 = -local104;
					}
					if (local99 < 0) {
						local99 = -local99;
					}
					@Pc(134) boolean local134 = local104 < local99;
					@Pc(138) int local138;
					@Pc(142) int local142;
					if (local134) {
						local138 = local65;
						local65 = local72;
						local142 = local83;
						local83 = local94;
						local72 = local138;
						local94 = local142;
					}
					if (local83 < local65) {
						local138 = local65;
						local65 = local83;
						local142 = local72;
						local83 = local138;
						local72 = local94;
						local94 = local142;
					}
					local138 = local72;
					local142 = local83 - local65;
					@Pc(179) int local179 = local94 - local72;
					@Pc(184) int local184 = -local142 / 2;
					@Pc(188) int local188 = 2048 / local142;
					@Pc(198) int local198 = 1024 - (Static46.method765(4096, local32) >> 2);
					if (local179 < 0) {
						local179 = -local179;
					}
					@Pc(214) int local214 = local94 <= local72 ? -1 : 1;
					for (@Pc(216) int local216 = local65; local216 < local83; local216++) {
						@Pc(230) int local230 = local198 + (-local65 + local216) * local188 + 1024;
						@Pc(234) int local234 = Static326.anInt4973 & local216;
						@Pc(238) int local238 = Static98.anInt1743 & local138;
						local184 += local179;
						if (local134) {
							local25[local238][local234] = local230;
						} else {
							local25[local234][local238] = local230;
						}
						if (local184 > 0) {
							local184 += -local142;
							local138 -= -local214;
						}
					}
				}
			}
		}
		return local11;
	}
}
