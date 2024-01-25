import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class43 {

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
	public int anInt891;

	@OriginalMember(owner = "client!cq", name = "f", descriptor = "I")
	public int anInt894;

	@OriginalMember(owner = "client!cq", name = "g", descriptor = "I")
	public int anInt895;

	@OriginalMember(owner = "client!cq", name = "j", descriptor = "I")
	public int anInt898;

	@OriginalMember(owner = "client!cq", name = "k", descriptor = "I")
	public int anInt899;

	@OriginalMember(owner = "client!cq", name = "l", descriptor = "I")
	public int anInt900;

	@OriginalMember(owner = "client!cq", name = "m", descriptor = "J")
	public long aLong27;

	@OriginalMember(owner = "client!cq", name = "q", descriptor = "I")
	public int anInt902;

	@OriginalMember(owner = "client!cq", name = "r", descriptor = "I")
	public int anInt903;

	@OriginalMember(owner = "client!cq", name = "t", descriptor = "I")
	private int anInt905;

	@OriginalMember(owner = "client!cq", name = "u", descriptor = "I")
	public int anInt906;

	@OriginalMember(owner = "client!cq", name = "o", descriptor = "I")
	public int anInt901 = 0;

	@OriginalMember(owner = "client!cq", name = "i", descriptor = "I")
	public int anInt897 = 0;

	@OriginalMember(owner = "client!cq", name = "n", descriptor = "Z")
	private boolean aBoolean55 = false;

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(BLclient!kh;I)V")
	private void method679(@OriginalArg(1) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt905 = arg0.method5187();
		} else if (arg1 == 2) {
			arg0.method5185();
		} else if (arg1 == 3) {
			this.anInt899 = arg0.method5198();
			this.anInt906 = arg0.method5198();
			this.anInt895 = arg0.method5198();
		} else if (arg1 == 4) {
			this.anInt898 = arg0.method5185();
			this.anInt903 = arg0.method5198();
		} else if (arg1 == 6) {
			this.anInt894 = arg0.method5185();
		} else if (arg1 == 8) {
			this.anInt897 = 1;
		} else if (arg1 == 9) {
			this.anInt901 = 1;
		} else if (arg1 == 10) {
			this.aBoolean55 = true;
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILclient!kh;)V")
	public void method680(@OriginalArg(1) Class11_Sub25 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method5185();
			if (local10 == 0) {
				return;
			}
			this.method679(arg0, local10);
		}
	}

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "(I)V")
	public void method682() {
		this.anInt902 = Class140.anIntArray329[this.anInt905 << 3];
		this.anInt891 = (int) Math.sqrt((double) (this.anInt906 * this.anInt906 + this.anInt899 * this.anInt899 + this.anInt895 * this.anInt895));
		if (this.anInt903 == 0) {
			this.anInt903 = 1;
		}
		if (this.anInt898 == 0) {
			this.aLong27 = 2147483647L;
		} else if (this.anInt898 == 1) {
			this.aLong27 = this.anInt891 * 8 / this.anInt903;
			this.aLong27 *= this.aLong27;
		} else if (this.anInt898 == 2) {
			this.aLong27 = this.anInt891 * 8 / this.anInt903;
		}
		if (this.aBoolean55) {
			this.anInt891 *= -1;
		}
	}
}
