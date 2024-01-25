import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class164 {

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
	public int anInt4056;

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
	public int anInt4058;

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
	public int anInt4059;

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "Z")
	public boolean aBoolean289;

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
	public int anInt4062;

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
	public int anInt4063;

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
	public int anInt4057 = 16777215;

	@OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
	public int anInt4064 = 8;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILclient!vj;)V")
	private void method3528(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 1) {
			this.anInt4064 = arg1.method8546();
		} else if (arg0 == 2) {
			this.aBoolean289 = true;
		} else if (arg0 == 3) {
			this.anInt4056 = arg1.method8526();
			this.anInt4059 = arg1.method8526();
			this.anInt4063 = arg1.method8526();
		} else if (arg0 == 4) {
			this.anInt4058 = arg1.method8547();
		} else if (arg0 == 5) {
			this.anInt4062 = arg1.method8546();
		} else if (arg0 == 6) {
			this.anInt4057 = arg1.method8539();
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!vj;)V")
	public void method3529(@OriginalArg(1) Class2_Sub22 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8547();
			if (local5 == 0) {
				return;
			}
			this.method3528(local5, arg0);
		}
	}
}
