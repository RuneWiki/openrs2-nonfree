import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iea")
public final class Class162 {

	@OriginalMember(owner = "client!iea", name = "c", descriptor = "I")
	public int anInt4061;

	@OriginalMember(owner = "client!iea", name = "e", descriptor = "Z")
	public boolean aBoolean303;

	@OriginalMember(owner = "client!iea", name = "f", descriptor = "I")
	public int anInt4063;

	@OriginalMember(owner = "client!iea", name = "j", descriptor = "I")
	public int anInt4067;

	@OriginalMember(owner = "client!iea", name = "l", descriptor = "I")
	public int anInt4069;

	@OriginalMember(owner = "client!iea", name = "m", descriptor = "I")
	public int anInt4070;

	@OriginalMember(owner = "client!iea", name = "h", descriptor = "I")
	public int anInt4065 = 8;

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "I")
	public int anInt4059 = 16777215;

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(Lclient!es;B)V")
	public void method3634(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8865();
			if (local9 == 0) {
				return;
			}
			this.method3637(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(Lclient!es;II)V")
	private void method3637(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4065 = arg0.method8859();
		} else if (arg1 == 2) {
			this.aBoolean303 = true;
		} else if (arg1 == 3) {
			this.anInt4063 = arg0.method8834();
			this.anInt4069 = arg0.method8834();
			this.anInt4070 = arg0.method8834();
		} else if (arg1 == 4) {
			this.anInt4061 = arg0.method8865();
		} else if (arg1 == 5) {
			this.anInt4067 = arg0.method8859();
		} else if (arg1 == 6) {
			this.anInt4059 = arg0.method8827();
			return;
		}
	}
}
