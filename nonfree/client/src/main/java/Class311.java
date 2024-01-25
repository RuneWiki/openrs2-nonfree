import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class311 {

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
	public int anInt9061;

	@OriginalMember(owner = "client!sk", name = "g", descriptor = "Z")
	public boolean aBoolean643;

	@OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
	public int anInt9063;

	@OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
	public int anInt9064;

	@OriginalMember(owner = "client!sk", name = "k", descriptor = "I")
	public int anInt9066;

	@OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
	public int anInt9069;

	@OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
	public int anInt9065 = 8;

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
	public int anInt9060 = 16777215;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IILclient!ig;)V")
	private void method7416(@OriginalArg(1) int arg0, @OriginalArg(2) Class8_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt9065 = arg1.method8578();
		} else if (arg0 == 2) {
			this.aBoolean643 = true;
		} else if (arg0 == 3) {
			this.anInt9064 = arg1.method8568();
			this.anInt9069 = arg1.method8568();
			this.anInt9066 = arg1.method8568();
		} else if (arg0 == 4) {
			this.anInt9061 = arg1.method8525();
		} else if (arg0 == 5) {
			this.anInt9063 = arg1.method8578();
		} else if (arg0 == 6) {
			this.anInt9060 = arg1.method8560();
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILclient!ig;)V")
	public void method7420(@OriginalArg(1) Class8_Sub8 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method8525();
			if (local11 == 0) {
				return;
			}
			this.method7416(local11, arg0);
		}
	}
}
