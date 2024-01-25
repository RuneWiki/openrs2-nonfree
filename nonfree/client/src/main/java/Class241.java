import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class241 {

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "Lclient!hn;")
	private final Class102 aClass102_55 = new Class102(64);

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
	public int anInt6676 = 0;

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "Lclient!fo;")
	private final Class82 aClass82_92;

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
	public final int anInt6674;

	static {
		new Class119("Ok", "Okay", "OK", "Ok");
	}

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lclient!d;ILclient!fo;)V")
	public Class241(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class82 arg2) {
		this.aClass82_92 = arg2;
		this.anInt6674 = this.aClass82_92.method1823(4);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)Lclient!vt;")
	public Class258 method5222(@OriginalArg(1) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_55;
		@Pc(16) Class258 local16;
		synchronized (this.aClass102_55) {
			local16 = (Class258) this.aClass102_55.method2258((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) Class82 local33 = this.aClass82_92;
		@Pc(42) byte[] local42;
		synchronized (this.aClass82_92) {
			local42 = this.aClass82_92.method1817(4, arg0);
		}
		local16 = new Class258();
		local16.aClass241_14 = this;
		local16.anInt7318 = arg0;
		if (local42 != null) {
			local16.method5724(new Class1_Sub28(local42));
		}
		local16.method5723();
		@Pc(73) Class102 local73 = this.aClass102_55;
		synchronized (this.aClass102_55) {
			this.aClass102_55.method2272((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)V")
	public void method5224() {
		@Pc(2) Class102 local2 = this.aClass102_55;
		synchronized (this.aClass102_55) {
			this.aClass102_55.method2262(5);
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(Z)V")
	public void method5225() {
		@Pc(8) Class102 local8 = this.aClass102_55;
		synchronized (this.aClass102_55) {
			this.aClass102_55.method2271();
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
	public void method5226() {
		@Pc(12) Class102 local12 = this.aClass102_55;
		synchronized (this.aClass102_55) {
			this.aClass102_55.method2260();
		}
	}
}
