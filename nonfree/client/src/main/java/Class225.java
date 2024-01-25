import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mea")
public final class Class225 {

	@OriginalMember(owner = "client!mea", name = "c", descriptor = "I")
	public int anInt6214;

	@OriginalMember(owner = "client!mea", name = "p", descriptor = "Lclient!bm;")
	public Class37 aClass37_4;

	@OriginalMember(owner = "client!mea", name = "e", descriptor = "I")
	public int anInt6216 = 8;

	@OriginalMember(owner = "client!mea", name = "m", descriptor = "I")
	public int anInt6222 = 512;

	@OriginalMember(owner = "client!mea", name = "n", descriptor = "Z")
	public boolean aBoolean434 = true;

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "I")
	public int anInt6212 = 1190717;

	@OriginalMember(owner = "client!mea", name = "f", descriptor = "Z")
	public boolean aBoolean433 = true;

	@OriginalMember(owner = "client!mea", name = "q", descriptor = "Z")
	public boolean aBoolean435 = false;

	@OriginalMember(owner = "client!mea", name = "o", descriptor = "I")
	public int anInt6223 = -1;

	@OriginalMember(owner = "client!mea", name = "h", descriptor = "I")
	public int anInt6218 = 0;

	@OriginalMember(owner = "client!mea", name = "j", descriptor = "I")
	public int anInt6219 = 127;

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "I")
	public int anInt6213 = 64;

	@OriginalMember(owner = "client!mea", name = "u", descriptor = "I")
	public int anInt6226 = -1;

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Z)V")
	public void method5242() {
		this.anInt6216 = this.anInt6216 << 8 | this.anInt6214;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Lclient!dt;II)V")
	private void method5244(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt6218 = Static307.method4538(arg0.method7945());
		} else if (arg1 == 2) {
			this.anInt6226 = arg0.method7954();
		} else if (arg1 == 3) {
			this.anInt6226 = arg0.method7951();
			if (this.anInt6226 == 65535) {
				this.anInt6226 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean434 = false;
		} else if (arg1 == 7) {
			this.anInt6223 = Static307.method4538(arg0.method7945());
		} else if (arg1 == 8) {
			this.aClass37_4.anInt1155 = this.anInt6214;
		} else if (arg1 == 9) {
			this.anInt6222 = arg0.method7951() << 2;
		} else if (arg1 == 10) {
			this.aBoolean433 = false;
		} else if (arg1 == 11) {
			this.anInt6216 = arg0.method7954();
		} else if (arg1 == 12) {
			this.aBoolean435 = true;
		} else if (arg1 == 13) {
			this.anInt6212 = arg0.method7945();
		} else if (arg1 == 14) {
			this.anInt6213 = arg0.method7954() << 2;
		} else if (arg1 == 16) {
			this.anInt6219 = arg0.method7954();
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Lclient!dt;Z)V")
	public void method5250(@OriginalArg(0) Class3_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method7954();
			if (local5 == 0) {
				return;
			}
			this.method5244(arg0, local5);
		}
	}
}
