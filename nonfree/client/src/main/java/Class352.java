import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class352 {

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "Z")
	public boolean aBoolean735 = false;

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
	public int anInt9412 = 64;

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "Z")
	public boolean aBoolean736 = false;

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
	public int anInt9410 = 2;

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
	public int anInt9415 = 64;

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
	public int anInt9416 = -1;

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
	public int anInt9417 = 1;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILclient!mo;)V")
	public void method7672(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub35 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method5750();
			if (local9 == 0) {
				return;
			}
			this.method7674(arg1, local9, arg0);
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!mo;III)V")
	private void method7674(@OriginalArg(0) Class1_Sub35 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt9416 = arg0.method5771();
			if (this.anInt9416 == 65535) {
				this.anInt9416 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt9415 = arg0.method5771() + 1;
			this.anInt9412 = arg0.method5771() + 1;
		} else if (arg1 == 3) {
			arg0.method5751();
		} else if (arg1 == 4) {
			this.anInt9410 = arg0.method5750();
		} else if (arg1 == 5) {
			this.anInt9417 = arg0.method5750();
		} else if (arg1 == 6) {
			this.aBoolean736 = true;
		} else if (arg1 == 7) {
			this.aBoolean735 = true;
		}
	}
}
