import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class177 {

	@OriginalMember(owner = "client!om", name = "c", descriptor = "Z")
	public boolean aBoolean376 = false;

	@OriginalMember(owner = "client!om", name = "f", descriptor = "I")
	public int anInt5186 = -1;

	@OriginalMember(owner = "client!om", name = "d", descriptor = "I")
	public int anInt5185 = 64;

	@OriginalMember(owner = "client!om", name = "g", descriptor = "I")
	public int anInt5187 = 1;

	@OriginalMember(owner = "client!om", name = "k", descriptor = "I")
	public int anInt5191 = 2;

	@OriginalMember(owner = "client!om", name = "q", descriptor = "Z")
	public boolean aBoolean377 = false;

	@OriginalMember(owner = "client!om", name = "n", descriptor = "I")
	public int anInt5194 = 64;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!nj;ZI)V")
	public void method4280(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(15) int local15 = arg0.method4096();
			if (local15 == 0) {
				return;
			}
			this.method4286(local15, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIBLclient!nj;)V")
	private void method4286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3_Sub25 arg2) {
		if (arg0 == 1) {
			this.anInt5186 = arg2.method4083();
			if (this.anInt5186 == 65535) {
				this.anInt5186 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt5194 = arg2.method4083() + 1;
			this.anInt5185 = arg2.method4083() + 1;
		} else if (arg0 == 3) {
			arg2.method4097();
		} else if (arg0 == 4) {
			this.anInt5191 = arg2.method4096();
		} else if (arg0 == 5) {
			this.anInt5187 = arg2.method4096();
		} else if (arg0 == 6) {
			this.aBoolean376 = true;
		} else if (arg0 == 7) {
			this.aBoolean377 = true;
		}
	}
}
