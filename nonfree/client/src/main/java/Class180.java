import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class180 {

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "Z")
	public boolean aBoolean402 = true;

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "Z")
	public boolean aBoolean404 = true;

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "Z")
	public boolean aBoolean403 = false;

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
	public int anInt5285 = 16;

	@OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
	public int anInt5288 = 8;

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
	public int anInt5286 = -1;

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
	public int anInt5283 = -1;

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
	public int anInt5284 = 128;

	@OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
	public int anInt5293 = 0;

	@OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
	public int anInt5294 = 1190717;

	@OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
	public int anInt5289 = -1;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)V")
	public void method4846(@OriginalArg(1) int arg0) {
		if (this.anInt5289 == -1) {
			this.anInt5289 = this.anInt5286;
		}
		this.anInt5288 = arg0 | this.anInt5288 << 8;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!at;I)V")
	public void method4849(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub7 arg1) {
		while (true) {
			@Pc(13) int local13 = arg1.method2132();
			if (local13 == 0) {
				return;
			}
			this.method4851(local13, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILclient!at;I)V")
	private void method4851(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt5293 = Static357.method5931(arg1.method2119());
		} else if (arg0 == 2) {
			this.anInt5286 = arg1.method2132();
		} else if (arg0 == 3) {
			this.anInt5286 = arg1.method2161();
			if (this.anInt5286 == 65535) {
				this.anInt5286 = -1;
				return;
			}
		} else if (arg0 == 5) {
			this.aBoolean402 = false;
			return;
		} else if (arg0 == 7) {
			this.anInt5283 = Static357.method5931(arg1.method2119());
			return;
		} else if (arg0 == 8) {
			Static50.anInt1268 = arg2;
			return;
		} else if (arg0 == 9) {
			this.anInt5284 = arg1.method2161();
			return;
		} else if (arg0 == 10) {
			this.aBoolean404 = false;
			return;
		} else {
			if (arg0 == 11) {
				this.anInt5288 = arg1.method2132();
			} else if (arg0 == 12) {
				this.aBoolean403 = true;
				return;
			} else if (arg0 == 13) {
				this.anInt5294 = arg1.method2119();
				return;
			} else if (arg0 == 14) {
				this.anInt5285 = arg1.method2132();
				return;
			} else if (arg0 == 15) {
				this.anInt5289 = arg1.method2161();
				if (this.anInt5289 == 65535) {
					this.anInt5289 = -1;
					return;
				}
			}
			return;
		}
	}
}
