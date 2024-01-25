import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class369 {

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
	public int anInt10286;

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
	public int anInt10287;

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
	public int anInt10288;

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
	public int anInt10292;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "Z")
	public boolean aBoolean765;

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
	public int anInt10294;

	@OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
	public int anInt10289 = 16777215;

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
	public int anInt10293 = 8;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IILclient!ib;)V")
	private void method8847(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 1) {
			this.anInt10293 = arg1.method8519();
		} else if (arg0 == 2) {
			this.aBoolean765 = true;
		} else if (arg0 == 3) {
			this.anInt10288 = arg1.method8516();
			this.anInt10294 = arg1.method8516();
			this.anInt10292 = arg1.method8516();
		} else if (arg0 == 4) {
			this.anInt10287 = arg1.method8529();
		} else if (arg0 == 5) {
			this.anInt10286 = arg1.method8519();
			return;
		} else if (arg0 == 6) {
			this.anInt10289 = arg1.method8510();
			return;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!ib;I)V")
	public void method8848(@OriginalArg(0) Class5_Sub23 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8529();
			if (local9 == 0) {
				return;
			}
			this.method8847(local9, arg0);
		}
	}
}
