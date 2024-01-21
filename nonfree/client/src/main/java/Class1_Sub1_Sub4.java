import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class1_Sub1_Sub4 extends Class1_Sub1 {

	@OriginalMember(owner = "client!db", name = "X", descriptor = "I")
	public int anInt536;

	@OriginalMember(owner = "client!db", name = "cb", descriptor = "I")
	public int anInt541;

	@OriginalMember(owner = "client!db", name = "eb", descriptor = "I")
	public int anInt542;

	@OriginalMember(owner = "client!db", name = "jb", descriptor = "I")
	public int anInt546;

	@OriginalMember(owner = "client!db", name = "ob", descriptor = "I")
	public int anInt550;

	@OriginalMember(owner = "client!db", name = "ub", descriptor = "I")
	public int anInt552;

	@OriginalMember(owner = "client!db", name = "pb", descriptor = "I")
	public int anInt551 = 0;

	@OriginalMember(owner = "client!db", name = "ib", descriptor = "I")
	public int anInt545 = -1;

	@OriginalMember(owner = "client!db", name = "lb", descriptor = "Z")
	public boolean aBoolean23 = true;

	@OriginalMember(owner = "client!db", name = "nb", descriptor = "I")
	public int anInt549 = -1;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IBLclient!ka;I)V")
	private void method392(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt551 = arg1.method1202();
		} else if (arg0 == 2) {
			this.anInt549 = arg1.method1186();
		} else if (arg0 == 5) {
			this.aBoolean23 = false;
		} else if (arg0 == 7) {
			this.anInt545 = arg1.method1202();
			return;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)V")
	private void method395(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(29) double local29 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(31) double local31 = local14;
		@Pc(40) double local40 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		if (local40 < local14) {
			local31 = local40;
		}
		if (local31 > local29) {
			local31 = local29;
		}
		@Pc(54) double local54 = local14;
		if (local40 > local14) {
			local54 = local40;
		}
		@Pc(62) double local62 = 0.0D;
		if (local54 < local29) {
			local54 = local29;
		}
		@Pc(74) double local74 = (local31 + local54) / 2.0D;
		this.anInt550 = (int) (local74 * 256.0D);
		if (this.anInt550 < 0) {
			this.anInt550 = 0;
		} else if (this.anInt550 > 255) {
			this.anInt550 = 255;
		}
		@Pc(99) double local99 = 0.0D;
		if (local31 != local54) {
			if (local74 < 0.5D) {
				local99 = (local54 - local31) / (local54 + local31);
			}
			if (local14 == local54) {
				local62 = (local40 - local29) / (local54 - local31);
			} else if (local40 == local54) {
				local62 = (local29 - local14) / (-local31 + local54) + 2.0D;
			} else if (local54 == local29) {
				local62 = (local14 - local40) / (-local31 + local54) + 4.0D;
			}
			if (local74 >= 0.5D) {
				local99 = (local54 - local31) / (2.0D - local54 - local31);
			}
		}
		local62 /= 6.0D;
		this.anInt541 = (int) (local99 * 256.0D);
		this.anInt536 = (int) (local62 * 256.0D);
		if (this.anInt541 < 0) {
			this.anInt541 = 0;
		} else if (this.anInt541 > 255) {
			this.anInt541 = 255;
			return;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!ka;I)V")
	public void method399(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub8 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method1186();
			if (local9 == 0) {
				return;
			}
			this.method392(local9, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!db", name = "g", descriptor = "(I)V")
	public void method401() {
		if (this.anInt545 != -1) {
			this.method395(this.anInt545);
			this.anInt546 = this.anInt541;
			this.anInt552 = this.anInt536;
			this.anInt542 = this.anInt550;
		}
		this.method395(this.anInt551);
	}
}
