import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class280 {

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "Z")
	public boolean aBoolean666;

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
	public int anInt8345;

	@OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
	public int anInt8346;

	@OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
	public int anInt8348;

	@OriginalMember(owner = "client!ql", name = "m", descriptor = "I")
	public int anInt8350;

	@OriginalMember(owner = "client!ql", name = "o", descriptor = "I")
	public int anInt8351;

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
	public int anInt8344 = 8;

	@OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
	public int anInt8349 = 16777215;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!ji;B)V")
	public void method6993(@OriginalArg(0) Class6_Sub8 arg0) {
		while (true) {
			@Pc(18) int local18 = arg0.method8246();
			if (local18 == 0) {
				return;
			}
			this.method6994(local18, arg0);
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZILclient!ji;)V")
	private void method6994(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt8344 = arg1.method8220();
		} else if (arg0 == 2) {
			this.aBoolean666 = true;
		} else if (arg0 == 3) {
			this.anInt8348 = arg1.method8231();
			this.anInt8346 = arg1.method8231();
			this.anInt8345 = arg1.method8231();
		} else if (arg0 == 4) {
			this.anInt8350 = arg1.method8246();
		} else if (arg0 == 5) {
			this.anInt8351 = arg1.method8220();
		} else if (arg0 == 6) {
			this.anInt8349 = arg1.method8203();
		}
	}
}
