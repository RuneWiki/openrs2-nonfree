import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class148 {

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
	public int anInt4700 = 1;

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
	public int anInt4704 = 2;

	@OriginalMember(owner = "client!ih", name = "j", descriptor = "Z")
	public boolean aBoolean334 = false;

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
	public int anInt4705 = 64;

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "Z")
	public boolean aBoolean333 = false;

	@OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
	public int anInt4706 = 64;

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
	public int anInt4702 = -1;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!rg;II)V")
	public void method4075(@OriginalArg(0) Class6_Sub40 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(17) int local17 = arg0.method8604();
			if (local17 == 0) {
				return;
			}
			this.method4076(local17, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IILclient!rg;I)V")
	private void method4076(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub40 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt4702 = arg1.method8571();
			if (this.anInt4702 == 65535) {
				this.anInt4702 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt4706 = arg1.method8571() + 1;
			this.anInt4705 = arg1.method8571() + 1;
		} else if (arg0 == 3) {
			arg1.method8602();
		} else if (arg0 == 4) {
			this.anInt4704 = arg1.method8604();
		} else if (arg0 == 5) {
			this.anInt4700 = arg1.method8604();
		} else if (arg0 == 6) {
			this.aBoolean334 = true;
		} else if (arg0 == 7) {
			this.aBoolean333 = true;
		}
	}
}
