import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kba")
public final class Class183 {

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "I")
	public int anInt4755;

	@OriginalMember(owner = "client!kba", name = "d", descriptor = "I")
	public int anInt4758;

	@OriginalMember(owner = "client!kba", name = "e", descriptor = "I")
	public int anInt4759;

	@OriginalMember(owner = "client!kba", name = "g", descriptor = "I")
	private int anInt4761;

	@OriginalMember(owner = "client!kba", name = "i", descriptor = "J")
	public long aLong121;

	@OriginalMember(owner = "client!kba", name = "k", descriptor = "I")
	public int anInt4763;

	@OriginalMember(owner = "client!kba", name = "m", descriptor = "I")
	public int anInt4764;

	@OriginalMember(owner = "client!kba", name = "o", descriptor = "I")
	public int anInt4765;

	@OriginalMember(owner = "client!kba", name = "q", descriptor = "I")
	public int anInt4767;

	@OriginalMember(owner = "client!kba", name = "r", descriptor = "I")
	public int anInt4768;

	@OriginalMember(owner = "client!kba", name = "s", descriptor = "I")
	public int anInt4769;

	@OriginalMember(owner = "client!kba", name = "h", descriptor = "Z")
	private boolean aBoolean362 = false;

	@OriginalMember(owner = "client!kba", name = "f", descriptor = "I")
	public int anInt4760 = 0;

	@OriginalMember(owner = "client!kba", name = "v", descriptor = "I")
	public int anInt4772 = 0;

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(ILclient!ac;I)V")
	private void method3787(@OriginalArg(1) Class1_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4761 = arg0.method7945();
		} else if (arg1 == 2) {
			arg0.method7974();
		} else if (arg1 == 3) {
			this.anInt4755 = arg0.method7940();
			this.anInt4763 = arg0.method7940();
			this.anInt4759 = arg0.method7940();
		} else if (arg1 == 4) {
			this.anInt4765 = arg0.method7974();
			this.anInt4767 = arg0.method7940();
		} else if (arg1 == 6) {
			this.anInt4758 = arg0.method7974();
		} else if (arg1 == 8) {
			this.anInt4760 = 1;
		} else if (arg1 == 9) {
			this.anInt4772 = 1;
		} else if (arg1 == 10) {
			this.aBoolean362 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Z)V")
	public void method3789() {
		this.anInt4768 = Class85_Sub8.anIntArray427[this.anInt4761 << 3];
		@Pc(17) long local17 = (long) this.anInt4755;
		@Pc(21) long local21 = (long) this.anInt4763;
		@Pc(25) long local25 = (long) this.anInt4759;
		this.anInt4764 = (int) Math.sqrt((double) (local25 * local25 + local21 * local21 + local17 * local17));
		if (this.anInt4767 == 0) {
			this.anInt4767 = 1;
		}
		if (this.anInt4765 == 0) {
			this.aLong121 = 2147483647L;
		} else if (this.anInt4765 == 1) {
			this.aLong121 = this.anInt4764 * 8 / this.anInt4767;
			this.aLong121 *= this.aLong121;
		} else if (this.anInt4765 == 2) {
			this.aLong121 = this.anInt4764 * 8 / this.anInt4767;
		}
		if (this.aBoolean362) {
			this.anInt4764 *= -1;
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lclient!ac;B)V")
	public void method3794(@OriginalArg(0) Class1_Sub3 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method7974();
			if (local9 == 0) {
				return;
			}
			this.method3787(arg0, local9);
		}
	}
}
