import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class101 {

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "Z")
	public boolean aBoolean274 = false;

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
	public int anInt3711 = 64;

	@OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
	public int anInt3715 = 64;

	@OriginalMember(owner = "client!fg", name = "h", descriptor = "Z")
	public boolean aBoolean275 = false;

	@OriginalMember(owner = "client!fg", name = "k", descriptor = "I")
	public int anInt3717 = 2;

	@OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
	public int anInt3718 = 1;

	@OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
	public int anInt3716 = -1;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(BLclient!ig;I)V")
	public void method3047(@OriginalArg(1) Class8_Sub8 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method8525();
			if (local5 == 0) {
				return;
			}
			this.method3048(arg0, arg1, local5);
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!ig;III)V")
	private void method3048(@OriginalArg(0) Class8_Sub8 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt3716 = arg0.method8578();
			if (this.anInt3716 == 65535) {
				this.anInt3716 = -1;
			}
		} else if (arg2 == 2) {
			this.anInt3711 = arg0.method8578() + 1;
			this.anInt3715 = arg0.method8578() + 1;
		} else if (arg2 == 3) {
			arg0.method8550();
		} else if (arg2 == 4) {
			this.anInt3717 = arg0.method8525();
		} else if (arg2 == 5) {
			this.anInt3718 = arg0.method8525();
		} else if (arg2 == 6) {
			this.aBoolean275 = true;
		} else if (arg2 == 7) {
			this.aBoolean274 = true;
			return;
		}
	}
}
