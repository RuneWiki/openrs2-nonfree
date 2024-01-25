import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tv")
public final class Class356 {

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "Lclient!iha;")
	private final Class168 aClass168_86 = new Class168(16);

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "Lclient!gda;")
	private final Class126 aClass126_267;

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Lclient!po;ILclient!gda;)V")
	public Class356(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class126 arg2) {
		this.aClass126_267 = arg2;
		this.aClass126_267.method3062(29);
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(BI)Lclient!aaa;")
	private Class2 method8130(@OriginalArg(1) int arg0) {
		@Pc(6) Class168 local6 = this.aClass168_86;
		@Pc(16) Class2 local16;
		synchronized (this.aClass168_86) {
			local16 = (Class2) this.aClass168_86.method3860((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class126 local30 = this.aClass126_267;
		@Pc(39) byte[] local39;
		synchronized (this.aClass126_267) {
			local39 = this.aClass126_267.method3086(arg0, 29);
		}
		local16 = new Class2();
		if (local39 != null) {
			local16.method21(new Class5_Sub36(local39));
		}
		@Pc(71) Class168 local71 = this.aClass168_86;
		synchronized (this.aClass168_86) {
			this.aClass168_86.method3853((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IB)V")
	public void method8131() {
		@Pc(2) Class168 local2 = this.aClass168_86;
		synchronized (this.aClass168_86) {
			this.aClass168_86.method3852(5);
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Z)V")
	public void method8132() {
		@Pc(13) Class168 local13 = this.aClass168_86;
		synchronized (this.aClass168_86) {
			this.aClass168_86.method3862();
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILclient!hw;IIII)Lclient!in;")
	public Class173 method8133(@OriginalArg(0) int arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class365[] local7 = null;
		@Pc(20) Class2 local20 = this.method8130(arg0);
		if (local20.anIntArray1 != null) {
			local7 = new Class365[local20.anIntArray1.length];
			for (@Pc(30) int local30 = 0; local30 < local7.length; local30++) {
				@Pc(40) Class351 local40 = arg1.method3634(local20.anIntArray1[local30]);
				local7[local30] = new Class365(local40.anInt9019, local40.anInt9015, local40.anInt9017, local40.anInt9021, local40.anInt9022, local40.anInt9014, local40.anInt9018, local40.aBoolean603);
			}
		}
		return new Class173(local20.anInt12, local7, local20.anInt5, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)V")
	public void method8134() {
		@Pc(16) Class168 local16 = this.aClass168_86;
		synchronized (this.aClass168_86) {
			this.aClass168_86.method3856();
		}
	}
}
