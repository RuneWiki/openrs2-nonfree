import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class59 {

	@OriginalMember(owner = "client!cp", name = "g", descriptor = "Lclient!tb;")
	private final Class313 aClass313_14 = new Class313(64);

	@OriginalMember(owner = "client!cp", name = "l", descriptor = "I")
	public int anInt1601 = 0;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "Lclient!pl;")
	private final Class259 aClass259_32;

	@OriginalMember(owner = "client!cp", name = "d", descriptor = "I")
	public final int anInt1595;

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Lclient!rf;ILclient!pl;)V")
	public Class59(@OriginalArg(0) Class284 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class259 arg2) {
		this.aClass259_32 = arg2;
		this.anInt1595 = this.aClass259_32.method5969(4);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)V")
	public void method1138() {
		@Pc(2) Class313 local2 = this.aClass313_14;
		synchronized (this.aClass313_14) {
			this.aClass313_14.method6977();
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)V")
	public void method1140() {
		@Pc(2) Class313 local2 = this.aClass313_14;
		synchronized (this.aClass313_14) {
			this.aClass313_14.method6983();
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IB)Lclient!ng;")
	public Class230 method1141(@OriginalArg(0) int arg0) {
		@Pc(6) Class313 local6 = this.aClass313_14;
		@Pc(16) Class230 local16;
		synchronized (this.aClass313_14) {
			local16 = (Class230) this.aClass313_14.method6989((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class259 local29 = this.aClass259_32;
		@Pc(38) byte[] local38;
		synchronized (this.aClass259_32) {
			local38 = this.aClass259_32.method5985(arg0, 4);
		}
		local16 = new Class230();
		local16.anInt6400 = arg0;
		local16.aClass59_6 = this;
		if (local38 != null) {
			local16.method5308(new Class2_Sub15(local38));
		}
		local16.method5307();
		@Pc(69) Class313 local69 = this.aClass313_14;
		synchronized (this.aClass313_14) {
			this.aClass313_14.method6980((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)V")
	public void method1142() {
		@Pc(2) Class313 local2 = this.aClass313_14;
		synchronized (this.aClass313_14) {
			this.aClass313_14.method6982(5);
		}
	}
}
