import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class179 {

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "Lclient!sf;")
	public Class309 aClass309_3;

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "I")
	public int anInt4270;

	@OriginalMember(owner = "client!jo", name = "j", descriptor = "I")
	public int anInt4274 = 0;

	@OriginalMember(owner = "client!jo", name = "g", descriptor = "I")
	public int anInt4271 = 127;

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
	public int anInt4269 = 512;

	@OriginalMember(owner = "client!jo", name = "h", descriptor = "I")
	public int anInt4272 = 8;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "Z")
	public boolean aBoolean316 = true;

	@OriginalMember(owner = "client!jo", name = "n", descriptor = "Z")
	public boolean aBoolean317 = false;

	@OriginalMember(owner = "client!jo", name = "p", descriptor = "I")
	public int anInt4279 = -1;

	@OriginalMember(owner = "client!jo", name = "o", descriptor = "I")
	public int anInt4278 = -1;

	@OriginalMember(owner = "client!jo", name = "q", descriptor = "I")
	public int anInt4280 = 64;

	@OriginalMember(owner = "client!jo", name = "r", descriptor = "Z")
	public boolean aBoolean318 = true;

	@OriginalMember(owner = "client!jo", name = "l", descriptor = "I")
	public int anInt4276 = 1190717;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IILclient!gk;)V")
	private void method3649(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub7 arg1) {
		if (arg0 == 1) {
			this.anInt4274 = Static143.method5990(arg1.method4503());
		} else if (arg0 == 2) {
			this.anInt4278 = arg1.method4464();
		} else if (arg0 == 3) {
			this.anInt4278 = arg1.method4518();
			if (this.anInt4278 == 65535) {
				this.anInt4278 = -1;
				return;
			}
		} else if (arg0 == 5) {
			this.aBoolean316 = false;
		} else if (arg0 == 7) {
			this.anInt4279 = Static143.method5990(arg1.method4503());
			return;
		} else if (arg0 == 8) {
			this.aClass309_3.anInt7724 = this.anInt4270;
			return;
		} else if (arg0 == 9) {
			this.anInt4269 = arg1.method4518() << 2;
			return;
		} else if (arg0 == 10) {
			this.aBoolean318 = false;
			return;
		} else if (arg0 == 11) {
			this.anInt4272 = arg1.method4464();
			return;
		} else if (arg0 == 12) {
			this.aBoolean317 = true;
			return;
		} else if (arg0 == 13) {
			this.anInt4276 = arg1.method4503();
			return;
		} else {
			if (arg0 == 14) {
				this.anInt4280 = arg1.method4464() << 2;
			} else if (arg0 == 16) {
				this.anInt4271 = arg1.method4464();
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V")
	public void method3650() {
		this.anInt4272 = this.anInt4272 << 8 | this.anInt4270;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(BLclient!gk;)V")
	public void method3652(@OriginalArg(1) Class2_Sub7 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method4464();
			if (local14 == 0) {
				return;
			}
			this.method3649(local14, arg0);
		}
	}
}
