import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class2_Sub2_Sub31 extends Class2_Sub2 {

	@OriginalMember(owner = "client!r", name = "R", descriptor = "[I")
	private int[] anIntArray323;

	@OriginalMember(owner = "client!r", name = "V", descriptor = "[I")
	private int[] anIntArray324;

	@OriginalMember(owner = "client!r", name = "W", descriptor = "I")
	private int anInt2974;

	@OriginalMember(owner = "client!r", name = "U", descriptor = "I")
	private int anInt2973;

	@OriginalMember(owner = "client!r", name = "Q", descriptor = "I")
	private int anInt2971;

	@OriginalMember(owner = "client!r", name = "fb", descriptor = "Z")
	private boolean aBoolean134;

	@OriginalMember(owner = "client!r", name = "eb", descriptor = "[I")
	private int[] anIntArray325;

	@OriginalMember(owner = "client!r", name = "cb", descriptor = "I")
	private int anInt2980;

	@OriginalMember(owner = "client!r", name = "ab", descriptor = "I")
	private int anInt2978;

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V")
	@Override
	public void method2574() {
		this.method2142();
		this.method2139();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2575(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass76_38.method2290(arg0);
		if (super.aClass76_38.aBoolean142) {
			@Pc(25) int local25 = this.anInt2974 << 12;
			@Pc(30) int local30 = this.anInt2980 << 12;
			@Pc(37) int local37 = this.anInt2980 * Static86.anIntArray218[arg0];
			for (@Pc(39) int local39 = 0; local39 < Static149.anInt3233; local39++) {
				@Pc(43) int local43 = 0;
				@Pc(50) int local50 = Static154.anIntArray354[local39] * this.anInt2974;
				for (@Pc(52) int local52 = 0; local52 < this.anInt2971; local52++) {
					@Pc(59) int local59 = this.anIntArray324[local52];
					@Pc(64) int local64 = this.anIntArray323[local52];
					@Pc(88) int local88 = this.method2141(local59 * local50 >> 12, local59 * local37 >> 12, local25 * local59 >> 12, local30 * local59 >> 12);
					local43 += local64 * local88 >> 12;
				}
				if (this.aBoolean134) {
					local43 = (local43 >> 1) + 2048;
				}
				local16[local39] = local43;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!r", name = "f", descriptor = "(I)V")
	private void method2139() {
		@Pc(23) int local23;
		if (this.anInt2973 > 0) {
			this.anIntArray324 = new int[this.anInt2971];
			this.anIntArray323 = new int[this.anInt2971];
			for (local23 = 0; local23 < this.anInt2971; local23++) {
				this.anIntArray323[local23] = (int) (Math.pow((double) (this.anInt2973 / 4096), (double) local23) * 4096.0D);
				this.anIntArray324[local23] = (int) (Math.pow(2.0D, (double) local23) * 4096.0D);
			}
		} else if (this.anIntArray323 != null && this.anInt2971 == this.anIntArray323.length) {
			this.anIntArray324 = new int[this.anInt2971];
			for (local23 = 0; local23 < this.anInt2971; local23++) {
				this.anIntArray324[local23] = (int) (Math.pow(2.0D, (double) local23) * 4096.0D);
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IBIII)I")
	private int method2141(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg0 & 0xFFFFF000;
		@Pc(11) int local11 = arg0 - local7;
		@Pc(15) int local15 = local7 >> 12;
		@Pc(19) int local19 = local15 + 1;
		@Pc(23) int local23 = local15 & 0xFF;
		@Pc(27) int local27 = arg1 & 0xFFFFF000;
		@Pc(31) int local31 = arg1 - local27;
		@Pc(35) int local35 = arg2 & 0xFFFFF000;
		@Pc(39) int local39 = local27 >> 12;
		@Pc(43) int local43 = local39 + 1;
		@Pc(47) int local47 = local39 & 0xFF;
		if (local35 >> 12 <= local19) {
			local19 = 0;
		}
		local19 &= 0xFF;
		@Pc(66) int local66 = arg3 & 0xFFFFF000;
		@Pc(78) int local78 = this.anIntArray325[local23 + this.anIntArray325[local47]] % 4;
		if (local66 >> 12 <= local43) {
			local43 = 0;
		}
		@Pc(105) int local105 = this.anIntArray325[local19 + this.anIntArray325[local47]] % 4;
		local43 &= 0xFF;
		@Pc(121) int local121 = this.anIntArray325[local23 + this.anIntArray325[local43]] % 4;
		@Pc(134) int local134 = this.anIntArray325[local19 + this.anIntArray325[local43]] % 4;
		@Pc(142) int local142 = Static156.method2398(local31, Static154.anIntArrayArray36[local78], local11);
		@Pc(152) int local152 = Static156.method2398(local31, Static154.anIntArrayArray36[local105], local11 - 4096);
		@Pc(162) int local162 = Static156.method2398(local31 - 4096, Static154.anIntArrayArray36[local121], local11);
		@Pc(174) int local174 = Static156.method2398(local31 - 4096, Static154.anIntArrayArray36[local134], local11 - 4096);
		@Pc(178) int local178 = Static69.method1165(local11);
		@Pc(182) int local182 = Static69.method1165(local31);
		@Pc(188) int local188 = Static76.method1261(local152, local178, local142);
		@Pc(194) int local194 = Static76.method1261(local174, local178, local162);
		return Static76.method1261(local194, local182, local188);
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(B)V")
	private void method2142() {
		@Pc(12) Random local12 = new Random((long) this.anInt2978);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.anIntArray325[local14] = -1;
		}
		for (@Pc(35) int local35 = 0; local35 < 255; local35++) {
			@Pc(42) int local42;
			do {
				local42 = Static137.method2174(local12, 255);
			} while (this.anIntArray325[local42] != -1);
			this.anIntArray325[local42 + 255] = this.anIntArray325[local42] = local35;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BILclient!va;)V")
	@Override
	public void method2580(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.aBoolean134 = arg1.method1461() == 1;
		} else if (arg0 == 1) {
			this.anInt2971 = arg1.method1461();
		} else if (arg0 == 2) {
			this.anInt2973 = arg1.method1455();
			if (this.anInt2973 < 0) {
				this.anIntArray323 = new int[this.anInt2971];
				for (@Pc(79) int local79 = 0; local79 < this.anInt2971; local79++) {
					this.anIntArray323[local79] = arg1.method1455();
				}
			}
		} else if (arg0 == 3) {
			this.anInt2974 = this.anInt2980 = arg1.method1461();
		} else if (arg0 == 4) {
			this.anInt2978 = arg1.method1461();
		} else if (arg0 == 5) {
			this.anInt2974 = arg1.method1461();
		} else if (arg0 == 6) {
			this.anInt2980 = arg1.method1461();
		}
	}
}
