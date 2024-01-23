import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class32 {

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
	public int anInt952;

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "Z")
	public boolean aBoolean76;

	@OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
	public int anInt955;

	@OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
	public int anInt956;

	@OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
	public int anInt958;

	@OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
	public int anInt960;

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
	public int anInt950 = 8;

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
	public int anInt951 = 16777215;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZILclient!ug;)V")
	private void method789(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub26 arg2) {
		if (arg0 == 1) {
			this.anInt950 = arg2.method3948();
		} else if (arg0 == 2) {
			this.aBoolean76 = true;
		} else if (arg0 == 3) {
			this.anInt952 = arg2.method3930();
			this.anInt960 = arg2.method3930();
			this.anInt956 = arg2.method3930();
		} else if (arg0 == 4) {
			this.anInt955 = arg2.method3915();
		} else if (arg0 == 5) {
			this.anInt958 = arg2.method3948();
		} else if (arg0 == 6) {
			this.anInt951 = arg2.method3899();
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BILclient!ug;)V")
	public void method790(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method3915();
			if (local5 == 0) {
				return;
			}
			this.method789(local5, arg0, arg1);
		}
	}
}
