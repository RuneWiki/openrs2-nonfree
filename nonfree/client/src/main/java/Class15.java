import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class15 {

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
	private int anInt230;

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
	public int anInt236;

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
	public int anInt237;

	@OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
	public int anInt239;

	@OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
	public int anInt240;

	@OriginalMember(owner = "client!ai", name = "m", descriptor = "I")
	public int anInt241;

	@OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
	public int anInt242;

	@OriginalMember(owner = "client!ai", name = "o", descriptor = "J")
	public long aLong10;

	@OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
	public int anInt243;

	@OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
	public int anInt244;

	@OriginalMember(owner = "client!ai", name = "u", descriptor = "I")
	public int anInt248;

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "Z")
	private boolean aBoolean15 = false;

	@OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
	public int anInt245 = 0;

	@OriginalMember(owner = "client!ai", name = "t", descriptor = "I")
	public int anInt247 = 0;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZILclient!mc;)V")
	private void method208(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub41 arg1) {
		if (arg0 == 1) {
			this.anInt230 = arg1.method7860();
		} else if (arg0 == 2) {
			arg1.method7816();
		} else if (arg0 == 3) {
			this.anInt241 = arg1.method7804();
			this.anInt243 = arg1.method7804();
			this.anInt248 = arg1.method7804();
		} else if (arg0 == 4) {
			this.anInt244 = arg1.method7816();
			this.anInt236 = arg1.method7804();
		} else if (arg0 == 6) {
			this.anInt240 = arg1.method7816();
		} else if (arg0 == 8) {
			this.anInt245 = 1;
		} else if (arg0 == 9) {
			this.anInt247 = 1;
		} else if (arg0 == 10) {
			this.aBoolean15 = true;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLclient!mc;)V")
	public void method209(@OriginalArg(1) Class5_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method7816();
			if (local3 == 0) {
				return;
			}
			this.method208(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
	public void method210() {
		this.anInt242 = Class200.anIntArray338[this.anInt230 << 3];
		@Pc(15) long local15 = (long) this.anInt241;
		@Pc(19) long local19 = (long) this.anInt243;
		@Pc(29) long local29 = (long) this.anInt248;
		this.anInt237 = (int) Math.sqrt((double) (local15 * local15 + local19 * local19 + local29 * local29));
		if (this.anInt236 == 0) {
			this.anInt236 = 1;
		}
		if (this.anInt244 == 0) {
			this.aLong10 = 2147483647L;
		} else if (this.anInt244 == 1) {
			this.aLong10 = (long) (this.anInt237 * 8 / this.anInt236);
			this.aLong10 *= this.aLong10;
		} else if (this.anInt244 == 2) {
			this.aLong10 = (long) (this.anInt237 * 8 / this.anInt236);
		}
		if (this.aBoolean15) {
			this.anInt237 *= -1;
		}
	}
}
