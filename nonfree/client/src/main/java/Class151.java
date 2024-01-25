import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class151 {

	@OriginalMember(owner = "client!m", name = "e", descriptor = "Lclient!jo;")
	private final Class126 aClass126_31 = new Class126(64);

	@OriginalMember(owner = "client!m", name = "n", descriptor = "Lclient!jo;")
	private final Class126 aClass126_32 = new Class126(100);

	@OriginalMember(owner = "client!m", name = "f", descriptor = "Lclient!ok;")
	private final Class178 aClass178_70;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!kr;ILclient!ok;Lclient!ok;Lclient!ok;)V")
	public Class151(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class178 arg2, @OriginalArg(3) Class178 arg3, @OriginalArg(4) Class178 arg4) {
		this.aClass178_70 = arg2;
		if (this.aClass178_70 != null) {
			@Pc(26) int local26 = this.aClass178_70.method3832() - 1;
			this.aClass178_70.method3833(local26);
		}
		Static415.method5216(arg3, arg4);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V")
	public void method3288() {
		@Pc(2) Class126 local2 = this.aClass126_31;
		synchronized (this.aClass126_31) {
			this.aClass126_31.method2828(5);
		}
		local2 = this.aClass126_32;
		synchronized (this.aClass126_32) {
			this.aClass126_32.method2828(5);
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(II)Lclient!wg;")
	public Class7_Sub4_Sub18 method3289(@OriginalArg(0) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_32;
		@Pc(16) Class7_Sub4_Sub18 local16;
		synchronized (this.aClass126_32) {
			local16 = (Class7_Sub4_Sub18) this.aClass126_32.method2822((long) arg0);
			if (local16 == null) {
				local16 = new Class7_Sub4_Sub18(arg0);
				this.aClass126_32.method2824((long) arg0, local16);
			}
		}
		synchronized (local16) {
			return local16.method5669() ? local16 : null;
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V")
	public void method3290() {
		@Pc(2) Class126 local2 = this.aClass126_31;
		synchronized (this.aClass126_31) {
			this.aClass126_31.method2821();
		}
		local2 = this.aClass126_32;
		synchronized (this.aClass126_32) {
			this.aClass126_32.method2821();
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)V")
	public void method3291() {
		@Pc(6) Class126 local6 = this.aClass126_31;
		synchronized (this.aClass126_31) {
			this.aClass126_31.method2827();
		}
		local6 = this.aClass126_32;
		synchronized (this.aClass126_32) {
			this.aClass126_32.method2827();
		}
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(II)Lclient!lc;")
	public Class139 method3293(@OriginalArg(0) int arg0) {
		@Pc(11) Class126 local11 = this.aClass126_31;
		@Pc(21) Class139 local21;
		synchronized (this.aClass126_31) {
			local21 = (Class139) this.aClass126_31.method2822((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class178 local34 = this.aClass178_70;
		@Pc(47) byte[] local47;
		synchronized (this.aClass178_70) {
			local47 = this.aClass178_70.method3838(Static421.method5274(arg0), Static366.method4711(arg0));
		}
		local21 = new Class139();
		local21.aClass151_3 = this;
		local21.anInt3940 = arg0;
		if (local47 != null) {
			local21.method3134(new Class7_Sub14(local47));
		}
		local21.method3125();
		@Pc(78) Class126 local78 = this.aClass126_31;
		synchronized (this.aClass126_31) {
			this.aClass126_31.method2824((long) arg0, local21);
			return local21;
		}
	}
}
