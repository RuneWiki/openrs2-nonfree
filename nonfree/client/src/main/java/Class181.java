import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iv")
public final class Class181 {

	@OriginalMember(owner = "client!iv", name = "k", descriptor = "Lclient!wq;")
	private final Class391 aClass391_23 = new Class391(16);

	@OriginalMember(owner = "client!iv", name = "e", descriptor = "Lclient!la;")
	private final Class208 aClass208_61;

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lclient!to;ILclient!la;)V")
	public Class181(@OriginalArg(0) Class333 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class208 arg2) {
		this.aClass208_61 = arg2;
		this.aClass208_61.method5005(29);
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(B)V")
	public void method3877() {
		@Pc(2) Class391 local2 = this.aClass391_23;
		synchronized (this.aClass391_23) {
			this.aClass391_23.method9286();
		}
	}

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "(I)V")
	public void method3880(@OriginalArg(0) int arg0) {
		if (arg0 == -3073) {
			@Pc(11) Class391 local11 = this.aClass391_23;
			synchronized (this.aClass391_23) {
				this.aClass391_23.method9276(0);
			}
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(ZI)Lclient!pp;")
	private Class282 method3881(@OriginalArg(1) int arg0) {
		@Pc(6) Class391 local6 = this.aClass391_23;
		@Pc(16) Class282 local16;
		synchronized (this.aClass391_23) {
			local16 = (Class282) this.aClass391_23.method9275((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class208 local30 = this.aClass208_61;
		@Pc(39) byte[] local39;
		synchronized (this.aClass208_61) {
			local39 = this.aClass208_61.method4991(29, arg0, -122);
		}
		local16 = new Class282();
		if (local39 != null) {
			local16.method6737(new Class5_Sub23(local39));
		}
		@Pc(63) Class391 local63 = this.aClass391_23;
		synchronized (this.aClass391_23) {
			this.aClass391_23.method9273((long) arg0, local16, 1);
			return local16;
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(II)V")
	public void method3883() {
		@Pc(2) Class391 local2 = this.aClass391_23;
		synchronized (this.aClass391_23) {
			this.aClass391_23.method9274(5);
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIIIILclient!sja;)Lclient!rp;")
	public Class311 method3885(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class321 arg4) {
		@Pc(7) Class11[] local7 = null;
		@Pc(12) Class282 local12 = this.method3881(arg3);
		if (local12.anIntArray470 != null) {
			local7 = new Class11[local12.anIntArray470.length];
			for (@Pc(22) int local22 = 0; local22 < local7.length; local22++) {
				@Pc(32) Class369 local32 = arg4.method7947(local12.anIntArray470[local22]);
				local7[local22] = new Class11(local32.anInt10287, local32.anInt10286, local32.anInt10288, local32.anInt10294, local32.anInt10292, local32.anInt10293, local32.anInt10289, local32.aBoolean765);
			}
		}
		return new Class311(local12.anInt7841, local7, local12.anInt7839, arg2, arg0, arg1);
	}
}
