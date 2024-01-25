import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class301 {

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "Lclient!lq;")
	public Class205 aClass205_2;

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
	public int anInt8813;

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
	public int anInt8814;

	@OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
	private int anInt8817;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILclient!iaa;)V")
	public void method7377(@OriginalArg(1) Class6_Sub26 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method4966();
			if (local15 == 0) {
				return;
			}
			this.method7380(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)Lclient!aaa;")
	public synchronized Class1 method7379() {
		@Pc(13) Class1 local13 = (Class1) this.aClass205_2.aClass245_47.method6082((long) this.anInt8817);
		if (local13 != null) {
			return local13;
		}
		local13 = Static583.method55(this.aClass205_2.aClass168_74, this.anInt8817, 0);
		if (local13 != null) {
			this.aClass205_2.aClass245_47.method6075(local13, (long) this.anInt8817);
		}
		return local13;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILclient!iaa;I)V")
	private void method7380(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 == 1) {
			this.anInt8817 = arg1.method4999();
		} else if (arg0 == 2) {
			this.anInt8813 = arg1.method4966();
			this.anInt8814 = arg1.method4966();
		}
	}
}
