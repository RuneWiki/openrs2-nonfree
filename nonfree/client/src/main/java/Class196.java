import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class196 {

	@OriginalMember(owner = "client!u", name = "a", descriptor = "I")
	public int anInt6150;

	@OriginalMember(owner = "client!u", name = "f", descriptor = "I")
	public int anInt6155;

	@OriginalMember(owner = "client!u", name = "h", descriptor = "I")
	public int anInt6157;

	@OriginalMember(owner = "client!u", name = "i", descriptor = "J")
	public long aLong191;

	@OriginalMember(owner = "client!u", name = "j", descriptor = "I")
	public int anInt6158;

	@OriginalMember(owner = "client!u", name = "k", descriptor = "I")
	public int anInt6159;

	@OriginalMember(owner = "client!u", name = "l", descriptor = "I")
	public int anInt6160;

	@OriginalMember(owner = "client!u", name = "n", descriptor = "I")
	public int anInt6162;

	@OriginalMember(owner = "client!u", name = "p", descriptor = "I")
	private int anInt6163;

	@OriginalMember(owner = "client!u", name = "t", descriptor = "I")
	public int anInt6167;

	@OriginalMember(owner = "client!u", name = "u", descriptor = "I")
	public int anInt6168;

	@OriginalMember(owner = "client!u", name = "b", descriptor = "I")
	public int anInt6151 = 0;

	@OriginalMember(owner = "client!u", name = "o", descriptor = "Z")
	private boolean aBoolean420 = false;

	@OriginalMember(owner = "client!u", name = "w", descriptor = "I")
	public int anInt6169 = 0;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!fb;)V")
	public void method5218(@OriginalArg(1) Class3_Sub4 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method3643();
			if (local15 == 0) {
				return;
			}
			this.method5221(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!fb;BI)V")
	private void method5221(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt6163 = arg0.method3649();
		} else if (arg1 == 2) {
			arg0.method3643();
		} else if (arg1 == 3) {
			this.anInt6160 = arg0.method3642();
			this.anInt6158 = arg0.method3642();
			this.anInt6155 = arg0.method3642();
		} else if (arg1 == 4) {
			this.anInt6159 = arg0.method3643();
			this.anInt6150 = arg0.method3642();
		} else if (arg1 == 6) {
			this.anInt6167 = arg0.method3643();
		} else if (arg1 == 8) {
			this.anInt6151 = 1;
		} else if (arg1 == 9) {
			this.anInt6169 = 1;
			return;
		} else if (arg1 == 10) {
			this.aBoolean420 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V")
	public void method5223() {
		this.anInt6157 = Class19.anIntArray21[this.anInt6163 << 3];
		this.anInt6168 = (int) Math.sqrt((double) (this.anInt6160 * this.anInt6160 + this.anInt6158 * this.anInt6158 + this.anInt6155 * this.anInt6155));
		if (this.anInt6150 == 0) {
			this.anInt6150 = 1;
		}
		if (this.anInt6159 == 0) {
			this.aLong191 = 2147483647L;
		} else if (this.anInt6159 == 1) {
			this.aLong191 = this.anInt6168 * 8 / this.anInt6150;
			this.aLong191 *= this.aLong191;
		} else if (this.anInt6159 == 2) {
			this.aLong191 = this.anInt6168 * 8 / this.anInt6150;
		}
		if (this.aBoolean420) {
			this.anInt6168 *= -1;
		}
	}
}
