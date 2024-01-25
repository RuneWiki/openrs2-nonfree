import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class248 {

	@OriginalMember(owner = "client!os", name = "m", descriptor = "Lclient!nga;")
	private Class233 aClass233_34 = new Class233(128);

	@OriginalMember(owner = "client!os", name = "p", descriptor = "Lclient!nga;")
	public Class233 aClass233_35 = new Class233(64);

	@OriginalMember(owner = "client!os", name = "b", descriptor = "Lclient!eq;")
	private final Class97 aClass97_103;

	@OriginalMember(owner = "client!os", name = "d", descriptor = "Lclient!eq;")
	public final Class97 aClass97_104;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Lclient!cw;ILclient!eq;Lclient!eq;)V")
	public Class248(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class97 arg2, @OriginalArg(3) Class97 arg3) {
		this.aClass97_103 = arg2;
		this.aClass97_104 = arg3;
		this.aClass97_103.method2569(36);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Z)V")
	public void method6346() {
		@Pc(2) Class233 local2 = this.aClass233_34;
		synchronized (this.aClass233_34) {
			this.aClass233_34.method5665();
		}
		local2 = this.aClass233_35;
		synchronized (this.aClass233_35) {
			this.aClass233_35.method5665();
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(II)Lclient!fd;")
	public Class105 method6347(@OriginalArg(0) int arg0) {
		@Pc(6) Class233 local6 = this.aClass233_34;
		@Pc(16) Class105 local16;
		synchronized (this.aClass233_34) {
			local16 = (Class105) this.aClass233_34.method5669((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class97 local29 = this.aClass97_103;
		@Pc(38) byte[] local38;
		synchronized (this.aClass97_103) {
			local38 = this.aClass97_103.method2545(arg0, 36);
		}
		local16 = new Class105();
		local16.aClass248_1 = this;
		local16.anInt3344 = arg0;
		if (local38 != null) {
			local16.method2793(new Class2_Sub34(local38));
		}
		local16.method2792();
		@Pc(74) Class233 local74 = this.aClass233_34;
		synchronized (this.aClass233_34) {
			this.aClass233_34.method5662(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIB)V")
	public void method6348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass233_34 = new Class233(arg1);
		this.aClass233_35 = new Class233(arg0);
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(II)V")
	public void method6350() {
		@Pc(10) Class233 local10 = this.aClass233_34;
		synchronized (this.aClass233_34) {
			this.aClass233_34.method5664(5);
		}
		local10 = this.aClass233_35;
		synchronized (this.aClass233_35) {
			this.aClass233_35.method5664(5);
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
	public void method6351() {
		@Pc(10) Class233 local10 = this.aClass233_34;
		synchronized (this.aClass233_34) {
			this.aClass233_34.method5663();
		}
		local10 = this.aClass233_35;
		synchronized (this.aClass233_35) {
			this.aClass233_35.method5663();
		}
	}
}
