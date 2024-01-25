import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class181 {

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "Lclient!mf;")
	private final Class222 aClass222_28 = new Class222(64);

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
	public int anInt4644 = 0;

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "Lclient!pu;")
	private final Class270 aClass270_52;

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
	public final int anInt4642;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lclient!kr;ILclient!pu;)V")
	public Class181(@OriginalArg(0) Class195 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class270 arg2) {
		this.aClass270_52 = arg2;
		this.anInt4642 = this.aClass270_52.method5685(4);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public void method3758() {
		@Pc(6) Class222 local6 = this.aClass222_28;
		synchronized (this.aClass222_28) {
			this.aClass222_28.method4428();
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IB)V")
	public void method3759() {
		@Pc(6) Class222 local6 = this.aClass222_28;
		synchronized (this.aClass222_28) {
			this.aClass222_28.method4433(5);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)Lclient!tca;")
	public Class314 method3760(@OriginalArg(1) int arg0) {
		@Pc(11) Class222 local11 = this.aClass222_28;
		@Pc(21) Class314 local21;
		synchronized (this.aClass222_28) {
			local21 = (Class314) this.aClass222_28.method4430((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class270 local34 = this.aClass270_52;
		@Pc(45) byte[] local45;
		synchronized (this.aClass270_52) {
			local45 = this.aClass270_52.method5704(4, arg0);
		}
		local21 = new Class314();
		local21.anInt8501 = arg0;
		local21.aClass181_6 = this;
		if (local45 != null) {
			local21.method6890(new Class1_Sub35(local45));
		}
		local21.method6889();
		@Pc(78) Class222 local78 = this.aClass222_28;
		synchronized (this.aClass222_28) {
			this.aClass222_28.method4434(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
	public void method3761() {
		@Pc(2) Class222 local2 = this.aClass222_28;
		synchronized (this.aClass222_28) {
			this.aClass222_28.method4422();
		}
	}
}
