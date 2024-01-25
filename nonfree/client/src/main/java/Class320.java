import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public final class Class320 {

	@OriginalMember(owner = "client!rq", name = "s", descriptor = "[C")
	public static final char[] aCharArray7 = new char[64];

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
	public int anInt8179;

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
	public int anInt8180;

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "I")
	private int anInt8181;

	@OriginalMember(owner = "client!rq", name = "g", descriptor = "I")
	public int anInt8184;

	@OriginalMember(owner = "client!rq", name = "h", descriptor = "I")
	public int anInt8185;

	@OriginalMember(owner = "client!rq", name = "i", descriptor = "I")
	public int anInt8186;

	@OriginalMember(owner = "client!rq", name = "l", descriptor = "I")
	public int anInt8189;

	@OriginalMember(owner = "client!rq", name = "n", descriptor = "I")
	public int anInt8191;

	@OriginalMember(owner = "client!rq", name = "o", descriptor = "I")
	public int anInt8192;

	@OriginalMember(owner = "client!rq", name = "p", descriptor = "I")
	public int anInt8193;

	@OriginalMember(owner = "client!rq", name = "t", descriptor = "J")
	public long aLong244;

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "Z")
	private boolean aBoolean642 = false;

	@OriginalMember(owner = "client!rq", name = "k", descriptor = "I")
	public int anInt8188 = 0;

	@OriginalMember(owner = "client!rq", name = "r", descriptor = "I")
	public int anInt8195 = 0;

	static {
		for (@Pc(6) int local6 = 0; local6 < 26; local6++) {
			aCharArray7[local6] = (char) (local6 + 65);
		}
		for (@Pc(22) int local22 = 26; local22 < 52; local22++) {
			aCharArray7[local22] = (char) (local22 + 97 - 26);
		}
		for (@Pc(40) int local40 = 52; local40 < 62; local40++) {
			aCharArray7[local40] = (char) (local40 + 48 - 52);
		}
		aCharArray7[63] = '/';
		aCharArray7[62] = '+';
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lclient!es;IB)V")
	private void method7107(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt8181 = arg0.method8859();
		} else if (arg1 == 2) {
			arg0.method8865();
		} else if (arg1 == 3) {
			this.anInt8193 = arg0.method8850();
			this.anInt8180 = arg0.method8850();
			this.anInt8189 = arg0.method8850();
		} else if (arg1 == 4) {
			this.anInt8192 = arg0.method8865();
			this.anInt8186 = arg0.method8850();
		} else if (arg1 == 6) {
			this.anInt8184 = arg0.method8865();
		} else if (arg1 == 8) {
			this.anInt8188 = 1;
		} else if (arg1 == 9) {
			this.anInt8195 = 1;
		} else if (arg1 == 10) {
			this.aBoolean642 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lclient!es;I)V")
	public void method7108(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method8865();
			if (local12 == 0) {
				return;
			}
			this.method7107(arg0, local12);
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V")
	public void method7109() {
		this.anInt8185 = Class4_Sub2_Sub26.anIntArray562[this.anInt8181 << 3];
		@Pc(17) long local17 = (long) this.anInt8193;
		@Pc(21) long local21 = (long) this.anInt8180;
		@Pc(25) long local25 = (long) this.anInt8189;
		this.anInt8191 = (int) Math.sqrt((double) (local25 * local25 + local17 * local17 + local21 * local21));
		if (this.anInt8186 == 0) {
			this.anInt8186 = 1;
		}
		if (this.anInt8192 == 0) {
			this.aLong244 = 2147483647L;
		} else if (this.anInt8192 == 1) {
			this.aLong244 = (long) (this.anInt8191 * 8 / this.anInt8186);
			this.aLong244 *= this.aLong244;
		} else if (this.anInt8192 == 2) {
			this.aLong244 = (long) (this.anInt8191 * 8 / this.anInt8186);
		}
		if (this.aBoolean642) {
			this.anInt8191 *= -1;
		}
	}
}
