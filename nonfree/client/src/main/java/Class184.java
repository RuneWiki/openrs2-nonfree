import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class184 {

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "Lclient!er;")
	public Class81 aClass81_5;

	@OriginalMember(owner = "client!ls", name = "q", descriptor = "I")
	public int anInt5607;

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "I")
	public int anInt5596 = 0;

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
	public int anInt5595 = -1;

	@OriginalMember(owner = "client!ls", name = "h", descriptor = "I")
	public int anInt5600 = -1;

	@OriginalMember(owner = "client!ls", name = "k", descriptor = "I")
	public int anInt5602 = 127;

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "Z")
	public boolean aBoolean387 = false;

	@OriginalMember(owner = "client!ls", name = "m", descriptor = "I")
	public int anInt5604 = -1;

	@OriginalMember(owner = "client!ls", name = "i", descriptor = "Z")
	public boolean aBoolean388 = true;

	@OriginalMember(owner = "client!ls", name = "o", descriptor = "Z")
	public boolean aBoolean389 = true;

	@OriginalMember(owner = "client!ls", name = "g", descriptor = "I")
	public int anInt5599 = 8;

	@OriginalMember(owner = "client!ls", name = "p", descriptor = "I")
	public int anInt5606 = 1190717;

	@OriginalMember(owner = "client!ls", name = "s", descriptor = "I")
	public int anInt5608 = 128;

	@OriginalMember(owner = "client!ls", name = "l", descriptor = "I")
	public int anInt5603 = 16;

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(BLclient!gw;)V")
	public void method4841(@OriginalArg(1) Class1_Sub13 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method3043();
			if (local3 == 0) {
				return;
			}
			this.method4846(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V")
	public void method4844() {
		if (this.anInt5604 == -1) {
			this.anInt5604 = this.anInt5595;
		}
		this.anInt5599 = this.anInt5607 | this.anInt5599 << 8;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(BLclient!gw;I)V")
	private void method4846(@OriginalArg(1) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt5596 = Static317.method5202(arg0.method3039());
		} else if (arg1 == 2) {
			this.anInt5595 = arg0.method3043();
		} else if (arg1 == 3) {
			this.anInt5595 = arg0.method3056();
			if (this.anInt5595 == 65535) {
				this.anInt5595 = -1;
				return;
			}
		} else if (arg1 == 5) {
			this.aBoolean388 = false;
			return;
		} else if (arg1 == 7) {
			this.anInt5600 = Static317.method5202(arg0.method3039());
			return;
		} else if (arg1 == 8) {
			this.aClass81_5.anInt2816 = this.anInt5607;
			return;
		} else if (arg1 == 9) {
			this.anInt5608 = arg0.method3056() << 0;
			return;
		} else if (arg1 == 10) {
			this.aBoolean389 = false;
			return;
		} else if (arg1 == 11) {
			this.anInt5599 = arg0.method3043();
			return;
		} else if (arg1 == 12) {
			this.aBoolean387 = true;
			return;
		} else {
			if (arg1 == 13) {
				this.anInt5606 = arg0.method3039();
			} else if (arg1 == 14) {
				this.anInt5603 = arg0.method3043() << 0;
				return;
			} else if (arg1 == 15) {
				this.anInt5604 = arg0.method3056();
				if (this.anInt5604 == 65535) {
					this.anInt5604 = -1;
					return;
				}
			} else if (arg1 == 16) {
				this.anInt5602 = arg0.method3043();
				return;
			} else {
				return;
			}
			return;
		}
	}
}
