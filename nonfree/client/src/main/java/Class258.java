import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class258 {

	@OriginalMember(owner = "client!o", name = "b", descriptor = "I")
	public int anInt6619;

	@OriginalMember(owner = "client!o", name = "e", descriptor = "I")
	public int anInt6621;

	@OriginalMember(owner = "client!o", name = "h", descriptor = "I")
	private int anInt6623;

	@OriginalMember(owner = "client!o", name = "j", descriptor = "Lclient!br;")
	public Class32 aClass32_2;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!es;I)V")
	private void method5762(@OriginalArg(1) Class4_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt6623 = arg0.method8859();
		} else if (arg1 == 2) {
			this.anInt6619 = arg0.method8865();
			this.anInt6621 = arg0.method8865();
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)Lclient!cr;")
	public synchronized Class51 method5763() {
		@Pc(13) Class51 local13 = (Class51) this.aClass32_2.aClass352_6.method7653((long) this.anInt6623);
		if (local13 != null) {
			return local13;
		}
		local13 = Static682.method1662(this.aClass32_2.aClass34_8, this.anInt6623, 0);
		if (local13 != null) {
			this.aClass32_2.aClass352_6.method7655((long) this.anInt6623, local13);
		}
		return local13;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!es;I)V")
	public void method5765(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8865();
			if (local13 == 0) {
				return;
			}
			this.method5762(arg0, local13);
		}
	}
}
