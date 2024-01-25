import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class119 {

	@OriginalMember(owner = "client!j", name = "i", descriptor = "Lclient!mq;")
	private final Class154 aClass154_17 = new Class154(16);

	@OriginalMember(owner = "client!j", name = "b", descriptor = "Lclient!fc;")
	private final Class71 aClass71_36;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lclient!dk;ILclient!fc;)V")
	public Class119(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class71 arg2) {
		this.aClass71_36 = arg2;
		this.aClass71_36.method1580(29);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
	public void method2670() {
		@Pc(12) Class154 local12 = this.aClass154_17;
		synchronized (this.aClass154_17) {
			this.aClass154_17.method3746();
		}
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
	public void method2672() {
		@Pc(6) Class154 local6 = this.aClass154_17;
		synchronized (this.aClass154_17) {
			this.aClass154_17.method3748();
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!om;IIIBI)Lclient!wl;")
	public Class248 method2673(@OriginalArg(0) Class171 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class207[] local7 = null;
		@Pc(20) Class153 local20 = this.method2676(arg1);
		if (local20.anIntArray503 != null) {
			local7 = new Class207[local20.anIntArray503.length];
			for (@Pc(30) int local30 = 0; local30 < local7.length; local30++) {
				@Pc(40) Class36 local40 = arg0.method4050(local20.anIntArray503[local30]);
				local7[local30] = new Class207(local40.anInt915, local40.anInt912, local40.anInt911, local40.anInt914, local40.anInt918, local40.anInt910, local40.anInt908, local40.aBoolean81);
			}
		}
		return new Class248(local20.anInt4110, local7, local20.anInt4107, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IB)V")
	public void method2675() {
		@Pc(6) Class154 local6 = this.aClass154_17;
		synchronized (this.aClass154_17) {
			this.aClass154_17.method3758(5);
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II)Lclient!mp;")
	private Class153 method2676(@OriginalArg(1) int arg0) {
		@Pc(6) Class154 local6 = this.aClass154_17;
		@Pc(16) Class153 local16;
		synchronized (this.aClass154_17) {
			local16 = (Class153) this.aClass154_17.method3751((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass71_36.method1555(29, arg0);
		local16 = new Class153();
		if (local33 != null) {
			local16.method3741(new Class2_Sub13(local33));
		}
		@Pc(49) Class154 local49 = this.aClass154_17;
		synchronized (this.aClass154_17) {
			this.aClass154_17.method3745((long) arg0, local16);
			return local16;
		}
	}
}
