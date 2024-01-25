import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class36 {

	@OriginalMember(owner = "client!cm", name = "e", descriptor = "Z")
	public boolean aBoolean81;

	@OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
	public int anInt911;

	@OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
	public int anInt912;

	@OriginalMember(owner = "client!cm", name = "k", descriptor = "I")
	public int anInt914;

	@OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
	public int anInt915;

	@OriginalMember(owner = "client!cm", name = "o", descriptor = "I")
	public int anInt918;

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
	public int anInt908 = 16777215;

	@OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
	public int anInt910 = 8;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!lk;II)V")
	private void method895(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt910 = arg0.method4245();
		} else if (arg1 == 2) {
			this.aBoolean81 = true;
		} else if (arg1 == 3) {
			this.anInt911 = arg0.method4251();
			this.anInt914 = arg0.method4251();
			this.anInt918 = arg0.method4251();
		} else if (arg1 == 4) {
			this.anInt915 = arg0.method4240();
			return;
		} else if (arg1 == 5) {
			this.anInt912 = arg0.method4245();
			return;
		} else if (arg1 == 6) {
			this.anInt908 = arg0.method4235();
			return;
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!lk;)V")
	public void method896(@OriginalArg(1) Class2_Sub13 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4240();
			if (local9 == 0) {
				return;
			}
			this.method895(arg0, local9);
		}
	}
}
