import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class96 {

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "Lclient!wg;")
	public Class246 aClass246_3;

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
	public int anInt2411;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "Z")
	public boolean aBoolean185 = false;

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
	public int anInt2414 = 16;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
	public int anInt2403 = 128;

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
	public int anInt2406 = 0;

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
	public int anInt2413 = -1;

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
	public int anInt2405 = 1190717;

	@OriginalMember(owner = "client!hc", name = "q", descriptor = "Z")
	public boolean aBoolean186 = true;

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
	public int anInt2404 = 127;

	@OriginalMember(owner = "client!hc", name = "u", descriptor = "Z")
	public boolean aBoolean187 = true;

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
	public int anInt2410 = -1;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
	public int anInt2408 = -1;

	@OriginalMember(owner = "client!hc", name = "v", descriptor = "I")
	public int anInt2417 = 8;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V")
	public void method2280() {
		if (this.anInt2410 == -1) {
			this.anInt2410 = this.anInt2408;
		}
		this.anInt2417 = this.anInt2417 << 8 | this.anInt2411;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!lk;I)V")
	private void method2281(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt2406 = Static275.method4291(arg1.method4235());
		} else if (arg0 == 2) {
			this.anInt2408 = arg1.method4240();
		} else if (arg0 == 3) {
			this.anInt2408 = arg1.method4245();
			if (this.anInt2408 == 65535) {
				this.anInt2408 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean186 = false;
		} else if (arg0 == 7) {
			this.anInt2413 = Static275.method4291(arg1.method4235());
		} else if (arg0 == 8) {
			this.aClass246_3.anInt6641 = this.anInt2411;
		} else if (arg0 == 9) {
			this.anInt2403 = arg1.method4245();
		} else if (arg0 == 10) {
			this.aBoolean187 = false;
		} else if (arg0 == 11) {
			this.anInt2417 = arg1.method4240();
		} else if (arg0 == 12) {
			this.aBoolean185 = true;
		} else if (arg0 == 13) {
			this.anInt2405 = arg1.method4235();
		} else if (arg0 == 14) {
			this.anInt2414 = arg1.method4240();
		} else if (arg0 == 15) {
			this.anInt2410 = arg1.method4245();
			if (this.anInt2410 == 65535) {
				this.anInt2410 = -1;
			}
		} else if (arg0 == 16) {
			this.anInt2404 = arg1.method4240();
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!lk;I)V")
	public void method2283(@OriginalArg(0) Class2_Sub13 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4240();
			if (local5 == 0) {
				return;
			}
			this.method2281(local5, arg0);
		}
	}
}
